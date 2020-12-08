package com.maxyar.kurs.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Типы_установленных_устройств")
public class TypesOfGadgets {
    @Id
    @Column(name = "Тип_устройства")
    private String type;
    @Column(name = "Описание")
    private String description;
}
