package com.maxyar.kurs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "люди")
public class People {
    @Id
    @Column(name = "id_человека")
    @GeneratedValue
    private Integer id;

    @Column(name = "имя")
    private String name;

    @Column(name = "фамилия")
    private String surname;

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
}
