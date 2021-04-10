package com.devsdayoff.heapetclinic.bootstrap;

import com.devsdayoff.heapetclinic.model.Owner;
import com.devsdayoff.heapetclinic.model.Vet;
import com.devsdayoff.heapetclinic.service.OwnerService;
import com.devsdayoff.heapetclinic.service.VetService;
import com.devsdayoff.heapetclinic.service.map.OwnerServiceMap;
import com.devsdayoff.heapetclinic.service.map.VetServiceMap;
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
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Sakura");
        owner1.setLastName("Haruno");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ino");
        owner2.setLastName("Yamanaka");
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Itachi");
        owner3.setLastName("Uchiha");
        ownerService.save(owner3);

        Owner owner4 = new Owner();
        owner4.setFirstName("Sasuke");
        owner4.setLastName("Uchiha");
        ownerService.save(owner4);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Mikasa");
        vet1.setLastName("Ackerman");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Eren");
        vet2.setLastName("Jaeger");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
