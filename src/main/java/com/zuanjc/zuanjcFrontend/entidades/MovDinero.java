package com.zuanjc.zuanjcFrontend.entidades;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "movDinero")
public class MovDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "montoDinero", nullable = false, length = 30)
    private Double montoMovimiento;
    @Column(name = "conceptoMovimiento", nullable = false, length = 30)
    private  String conceptoMovimiento;
    @CreationTimestamp
    @Column(name = "fechaCreacion")
    private LocalDateTime fechaCreacion;
    @UpdateTimestamp
    @Column(name = "fechaActualizacion")
    private LocalDateTime fechaActualizacion;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private Empleado empleado;
}
