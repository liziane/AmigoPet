
package amigopet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class DbConnection {
    private String Driver;
    private String File;
    private String Url;
    private Connection conn;
    private PreparedStatement pstmt;
    private boolean transaction;

    public DbConnection() {
        Driver = "org.sqlite.JDBC";
        File = "AmigoPet.sqlite";
        Url = "jdbc:sqlite:" + File;
        conn = null;
        pstmt = null;
        transaction = false;
        create();
    }
    
        public void connect() throws SQLException {
        if (conn != null) return;
        
        try {
            Class.forName(Driver);
        } catch (ClassNotFoundException e) {
            ShowMessageDialog.error(e.getMessage(), "Error");
        }
        this.conn = DriverManager.getConnection(this.Url);
        
        enableForeign_keys(true);
    }

    public boolean isTransaction() {
        return transaction;
    }
    
        public void create() {
        try {
            connect();
            executeUpdate("pragma foreign_keys = 1");
            
            executeUpdate("CREATE TABLE IF NOT EXISTS animal (\n"
                    + "id integer PRIMARY KEY AUTOINCREMENT NOT NULL, \n"
                    + "tipo text NOT NULL, \n"
                    + "raca text NOT NULL,  \n"
                    + "nome text NOT NULL,  \n"
                    + "idade text NOT NULL,  \n"
                    + "observacoes text NOT NULL, \n"
                    + "adotado boolean NOT NULL)\n");

            executeUpdate("CREATE TABLE IF NOT EXISTS adotante(\n"
                    + "id integer PRIMARY KEY AUTOINCREMENT NOT NULL, \n"
                    + "nome text NOT NULL, \n"
                    + "cpf text NOT NULL, \n"
                    + "email text, \n"
                    + "endereco text, \n"
                    + "fone text NOT NULL)\n");


            
            close();
        } catch (SQLException e) {
            ShowMessageDialog.error("Não foi possivel criar ou acessar o banco de dados", "Erro");
        }
    }
   
       public void enableForeign_keys(boolean isEnable) throws SQLException{
        int enable = (isEnable) ? 1 : 0;        
        executeUpdate("pragma foreign_keys = " + enable + ";");
    }
       
       public void startTransaction() throws SQLException {
        this.conn.setAutoCommit(false);
        this.transaction = true;
    }

    public void commit() throws SQLException {
        this.conn.commit();
        this.transaction = false;
    }

    public void rollback() throws SQLException {
        this.conn.rollback();
        this.transaction = false;
    }

    public ResultSet executeQuery(String query, Object... fields)
            throws SQLException {

        this.pstmt = this.conn.prepareStatement(query);

        int i = 1;
        for (Object field : fields) {
            this.pstmt.setObject(i++, field);
        }

        ResultSet result = this.pstmt.executeQuery();
        return result;
    }

    public ResultSet executeQuery(String query)
            throws SQLException {
        this.pstmt = this.conn.prepareStatement(query);
        ResultSet result = this.pstmt.executeQuery();
        return result;
    }

    public int executeUpdateAndReturn(String query, Object... fields) throws SQLException {
        this.pstmt = this.conn.prepareStatement(query,
                Statement.RETURN_GENERATED_KEYS);
        int i = 1;
        for (Object field : fields) {
            this.pstmt.setObject(i++, field);
        }

        this.pstmt.executeUpdate(); 
        int keyGenerated = lastId(); // para o mysql isso não é necessário.
        closePreparedStatement();
        return keyGenerated;
    }

    public void executeUpdate(String query, Object... fields) throws SQLException {
        this.pstmt = this.conn.prepareStatement(query);
        int i = 1;
        for (Object field : fields) {
            this.pstmt.setObject(i++, field);
        }

        this.pstmt.executeUpdate();
        closePreparedStatement();
    }

    public void executeUpdate(String query) throws SQLException {
        this.pstmt = this.conn.prepareStatement(query);
        this.pstmt.executeUpdate();
        closePreparedStatement();
    }

    public int lastId() throws SQLException {
        int lastId = 0;
        ResultSet rs = this.pstmt.getGeneratedKeys();
        while (rs.next()) {
            lastId = rs.getInt(1);
        }
        return lastId;
    }

    public void close() {
        closePreparedStatement();
        closeConnection();
    }

    private void closePreparedStatement() {
        if (this.pstmt != null) {
            try {
                this.pstmt.close();
                this.pstmt = null;
            } catch (SQLException ex) {
            }
        }
    }

    private void closeConnection() {
        if ((this.conn != null) && (this.transaction == false)) {
            try {
                this.conn.close();
                this.conn = null;
            } catch (SQLException ex) {
            }
        }
    }
    
    
}


