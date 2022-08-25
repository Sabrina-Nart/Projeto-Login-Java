
package br.comLogin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public Connection getConnection() throws SQLException{ //Já consegue se conectar com o banco

        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/FaculdadeII", "postgres", "123");
        return conexao;
    }
    
}
