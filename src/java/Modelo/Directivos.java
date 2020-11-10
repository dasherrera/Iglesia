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
public class Directivos {
    @Id
    public int IdDistrito;
    public String Distrito;
    public String Departamento;
    

    public int getIdDistrito() {
        return IdDistrito;
    }

    public void setIdDistrito(int IdDistrito) {
        this.IdDistrito = IdDistrito;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    
    
    
}
