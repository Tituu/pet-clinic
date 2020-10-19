package com.tituuuu.petclinic.service.map;

import com.tituuuu.petclinic.model.Owner;
import com.tituuuu.petclinic.service.CrudService;

public class OwnerServiceMap extends AbstractServiceMap<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Iterable<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Boolean delete(Owner object) {
        return super.deleteByObject(object);
    }

    @Override
    public Boolean deleteByID(Long id) {
        return super.deleteByID(id);
    }
}
