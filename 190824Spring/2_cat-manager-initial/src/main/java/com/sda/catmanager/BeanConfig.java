package com.sda.catmanager;

import com.sda.catmanager.service.helper.KitchenService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class BeanConfig {

    @Bean
    public Random random(){
        Random random = new Random();
        return random;
    }
}
