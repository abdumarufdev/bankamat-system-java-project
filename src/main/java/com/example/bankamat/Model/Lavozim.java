package com.example.bankamat.Model;

import com.example.bankamat.Enum.Huquqlar;
import com.example.bankamat.Template.AbstraktClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.boot.model.source.spi.AbstractAttributeKey;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Lavozim extends AbstraktClass {
    @Column(nullable = false)
    private String nomi;
    @Enumerated(value = EnumType.STRING)
    @ElementCollection
    private List<Huquqlar> huquqlarlist;
}
