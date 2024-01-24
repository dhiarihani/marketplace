package com.example.marketplace.Entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Messangerie {
    @Id
    private int id ;
    private String body ;
    private String Conversation ;
    private int recipier_Id ;
    private int sender_Id ;

}
