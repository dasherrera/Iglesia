/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author ASUS
 */
@Entity
public class Ciudad {

    @Id
    public int idCiudad;
    public String Ciudad;
    @JoinColumn(name = "Distrito_idDistrito")
    @ManyToOne
    public int IdDistrito;

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public int getIdDistrito() {
        return IdDistrito;
    }

    public void setIdDistrito(int IdDistrito) {
        this.IdDistrito = IdDistrito;
    }

}
