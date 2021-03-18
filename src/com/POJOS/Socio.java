/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.POJOS;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "socios")
public class Socio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSocio;
    
    @Column(nullable = false)
    private String dni;
    
    @Column(nullable = false)
    private String nombre;
    
    @OneToMany(mappedBy = "socio", cascade = CascadeType.ALL)
    private List<Barco> listaBarcos;

    public Socio() {
    }

    public Socio(Long idSocio) {
        this.idSocio = idSocio;
    }

    public Socio(String dni, String nombre, List<Barco> listaBarcos) {
        this.dni = dni;
        this.nombre = nombre;
        this.listaBarcos = listaBarcos;
    }

    public Socio(Long idSocio, String dni, String nombre, List<Barco> listaBarcos) {
        this.idSocio = idSocio;
        this.dni = dni;
        this.nombre = nombre;
        this.listaBarcos = listaBarcos;
    }

    public Long getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Long idSocio) {
        this.idSocio = idSocio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Barco> getListaBarcos() {
        return listaBarcos;
    }

    public void setListaBarcos(List<Barco> listaBarcos) {
        this.listaBarcos = listaBarcos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idSocio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Socio other = (Socio) obj;
        if (!Objects.equals(this.idSocio, other.idSocio)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return getNombre();
    }
}
