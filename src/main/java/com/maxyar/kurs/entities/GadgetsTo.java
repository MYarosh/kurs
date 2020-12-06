package com.maxyar.kurs.entities;

import javax.persistence.*;

@Entity
@Table(name = "Устройства_приемники")
public class GadgetsTo {
    @Id
    @Column(name = "ID_Приемника")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;
}
