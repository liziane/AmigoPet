package model;

public class Animal {
    String tipo;
    String raca;
    String nome;
    String idade;
    String observacoes;
    String adotante = "Sem adotante";
    Boolean adotado = false;
    
    public Animal(String tipo, String raca, String nome, String idade, String observacoes){
        this.tipo = tipo;
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        this.observacoes = observacoes;
    }
    
    public void callAnimal(Animal animal){
        System.out.println(animal.nome + animal.adotante);
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
}