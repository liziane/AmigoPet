package controller;

import model.Adotante;
import model.DbConnection;
import java.sql.SQLException;

public class AdotanteDAO{
    
    DbConnection db = new DbConnection();
    
    public AdotanteDAO(DbConnection db){
        this.db = db;
    }
    
    public int salvar(Adotante adotante) throws SQLException {
        int cod = 0;
        String query = "INSERT INTO adotante (nome, cpf, endereco, email, fone)"
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            db.connect();
            cod = db.executeUpdateAndReturn(query,
                                            adotante.getNome(),
                                            adotante.getCpf(),
                                            adotante.getEndereco(),
                                            adotante.getEmail(),
                                            adotante.getFone());
        } catch (SQLException ex) {
            throw new SQLException(ex);
        } finally {
            query = null;
            db.close();
        }
        return cod;
    }
}