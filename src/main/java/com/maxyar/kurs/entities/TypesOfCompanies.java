package com.maxyar.kurs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "типы_организаций")
public class TypesOfCompanies {
    @Id
    @Column(name = "тип_организации")
    private String type;
    @Column(name = "описание")
    private String description;
}
