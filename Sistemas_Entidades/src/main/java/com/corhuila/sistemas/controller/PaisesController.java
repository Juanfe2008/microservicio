package com.corhuila.sistemas.controller;

import com.corhuila.sistemas.entity.Paises;
import com.corhuila.sistemas.iservice.IPaisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/paises")
public class PaisesController {

    @Autowired
    private IPaisesService service;

    @GetMapping
    public List<Paises> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Paises> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Paises save(@RequestBody Paises paises) {
        return service.save(paises);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Paises update(@PathVariable Long id, @RequestBody Paises paises) {
        Optional<Paises> op = service.findById(id);

        if (!op.isEmpty()) {
            Paises paisesUpdate = op.get();
            paisesUpdate.setNombre(paises.getNombre());
            paisesUpdate.setCodigo(paises.getCodigo());
            paisesUpdate.setEstado(paises.getEstado());
            return service.save(paisesUpdate);
        }

        return paises;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
