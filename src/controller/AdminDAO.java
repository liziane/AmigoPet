
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Admin;
import model.DbConnection;

public class AdminDAO {
    DbConnection db;
    
    public AdminDAO(DbConnection db){
        this.db = db;
    }
    
    
        public boolean login(String usuario, String senha) throws SQLException, Exception {
        String query = "SELECT * FROM admin "
                        + "WHERE usuario = ?" 
                        + "and senha = ?"; 
                        
        ResultSet result = null;
        List<Admin> listaAdmin = null;
        try {
            db.connect();
            result = db.executeQuery(query, usuario, senha);
            listaAdmin = mapperAdmin(result);
        }finally {
            query = null;
            result.close();
            db.close();
        }
        if (listaAdmin.size() < 0) {
            return false;
        }
        return true;
        }
        
            private List<Admin> mapperAdmin(ResultSet resultSet) throws SQLException {
        List<Admin> listaAdmin = new ArrayList<>();
        Admin admin = null;
        if (resultSet != null) {
            while (resultSet.next()) {
                admin = new Admin(resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("usuario"),
                        resultSet.getString("senha"),
                        resultSet.getBoolean("autenticado"));
                listaAdmin.add(admin);
            }
        }
        return listaAdmin;
    }
}
