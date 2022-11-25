package com.corhuila.sistemas.iservice;

import com.corhuila.sistemas.entity.DetallesFacturas;
import com.corhuila.sistemas.entity.Facturas;

import java.util.List;
import java.util.Optional;

public interface IDetallesFacturasService {

    List<DetallesFacturas> all();

    Optional<DetallesFacturas> findById(Long id);

    DetallesFacturas save(DetallesFacturas detallesFacturas);

    void delete(Long id);
}
