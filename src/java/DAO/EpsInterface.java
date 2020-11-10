/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Modelo.EPS;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface EpsInterface {
    public int insertarEPS(EPS p);

    //public int insertarProducto(Proveedor pro,Producto p);
    public int actualizarEPS(int id, EPS p);

    public boolean borrarEPS(int id);

    public EPS seleccionarEPS(int id);

    public ArrayList listarEPS();

    public ArrayList buscarEPSPorNombre(String EPS);

}
