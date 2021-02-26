package com.maciej.petclinic.services.map;

import com.maciej.petclinic.model.BasicEntity;

import java.util.*;

public abstract class AbstractServiceMap<T extends BasicEntity,ID extends Long> {

    protected Map<Long,T> map = new HashMap<>();

    T findById(ID id) {
        return map.get(id);
    }

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T save(T object) {
        if (object !=null) {
            if (object.getId()==null){
                object.setId(getNextId());
            }
        } else {
            throw new RuntimeException("Object saved to HashMap cannot be null");
        }

        map.put(object.getId(),object);
        return object;
    }

    void delete(T object) {
        map.entrySet().removeIf(saved -> saved.equals(object));
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    private Long getNextId() {
        Long id = null;

        try {
            id = Collections.max(map.keySet())+1;
        } catch (RuntimeException e) {
            id = 1L;
        }
        return id;
    }
}
