package com.example.demo.NDOST.config;

import com.example.demo.NDOST.repository.NDOSTRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NDOSTConfig {


    @Bean
    CommandLineRunner commandLineRunner(NDOSTRepository repository) {
                        return args -> repository.findAll();
                }

}
