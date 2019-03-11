package com.prkat.mangomatters.repository;

import com.prkat.mangomatters.model.Orchard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrchardRepository extends JpaRepository<Orchard,Long> {


}
