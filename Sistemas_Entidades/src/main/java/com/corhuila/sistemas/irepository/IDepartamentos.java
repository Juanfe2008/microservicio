package com.corhuila.sistemas.irepository;

import com.corhuila.sistemas.entity.Departamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartamentos extends JpaRepository<Departamentos, Long> {
}
