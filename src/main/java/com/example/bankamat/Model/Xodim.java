package com.example.bankamat.Model;

import com.example.bankamat.Enum.Huquqlar;
import com.example.bankamat.Template.AbstraktClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Xodim extends AbstraktClass implements UserDetails {
    @Column(nullable = false)
    private String fish;
    @Column(nullable = false,unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @OneToOne
    private Bankamat bankamat;
    @OneToOne
    Lavozim lavozim;
    private boolean enabled;
    private boolean accountNonExpired=true;
    private boolean accountNonLocked=true;
    private boolean credentialsNonExpired=true;

    public Xodim(String fish, String username, String password, Bankamat bankamat, Lavozim lavozim, boolean enabled) {
        this.fish = fish;
        this.username = username;
        this.password = password;
        this.bankamat = bankamat;
        this.lavozim = lavozim;
        this.enabled = enabled;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<Huquqlar> huquqlarlist = lavozim.getHuquqlarlist();
        List<GrantedAuthority> grantedAuthorityList=new ArrayList<>();
        for (Huquqlar i:huquqlarlist) {
            grantedAuthorityList.add(new SimpleGrantedAuthority(i.name()));
        }
        return grantedAuthorityList;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
