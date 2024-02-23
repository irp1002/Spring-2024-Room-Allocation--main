package edu.sru.group7.roomallocation.secure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//import edu.sru.cpsc.webshopping.domain.user.User;
import edu.sru.group7.roomallocation.repositories.*;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
 
	@Autowired
	private UserRepository userRepository;
	
    @Override
    public UserDetails loadUserByUsername(String username) {
    	
    	edu.sru.group7.roomallocation.domain.User user1 = userRepository.findByUsername(username);
        if (user1 == null || user1.getEnabled() == false) {
            throw new UsernameNotFoundException(username);
        }
    
        UserDetails user = User.withUsername(user1.getUsername())
        					.password(user1.getPassword())
        					.authorities(user1.getRole())
        					.build();
        return user;
    }
 
}