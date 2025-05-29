package com.greenest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "garden_product_tb")
public class GardenProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "gardenProduct")
    private List<Garden> gardens;


    private String nameProduct;
    private String description;
    private int idealTemperature;
    private int idealUmidity;
    private int idealSoilPH;

}