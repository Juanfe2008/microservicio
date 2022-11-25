package com.corhuila.sistemas.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "detalles_facturas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetallesFacturas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "cantidad", nullable = false)
    private String cantidad;

    @Column(name = "precio", nullable = false)
    private Long precio;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "facturas_id", nullable = false)
    private Facturas facturasId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "inventarios_id", nullable = false)
    private Inventarios inventariosId;
}
