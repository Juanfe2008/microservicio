package com.corhuila.sistemas.controller;

import com.corhuila.sistemas.entity.Marcas;
import com.corhuila.sistemas.entity.TiposVehiculos;
import com.corhuila.sistemas.iservice.ITipoVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api1.0/tipo_vehiculo")
public class TipoVehiculoController {

    @Autowired
    private ITipoVehiculoService vehiculoService;

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<TiposVehiculos> all(){
        return vehiculoService.all();
    }

    @GetMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Optional<TiposVehiculos> findById(@PathVariable Long id){
        return vehiculoService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public TiposVehiculos save(@RequestBody TiposVehiculos tiposVehiculos){
        return vehiculoService.save(tiposVehiculos);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public TiposVehiculos update(@PathVariable Long id,@RequestBody TiposVehiculos tiposVehiculos){
        Optional<TiposVehiculos> tipoVehiculo = vehiculoService.findById(id);

        if (!tipoVehiculo.isEmpty()){
            TiposVehiculos tiposVehiculosUpdate = tipoVehiculo.get();
            tiposVehiculosUpdate.setId(tiposVehiculos.getId());
            tiposVehiculosUpdate.setCodigo(tiposVehiculos.getCodigo());
            tiposVehiculosUpdate.setEstado(tiposVehiculos.getEstado());
            tiposVehiculosUpdate.setDescripcion(tiposVehiculos.getDescripcion());
            return vehiculoService.save(tiposVehiculosUpdate);
        }

        return tiposVehiculos;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id){
        vehiculoService.delete(id);
    }

}
