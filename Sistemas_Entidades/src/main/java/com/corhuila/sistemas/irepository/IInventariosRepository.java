package com.corhuila.sistemas.irepository;

import com.corhuila.sistemas.entity.Inventarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInventariosRepository extends JpaRepository<Inventarios,Long> {
}
