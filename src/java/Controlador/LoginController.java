/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.CreyenteImplement;
import Modelo.Creyente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ASUS
 */
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Email, Pass, pass;
        HttpSession session = req.getSession();
        System.out.println(session);
        Email = req.getParameter("correo");
        Pass = req.getParameter("clave");
        encriptacion obj = new encriptacion();
        pass = obj.getMd5(Pass);

        Creyente us = new Creyente();
        us.setCorreo(Email);
        us.setContraseña(pass);
        System.out.println("Contraseña " + Pass);
        System.out.println("Contraseña " + pass);
        CreyenteImplement ui = new CreyenteImplement();
        ArrayList<Creyente> lista = new ArrayList<Creyente>();

        lista = ui.BuscarUsusario(Email, pass);

        //obj=ui.seleccionarUsuarios(Email, Pass);
        int Rol = 0;
        String correo;
        String ID;

        if (lista != null && lista.size() > 0) {
            for (Creyente u : lista) {
                session.setAttribute("usuario", u.getCorreo());
                session.setAttribute("idusuario", u.getIdCedula());
                //Correo = session.getAttribute("usuario", u.getCorreo());
                //ID = session.getAttribute("idusuario", u.getIdCedula());
                Rol = 1;
            }

            if (Rol == 1) {
                resp.sendRedirect("CrearPedido.jsp");
            } else {
                resp.sendRedirect("Login.jsp?ErrorSession=true");
            }
        } else {
            resp.sendRedirect("Login.jsp?ErrorSession=true");
        }

        if (req.getParameter("cerrar") != null) {
            session.invalidate();
        }

    }

}
