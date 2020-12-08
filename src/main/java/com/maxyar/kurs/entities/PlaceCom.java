package com.maxyar.kurs.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "Место_расположения")
public class PlaceCom {
    @Id
    @Column(name = "ID_места")
    @GeneratedValue
    private Integer id;
    @OneToMany
    @JoinColumn(name = "Организация")
    private Collection<Company> company;
    @Column(name = "X")
    private Double x;
    @Column(name = "Y")
    private Double y;
    @Column(name = "Z")
    private Double z;
}
