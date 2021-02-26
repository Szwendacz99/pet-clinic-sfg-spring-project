package com.maciej.petclinic.bootstrap;

import com.maciej.petclinic.model.Owner;
import com.maciej.petclinic.model.Vet;
import com.maciej.petclinic.services.OwnerService;
import com.maciej.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) {

        System.out.println("Loading owners.....");

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("William");
        owner1.setLastName("Adama");

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Gaius");
        owner2.setLastName("Baltar");

        ownerService.save(owner1);
        ownerService.save(owner2);

        System.out.println("Loading vets.....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Laura");
        vet1.setLastName("Roslin");

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Felix");
        vet2.setLastName("Gaeta");

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("Loading finished!");

    }
}
