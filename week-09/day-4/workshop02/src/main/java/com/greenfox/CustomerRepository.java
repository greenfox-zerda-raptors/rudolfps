package com.greenfox;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

/**
 * Created by rudolfps on 2016.12.30..
 */

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}