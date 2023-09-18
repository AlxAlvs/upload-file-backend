package com.upload.file.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "geracao")
public class Geracao {

    @Id
    @GeneratedValue()
    @Column(name = "geracao_id")
    private int geracao_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "geracao_id", referencedColumnName = "geracao_id")
    private List<Valor> valor;

    @OneToOne(mappedBy = "geracao")
    private Regiao regiao;
}
