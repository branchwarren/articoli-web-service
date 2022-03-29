package com.xantrix.webapp.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BARCODE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Barcode implements Serializable {

    @Id
    @Column(name = "BARCODE")
    private String barCode;

    @Column(name = "IDTIPOART")
    private String idTipoArt;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "CODART", referencedColumnName = "codArt")
    @JsonBackReference
    private Articoli articolo;
}
