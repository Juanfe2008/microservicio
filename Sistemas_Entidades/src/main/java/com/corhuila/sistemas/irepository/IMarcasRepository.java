package com.corhuila.sistemas.irepository;

import com.corhuila.sistemas.entity.Marcas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMarcasRepository extends JpaRepository<Marcas,Long> {
}
