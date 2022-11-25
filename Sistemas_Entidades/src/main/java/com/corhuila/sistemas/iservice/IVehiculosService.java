package com.corhuila.sistemas.iservice;

import com.corhuila.sistemas.entity.Vehiculos;

import java.util.List;
import java.util.Optional;

public interface IVehiculosService {

     List<Vehiculos> all();

     Optional<Vehiculos> findById(Long id);

     Vehiculos save(Vehiculos vehiculos);

     void delete(Long id);
}
