package com.corso.java.boot.service.api;

import com.corso.java.boot.domain.CompactDisk;
import com.mongodb.DBCollection;
import java.util.List;

public interface CompactDiskService {
    List<CompactDisk> findAll();
    CompactDisk create(CompactDisk compactDisk);
    void update(DBCollection collection);
    // CompactDisk findById(String id);
}
