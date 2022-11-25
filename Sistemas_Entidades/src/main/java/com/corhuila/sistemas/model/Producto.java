package com.corhuila.sistemas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {


    private Long id;

    private String name;

    private Float value;

    private String weight;

    private Long quantity;

    private String unit;

    private String supplier;
}
