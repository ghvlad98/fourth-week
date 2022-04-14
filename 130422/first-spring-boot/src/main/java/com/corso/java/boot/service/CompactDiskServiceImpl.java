package com.corso.java.boot.service;

import com.corso.java.boot.domain.CompactDisk;
import com.corso.java.boot.repository.CompactDiskRepository;
import com.corso.java.boot.service.api.CompactDiskService;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompactDiskServiceImpl implements CompactDiskService {

    @Autowired
    CompactDiskRepository compactDiskRepository;

    @Override
    public List<CompactDisk> findAll() {
        return compactDiskRepository.findAll();
    }

    public CompactDisk create(CompactDisk compactDisk) {
        return compactDiskRepository.save(compactDisk);
    }

    @Override
    public void update(DBCollection collection) {
        BasicDBObject dbObject = new BasicDBObject();
        dbObject.append("$set", new BasicDBObject().append("name", "Pippo"));
        BasicDBObject searchQuery = new BasicDBObject().append("title", "Pippo2");
        collection.update(searchQuery, dbObject);
    }
}
