package com.corhuila.sistemas.iservice;

import com.corhuila.sistemas.entity.Marcas;
import com.corhuila.sistemas.entity.TiposVehiculos;

import java.util.List;
import java.util.Optional;

public interface ITipoVehiculoService {
    List<TiposVehiculos> all();

    Optional<TiposVehiculos> findById(Long id);

    TiposVehiculos save(TiposVehiculos tiposVehiculos);

    void delete(Long id);
}
