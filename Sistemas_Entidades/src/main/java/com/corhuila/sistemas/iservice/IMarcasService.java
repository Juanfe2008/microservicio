package com.corhuila.sistemas.iservice;

import com.corhuila.sistemas.entity.Marcas;

import java.util.List;
import java.util.Optional;

public interface IMarcasService {

     List<Marcas> all();

     Optional<Marcas> findById(Long id);

    Marcas save(Marcas marcas);

     void delete(Long id);
}
