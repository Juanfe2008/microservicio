package com.corhuila.sistemas.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "municipios")
public class Municipios implements Serializable {

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @Column(name = "nombre", nullable = false)
    private String Nombre;

    @Column(name = "estado", nullable = false)
    private Boolean Estado;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "departamento_id", nullable = false)
    private Departamentos departamentoId;

    public Departamentos getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(Departamentos departamentoId) {
        this.departamentoId = departamentoId;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean estado) {
        Estado = estado;
    }
}
