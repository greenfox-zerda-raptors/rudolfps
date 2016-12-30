package com.greenfox.repository;
import com.greenfox.Product;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by gabkamabka on 2016.12.30..
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findByName(String name);
}