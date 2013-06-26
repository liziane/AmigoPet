package model;

import controller.AdotanteDAO;
import java.sql.SQLException;

public class Adotante {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private String fone;
    
    public Adotante(String nome, String cpf, String email, String endereco, String fone){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.fone = fone;        
    }
    
        public Adotante(int id, String nome, String cpf, String email, String endereco, String fone){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.fone = fone;        
    }

    
    public int getId() {
        return id;
    }
        
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void excluir() throws SQLException {
       AdotanteDAO adotanteDAO = new AdotanteDAO(new DbConnection());
       adotanteDAO.deleteAdotante(this);
    }

   
}
