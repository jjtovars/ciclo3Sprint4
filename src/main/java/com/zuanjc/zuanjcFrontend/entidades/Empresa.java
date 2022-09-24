package com.zuanjc.zuanjcFrontend.entidades;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    @Column(name = "direccion", nullable = false, length = 30)
    private String direccion;
    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;
    @Column(name = "nit", nullable = false, length = 20)
    private String nit;
}
