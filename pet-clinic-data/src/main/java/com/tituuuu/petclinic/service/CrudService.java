package com.tituuuu.petclinic.service;

public interface CrudService<T, ID> {
    Iterable<T> findAll();

    T findByID(ID id);

    T save(T object);

    Boolean delete(T object);

    Boolean deleteByID(ID id);
}
