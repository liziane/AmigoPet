package controller;

import model.Animal;
import model.DbConnection;
import java.sql.SQLException;

public class AnimalDAO{
    
    DbConnection db;
    
    public AnimalDAO(DbConnection db){
        this.db = db;
    }
    
    public int salvar(Animal animal) throws SQLException {
        int cod = 0;
        String query = "INSERT INTO animal (tipo, raca, nome, idade, observacoes, adotado, adotante)"
                + "VALUES (?, ?, ? ,? ,?, ?, ?)";
        try {
            db.connect();
            cod = db.executeUpdateAndReturn(query,
                                            animal.getTipo(),
                                            animal.getRaca(),
                                            animal.getNome(),
                                            animal.getIdade(),
                                            animal.getObservacoes(),
                                            animal.getAdotante(),
                                            animal.isAdotado());
        } catch (SQLException ex) {
            throw new SQLException(ex);
        } finally {
            query = null;
            db.close();
        }
        return cod;
    }
}