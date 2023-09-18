package com.upload.file.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "agente")
public class Agente {
    @Id
    @GeneratedValue()
    @Column(name = "agente_id")
    private int agente_id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigo_id")
    private Codigo codigo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "data_id")
    private Data data;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "agente_id", referencedColumnName = "agente_id")
    private List<Regiao> regiao;

}
