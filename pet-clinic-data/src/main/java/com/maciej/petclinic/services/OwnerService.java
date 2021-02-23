package com.maciej.petclinic.services;

import com.maciej.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
