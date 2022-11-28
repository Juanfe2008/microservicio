package com.corhuila.sistemas.feignclients;

import com.corhuila.sistemas.model.Producto;
import com.corhuila.sistemas.model.ResponseProducto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "prueba-service")
@RequestMapping("/api/products")
public interface ProductoFeingClient {

    @PostMapping("/save")
    ResponseProducto save(@RequestBody Producto producto);
}
