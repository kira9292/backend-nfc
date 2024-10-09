package com.example.backendnfc;

import com.example.backendnfc.Repositories.OfficierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BackendNfcApplication implements CommandLineRunner {
    @Autowired
    private OfficierRepository officierRepository;


    public static void main(String[] args) {
        SpringApplication.run(BackendNfcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

    public OfficierRepository getOfficierRepository() {
        return officierRepository;
    }
}
