package com.restservice.rest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @Getter @Setter @Column (name = "id")
    private Long id;

    @Getter @Setter @Column (name = "nombre")
    private String nombre;

    @Getter @Setter @Column (name = "apellido")
    private String apellido;

    @Getter @Setter @Column (name = "email")
    private String email;

    @Getter @Setter @Column (name = "telefono")
    private String telefono;

    @Getter @Setter @Column (name = "password")
    private String password;

}
