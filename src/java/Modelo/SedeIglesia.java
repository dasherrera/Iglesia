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
public class SedeIglesia {
    @Id
    public int IdSede;
    public String Nombre;
    public String Direccion;
    public String Barrio;
    @JoinColumn(name = "Ciudad_idCiudad")
    @ManyToOne
    public Ciudad City;

    public int getIdSede() {
        return IdSede;
    }

    public void setIdSede(int IdSede) {
        this.IdSede = IdSede;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String Barrio) {
        this.Barrio = Barrio;
    }

    public Ciudad getCity() {
        return City;
    }

    public void setCity(Ciudad City) {
        this.City = City;
    }
    
}
