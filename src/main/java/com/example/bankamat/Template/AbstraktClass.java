package com.example.bankamat.Template;

import com.example.bankamat.Model.Lavozim;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;
import java.sql.Timestamp;
@Data
@MappedSuperclass
public abstract class AbstraktClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @CreationTimestamp
    private Timestamp yaratilganvaqt;
    @UpdateTimestamp
    private Timestamp yangilanganvaqt;
    @ManyToOne
    @JoinColumn
    @CreatedBy
    private Lavozim kimyaratgan;
    @ManyToOne
    @JoinColumn
    @LastModifiedBy
    private Lavozim kimyangilangan;
}
