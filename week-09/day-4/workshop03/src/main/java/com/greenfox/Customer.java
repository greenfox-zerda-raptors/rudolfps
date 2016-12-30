package com.greenfox;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;

/**
 * Created by gabkamabka on 2016.12.30..
 */
    @Entity
    @Table(name = "customers")
    @Getter
    @Setter
    public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String name;

        @ManyToMany(fetch = FetchType.LAZY)
        @JoinTable(name = "customers_phones")
        private Set<PhoneNumber> phoneNumbers;

        protected Customer() {
        }
    }

