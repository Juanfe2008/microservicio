package com.corhuila.sistemas.service;

import com.corhuila.sistemas.entity.TiposVehiculos;
import com.corhuila.sistemas.irepository.ITipoVehiculoRepository;
import com.corhuila.sistemas.iservice.ITipoVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoVehiculoService implements ITipoVehiculoService {

    @Autowired
    private ITipoVehiculoRepository vehiculoRepository;

    @Override
    public List<TiposVehiculos> all() {
        return this.vehiculoRepository.findAll();
    }

    @Override
    public Optional<TiposVehiculos> findById(Long id) {
        return this.vehiculoRepository.findById(id);
    }

    @Override
    public TiposVehiculos save(TiposVehiculos tiposVehiculos) {
        return this.vehiculoRepository.save(tiposVehiculos);
    }

    @Override
    public void delete(Long id) {

        this.vehiculoRepository.deleteById(id);
    }
}
