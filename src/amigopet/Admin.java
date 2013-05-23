package amigopet;

public class Admin {
    Credenciais credenciais;
    String nome;
    boolean autenticado;
    
    public Admin(Credenciais credenciais, String nome, boolean autenticado){
        this.credenciais = credenciais;
        this.nome = nome;   
        this.autenticado = autenticado;
    }
    
    public boolean login(){
        return false;
    }
}
