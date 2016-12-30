package com.greenfox;

/**
 * Created by gabkamabka on 2016.12.30..
 */
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Setter
@Getter
@EqualsAndHashCode
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
}