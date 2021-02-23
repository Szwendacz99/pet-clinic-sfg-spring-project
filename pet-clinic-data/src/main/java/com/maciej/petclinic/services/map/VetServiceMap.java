package com.maciej.petclinic.services.map;

import com.maciej.petclinic.model.Owner;
import com.maciej.petclinic.model.Vet;
import com.maciej.petclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractServiceMap<Vet,Long> implements CrudService<Vet,Long> {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
