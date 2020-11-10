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
public class RecuperarPass extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String Email, Email1, Pass, pass;
        HttpSession session = req.getSession();
        System.out.println(session);
        Email = req.getParameter("correo");
        Email1 = req.getParameter("correo1");
        PrintWriter salida = resp.getWriter();
        if (Email == Email1) {
            CreyenteImplement ui = new CreyenteImplement();
            ArrayList<Creyente> lista = new ArrayList<Creyente>();
            lista = ui.buscarUsuariosPorCorreo(Email);
            if (lista != null) {
                resp.sendRedirect("RecuperarPass.jsp?Validacion=true");
            } else {
                salida.println("el correo" + Email + " No esta vinculado a nuestros servicios en la base de datos");    
            }
        } else {
            salida.println("el correo" + Email + " Es diferente a" + Email1);
            resp.sendRedirect("RecuperarPass.jsp?Validacion=false");
        }

    }
}
