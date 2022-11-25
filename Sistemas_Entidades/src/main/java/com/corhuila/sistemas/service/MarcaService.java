package com.corhuila.sistemas.service;

import com.corhuila.sistemas.entity.Marcas;
import com.corhuila.sistemas.irepository.IMarcasRepository;
import com.corhuila.sistemas.iservice.IMarcasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService implements IMarcasService {

    @Autowired
    private IMarcasRepository iMarcasRepository;

    @Override
    public List<Marcas> all() {
        return this.iMarcasRepository.findAll();
    }

    @Override
    public Optional<Marcas> findById(Long id) {
        return this.iMarcasRepository.findById(id);
    }

    @Override
    public Marcas save(Marcas marcas) {
        return this.iMarcasRepository.save(marcas);
    }

    @Override
    public void delete(Long id) {

        this.iMarcasRepository.deleteById(id);
    }
}
