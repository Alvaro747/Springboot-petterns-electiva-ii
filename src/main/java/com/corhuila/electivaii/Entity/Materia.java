package com.corhuila.electivaii.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "materia")
public class Materia extends ABaseEntity {

    @Column(name = "codigo", nullable = false)
    private String codigo;


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


}