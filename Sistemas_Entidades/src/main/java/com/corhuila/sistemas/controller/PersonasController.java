package com.corhuila.sistemas.controller;


import com.corhuila.sistemas.entity.Personas;
import com.corhuila.sistemas.iservice.IPersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api1.0/personas")
public class PersonasController {
	@Autowired
	private IPersonasService service;

	@GetMapping
	public List<Personas> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Personas> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Personas save(@RequestBody Personas personas) {
		return service.save(personas);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Personas update(@PathVariable Long id, @RequestBody Personas personas) {
		Optional<Personas> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Personas personasUpdate = op.get();
			personasUpdate.setTipoDocumento(personas.getTipoDocumento());
			personasUpdate.setDocumento(personas.getDocumento());
			personasUpdate.setNombre(personas.getNombre());
			personasUpdate.setGenero(personas.getGenero());
			personasUpdate.setCorreo(personas.getCorreo());
			personasUpdate.setTelefono(personas.getTelefono());
			personasUpdate.setEstado(personas.getEstado());
			return service.save(personasUpdate);
		}
		
		return personas;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
