package com.example.marketplace.Entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class LigneCommande {
    @Id
    private int id ;
    private int Quantitie_commande ;

}
