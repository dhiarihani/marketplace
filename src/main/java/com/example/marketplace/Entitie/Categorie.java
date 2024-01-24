package com.example.marketplace.Entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Categorie {
    @Id
    private int id ;
    private String labelle_Cat ;

}
