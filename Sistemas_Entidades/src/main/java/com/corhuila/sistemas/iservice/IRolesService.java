package com.corhuila.sistemas.iservice;



import com.corhuila.sistemas.entity.Roles;

import java.util.List;
import java.util.Optional;

public interface IRolesService {
	
	public List<Roles> all();
	
	public Optional<Roles> findById(Long id);
	
	public Roles save(Roles roles);
	
	public void delete(Long id);
}
