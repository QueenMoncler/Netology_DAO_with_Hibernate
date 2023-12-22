package com.example.netology_dao_with_hibernate.repository;


import com.example.netology_dao_with_hibernate.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
@org.springframework.stereotype.Repository
public class Repository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Person> getPersonsByCity(String city) {
        var query = entityManager.createNamedQuery("findPersonByCity");
        query.setParameter("city", city);
        List<Person> personList = query.getResultList();

        return personList;
    }


}