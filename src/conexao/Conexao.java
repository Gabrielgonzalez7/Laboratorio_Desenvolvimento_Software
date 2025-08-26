/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;
import java.sql.*;
public class Conexao {

    /**
     *
     * @return
     */
    public Connection getConexao(){
        try{
            
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ESCOLA?useTimezone=true&serverTimezone=UTC",
                    "root", "laboratorio");
            System.out.println("Conexao realizada com sucesso!");
            return conn;
        }
            catch(SQLException e){
                    System.out.println("Erro ao conectar no BD" +e.getMessage());
                    return null;
                    }
        }
    } 

