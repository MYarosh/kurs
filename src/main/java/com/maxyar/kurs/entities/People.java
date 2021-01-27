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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "имя")
    private String name;

    @Column(name = "фамилия")
    private String surname;


    @Override
    public String toString(){
        return "id:"+id+", name:"+name+", surname:"+surname;
    }
}
