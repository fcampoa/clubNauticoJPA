/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.POJOS;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "barcos")
public class Barco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBarco;

    @Column(nullable = false)
    private String nombre;
    
    @Column(nullable = false)
    private String matricula;
    
    @Column(nullable = false)
    private int numAmarre;
    
    @Column(nullable = false)
    private float cuota;
    
    @ManyToOne
    @JoinColumn(name = "idsocio", nullable = false)
    private Socio socio;
    
    @OneToMany(mappedBy = "barco")
    private List<Salida> salidas;

    public Barco() {
    }

    public Barco(String nombre, String matricula, int numAmarre, float cuota, Socio socio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.numAmarre = numAmarre;
        this.cuota = cuota;
        this.socio = socio;
    }

    public Barco(Long idBarco, String nombre, String matricula, int numAmarre, float cuota, Socio socio) {
        this.idBarco = idBarco;
        this.nombre = nombre;
        this.matricula = matricula;
        this.numAmarre = numAmarre;
        this.cuota = cuota;
        this.socio = socio;
    }

    public Barco(Long idBarco, String nombre, String matricula, int numAmarre, float cuota, Socio socio, List<Salida> salidas) {
        this.idBarco = idBarco;
        this.nombre = nombre;
        this.matricula = matricula;
        this.numAmarre = numAmarre;
        this.cuota = cuota;
        this.socio = socio;
        this.salidas = salidas;
    }

    public Barco(Long idBarco) {
        this.idBarco = idBarco;
    }

    public Long getIdBarco() {
        return idBarco;
    }

    public void setIdBarco(Long idBarco) {
        this.idBarco = idBarco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumAmarre() {
        return numAmarre;
    }

    public void setNumAmarre(int numAmarre) {
        this.numAmarre = numAmarre;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public List<Salida> getSalidas() {
        return salidas;
    }

    public void setSalidas(List<Salida> salidas) {
        this.salidas = salidas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.idBarco);
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
        final Barco other = (Barco) obj;
        if (!Objects.equals(this.idBarco, other.idBarco)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return getNombre();
    }
}
