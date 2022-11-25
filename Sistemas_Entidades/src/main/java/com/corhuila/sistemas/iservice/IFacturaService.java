package com.corhuila.sistemas.iservice;

import com.corhuila.sistemas.entity.Facturas;
import com.corhuila.sistemas.entity.Marcas;

import java.util.List;
import java.util.Optional;

public interface IFacturaService {

    List<Facturas> all();

    Optional<Facturas> findById(Long id);

    Facturas save(Facturas facturas);

    void delete(Long id);
}
