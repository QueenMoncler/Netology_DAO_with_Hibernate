package com.example.netology_dao_with_hibernate;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Entity implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public void run(String[] args) throws Exception {

        Person xxx1 = Person.builder().contact(Contact.builder()
                        .name("Xxx1")
                        .surname("Xxx11")
                        .age(10)
                        .build())
                .phoneNumber("+7 (111) 111-11-11")
                .cityOfLiving("Moscow")
                .build();

        Person xxx2 = Person.builder().contact(Contact.builder()
                        .name("Xxx2")
                        .surname("Xxx2")
                        .age(20)
                        .build())
                .phoneNumber("+7 (222) 222-22-22")
                .cityOfLiving("Moscow")
                .build();

        Person xxx3 = Person.builder().contact(Contact.builder()
                        .name("Xxx3")
                        .surname("Xxx3")
                        .age(30)
                        .build())
                .phoneNumber("+7 (333) 333-33-33")
                .cityOfLiving("Moscow")
                .build();

        Person xxx4 = Person.builder().contact(Contact.builder()
                        .name("Xxx4")
                        .surname("Xxx4")
                        .age(40)
                        .build())
                .phoneNumber("+7 (444) 444-44-44")
                .cityOfLiving("Spb")
                .build();

        Person xxx5 = Person.builder().contact(Contact.builder()
                        .name("Xxx5")
                        .surname("Xxx5")
                        .age(50)
                        .build())
                .phoneNumber("+7 (555) 555-55-55")
                .cityOfLiving("Spb")
                .build();
        entityManager.persist(xxx1);
        entityManager.persist(xxx2);
        entityManager.persist(xxx3);
        entityManager.persist(xxx4);
        entityManager.persist(xxx5);
    }
}