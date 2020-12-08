package com.maxyar.kurs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "наблюдаемый")
public class ManSee {
    @Id
    @Column(name = "id_наблюдаемого")
    private Integer id;
    @Column(name = "должность")
    private String job;
    @ManyToOne
    @JoinColumn(name = "организация")
    private Company company;

    @ManyToMany
    @JoinTable(name = "устройства_наблюдаемый",
            joinColumns = @JoinColumn(name = "id_устройства"),
            inverseJoinColumns = @JoinColumn(name = "id_наблюдаемого")
    )
    private Collection<GadgetsFrom> gadgets;
}
