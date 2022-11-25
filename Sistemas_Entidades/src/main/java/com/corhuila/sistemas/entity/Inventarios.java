package com.corhuila.sistemas.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "inventarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inventarios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "precio_unitario", nullable = false)
    private Double precioUnitario;

    @Column(name = "cantidad_existente", nullable = false)
    private Long cantidadExistente;

    @Column(name = "observacion", nullable = false)
    private String observacion;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vehiculos_id", nullable = false)
    private Vehiculos vehiculosId;
}
