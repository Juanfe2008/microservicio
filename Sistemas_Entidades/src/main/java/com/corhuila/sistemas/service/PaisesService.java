package com.corhuila.sistemas.service;

import com.corhuila.sistemas.entity.Paises;
import com.corhuila.sistemas.irepository.IPaises;
import com.corhuila.sistemas.iservice.IPaisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisesService implements IPaisesService {

    @Autowired
    private IPaises repository;

    @Override
    public List<Paises> all() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Paises> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public Paises save(Paises paises) {
        return this.repository.save(paises);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}