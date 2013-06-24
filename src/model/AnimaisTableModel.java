package model;

import java.util.Arrays;
import java.util.List;

public class AnimaisTableModel extends TableModel{
    
    private List<Animal> rows;

    public AnimaisTableModel(List<Animal> animais) {
        this.rows = animais;
        setColunas();
    }

    public AnimaisTableModel() {
        setColunas();
    }
        
    @Override
    void setColunas() {
        this.colunas = Arrays.asList("Nome", 
                                    "Tipo", 
                                    "Raça", 
                                    "Idade");
                                                                     
    }
    
    public void setLinhas(List<Animal> animais){
        this.rows = animais;
    }

    public List<Animal> getAnimais(){
        return rows;
    }
    
    public Animal getAnimal(int index){
        return rows.get(index);
    }
    
    @Override
    public int getRowCount() {
        return this.rows.size();
    }

        @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Animal animal = this.rows.get(rowIndex);
        
        switch(columnIndex){
            case 0: return animal.getNome();
            case 1: return animal.getTipo();
            case 2: return animal.getRaca();
            case 3: return animal.getIdade();
            case 4: return (animal.isAdotado()) ? "Adotado" : "Não adotado";
        }
        return null;
    }
}
