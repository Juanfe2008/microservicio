package com.corhuila.sistemas.controller;


import com.corhuila.sistemas.entity.Continentes;
import com.corhuila.sistemas.iservice.IContinentesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/continente")
public class ContinentesController {

    @Autowired
    private IContinentesService service;

    @GetMapping
    public List<Continentes> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Continentes> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Continentes save(@RequestBody Continentes continentes) {
        return service.save(continentes);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Continentes update(@PathVariable Long id, @RequestBody Continentes continentes) {
        Optional<Continentes> op = service.findById(id);

        if (!op.isEmpty()) {
            Continentes continentesUpdate = op.get();
            continentesUpdate.setEstado(continentes.getEstado());
            continentesUpdate.setNombre(continentes.getNombre());
            continentesUpdate.setCodigo(continentes.getCodigo());
            return service.save(continentesUpdate);
        }
        return continentes;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
