package com.corhuila.sistemas.controller;

import com.corhuila.sistemas.entity.Facturas;
import com.corhuila.sistemas.iservice.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/factura")
public class FacturaController {

    @Autowired
    private IFacturaService iFacturaService;

    @GetMapping
    public List<Facturas> all() {
        return iFacturaService.all();
    }

    @GetMapping("{id}")
    public Optional<Facturas> show(@PathVariable Long id) {
        return iFacturaService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Facturas save(@RequestBody Facturas facturas) {
        return iFacturaService.save(facturas);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Facturas update(@PathVariable Long id, @RequestBody Facturas facturas) {
        Optional<Facturas> op = iFacturaService.findById(id);

        if (!op.isEmpty()) {
            Facturas facturasUpdate = op.get();
            facturasUpdate.setValorTotal(facturas.getValorTotal());
            facturasUpdate.setCodigo(facturas.getCodigo());
            facturasUpdate.setEstado(facturas.getEstado());
            facturasUpdate.setFecha(facturas.getFecha());
            facturasUpdate.setMunicipiosId(facturas.getMunicipiosId());
            facturasUpdate.setPersonasId(facturas.getPersonasId());
            return iFacturaService.save(facturasUpdate);
        }

        return facturas;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        iFacturaService.delete(id);
    }

}
