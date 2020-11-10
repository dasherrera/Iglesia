/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Creyente;
import Modelo.SedeIglesia;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface SedeInterface {
    public int insertarSede(SedeIglesia p);

    //public int insertarProducto(Proveedor pro,Producto p);
    public int actualizarSede(int id, SedeIglesia p);

    public boolean borrarSede(int id);

    public SedeIglesia seleccionarSede(int id);

    public ArrayList listarSede();

    public ArrayList buscarSedePorNombre(String nombre);
    
    public ArrayList buscarSedePorDireccion(String Direccion);
    
    public ArrayList buscarSedePorBarrio(String Barrio);

}
