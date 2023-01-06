package com.example.bankamat.Sozlamalar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Configuration
@EnableWebSecurity
public class HafsizlikSozlamalari extends WebSecurityConfigurerAdapter {
    @Bean
    PasswordEncoder passwordEncoder(){return new BCryptPasswordEncoder(10);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/kartaregister","/bankamatregister","/xodimregister","/bankamatpulyechishregister")
                .permitAll()
                .anyRequest().authenticated();
    }
}
