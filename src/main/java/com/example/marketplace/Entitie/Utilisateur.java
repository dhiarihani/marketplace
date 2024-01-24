package com.example.marketplace.Entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Utilisateur {
    @Id
private int id;
    private String email;
    private String hash_password ;
    private String nom ;
    private int role ;
    private String salt ;
}
