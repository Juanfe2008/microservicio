package com.corhuila.sistemas.controller;

import com.corhuila.sistemas.entity.DetallesFacturas;
import com.corhuila.sistemas.entity.Facturas;
import com.corhuila.sistemas.iservice.IDetallesFacturasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/detalle_factura")
public class DetallesFacturaController {

    @Autowired
    private IDetallesFacturasService iDetallesFacturasService;

    @GetMapping
    public List<DetallesFacturas> all() {
        return iDetallesFacturasService.all();
    }

    @GetMapping("{id}")
    public Optional<DetallesFacturas> show(@PathVariable Long id) {
        return iDetallesFacturasService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public DetallesFacturas save(@RequestBody DetallesFacturas detallesFacturas) {
        return iDetallesFacturasService.save(detallesFacturas);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public DetallesFacturas update(@PathVariable Long id, @RequestBody DetallesFacturas detallesFacturas) {
        Optional<DetallesFacturas> op = iDetallesFacturasService.findById(id);

        if (!op.isEmpty()) {
            DetallesFacturas detalleFacturaUpdate = op.get();
            detalleFacturaUpdate.setCantidad(detallesFacturas.getCantidad());
            detalleFacturaUpdate.setPrecio(detallesFacturas.getPrecio());
            detalleFacturaUpdate.setEstado(detallesFacturas.getEstado());
            detalleFacturaUpdate.setFacturasId(detallesFacturas.getFacturasId());
            detalleFacturaUpdate.setInventariosId(detallesFacturas.getInventariosId());
            return iDetallesFacturasService.save(detalleFacturaUpdate);
        }

        return detallesFacturas;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        iDetallesFacturasService.delete(id);
    }

}
