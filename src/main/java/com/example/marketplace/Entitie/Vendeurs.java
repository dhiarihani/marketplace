package com.example.marketplace.Entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Vendeurs extends Utilisateur{
    @Id
    private  int id ;
    private String adresse ;
    private String description ;


}
