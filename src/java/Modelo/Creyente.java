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
public class Creyente {
    @Id
    public int idCedula;
    public String Nombre;
    public String Apellido;
    public String Telefono;
    public String Direccion;
    public String Correo;
    public String Contraseña;
    public String Foto;
    @JoinColumn(name = "EPS_idEPS")
    @ManyToOne
    public int Eps;
    @JoinColumn(name = "sedeiglesia_idSede")
    @ManyToOne
    public int Sede;

    public int getIdCedula() {
        return idCedula;
    }

    public void setIdCedula(int idCedula) {
        this.idCedula = idCedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }
    
    
}
