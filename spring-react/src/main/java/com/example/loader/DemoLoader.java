package com.example.loader;

import com.example.model.Contact;
import com.example.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {

    private ContactRepository repo;

    @Autowired
    public DemoLoader(ContactRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        this.repo.save(new Contact("Anar", "Mammadzada", "anar@gmail.com"));
        this.repo.save(new Contact("Ugur", "Mammadzada", "ugur@gmail.com"));
        this.repo.save(new Contact("Sanan", "Mammadzada", "sanan@gmail.com"));
    }
}
