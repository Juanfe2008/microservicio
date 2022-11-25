package com.corhuila.sistemas.irepository;


import com.corhuila.sistemas.entity.Personas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonasRepository extends JpaRepository<Personas, Long> {

}
