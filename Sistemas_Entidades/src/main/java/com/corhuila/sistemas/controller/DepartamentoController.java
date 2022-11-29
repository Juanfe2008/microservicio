package com.corhuila.sistemas.controller;


import com.corhuila.sistemas.entity.Departamentos;
import com.corhuila.sistemas.iservice.IDepartamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/departamento")
public class DepartamentoController {

    @Autowired
    private IDepartamentosService service;

    @GetMapping
    public List<Departamentos> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Departamentos> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Departamentos save(@RequestBody Departamentos departamentos) {
        return service.save(departamentos);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Departamentos update(@PathVariable Long id, @RequestBody Departamentos departamentos) {
        Optional<Departamentos> op = service.findById(id);

        if (!op.isEmpty()) {
            Departamentos departamentosUpdate = op.get();
            departamentosUpdate.setNombre(departamentos.getNombre());
            departamentosUpdate.setCodigo(departamentos.getCodigo());
            departamentosUpdate.setEstado(departamentos.getEstado());
            return service.save(departamentosUpdate);
        }

        return departamentos;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
