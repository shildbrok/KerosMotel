/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package connection;
import com.sun.source.tree.TryTree;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author estev
 */
public class ConnectionDB {
    public Connection conectaDB() {
        Connection conn = null;
        
            try{
                String URL = "jdbc:mysql://localhost:3306/kerosmotel?user=root&password=";
                conn = DriverManager.getConnection(URL);
            } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Conecxão Com DB: " + e.getMessage());
            }
            return conn;
    }
}
   

