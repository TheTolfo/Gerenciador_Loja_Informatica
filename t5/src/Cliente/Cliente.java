// pesquisar H2
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

/**
 *
 * @author TheTolfo
 */
public class Cliente {

    private String Nome_Usuario;
    private String Login;
    private String Senha;
    private int Reputacao;
    private boolean ADM;
    private boolean Funcionario;

    public Cliente(String log, String pass, String nom, boolean adm, boolean func) {
        Nome_Usuario = nom;
        Login = log;
        Senha = pass;
        Reputacao = 0;
        ADM = adm;
        Funcionario = func;
    }

    private boolean Verifica_Login(String busca) {
        if (busca.equalsIgnoreCase(Login)) {
            return true;
        }
        return false;
    }

    private boolean Verifica_Senha(String pass) {
        if (pass.equalsIgnoreCase(Senha)) {
            return true;
        }
        return false;
    }
    
    private boolean Verifica_ADM(){
        if(ADM){
            return true;
        }
        return false;
    }
    
    private boolean Verifica_Funcionario(){
        if(Funcionario){
            return true;
        }
        return false;
    }

    private String Get_Nome() {
        return Nome_Usuario;
    }
}
