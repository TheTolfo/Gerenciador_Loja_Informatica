/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t5;

import entidades.Produto;

/**
 *
 * @author TheTolfo
 */
public class Carrinho_Compras {
    Produto Prod;
    int Quantidade;
    Double Valor_Total;
    
    public Carrinho_Compras(int id, int quant){
        this.Prod = Verificações.Retorna_Produto(id);
        Set_Quantia(quant);
    }
    
    public Carrinho_Compras(Produto prod, int quant){
        this.Prod = prod;
        Set_Quantia(quant);
    }
    
    private void Set_Quantia(int q){
        this.Quantidade = q;
        Set_ValorTotal();
    }
    
    private void Set_ValorTotal(){
        this.Valor_Total = Quantidade * Prod.getPreco();
    }
    
    public void SetQuantia(int q){
        this.Quantidade = q;
        Set_ValorTotal();
    }
   
    public int Get_Quantia(){
        return Quantidade;
    }
    public Produto Get_Produto(){
        return Prod;
    }
    
    public double Get_ValorTotal(){
        return Valor_Total;
    }
}
