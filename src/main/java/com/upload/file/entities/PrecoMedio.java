package com.upload.file.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "precoMedio")
public class PrecoMedio {

    @Id
    @GeneratedValue()
    @Column(name = "preco_medio_id")
    private int preco_medio_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "preco_medio_id", referencedColumnName = "preco_medio_id")
    private List<Valor> valor;

    @OneToOne(mappedBy = "precoMedio")
    private Regiao regiao;
}
