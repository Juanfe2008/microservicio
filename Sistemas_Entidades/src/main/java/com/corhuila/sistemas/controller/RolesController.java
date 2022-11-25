package com.corhuila.sistemas.controller;


import com.corhuila.sistemas.entity.Roles;
import com.corhuila.sistemas.iservice.IRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/roles")
public class RolesController {

	@Autowired
	private IRolesService service;

	@GetMapping
	public List<Roles> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Roles> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Roles save(@RequestBody Roles roles) {
		return service.save(roles);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Roles update(@PathVariable Long id, @RequestBody Roles roles) {
		Optional<Roles> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Roles rolesUpdate = op.get();
			rolesUpdate.setNombre(roles.getNombre());						
			rolesUpdate.setEstado(roles.getEstado());
			return service.save(rolesUpdate);
		}
		
		return roles;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
