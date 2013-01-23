/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t5;

import Util.HibernateUtil;
import entidades.Produto;
import org.hibernate.Session;

/**
 *
 * @author TheTolfo
 */
public class T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Produto prod = new Produto("teste2", "Testando", 10, 5.0, 1);
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            s.save(prod);
            s.getTransaction().commit();
        } catch (Exception prod) {
            System.out.println("erro" + prod);
        }
        //Int_Inicio.main(null);
    }
}