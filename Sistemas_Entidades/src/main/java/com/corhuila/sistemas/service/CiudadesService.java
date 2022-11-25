package com.corhuila.sistemas.service;

import com.corhuila.sistemas.entity.Municipios;
import com.corhuila.sistemas.irepository.ICiudades;
import com.corhuila.sistemas.iservice.ICiudadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CiudadesService implements ICiudadesService {

    @Autowired
    private ICiudades repository;

    @Override
    public List<Municipios> all() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Municipios> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public Municipios save(Municipios municipios) {
        return this.repository.save(municipios);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }


}
