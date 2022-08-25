
package br.comLogin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet; 
import org.postgresql.jdbc.ResultWrapper;

public class LoginDAO {
    
    public void cadastrarUsuario(String nome, String email, String senha) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "INSERT INTO login(NOME, EMAIL, SENHA) VALUES('"+nome+"', '"+email+"', '"+senha+"')"; //'' porque é varchar - porque se dizer que teste é igual nome, o teste substitui
        PreparedStatement statment = conexao.prepareStatement(sql);
        statment.execute();
        conexao.close();
    }
 
    public void login(String nome, String email, String senha) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "SELECT EMAIL, SENHA FROM login WHERE '"+email+"' AND '"+senha+"')"; //'' porque é varchar - porque se dizer que teste é igual nome, o teste substitui
        PreparedStatement statment = conexao.prepareStatement(sql);
        ResultSet rs = statment.executeQuery();
        
        if (rs.next()) {
            System.out.print("Possui");
        } else {
            System.out.println("Não possui");
        }
            
        conexao.close();
    }

    public void login(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
