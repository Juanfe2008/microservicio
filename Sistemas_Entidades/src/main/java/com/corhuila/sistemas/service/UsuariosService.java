package com.corhuila.sistemas.service;


import com.corhuila.sistemas.entity.Usuarios;
import com.corhuila.sistemas.feignclients.ProductoFeingClient;
import com.corhuila.sistemas.irepository.IUsuariosRepository;
import com.corhuila.sistemas.iservice.IUsuariosService;
import com.corhuila.sistemas.model.Producto;
import com.corhuila.sistemas.model.ResponseProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService implements IUsuariosService {
	@Autowired
	IUsuariosRepository repository;

	@Autowired
	ProductoFeingClient productoFeingClient;

	
	@Override
	public List<Usuarios> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Usuarios> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Usuarios save(Usuarios usuarios) {
		return this.repository.save(usuarios);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}

	@Override
	public ResponseProducto saveProducto(Producto producto){
		ResponseProducto listProducto = productoFeingClient.save(producto);
		return listProducto;
	}
}
