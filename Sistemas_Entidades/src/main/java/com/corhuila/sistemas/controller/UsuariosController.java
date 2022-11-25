package com.corhuila.sistemas.controller;

import com.corhuila.sistemas.entity.Usuarios;
import com.corhuila.sistemas.iservice.IUsuariosService;
import com.corhuila.sistemas.model.Producto;
import com.corhuila.sistemas.model.ResponseProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/usuarios")
public class UsuariosController {

	@Autowired
	private IUsuariosService service;

	@GetMapping
	public List<Usuarios> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Usuarios> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Usuarios save(@RequestBody Usuarios usuarios) {
		return service.save(usuarios);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Usuarios update(@PathVariable Long id, @RequestBody Usuarios usuarios) {
		Optional<Usuarios> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Usuarios usuariosUpdate = op.get();
			usuariosUpdate.setUsuario(usuarios.getUsuario());
			usuariosUpdate.setContrasenia(usuarios.getContrasenia());						
			usuariosUpdate.setEstado(usuarios.getEstado());
			return service.save(usuariosUpdate);
		}
		
		return usuarios;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

	@PostMapping("save/producto")
	public ResponseEntity<ResponseProducto> saveProducto(@RequestBody Producto producto){
		return new ResponseEntity<>(service.saveProducto(producto),HttpStatus.OK);
	}
}
