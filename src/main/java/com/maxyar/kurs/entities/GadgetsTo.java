package com.maxyar.kurs.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "Устройства_приемники")
public class GadgetsTo {
    @Id
    @Column(name = "ID_Приемника")
    @GeneratedValue
    private Integer id;

    @OneToMany
    @JoinColumn(name = "Устройство_передатчик")
    private Collection<GadgetsFrom> gadgets;

    @ManyToOne
    @JoinColumn(name = "Место_расположения")
    private PlaceCom place;

    @ManyToOne
    @JoinColumn(name = "Страна")
    private Country country;
}
