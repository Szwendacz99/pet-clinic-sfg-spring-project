package com.maciej.petclinic.services;

import com.maciej.petclinic.model.Pet;

import java.time.LocalDate;

public interface PetService extends CrudService<Pet,Long>{

    Pet findByBirthDate(LocalDate date);

}
