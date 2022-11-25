package com.corhuila.sistemas.irepository;

import com.corhuila.sistemas.entity.DetallesFacturas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetallesFacturasrepository extends JpaRepository<DetallesFacturas,Long> {
}
