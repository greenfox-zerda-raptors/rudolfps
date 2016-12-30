package com.greenfox;

/**
 * Created by gabkamabka on 2016.12.30..
 */
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "phone_numbers")
@Getter
@Setter
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String value;

    @ManyToMany(mappedBy = "phoneNumbers")
    private Set<Customer> customers;
}