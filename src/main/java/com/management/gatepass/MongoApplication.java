/*
package com.management.gatepass;

import com.management.gatepass.Entity.User;
import com.management.gatepass.repository.mongo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class MongoApplication implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(MongoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of customers
        repository.save(new User("EM102348432","Alice", "Smith", "dafda", LocalDate.now()));
        System.out.println("-----");
        repository.save(new User("EM102348432","Aliciadf", "Smithrins", "dafs", LocalDate.now()));

        // fetch all customers
        System.out.println("Users found with findAll():");
        System.out.println("-------------------------------");
        for (User user : repository.findAll()) {
            System.out.println(user);
        }
        System.out.println();

        // fetch an individual user
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (User user : repository.findByLastName("Smith")) {
            System.out.println(user);
        }

    }

}
*/
