package com.daicent.jpaexample.service;

import com.daicent.jpaexample.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;
}
