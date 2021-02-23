package com.maciej.petclinic.services;

import com.maciej.petclinic.model.Owner;
import com.maciej.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
