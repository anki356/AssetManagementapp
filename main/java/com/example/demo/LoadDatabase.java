package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(Employeerepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Employee(1,"Bilbo Baggins", "A.M",null)));
      log.info("Preloading " + repository.save(new Employee(2,"Frodo Baggins", "Manager",null)));
    };
    
  }
}