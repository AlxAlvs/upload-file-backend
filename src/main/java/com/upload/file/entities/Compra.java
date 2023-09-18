package com.upload.file.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @GeneratedValue()
    @Column(name = "compra_id")
    private int compra_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "compra_id", referencedColumnName = "compra_id")
    private List<Valor> valor;

    @OneToOne(mappedBy = "compra")
    private Regiao regiao;

}
