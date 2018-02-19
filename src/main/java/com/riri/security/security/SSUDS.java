package com.riri.security.security;

import com.riri.security.model.AppRole;
import com.riri.security.model.AppUser;
import com.riri.security.repository.AppUserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashSet;
import java.util.Set;

public class SSUDS implements UserDetailsService {
    private AppUserRepository userRepo;

    public SSUDS(AppUserRepository userRepository) {
        this.userRepo = userRepository;
    }
     /*
   The loadbyUsername method attempts to create an authentication string to be used to authenticate the user who logs in.
   See the code below for the format of the user that is returned to Spring security, and used by the authentiation manager builder
   in the security configuration file.
*/

    // =========================================================================================================================================
// UNCOMMENT THE FOLLOWING CODE TO SEE HOW IT WORKS

/*   @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // Lines 34 and 37 are put in a separate method for readability. The roles assigned to each user are converted into roles that
        //can be read by Spring Security.

        Set <GrantedAuthority> userAuthorities = new HashSet<>();


        userAuthorities.add(new SimpleGrantedAuthority("ADMIN"));


        return new User("afua","password",userAuthorities);
    }*/
//  ==========================================================================================================================================

    @Override
    public UserDetails loadUserByUsername(String username) throws
             UsernameNotFoundException {
         Set<GrantedAuthority> userAuthorities = new HashSet<>();
         return
     }
}