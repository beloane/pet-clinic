package belo.springframework.petclinic.services;

import belo.springframework.petclinic.model.Owner;
import belo.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
