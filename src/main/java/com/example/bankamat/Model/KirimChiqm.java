package com.example.bankamat.Model;

import com.example.bankamat.Template.AbstraktClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class KirimChiqm extends AbstraktClass {
      @OneToOne
      private Karta kartaid;
      @OneToOne
      private Bankamat bankamatid;
      private String pul;
      private String kommissiya;
      private String turi;
      private String holat;
}
