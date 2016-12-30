package com.greenfox.repository;
import com.greenfox.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gabkamabka on 2016.12.30..
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findByName(String name);
}