package com.corhuila.sistemas.service;

import com.corhuila.sistemas.entity.DetallesFacturas;
import com.corhuila.sistemas.irepository.IDetallesFacturasrepository;
import com.corhuila.sistemas.iservice.IDetallesFacturasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallesFacturasService implements IDetallesFacturasService {

    @Autowired
    private IDetallesFacturasrepository iDetallesFacturasrepository;

    @Override
    public List<DetallesFacturas> all() {
        return this.iDetallesFacturasrepository.findAll();
    }

    @Override
    public Optional<DetallesFacturas> findById(Long id) {
        return this.iDetallesFacturasrepository.findById(id);
    }

    @Override
    public DetallesFacturas save(DetallesFacturas detallesFacturas) {
        return this.iDetallesFacturasrepository.save(detallesFacturas);
    }

    @Override
    public void delete(Long id) {
        this.iDetallesFacturasrepository.deleteById(id);
    }
}
