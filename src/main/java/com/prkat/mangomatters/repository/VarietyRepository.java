package com.prkat.mangomatters.repository;

import com.prkat.mangomatters.model.Orchard;
import com.prkat.mangomatters.model.Variety;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VarietyRepository implements JpaRepository<Variety,Long> {
    @Override
    public List<Variety> findAll() {
        return null;
    }

    @Override
    public List<Variety> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Variety> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Variety> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Variety variety) {

    }

    @Override
    public void deleteAll(Iterable<? extends Variety> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Variety> S save(S s) {
        return null;
    }

    @Override
    public <S extends Variety> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Variety> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Variety> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Variety> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Variety getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Variety> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Variety> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Variety> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Variety> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Variety> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Variety> boolean exists(Example<S> example) {
        return false;
    }
}
