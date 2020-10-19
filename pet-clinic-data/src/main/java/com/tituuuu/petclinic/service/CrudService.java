package com.tituuuu.petclinic.service;

public interface CrudService<T, ID> {
    Iterable<T> findAll();

    T findByID(ID id);

    T save(T object);

    boolean delete(T object);

    void deleteByID(ID id);
}
