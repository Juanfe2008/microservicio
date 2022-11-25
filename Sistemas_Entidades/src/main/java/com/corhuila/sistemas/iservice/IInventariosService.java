package com.corhuila.sistemas.iservice;

import com.corhuila.sistemas.entity.Inventarios;

import java.util.List;
import java.util.Optional;

public interface IInventariosService {
    List<Inventarios> all();

    Optional<Inventarios> findById(Long id);

    Inventarios save(Inventarios inventarios);

    void delete(Long id);
}
