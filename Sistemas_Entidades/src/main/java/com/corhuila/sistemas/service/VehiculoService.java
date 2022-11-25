package com.corhuila.sistemas.service;

import com.corhuila.sistemas.entity.Vehiculos;
import com.corhuila.sistemas.irepository.IVehiculoRepository;
import com.corhuila.sistemas.iservice.IVehiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService implements IVehiculosService {

    @Autowired
    private IVehiculoRepository vehiculoRepository;

    @Override
    public List<Vehiculos> all() {
        return this.vehiculoRepository.findAll();
    }

    @Override
    public Optional<Vehiculos> findById(Long id) {
        return this.vehiculoRepository.findById(id);
    }

    @Override
    public Vehiculos save(Vehiculos vehiculos) {
        return this.vehiculoRepository.save(vehiculos);
    }

    @Override
    public void delete(Long id) {
        this.vehiculoRepository.deleteById(id);
    }
}
