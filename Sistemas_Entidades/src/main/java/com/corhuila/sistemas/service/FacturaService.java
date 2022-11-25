package com.corhuila.sistemas.service;

import com.corhuila.sistemas.entity.Facturas;
import com.corhuila.sistemas.irepository.IFacturasRepository;
import com.corhuila.sistemas.iservice.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService implements IFacturaService {

    @Autowired
    private IFacturasRepository iFacturasRepository;

    @Override
    public List<Facturas> all() {
        return this.iFacturasRepository.findAll();
    }

    @Override
    public Optional<Facturas> findById(Long id) {
        return this.iFacturasRepository.findById(id);
    }

    @Override
    public Facturas save(Facturas facturas) {
        return this.iFacturasRepository.save(facturas);
    }

    @Override
    public void delete(Long id) {
        this.iFacturasRepository.deleteById(id);
    }
}
