package model;

import java.util.Arrays;
import java.util.List;

public final class AdotanteTableModel extends TableModel{
    
    private List<Adotante> rows;

    public AdotanteTableModel(List<Adotante> adotante) {
        this.rows = adotante;
        setColunas();
    }

    public AdotanteTableModel() {
        setColunas();
    }
        
    @Override
    void setColunas() {
        this.colunas = Arrays.asList("Id",
                                     "Nome", 
                                     "CPF", 
                                     "E-mail", 
                                     "Endereço",
                                     "Fone");
                                                                     
    }
    
    public void setLinhas(List<Adotante> adotantes){
        this.rows = adotantes;
    }

    public List<Adotante> getAdotantes(){
        return rows;
    }
    
    public Adotante getAdotantes(int index){
        return rows.get(index);
    }
    
        public Adotante getAdotante(int index) {
            return rows.get(index);
    }
    
    @Override
    public int getRowCount() {
        return this.rows.size();
    }

        @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Adotante adotante = this.rows.get(rowIndex);
        
        switch(columnIndex){
            case 0: return adotante.getId();
            case 1: return adotante.getNome();
            case 2: return adotante.getCpf();
            case 3: return adotante.getEmail();
            case 4: return adotante.getEndereco();
            case 5: return adotante.getFone();
        }
        return null;
    }

 
}
