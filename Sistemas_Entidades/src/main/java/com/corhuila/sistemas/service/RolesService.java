package com.corhuila.sistemas.service;


import com.corhuila.sistemas.entity.Roles;
import com.corhuila.sistemas.irepository.IRolesRepository;
import com.corhuila.sistemas.iservice.IRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolesService implements IRolesService {

	@Autowired
	private IRolesRepository repository;
	
	@Override
	public List<Roles> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Roles> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Roles save(Roles roles) {
		return this.repository.save(roles);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}
}
