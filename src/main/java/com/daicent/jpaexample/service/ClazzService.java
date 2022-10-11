package com.daicent.jpaexample.service;

import com.daicent.jpaexample.repository.ClazzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClazzService {
    @Autowired
    private ClazzRepository classRepository;

}
