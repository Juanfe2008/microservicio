package com.corhuila.sistemas.irepository;

import com.corhuila.sistemas.entity.Paises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaises extends JpaRepository<Paises, Long> {
}
