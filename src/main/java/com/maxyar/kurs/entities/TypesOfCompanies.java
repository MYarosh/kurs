package com.maxyar.kurs.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Типы_организаций")
public class TypesOfCompanies {
    @Id
    @Column(name = "Тип_организации")
    private String type;
    @Column(name = "Описание")
    private String description;
}
