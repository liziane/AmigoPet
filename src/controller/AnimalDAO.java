package controller;

import java.sql.ResultSet;
import model.Animal;
import model.DbConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO{
    
    DbConnection db;
    
    public AnimalDAO(DbConnection db){
        this.db = db;
    }
    
    public int salvar(Animal animal) throws SQLException {
        int cod = 0;
        String query = "INSERT INTO animal (tipo, raca, nome, idade, observacoes, adotado, adotante, imagem)"
                + "VALUES (?, ?, ? ,? ,?, ?, ?, ?)";
        try {
            db.connect();
            cod = db.executeUpdateAndReturn(query,
                                            animal.getTipo(),
                                            animal.getRaca(),
                                            animal.getNome(),
                                            animal.getIdade(),
                                            animal.getObservacoes(),
                                            animal.isAdotado(),
                                            animal.getAdotante(),
                                            animal.getUrlImagem());
        } catch (SQLException ex) {
            throw new SQLException(ex);
        } finally {
            query = null;
            db.close();
        }
        return cod;
    }
    
        public Animal buscaAnimal(String field) throws SQLException, Exception {

        String sfield = (field.length() <= 0) ? "-" : field;
        String query = "SELECT * FROM usuario "
                        + "WHERE id = ? OR "
                        + "nome LIKE ? OR "
                        + "cpf = ? OR "
                        + "email = ?";
        ResultSet rs = null;
        List<Animal> lp = null;
        try {
            db.connect();
            rs = db.executeQuery(query, sfield, "%" + sfield + "%", sfield, sfield);
            lp = mapperAnimal(rs);
        }finally {
            sfield = null;
            query = null;
            rs.close();
            db.close();
        }
        if (lp.size() <= 0) {
            throw new Exception("Nenhum cliente encontrado");
        }
        return lp.get(0);
    }
    
    public void updateAnimal(Animal animal) throws SQLException {
        String query = "UPDATE animal "
                + "SET tipo = ?, raca = ?, nome = ?, idade = ?, observacoes = ?, adotado = ?, adotante = ?"
                + "WHERE id = ?";
        try {
            db.connect();
            db.executeUpdate(query,
                    animal.getId(),
                    animal.getTipo(),
                    animal.getRaca(),
                    animal.getNome(),
                    animal.getIdade(),
                    animal.getObservacoes(),
                    animal.isAdotado(),
                    animal.getAdotante());
        } catch (SQLException ex) {
            throw new SQLException(ex);
        } finally {
            query = null;
            db.close();
        }
    }
    
    public List<Animal> getListAnimais() throws SQLException {
        String query = "SELECT * FROM animal";
        ResultSet result = null;
        List<Animal> listaAnimais = null;
        try {
            db.connect();
            result = db.executeQuery(query);
            listaAnimais = mapperAnimal(result);
        } finally {
            result.close();
            db.close();
        }
        return listaAnimais;
    }
    
    private List<Animal> mapperAnimal(ResultSet resultSet) throws SQLException {
        List<Animal> listaAnimais = new ArrayList<Animal>();
        Animal animal = null;

        if (resultSet != null) {
            while (resultSet.next()) {
                animal = new Animal(resultSet.getInt("id"),
                        resultSet.getString("tipo"),
                        resultSet.getString("raca"),
                        resultSet.getString("nome"),
                        resultSet.getString("idade"),
                        resultSet.getString("observacoes"),
                        resultSet.getBoolean("adotado"),
                        resultSet.getString("adotante"));
                animal.setImagem(resultSet.getString("imagem"));
                listaAnimais.add(animal);
            }
        }

        return listaAnimais;
    }
}
