package com.upload.file.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "valor")
public class Valor {

    @Id
    @GeneratedValue()
    @Column(name = "valor_id")
    private int valor_id;

    @Column(name = "valor")
    private String _text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="preco_medio_id", referencedColumnName = "preco_medio_id")
    private PrecoMedio precoMedio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="geracao_id", referencedColumnName = "geracao_id")
    private Geracao geracao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="compra_id", referencedColumnName = "compra_id")
    private Compra compra;
}
