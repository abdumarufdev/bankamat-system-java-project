package com.example.bankamat.Model;

import com.example.bankamat.Template.AbstraktClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Karta extends AbstraktClass {
    @Column(nullable = false)
    private String raqam;
    @Column(nullable = false)
    private String kod;
    @Column(nullable = false)
    private String fish;
    @Column(nullable = false)
    private String banknomi;
    @Column(nullable = false)
    private String muddat;
    @Column(nullable = false)
    private String sum;
    @OneToOne
    Turlar kartaTuri;
}
