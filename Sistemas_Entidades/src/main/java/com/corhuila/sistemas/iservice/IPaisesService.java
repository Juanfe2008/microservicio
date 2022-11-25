package com.corhuila.sistemas.iservice;

import com.corhuila.sistemas.entity.Paises;

import java.util.List;
import java.util.Optional;

public interface IPaisesService {
    public List<Paises> all();

    public Optional<Paises> findById(Long id);

    public Paises save(Paises paises);

    public void delete(Long id);
}
