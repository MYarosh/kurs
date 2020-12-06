package com.maxyar.kurs.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Люди")
public class People {
    @Id
    @Column(name = "ID_человека")
    @GeneratedValue
    private Integer id;

    @Column(name = "Имя")
    private String name;

    @Column(name = "Фамилия")
    private String surname;
}
