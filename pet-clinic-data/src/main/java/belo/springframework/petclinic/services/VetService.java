package belo.springframework.petclinic.services;

import belo.springframework.petclinic.model.Owner;
import belo.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
