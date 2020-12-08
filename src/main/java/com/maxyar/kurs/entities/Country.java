package com.maxyar.kurs.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Страны")
public class Country {
    @Id
    @Column(name = "Страна")
    private String country;
    @Column(name = "Угроза")
    private String danger;
}
