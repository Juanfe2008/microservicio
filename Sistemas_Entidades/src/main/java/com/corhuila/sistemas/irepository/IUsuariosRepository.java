package com.corhuila.sistemas.irepository;


import com.corhuila.sistemas.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuariosRepository extends JpaRepository<Usuarios, Long>{

}
