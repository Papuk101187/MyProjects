package com.example.projectregistrpeple.auth;

import com.example.projectregistrpeple.service.userservice.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {


        return userService.findByUsers(login)
                .map(user -> new MyUserDetails(user))
                .orElseThrow(() -> new AuthenticationCredentialsNotFoundException("User not found "));
    }











}
