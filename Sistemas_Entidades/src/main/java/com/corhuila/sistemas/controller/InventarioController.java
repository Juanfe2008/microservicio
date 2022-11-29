package com.corhuila.sistemas.controller;

import com.corhuila.sistemas.entity.Facturas;
import com.corhuila.sistemas.entity.Inventarios;
import com.corhuila.sistemas.iservice.IInventariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/inventario")
public class InventarioController {

    @Autowired
    private IInventariosService iInventariosService;

    @GetMapping
    public List<Inventarios> all() {
        return iInventariosService.all();
    }

    @GetMapping("{id}")
    public Optional<Inventarios> show(@PathVariable Long id) {
        return iInventariosService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Inventarios save(@RequestBody Inventarios inventarios) {
        return iInventariosService.save(inventarios);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Inventarios update(@PathVariable Long id, @RequestBody Inventarios inventarios) {
        Optional<Inventarios> op = iInventariosService.findById(id);

        if (!op.isEmpty()) {
            Inventarios inventariosUpdate = op.get();
            inventariosUpdate.setPrecioUnitario(inventarios.getPrecioUnitario());
            inventariosUpdate.setCantidadExistente(inventarios.getCantidadExistente());
            inventariosUpdate.setEstado(inventarios.getEstado());
            inventariosUpdate.setObservacion(inventarios.getObservacion());
            inventariosUpdate.setVehiculosId(inventarios.getVehiculosId());
             return iInventariosService.save(inventariosUpdate);
        }

        return inventarios;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        iInventariosService.delete(id);
    }

}
