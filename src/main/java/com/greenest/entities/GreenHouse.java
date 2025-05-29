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
@Table(name = "greenhouse_tb")
public class GreenHouse {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

        @OneToMany(mappedBy = "greenhouse",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
        private List<Garden> gardens;

        @OneToMany(mappedBy = "greenhouse",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
        private List<Monotoring> monotorings;

        private String GreenhouseName;
        private String GreenhouseAddress;
        private int configTemperature;
        private int configUmidity;
        private int configSoilPH;


}
