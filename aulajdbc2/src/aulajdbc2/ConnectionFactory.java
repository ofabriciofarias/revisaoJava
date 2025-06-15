/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajdbc2;

/**
 *
 * @author labex
 */
//Importa as bibliotecas SQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public static Connection getConexao(){
        
        String url = "jdbc:mysql://localhost:3306/"
                + "bd_alunos?useTimezone=true"
                + "&serverTimezone=America/Sao_Paulo";
//        String url = "jdbc:mariadb://localhost:3307/"
//                + "db_escola?useTimezone=true"
//                + "&serverTimezone=America/Sao_Paulo";
        String user = "root";
        String password = "";
        
        try{
            return DriverManager.getConnection(url, 
                    user, password);
        }catch(SQLException e){
            System.out.println("Erro SQL Exception " + e);
        }
        return null;
    }
}

