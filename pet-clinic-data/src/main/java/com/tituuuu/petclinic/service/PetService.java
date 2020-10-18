package com.tituuuu.petclinic.service;

import com.tituuuu.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
