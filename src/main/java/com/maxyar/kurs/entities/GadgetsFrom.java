package com.maxyar.kurs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "устройства_передатчики")
public class GadgetsFrom {
    @Id
    @Column(name = "id_устройства")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "модель")
    private String model;
    @Column(name = "частота")
    private Double frequency;
    @ManyToOne
    @JoinColumn(name = "человек_установщик")
    private ManDo manDo;
    @ManyToOne
    @JoinColumn(name = "место_установки")
    private PlaceDo placeDo;
    @ManyToOne
    @JoinColumn(name = "тип")
    private TypesOfGadgets type;
}
