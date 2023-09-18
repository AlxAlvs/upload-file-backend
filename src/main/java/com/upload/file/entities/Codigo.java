package com.upload.file.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "codigo")
public class Codigo {

    @Id
    @GeneratedValue()
    @Column(name = "codigo_id")
    private int codigo_id;

    @Column(name = "codigo")
    private String _text;

    @OneToOne(mappedBy = "codigo")
    private Agente agente;
}
