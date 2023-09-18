package com.upload.file.entities;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "regiao")
public class Regiao {

    @Id
    @GeneratedValue()
    @Column(name = "regiao_id")
    private int regiao_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "compra_id")
    private Compra compra;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "geracao_id")
    private Geracao geracao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "precoMedio_id")
    private PrecoMedio precoMedio;

    @ManyToOne
    @JoinColumn(name="agente_id", referencedColumnName = "agente_id")
    private Agente agente;
}
