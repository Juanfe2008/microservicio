package com.corhuila.sistemas.service;

import com.corhuila.sistemas.entity.Inventarios;
import com.corhuila.sistemas.irepository.IInventariosRepository;
import com.corhuila.sistemas.iservice.IInventariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventariosService implements IInventariosService {

    @Autowired
    private IInventariosRepository iInventariosRepository;

    @Override
    public List<Inventarios> all() {
        return this.iInventariosRepository.findAll();
    }

    @Override
    public Optional<Inventarios> findById(Long id) {
        return this.iInventariosRepository.findById(id);
    }

    @Override
    public Inventarios save(Inventarios inventarios) {
        return this.iInventariosRepository.save(inventarios);
    }

    @Override
    public void delete(Long id) {
        this.iInventariosRepository.deleteById(id);
    }
}
