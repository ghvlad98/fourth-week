package com.corso.java.boot.repository;

import com.corso.java.boot.domain.CompactDisk;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompactDiskRepository extends MongoRepository<CompactDisk, String> {

}