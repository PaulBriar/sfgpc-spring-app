package com.paulbriar.sfgpcspringapp.services;

import com.paulbriar.sfgpcspringapp.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
