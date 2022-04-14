package com.corso.java.service;

import org.springframework.data.mongodb.repository.Query;

public interface BookService {
    public void updateSpecificField(String name, String value);
}
