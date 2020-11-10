/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Licencia;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface LicenciaInterface {
    public int insertarLicencia(Licencia p);

    //public int insertarProducto(Proveedor pro,Producto p);
    public int actualizarLicencia(int id, Licencia p);

    public boolean borrarLicencia(int id);

    public Licencia seleccionarLicencia(int id);

    public ArrayList listarLicencia();

    public ArrayList buscarLicenciaPorTipo(String nombre);
    
    public ArrayList buscarLicenciaPorNumero(String nombre);

}
