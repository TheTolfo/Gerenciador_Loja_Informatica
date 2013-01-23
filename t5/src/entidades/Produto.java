package entidades;
// Generated 23/01/2013 11:54:28 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Produto generated by hbm2java
 */
public class Produto  implements java.io.Serializable {


     private Integer idProduto;
     private String nome;
     private String descricao;
     private Integer quantia;
     private Double preco;
     private Integer desconto;
     private Set itenses = new HashSet(0);

    public Produto() {
    }

    public Produto(String nome, String descricao, Integer quantia, Double preco, Integer desconto) {
       this.nome = nome;
       this.descricao = descricao;
       this.quantia = quantia;
       this.preco = preco;
       this.desconto = desconto;
       //this.itenses = itenses;
    }
   
    public Integer getIdProduto() {
        return this.idProduto;
    }
    
    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    public Set getItenses() {
        return this.itenses;
    }
    
    public void setItenses(Set itenses) {
        this.itenses = itenses;
    }




}


