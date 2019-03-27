package com.prkat.mangomatters.service;

import com.prkat.mangomatters.model.Orchard;
import com.prkat.mangomatters.model.Variety;
import com.prkat.mangomatters.repository.VarietyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class VarietyService {
    @Autowired
    VarietyRepository repository;
    @Transactional
    public boolean addVariety(Variety variety) {
        return repository.save(variety) != null;
    }


    @Transactional
    public List<Variety> getAllVarities() {
        return (List<Variety>) repository.findAll();
    }


    public void deleteById(long varietyId) {
        repository.deleteById(varietyId);

    }

    public boolean updateVariety(Variety variety) {
        return repository.save(variety) != null;
    }
}
