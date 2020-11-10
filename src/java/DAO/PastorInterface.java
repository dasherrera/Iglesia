/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Modelo.Pastor;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface PastorInterface {
    public int insertarPastor(Pastor p);

    //public int insertarProducto(Proveedor pro,Producto p);
    public int actualizarPastor(int id, Pastor p);

    public boolean borrarPastor(int id);

    public Pastor seleccionarPastor(int id);

    public ArrayList listarPastor();

    public ArrayList buscarPastorPorNombre(String nombre);
    
    public ArrayList buscarPastorPorApellido(String Apellido);

}
