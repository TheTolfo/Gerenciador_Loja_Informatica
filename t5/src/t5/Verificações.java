/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t5;

import Util.HibernateUtil;
import entidades.Cliente;
import entidades.Produto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author TheTolfo
 */
public class Verificações {
    
    public static Cliente Retorna_Login(String busca){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        List<Cliente> l = new ArrayList<Cliente>();
        l = (List<Cliente>) s.createQuery("FROM Cliente").list();
        for(Cliente cl : l){
            if(busca.equalsIgnoreCase(cl.getNome())){
                return cl;
            }
        }
        return null;
    }
    
    public static Produto Retorna_Produto(String nome){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        List<Produto> l = new ArrayList<Produto>();
        l = (List<Produto>) s.createQuery("FROM Produto").list();
        for(Produto prod : l){
            if(prod.getNome().equals(nome)){
                return prod;
            }
        }
        return null;
    }
    
    public static Produto Retorna_Produto(int id){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        List<Produto> l = new ArrayList<Produto>();
        l = (List<Produto>) s.createQuery("FROM Produto").list();
        for(Produto prod : l){
            if(prod.getIdProduto() == id){
                return prod;
            }
        }
        return null;
    }
    
    
    public static boolean Verifica_Login(String busca){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        List<Cliente> l = new ArrayList<Cliente>();
        l = (List<Cliente>) s.createQuery("FROM Cliente").list();
        for(int i = 0; i < l.size(); i ++){
            if(busca.equalsIgnoreCase(l.get(i).getLogin())){
                return true;
            }
        }
        return false;
    }
    
    public static boolean Verifica_Nome(String busca){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        List<Cliente> l = new ArrayList<Cliente>();
        l = (List<Cliente>) s.createQuery("FROM Cliente").list();
        for(int i = 0; i < l.size(); i ++){
            if(busca.equalsIgnoreCase(l.get(i).getNome())){
                return true;
            }
        }
        return false;
    }
}
