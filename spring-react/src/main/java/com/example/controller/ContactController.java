package com.example.controller;

import com.example.model.Contact;
import com.example.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

    private ContactRepository repo;

    @Autowired
    public ContactController(ContactRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/contacts")
    public List<Contact> getAllContacts(){
        return (List<Contact>) repo.findAll();
    }

    @PostMapping("/contacts")
    public ResponseEntity<Contact> saveContact(@RequestBody Contact contact){
       try{
           Contact saved = repo.save(contact);
           return new ResponseEntity<>(saved, HttpStatus.CREATED);
       }catch (Exception ex){
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
       }
    }
}
