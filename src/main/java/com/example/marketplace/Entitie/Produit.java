package com.example.marketplace.Entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Produit {
    @Id
    private int id ;
    private String description ;
    private String image ;
    private String nom ;
    private Double prix_achat ;
    private Double prix_public ;
    private int Quantitie ;
    private String reference ;
    private String status ;
    private String titre ;

}
