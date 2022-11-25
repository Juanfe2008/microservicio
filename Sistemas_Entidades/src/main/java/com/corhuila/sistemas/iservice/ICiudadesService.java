package com.corhuila.sistemas.iservice;

import com.corhuila.sistemas.entity.Municipios;

import java.util.List;
import java.util.Optional;

public interface ICiudadesService {
    public List<Municipios> all();

    public Optional<Municipios> findById(Long id);

    public Municipios save(Municipios municipios);

    public void delete(Long id);
}
