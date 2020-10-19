package com.tituuuu.petclinic.service.map;

import com.tituuuu.petclinic.model.Pet;
import com.tituuuu.petclinic.service.CrudService;

public class PetServiceMap extends AbstractServiceMap<Pet,Long> implements CrudService<Pet, Long> {
    @Override
    public Iterable<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Boolean deleteByID(Long id) {
        return super.deleteByID(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Boolean delete(Pet object) {
        return super.deleteByObject(object);
    }

    @Override
    public Pet findByID(Long id) {
        return super.findByID(id);
    }
}
