package com.example.bankamat.Model;

import com.example.bankamat.Enum.Turi;
import com.example.bankamat.Template.AbstraktClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;


@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Bankamat extends AbstraktClass{

    @Column(nullable = false)
    private String nomi;
    @Column(nullable = false)
    private  String banknomi;
    @Column(nullable = false)
    private String maxpul;
    @Column(nullable = false)
    private String pulmiqdori;
    @Column(nullable = false)
    private String kommissiya;
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Turi bankamatturi;
}
