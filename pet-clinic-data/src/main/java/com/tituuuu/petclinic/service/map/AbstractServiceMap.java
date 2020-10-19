package com.tituuuu.petclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public abstract class AbstractServiceMap<T, ID> {

    protected Map<ID,T> map = new HashMap<>();

    Iterable<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findByID(ID id){
        return map.get(id);
    }

    T save(ID id,T object){
        map.put(id, object);
        return object;
    }

    Boolean deleteByID(ID id){
        T result = map.remove(id);
        return result != null;
    }

    Boolean deleteByObject(T object){
        return map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
