package com.lukmie.cats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private UserService userDetailsService;

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    BCryptPasswordEncoder encoder () {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
//                Tylko w pamieci:
//                .inMemoryAuthentication()
//                .withUser("root").password(encoder().encode("admin")).authorities("ROLE_ADMIN")
//                .and()
//                .withUser("user").password(encoder().encode("user")).authorities("ROLE_USER")
//                .and()
                .passwordEncoder(encoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/hello").permitAll()
                .antMatchers("/pdf").permitAll()
                .antMatchers("/register").permitAll()
                .antMatchers("/cats").hasAnyRole("ADMIN", "USER")
                .and()
                .httpBasic();
    }
}
