package com.corhuila.sistemas.controller;

import com.corhuila.sistemas.entity.Municipios;
import com.corhuila.sistemas.iservice.ICiudadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/ciudad")
public class CiudadesController {

    @Autowired
    private ICiudadesService service;

    @GetMapping
    public List<Municipios> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Municipios> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Municipios save(@RequestBody Municipios municipios) {
        return service.save(municipios);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Municipios update(@PathVariable Long id, @RequestBody Municipios municipios) {
        Optional<Municipios> op = service.findById(id);

        if (!op.isEmpty()) {
            Municipios municipiosUpdate = op.get();
            municipiosUpdate.setNombre(municipios.getNombre());
            municipiosUpdate.setCodigo(municipios.getCodigo());
            municipiosUpdate.setEstado(municipios.getEstado());
            return service.save(municipiosUpdate);
        }

        return municipios;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
