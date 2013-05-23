package amigopet;

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
}
