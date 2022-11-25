package com.corhuila.sistemas.irepository;

import com.corhuila.sistemas.entity.Facturas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturasRepository extends JpaRepository<Facturas,Long> {
}
