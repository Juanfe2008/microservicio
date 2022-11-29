package com.corhuila.sistemas.controller;

import com.corhuila.sistemas.entity.Marcas;
import com.corhuila.sistemas.iservice.IMarcasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/marca")
public class MarcasControler {

    @Autowired
    private IMarcasService iMarcasService;

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<Marcas> all(){
        return iMarcasService.all();
    }

    @GetMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Optional<Marcas> findById(@PathVariable Long id){
        return iMarcasService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Marcas save(@RequestBody Marcas marcas){
        return iMarcasService.save(marcas);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Marcas update(@PathVariable Long id,@RequestBody Marcas marcas){
        Optional<Marcas> marca = iMarcasService.findById(id);

        if (!marca.isEmpty()){
            Marcas marcasUpdate = marca.get();
            marcasUpdate.setId(marcas.getId());
            marcasUpdate.setCodigo(marcas.getCodigo());
            marcasUpdate.setEstado(marcas.getEstado());
            marcasUpdate.setDescripcion(marcas.getDescripcion());
            return iMarcasService.save(marcasUpdate);
        }

        return marcas;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id){
        iMarcasService.delete(id);
    }



}
