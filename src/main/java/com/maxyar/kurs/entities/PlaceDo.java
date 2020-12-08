package com.maxyar.kurs.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Место_установки")
public class PlaceDo {
    @Id
    @Column(name = "ID_места")
    @GeneratedValue
    private Integer id;
    @Column(name = "X")
    private Double x;
    @Column(name = "Y")
    private Double y;
    @Column(name = "Z")
    private Double z;
}
