/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Directivos;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface DirectivosInterface {

    public int insertarDirectivos(Directivos p);

    //public int insertarProducto(Proveedor pro,Producto p);
    public int actualizarDirectivos(int id, Directivos p);

    public boolean borrarDirectivos(int id);

    public Directivos seleccionarDirectivos(int id);

    public ArrayList listarDirectivos();

    public ArrayList buscarDirectivosPorNombre(String nombre);

}
