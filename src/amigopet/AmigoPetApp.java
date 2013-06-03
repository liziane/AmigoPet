//Liziane Brandini
package amigopet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmigoPetApp {
        
        public static void main(String[] args) {
            
        Animal animal = new Animal("gato", "persa", "luigi", "2", "pretinho lindo");
        System.out.println(animal.getNome() + animal.getAdotante());

        DbConnection db = new DbConnection();
        
        String query = "SELECT * FROM animal "
                + "WHERE tipo LIKE ?";

        String field = "gato";
        try {
            db.connect();
            ResultSet rs = db.executeQuery(query, "%" + field + "%");

            while (rs.next()) {
                System.out.println(rs.getString("nome"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        db.close();
    }
}





