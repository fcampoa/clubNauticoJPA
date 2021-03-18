/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.POJOS;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "salidas")
public class Salida implements Serializable {
    
    @Id
    @Column(name = "idsalida")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSalida;
    
    @Column(name = "fechahora", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaHora;
    
    @Column(name = "destino", nullable = false)
    private String destino;
    
    @ManyToOne
    @JoinColumn(name = "idbarco")
    private Barco barco;

    public Salida() {
    }

    public Salida(Long idSalida) {
        this.idSalida = idSalida;
    }

    public Salida(Date fechaHora, String destino, Barco barco) {
        this.fechaHora = fechaHora;
        this.destino = destino;
        this.barco = barco;
    }

    public Salida(Long idSalida, Date fechaHora, String destino, Barco barco) {
        this.idSalida = idSalida;
        this.fechaHora = fechaHora;
        this.destino = destino;
        this.barco = barco;
    }

    public Long getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(Long idSalida) {
        this.idSalida = idSalida;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idSalida);
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
        final Salida other = (Salida) obj;
        if (!Objects.equals(this.idSalida, other.idSalida)) {
            return false;
        }
        return true;
    }
    
    
}

