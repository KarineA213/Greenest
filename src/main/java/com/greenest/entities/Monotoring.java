package com.greenest.entities;

import com.greenest.entities.common.enums.Status;
import jakarta.persistence.*;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "monitoring_tb")
public class Monotoring {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "greenhouse_id")
    private GreenHouse greenhouse;

    @OneToOne
    @JoinColumn(name = "garden_id")
    private Garden garden;

    @Enumerated(EnumType.STRING)
    private Status status;

    private int CurrentTemperature;
    private int CurrentUmidity;
    private int CurrentSoilPH;

}