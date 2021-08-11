package com.abury.mono.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().ignoringAntMatchers("/")
                .and()
                .authorizeRequests(auth -> auth
                        .antMatchers("/public/**").permitAll()
                        .antMatchers(HttpMethod.POST, "/").permitAll()
                        .antMatchers("/transaction/**").authenticated()
                        .anyRequest().authenticated())
                .oauth2Login();
    }
}

