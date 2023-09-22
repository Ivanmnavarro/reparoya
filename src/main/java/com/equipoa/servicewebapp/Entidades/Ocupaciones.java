package com.equipoa.servicewebapp.Entidades;

import javax.persistence.*;

@Entity
public class Ocupaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToOne
    private Imagen foto;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public Ocupaciones() {
    }

    public Ocupaciones(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Imagen getFoto() {
        return foto;
    }

    public void setFoto(Imagen foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOcupacion() {
        return nombre;
    }

    public void setOcupacion(String nombre) {
        this.nombre = nombre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
