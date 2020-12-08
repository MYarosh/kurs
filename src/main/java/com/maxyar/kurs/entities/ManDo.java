package com.maxyar.kurs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "человек_установщик")
public class ManDo {
    @Id
    @Column(name = "id_человека")
    private Integer id;
    @Column(name = "должность")
    private String job;
    @ManyToOne
    @JoinColumn(name = "страна")
    private Country country;
    @ManyToOne
    @JoinColumn(name = "организация")
    private Company company;
}
