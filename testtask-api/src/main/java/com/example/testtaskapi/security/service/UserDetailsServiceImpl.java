package com.example.testtaskapi.security.service;

import com.example.testtaskapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username :  " + username));
        //TODO Possible exception
        return UserDetailsImpl.builder().build();
    }
}
