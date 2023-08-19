package demosec.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import demosec.data.DemosecUserRepo;
import demosec.domain.DemosecUser;

@Service
public class DemosecUserDetailsService implements UserDetailsService {

    @Autowired
    private DemosecUserRepo demosecUserRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        DemosecUser user = demosecUserRepo.getByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User " + username + " Not found.");
        }
        return user;
    }
    
}
