package com.maxyar.kurs.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Человек_установщик")
public class ManDo {
    @Id
    @OneToOne
    @JoinColumn(name = "ID_человека")
    private People id;
    @Column(name = "Должность")
    private String job;
    @ManyToOne
    @JoinColumn(name = "Страна")
    private Country country;
    @ManyToOne
    @JoinColumn(name = "Организация")
    private Company company;
}
