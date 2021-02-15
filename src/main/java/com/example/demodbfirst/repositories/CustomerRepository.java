package com.example.demodbfirst.repositories;

import com.example.demodbfirst.models.dto.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAllCustomerSortedByLastName();
}
