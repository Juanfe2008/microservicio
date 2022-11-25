package com.corhuila.sistemas.irepository;

import com.corhuila.sistemas.entity.Municipios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICiudades extends JpaRepository<Municipios, Long> {
}
