package com.daicent.jpaexample.repository;

import com.daicent.jpaexample.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
    public List<School> findAllByNameContains(String name);
}
