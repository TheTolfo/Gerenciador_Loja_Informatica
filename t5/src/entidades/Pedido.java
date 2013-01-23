package entidades;
// Generated 23/01/2013 11:54:28 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pedido generated by hbm2java
 */
public class Pedido  implements java.io.Serializable {


     private Integer idPedido;
     private Itens itens;
     private Date data;
     private Set clientes = new HashSet(0);

    public Pedido() {
    }

	
    public Pedido(Itens itens) {
        this.itens = itens;
    }
    public Pedido(Itens itens, Date data, Set clientes) {
       this.itens = itens;
       this.data = data;
       this.clientes = clientes;
    }
   
    public Integer getIdPedido() {
        return this.idPedido;
    }
    
    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }
    public Itens getItens() {
        return this.itens;
    }
    
    public void setItens(Itens itens) {
        this.itens = itens;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }




}

