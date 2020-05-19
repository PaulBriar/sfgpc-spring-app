package com.paulbriar.sfgpcspringapp.services;

import com.paulbriar.sfgpcspringapp.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
