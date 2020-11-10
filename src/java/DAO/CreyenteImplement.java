package DAO;

import Modelo.Creyente;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Fredy Alarcon
 */
public class CreyenteImplement implements CreyenteInterface {

    SessionFactory sf;
    Session ss;
    Transaction tr;

    //Constructor
    public CreyenteImplement() {
        sf = HelpClass.SessionFact.getSessionFact();
        ss = sf.openSession();
    }

    @Override
    public int insertarCreyentes(Creyente p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizarCreyente(int id, Creyente p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarCreyente(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Creyente seleccionarCreyente(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList listarCreyente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList buscarCreyentePorNombre(String nombre) {
        Criteria criterio= ss.createCriteria(Creyente.class);
        criterio.add(Restrictions.like("Nombre","%"+nombre+"%"));
        ArrayList registro =(ArrayList) criterio.list();
        if(registro.size()>0){
            return registro;
        }else{
            return null;
        }
    }
    @Override
    public ArrayList BuscarUsusario(String Correo, String Pass) {
        Criteria criterio = ss.createCriteria(Creyente.class);
        criterio.add(Restrictions.eq("Correo", Correo));
        criterio.add(Restrictions.eq("Clave", Pass));
        ArrayList registro = (ArrayList) criterio.list();
        if (registro.size() > 0) {
            return registro;
        } else {
            return null;
        }
    }
    @Override
    public ArrayList buscarUsuariosPorCorreo(String Correo){
        Criteria criterio= ss.createCriteria(Creyente.class);
        criterio.add(Restrictions.eq("Correo","%"+Correo+"%"));
        ArrayList registro =(ArrayList) criterio.list();
        if(registro.size()>0){
            return registro;
        }else{
            return null;
        }
    }
    
}
