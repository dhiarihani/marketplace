package com.example.marketplace.Entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Commande {
    @Id
    private int id ;
    private Date Date_cmd;
    private int delait_livraison ;
    private double montant ;
    private String status ;

}
