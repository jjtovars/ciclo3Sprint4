package com.zuanjc.zuanjcFrontend.entidades;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    @Column(name = "correo", nullable = false, length = 30)
    private String correo;
    @Column(name = "rol", nullable = false, length = 20)
    private String rol;

    @ManyToOne
    private Empresa empresa;
}
