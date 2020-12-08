package com.maxyar.kurs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "место_расположения")
public class PlaceCom {
    @Id
    @Column(name = "id_места")
    @GeneratedValue
    private Integer id;
    @OneToMany
    @JoinColumn(name = "организация")
    private Collection<Company> company;
    @Column(name = "x")
    private Double x;
    @Column(name = "y")
    private Double y;
    @Column(name = "z")
    private Double z;
}
