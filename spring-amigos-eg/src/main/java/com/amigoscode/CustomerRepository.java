package com.amigoscode;

import org.springframework.data.jpa.repository.JpaRepository;
//JPA used for CRUD
public interface CustomerRepository
        extends JpaRepository<Customer, Integer> {
}
