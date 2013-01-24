/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t5;

import GUI.Int_Inicio;

/**
 *
 * @author TheTolfo
 */
public class T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        try {
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            List<Cliente> l = new ArrayList<Cliente>();
            l = s.createQuery("FROM Cliente"). list();
        } catch (Exception prod) {
            System.out.println("erro" + prod);
        }
        */
        Int_Inicio.main(null);
    }
}