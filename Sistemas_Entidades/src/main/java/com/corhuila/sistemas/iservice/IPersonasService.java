package com.corhuila.sistemas.iservice;



import com.corhuila.sistemas.entity.Personas;

import java.util.List;
import java.util.Optional;

public interface IPersonasService {
	
	public List<Personas> all();
	
	public Optional<Personas> findById(Long id);
	
	public Personas save(Personas personas);
	
	public void delete(Long id);
}
