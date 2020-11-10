/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Creyente;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface CreyenteInterface {

    public int insertarCreyentes(Creyente p);

    public ArrayList BuscarUsusario(String Correo, String Pass);
            
    public int actualizarCreyente(int id, Creyente p);

    public boolean borrarCreyente(int id);

    public Creyente seleccionarCreyente(int id);

    public ArrayList listarCreyente();

    public ArrayList buscarCreyentePorNombre(String nombre);
    
    public ArrayList buscarUsuariosPorCorreo(String Correo);

}
