package com.example.bankamat.Model;

import com.example.bankamat.Enum.Turi;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Turlar implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(value = EnumType.STRING)
    private Turi turi;

    @Override
    public String getAuthority() {
        return turi.toString();
    }
}
