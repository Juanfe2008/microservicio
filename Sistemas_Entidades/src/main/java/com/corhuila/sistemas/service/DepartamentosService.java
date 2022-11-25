package com.corhuila.sistemas.service;

import com.corhuila.sistemas.entity.Departamentos;
import com.corhuila.sistemas.irepository.IDepartamentos;
import com.corhuila.sistemas.iservice.IDepartamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentosService implements IDepartamentosService {

    @Autowired
    private IDepartamentos repository;

    @Override
    public List<Departamentos> all() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Departamentos> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public Departamentos save(Departamentos departamentos) {
        return this.repository.save(departamentos);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
