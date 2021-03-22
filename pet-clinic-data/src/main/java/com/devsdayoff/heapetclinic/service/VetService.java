package com.devsdayoff.heapetclinic.service;

import com.devsdayoff.heapetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save (Vet vet);
    Set<Vet> findAll();

}
