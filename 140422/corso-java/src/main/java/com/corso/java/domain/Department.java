package com.corso.java.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    private String id;
    private String name;
}
