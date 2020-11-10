/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Ciudad;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface CiudadInterface {

    public int insertarCiudad(Ciudad p);

    public int actualizarCiudad(int id, Ciudad p);

    public boolean borrarCiudad(int id);

    public Ciudad seleccionarCiudad(int id);

    public ArrayList listarCiudad();

    public ArrayList buscarCiudadPorNombre(String nombre);
}
