package com.corhuila.sistemas.iservice;

import com.corhuila.sistemas.entity.Continentes;

import java.util.List;
import java.util.Optional;

public interface IContinentesService {
    public List<Continentes> all();

    public Optional<Continentes> findById(Long id);

    public Continentes save(Continentes continentes);

    public void delete(Long id);
}
