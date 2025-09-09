
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection getConexao() {
        try{
            Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Clientes?useTimezone=true&serverTimezone=UTC",
                    "root","laboratorio");
            System.out.println("Conexao realizada");
            return conn;
        }
        catch(SQLException e){
            System.out.println("Erro ao conectar no BD: "+e.getMessage());
            return null;
        }
    }
}
