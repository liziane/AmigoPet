package model;

import controller.AnimalDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Animal {
   private int id;
   private String tipo;
   private String raca;
   private String nome;
   private String idade;
   private String observacoes;
   private String adotante = "Sem adotante";
   private Boolean adotado = false;
   private String urlImagem = "/Users/lbrandin/NOAVATAR.jpg";
    
   public Animal(String tipo, String raca, String nome, String idade, String observacoes){
        this.tipo = tipo;
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        this.observacoes = observacoes;
    }
   
   public Animal(int id, String tipo, String raca, String nome, String idade, String observacoes, boolean adotado, String adotante){
        this.id = id;
        this.tipo = tipo;
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        this.observacoes = observacoes;
        this.adotante = adotante;
        this.adotado = adotado;
    }
    
    
    public void callAnimal(Animal animal){
        System.out.println(animal.nome + animal.adotante);
    }
    
     public void excluir() {
        AnimalDAO animalDAO = new AnimalDAO(new DbConnection());
       try {
           animalDAO.deleteAnimal(this);
       } catch (SQLException ex) {
           Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
     
     
    
    public int getId(){
        return this.id;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getRaca(){
        return this.raca;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getIdade(){
        return this.idade;
    }
    
    public String getObservacoes(){
        return this.observacoes;
    }
    
    public String getAdotante(){
        return this.adotante;
    }
    
    public Boolean isAdotado(){
        return this.adotado;
    }
    
    public String getUrlImagem(){
        return this.urlImagem;
    }
    
    public ImageIcon getImage(){
        return new ImageIcon(this.urlImagem);
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(String idade){
        this.idade = idade;
    }
    
    public void setObservacoes(String observacoes){
        this.observacoes = observacoes;
    }
    
    public void setAdotante(String adotante){
        
    }
    
    public void setAdotado(boolean adotado){
        this.adotado = adotado;
    }
    
    public void setImagem(String urlImagem){
        this.urlImagem = urlImagem;
    }

   
}