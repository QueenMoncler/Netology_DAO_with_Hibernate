package com.example.netology_dao_with_hibernate.controller;


import com.example.netology_dao_with_hibernate.Person;
import com.example.netology_dao_with_hibernate.repository.Repository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
public class Controller {

    private final Repository repository;


    @GetMapping("/persons/by-city")
    protected List<Person> getPersonsByCity(@RequestParam (value = "city", required = false) String city) {
        return repository.getPersonsByCity(city);
    }

}