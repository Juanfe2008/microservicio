package com.corhuila.sistemas.irepository;

import com.corhuila.sistemas.entity.Vehiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculoRepository extends JpaRepository<Vehiculos,Long> {
}
