/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Vigencia;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface VigenciaInterface {
    public int insertarVigencia(Vigencia p);

    //public int insertarProducto(Proveedor pro,Producto p);
    public int actualizarVigencia(int id, Vigencia p);

    public boolean borrarVigencia(int id);

    public Vigencia seleccionarVigencia(int id);

    public ArrayList listarVigencia();

    //public ArrayList buscarVigenciaPorNombre(String nombre);

}
