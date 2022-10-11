package com.daicent.jpaexample;

import java.util.List;

public interface IService <T> {
    List<T> findAll();
    T save(T t);
    T update(T t);
    void delete(T t);
    T findById(Long id);
}
