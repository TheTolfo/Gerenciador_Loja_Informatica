package entidades;
// Generated 23/01/2013 11:54:28 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Itens generated by hbm2java
 */
public class Itens  implements java.io.Serializable {


     private Integer idItens;
     private Produto produto;
     private Integer quantia;
     private Double preco;
     private Integer desconto;
     private Set pedidos = new HashSet(0);

    public Itens() {
    }

	
    public Itens(Produto produto) {
        this.produto = produto;
    }
    public Itens(Produto produto, Integer quantia, Double preco, Integer desconto, Set pedidos) {
       this.produto = produto;
       this.quantia = quantia;
       this.preco = preco;
       this.desconto = desconto;
       this.pedidos = pedidos;
    }
   
    public Integer getIdItens() {
        return this.idItens;
    }
    
    public void setIdItens(Integer idItens) {
        this.idItens = idItens;
    }
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Integer getQuantia() {
        return this.quantia;
    }
    
    public void setQuantia(Integer quantia) {
        this.quantia = quantia;
    }
    public Double getPreco() {
        return this.preco;
    }
    
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Integer getDesconto() {
        return this.desconto;
    }
    
    public void setDesconto(Integer desconto) {
        this.desconto = desconto;
    }
    public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }




}


