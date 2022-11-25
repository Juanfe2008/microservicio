package com.corhuila.sistemas.iservice;



import com.corhuila.sistemas.entity.Usuarios;
import com.corhuila.sistemas.model.Producto;
import com.corhuila.sistemas.model.ResponseProducto;

import java.util.List;
import java.util.Optional;

public interface IUsuariosService {

	List<Usuarios> all();
	
	Optional<Usuarios> findById(Long id);
	
	Usuarios save(Usuarios usuarios);
	
	void delete(Long id);

	ResponseProducto saveProducto(Producto producto);
}
