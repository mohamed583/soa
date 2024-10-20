package com.management.cooolab.Services;

import com.management.cooolab.Entities.User;
import com.management.cooolab.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        if (user.isHr() && user.isManager()) {
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        } else if (user.isHr()) {
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_HR"));
        } else if (user.isManager()) {
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_MANAGER"));
        } else {
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_EMPLOYEE"));
        }

        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), grantedAuthorities);
    }
}
