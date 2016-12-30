package com.greenfox;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by gabkamabka on 2016.12.30..
 */


import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}