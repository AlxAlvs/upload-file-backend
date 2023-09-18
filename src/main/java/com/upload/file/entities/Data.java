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
@Table(name = "data")
public class Data {

    @Id
    @GeneratedValue()
    @Column(name = "data_id")
    private int data_id;

    @Column(name = "data")
    private String _text;

    @OneToOne(mappedBy = "data")
    private Agente agente;
}
