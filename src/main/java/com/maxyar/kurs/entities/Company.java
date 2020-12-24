package com.maxyar.kurs.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "организация")
public class Company {
    @Id
    @Column(name = "id_организации")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "род_деятельности")
    private String function;
    @Column(name = "название")
    private String name;
    @ManyToOne
    @JoinColumn(name = "страна")
    private Country country;
    @ManyToOne
    @JoinColumn(name = "тип_организации")
    private TypesOfCompanies type;
}
