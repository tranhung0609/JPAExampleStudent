package com.daicent.jpaexample.service;

import com.daicent.jpaexample.IService;
import com.daicent.jpaexample.model.School;
import com.daicent.jpaexample.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Component
public class SchoolService implements IService<School> {

    @Autowired
    SchoolRepository schoolRepository;

    @Override
    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    @Override
    public School save(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public School update(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public void delete(School school) {
        schoolRepository.delete(school);
    }

    @Override
    public School findById(Long id) {
        return schoolRepository.findById(id).get();
    }

    public List<School> findByName(String name) {
        return schoolRepository.findAllByNameContains(name);
    }

}
