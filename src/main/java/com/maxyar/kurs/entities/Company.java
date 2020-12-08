package com.maxyar.kurs.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Организация")
public class Company {
    @Id
    @Column(name = "ID_Организации")
    @GeneratedValue
    private Integer id;
    @Column(name = "Род_деятельности")
    private String function;
    @Column(name = "Название")
    private String name;
    @ManyToOne
    @JoinColumn(name = "Страна")
    private Country country;
    @ManyToOne
    @JoinColumn(name = "Тип_организации")
    private TypesOfCompanies type;
}
