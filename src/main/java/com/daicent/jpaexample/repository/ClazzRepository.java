package com.daicent.jpaexample.repository;

import com.daicent.jpaexample.model.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazzRepository extends JpaRepository<Clazz, Long> {
}
