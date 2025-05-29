package com.greenest.entities;


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
@Table(name = "login_tb")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;
    private String password;
}

//select * from GARDEN_PRODUCT_TB ;
//select * from GARDEN_TB ;
//select * from GREENHOUSE_TB ;
//select * from GREENHOUSE_TB_GARDENS ;
//select * from USER_TB ;
//select * from LOGIN_TB ;
//select * from MONITORING_TB ;
