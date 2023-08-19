package demosec.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
// @EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class SecurityConfig {
    
    public static final String ROLE_PREFIX = "ROLE_";

    public static final String USER_ROLE = "USER";

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(16);
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        // this method will get UserDetails Bean and PasswordEncoder Bean
        // automatically and config with them.
        return authConfig.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .formLogin(Customizer.withDefaults())
            .authorizeHttpRequests(requests -> requests
                    .antMatchers("/api/content")
                    .hasRole(USER_ROLE)
                    .antMatchers("/**")
                    .permitAll())
            .logout(logout -> logout
                    .logoutSuccessUrl("/login"))
            .csrf(csrf -> csrf
                    .disable())
        ;

        return http.build();
    }


}
