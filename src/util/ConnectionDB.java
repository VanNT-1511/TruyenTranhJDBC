
package util;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author van15
 */
public class ConnectionDB {
    private static Connection conn;
    
    public static Connection getConnection(){
        if (conn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String userDB = "sa";
                String pwdDB = "123456";
                String urlDB = "jdbc:sqlserver://localhost:1433;databaseName=truyen_tranh;encrypt=false";
                conn = DriverManager.getConnection(urlDB, userDB, pwdDB);
                System.out.println(conn.getCatalog());
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }        
        }
        return conn;
    }
}
