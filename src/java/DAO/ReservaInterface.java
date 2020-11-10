/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Reserva;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface ReservaInterface {

    public int insertarReserva(Reserva p);

    //public int insertarProducto(Proveedor pro,Producto p);
    public int actualizarReserva(int id, Reserva p);

    public boolean borrarReserva(int id);

    public Reserva seleccionarReserva(int id);

    public ArrayList listarReserva();

    public ArrayList buscarReservaPorCupos(int Cupos);

}
