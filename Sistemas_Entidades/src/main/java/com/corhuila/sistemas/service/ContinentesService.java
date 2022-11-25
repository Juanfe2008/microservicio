package com.corhuila.sistemas.service;

import com.corhuila.sistemas.entity.Continentes;
import com.corhuila.sistemas.irepository.IContinentes;
import com.corhuila.sistemas.iservice.IContinentesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContinentesService implements IContinentesService {

    @Autowired
    private IContinentes repository;

    @Override
    public List<Continentes> all() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Continentes> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public Continentes save(Continentes continentes) {
        return this.repository.save(continentes);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
