package com.corso.java.domain;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student {

    @Id
    private String id;
    private String name;
    private String numberPassport;

    public Student() {

    }

    public Student(String name, String numberPassport) {
        this.name = name;
        this.numberPassport = numberPassport;
    }

    public Student(String id, String name, String numberPassport) {
        this.id = id;
        this.name = name;
        this.numberPassport = numberPassport;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }
}
