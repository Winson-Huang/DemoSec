package demosec.security;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class SecurityConfig {
    
    public static final String ROLE_PREFIX = "ROLE_";

    public static final String USER_ROLE = "USER";

}
