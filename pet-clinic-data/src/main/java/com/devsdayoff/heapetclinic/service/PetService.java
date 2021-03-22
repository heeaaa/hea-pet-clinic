package com.devsdayoff.heapetclinic.service;

import com.devsdayoff.heapetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save (Pet pet);
    Set<Pet> findAll();

}
