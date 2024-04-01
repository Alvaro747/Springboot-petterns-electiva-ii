package com.corhuila.electivaii.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiante")
public class Estudiante extends ABaseEntity {

    @Column(name = "documento", length = 20, nullable = false, unique = true)
    private String documento;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;


    }
}