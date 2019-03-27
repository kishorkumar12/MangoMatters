package com.prkat.mangomatters.service;

import com.prkat.mangomatters.model.Orchard;
import com.prkat.mangomatters.repository.OrchardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrchardServiceIml {
    @Autowired
    OrchardRepository repository;

    @Transactional
    public List<Orchard> getAllOrchidDetails() {
        return (List<Orchard>) repository.findAll();
    }


    @Transactional
    public boolean addOrchard(Orchard orchard) {
        return repository.save(orchard) != null;
    }
 /*  @Transactional
    public void deleteOrchard(Long orchardId) {
       repository.delete(orchardId);
   }
*/
    /*@Transactional
    public void deleteOrchard(Orchard orchardId) {
        repository.delete(orchardId);
    }*/

    @Transactional
    public boolean updateOrchard(Orchard orchard) {
        return repository.save(orchard) != null;
    }


    public void deleteById(long orchardId) {
        repository.deleteById(orchardId);
    }
}
