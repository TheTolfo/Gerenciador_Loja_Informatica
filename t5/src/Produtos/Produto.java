/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Produtos;

/**
 *
 * @author TheTolfo
 */
public class Produto {

    private String Descrição;
    private String Nome;
    private int Desconto;
    private float Valor;

    public Produto(String nome, String desccricao, float valor, int desconto) {
        Nome = nome;
        Descrição = desccricao;
        Desconto = desconto;
        Valor = valor;
    }
    public Produto(String nome, String descricao, float valor) {
        Nome = nome;
        Descrição = descricao;
        Desconto = 0;
        Valor = valor;
    }

    private boolean Pesquisa_produto(String busca) {
        if (busca.equalsIgnoreCase(Nome)) {
            return true;
        }
        return false;
    }

    private void Set_desconto(int desc) {
        if (desc > 0 && desc < 100) {
            Desconto = desc;
        }
    }

    private void Set_Nome(String str) {
        Nome = str;
    }

    private void Set_Descrição(String str) {
        Descrição = str;
    }

    private void Set_Valor(float val) {
        Valor = val;
    }

    private String Get_Nome() {
        return Nome;
    }

    private String Get_Descrição() {
        return Descrição;
    }

    private int Get_desconto() {
        return Desconto;
    }

    private float Get_Valor() {
        return Valor;
    }
}
