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
@Table(name = "устройства_приемники")
public class GadgetsTo {
    @Id
    @Column(name = "id_приемника")
    @GeneratedValue
    private Integer id;

    @OneToMany
    @JoinColumn(name = "устройство_передатчик")
    private Collection<GadgetsFrom> gadgets;

    @ManyToOne
    @JoinColumn(name = "место_расположения")
    private PlaceCom place;

    @ManyToOne
    @JoinColumn(name = "страна")
    private Country country;
}
