package com.maxyar.kurs.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Устройства_передатчики")
public class GadgetsFrom {
    @Id
    @Column(name = "ID_устройства")
    @GeneratedValue
    private Integer id;
    @Column(name = "Модель")
    private String model;
    @Column(name = "Частота")
    private Double frequency;
    @ManyToOne
    @JoinColumn(name = "Человек_установщик")
    private ManDo manDo;
    @ManyToOne
    @JoinColumn(name = "Место_установки")
    private PlaceDo placeDo;
    @ManyToOne
    @JoinColumn(name = "Тип")
    private TypesOfGadgets type;
}
