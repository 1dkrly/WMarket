package com.bmstu.wmarket.configurations;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@RequiredArgsConstructor

public class SecurityConfig extends SecurityConfigurerAdapter {
    @Bean
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        super.configure(auth);
    }
}
