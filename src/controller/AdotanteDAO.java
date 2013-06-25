package controller;

import java.sql.ResultSet;
import model.Adotante;
import model.DbConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Animal;

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

    public List<Adotante> getListAdotantes() throws SQLException {
               String query = "SELECT * FROM adotante";
        ResultSet result = null;
        List<Adotante> listaAdotantes = null;
        try {
            db.connect();
            result = db.executeQuery(query);
            listaAdotantes = mapperAdotante(result);
        } finally {
            result.close();
            db.close();
        }
        return listaAdotantes;
    }

    private List<Adotante> mapperAdotante(ResultSet resultSet) throws SQLException {
         List<Adotante> listaAdotantes = new ArrayList<Adotante>();
        Adotante adotante = null;

        if (resultSet != null) {
            while (resultSet.next()) {
                adotante = new Adotante(resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("cpf"),
                        resultSet.getString("email"),
                        resultSet.getString("endereco"),
                        resultSet.getString("fone"));
                
                listaAdotantes.add(adotante);
            }
        }

        return listaAdotantes;
    }
}