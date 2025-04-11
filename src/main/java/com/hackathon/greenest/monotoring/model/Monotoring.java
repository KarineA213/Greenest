package com.hackathon.greenest.monotoring.model;

import com.hackathon.greenest.common.enums.Status;
import com.hackathon.greenest.garden.model.Garden;
import com.hackathon.greenest.greenhouse.model.Greenhouse;

import com.hackathon.greenest.user.model.User;
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
    private Greenhouse greenhouse;

    @OneToOne
    @JoinColumn(name = "garden_id")
    private Garden garden;

    @Enumerated(EnumType.STRING)
    private Status status;

    private int CurrentTemperature;
    private int CurrentUmidity;
    private int CurrentSoilPH;

}