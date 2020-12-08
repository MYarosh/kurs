package com.maxyar.kurs.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "Наблюдаемый")
public class ManSee {
    @Id
    @OneToOne
    @JoinColumn(name = "ID_наблюдаемого")
    private People id;
    @Column(name = "Должность")
    private String job;
    @ManyToOne
    @JoinColumn(name = "Организация")
    private Company company;

    @ManyToMany
    @JoinTable(name = "Устройства_Наблюдаемый",
            joinColumns = @JoinColumn(name = "ID_Устройства"),
            inverseJoinColumns = @JoinColumn(name = "ID_наблюдаемого")
    )
    private Collection<GadgetsFrom> gadgets;
}
