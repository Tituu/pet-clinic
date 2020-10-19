package com.tituuuu.petclinic.service;

import com.tituuuu.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
