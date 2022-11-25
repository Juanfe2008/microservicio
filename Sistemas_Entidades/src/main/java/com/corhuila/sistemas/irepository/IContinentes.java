package com.corhuila.sistemas.irepository;

import com.corhuila.sistemas.entity.Continentes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContinentes extends JpaRepository<Continentes, Long> {
}
