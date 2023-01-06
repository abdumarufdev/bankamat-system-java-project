package com.example.bankamat.Model;

import com.example.bankamat.Template.AbstraktClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Shikoyatlar extends AbstraktClass {
    @Column(nullable = false,columnDefinition = "Text")
    private String messege;
    @ManyToOne
    Bankamat bankamat;
}
