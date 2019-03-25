package com.miage.altea.tp.pokemon_ui.config;

import org.aopalliance.intercept.Interceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfiguration {

    /*@Value("${trainer.service.username}")
    private String username;

    @Value("${trainer.service.password}")
    private String password;

    @Bean
    RestTemplate trainerApiRestTemplate(){

        return new RestTemplate.getInterceptors().add(new BasicAuthorizationInterceptor(username, password));

        TP SECURITÉ PROBLEME HERE !!




    }*/

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}