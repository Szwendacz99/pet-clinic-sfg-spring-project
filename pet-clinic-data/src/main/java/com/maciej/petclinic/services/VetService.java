package com.maciej.petclinic.services;

import com.maciej.petclinic.model.Vet;

public interface VetService extends CrudService<Vet,Long>{

    Vet findByLastName(String lastName);

}
