package model;

public class Admin {
    String usuario;
    String senha;
    String nome;
    boolean autenticado;
    
    public Admin(String usuario, String senha){
        
        this.usuario = usuario;   
        this.senha = senha;
    }
    
    public boolean login(){
        
        return false;
    }
}
