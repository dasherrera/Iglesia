/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author ASUS
 */
@Entity
public class Licencia {
    @Id
    public int idLicencia;
    public String TipoLicencia;

    public int getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }

    public String getTipoLicencia() {
        return TipoLicencia;
    }

    public void setTipoLicencia(String TipoLicencia) {
        this.TipoLicencia = TipoLicencia;
    }
    
}
