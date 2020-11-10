/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Modelo.Distrito;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface DistritoInterface {
    public int insertarDistrito(Distrito p);

    //public int insertarProducto(Proveedor pro,Producto p);
    public int actualizarDistrito(int id, Distrito p);

    public boolean borrarDistrito(int id);

    public Distrito seleccionarDistrito(int id);

    public ArrayList listarDistrito();

    public ArrayList buscarDistritoPorNombre(String nombre);

}   
