package com.corhuila.sistemas.irepository;

import com.corhuila.sistemas.entity.TiposVehiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoVehiculoRepository extends JpaRepository<TiposVehiculos,Long> {
}
