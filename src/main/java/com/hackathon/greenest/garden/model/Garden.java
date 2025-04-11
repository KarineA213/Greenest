package com.hackathon.greenest.garden.model;

import com.hackathon.greenest.greenhouse.model.Greenhouse;
import com.hackathon.greenest.user.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "garden_tb")
public class Garden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "greenhouse_id")
    private Greenhouse greenhouse;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "garden_product_id")
    private GardenProduct gardenProduct;

    private String GardenName;
    private int idealTemperature;
    private int idealUmidity;
    private int idealSoilPH;

}
