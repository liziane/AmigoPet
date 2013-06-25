
package model;

import controller.AdminDAO;
import java.sql.SQLException;

public class Admin {
    int id;
    private String nome;
    private String usuario;
    private String senha;
    private boolean autenticado;
        
    public Admin(String usuario, String senha){
        this.usuario = usuario;   
        this.senha = senha;
    }
 
    public Admin(int id, String nome, String usuario, String senha, boolean autenticado) {
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.autenticado = autenticado;
    }
    public boolean login(String usuario, String senha){
    AdminDAO adminDAO = new AdminDAO(new DbConnection());
       try {
         if(adminDAO.login(usuario, senha)){
               this.autenticado = true;
               return this.autenticado;
            }
        } catch (SQLException ex) {
           ShowMessageDialog.error("Erro ao conectar com o banco de dados", nome);
        } catch (Exception ex) {
            System.out.println(ex);
           ShowMessageDialog.error("erro denovo", nome);
        }
        return this.autenticado;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

}
