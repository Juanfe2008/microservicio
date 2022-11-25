package com.corhuila.sistemas.iservice;

import com.corhuila.sistemas.entity.Departamentos;

import java.util.List;
import java.util.Optional;

public interface IDepartamentosService {

    public List<Departamentos> all();

    public Optional<Departamentos> findById(Long id);

    public Departamentos save(Departamentos departamentos);

    public void delete(Long id);
}
