package com.corhuila.sistemas.controller;

import com.corhuila.sistemas.entity.Marcas;
import com.corhuila.sistemas.entity.Paises;
import com.corhuila.sistemas.entity.TiposVehiculos;
import com.corhuila.sistemas.entity.Vehiculos;
import com.corhuila.sistemas.iservice.IVehiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api1.0/vehiculos")
public class VehiculoController {

    @Autowired
    private IVehiculosService iVehiculosService;

    @GetMapping
    public List<Vehiculos> all() {
        return iVehiculosService.all();
    }

    @GetMapping("{id}")
    public Optional<Vehiculos> show(@PathVariable Long id) {
        return iVehiculosService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Vehiculos save(@RequestBody Vehiculos vehiculos) {
        return iVehiculosService.save(vehiculos);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Vehiculos update(@PathVariable Long id, @RequestBody Vehiculos vehiculos) {
        Optional<Vehiculos> op = iVehiculosService.findById(id);

        if (!op.isEmpty()) {
            Vehiculos vehiculosUpdate = op.get();
            vehiculosUpdate.setCilindraje(vehiculos.getCilindraje());
            vehiculosUpdate.setCodigo(vehiculos.getCodigo());
            vehiculosUpdate.setEstado(vehiculos.getEstado());
            vehiculosUpdate.setDescripcion(vehiculos.getDescripcion());
            vehiculosUpdate.setColor(vehiculos.getColor());
            vehiculosUpdate.setKilometraje(vehiculos.getKilometraje());
            vehiculosUpdate.setTipoVehiculoId(vehiculos.getTipoVehiculoId());
            vehiculosUpdate.setMarcasId(vehiculos.getMarcasId());
            return iVehiculosService.save(vehiculosUpdate);
        }

        return vehiculos;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        iVehiculosService.delete(id);
    }

}
