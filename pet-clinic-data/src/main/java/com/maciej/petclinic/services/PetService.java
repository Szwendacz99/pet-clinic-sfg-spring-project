package com.maciej.petclinic.services;

import com.maciej.petclinic.model.Pet;

import java.time.LocalDate;
import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet findByBirthDate(LocalDate date);

    Set<Pet> findAll();
}
