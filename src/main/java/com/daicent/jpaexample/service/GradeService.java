package com.daicent.jpaexample.service;

import com.daicent.jpaexample.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GradeService {

    @Autowired
    GradeRepository gradeRepository;
}
