package com.lukmie.cats.service;

import com.lukmie.cats.exception.CatNotFoundException;
import com.lukmie.cats.model.Profile;
import com.lukmie.cats.model.Role;
import com.lukmie.cats.model.SignUpRequest;
import com.lukmie.cats.repository.ProfileRepository;
import com.lukmie.cats.service.mapper.ProfileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Primary
public class UserService implements UserDetailsService {

    private ProfileRepository profileRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public UserService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }


    public void createUser(SignUpRequest signUpRequest) {
        // todo check if username exist, if true throw exception
//        1
//        profileRepository
//                .findById(signUpRequest.getLogin())
//                .ifPresent(i -> {
//                    throw new CatNotFoundException();
//                });
//        2
        profileRepository.findById(signUpRequest.getLogin()).orElseGet(() -> {
            Profile profile = new Profile();
            profile.setUsername(signUpRequest.getLogin());
            profile.setPassword(encoder.encode(signUpRequest.getPassword()));
            Role role = new Role();
            role.setName("ROLE_ADMIN");
            profile.setRoles(Collections.singletonList(role));
            return profileRepository.save(profile);
        });
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return profileRepository.findById(username)
//                mapowanie na obiekt springa
                .map(existingProfile -> new User(
                        existingProfile.getUsername(),
                        existingProfile.getPassword(),
                        parseRoles(existingProfile.getRoles())
                )).orElseThrow(() -> new UsernameNotFoundException(username));
    }

    private Collection<? extends GrantedAuthority> parseRoles(List<Role> roles) {
        return roles
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toSet());
    }
}
