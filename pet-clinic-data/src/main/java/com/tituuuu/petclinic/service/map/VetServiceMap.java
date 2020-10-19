package com.tituuuu.petclinic.service.map;

import com.tituuuu.petclinic.model.Vet;
import com.tituuuu.petclinic.service.CrudService;

public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Iterable<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Boolean delete(Vet object) {
        return super.deleteByObject(object);
    }

    @Override
    public Boolean deleteByID(Long id) {
        return super.deleteByID(id);
    }
}
