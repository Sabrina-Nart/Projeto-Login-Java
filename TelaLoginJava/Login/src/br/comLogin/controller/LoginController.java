
package br.comLogin.controller;

import br.comLogin.dao.Conexao;
import br.comLogin.dao.LoginDAO;
import br.comLogin.view.CadastroView1;
import br.comLogin.view.LoginView;
import java.sql.Connection;
import java.sql.SQLException;

public class LoginController {

    public void cadastroUsuario(CadastroView1 view) throws SQLException{
        
        Connection conexao = new Conexao().getConnection();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUsuario(view.getTextNome().getText(), view.getTextUsuario().getText(), view.getPassSenha().getText());   
    }

    public void loginUsuario(LoginView view) throws SQLException{
        
        Connection conexao = new Conexao().getConnection();
        LoginDAO login = new LoginDAO();
        login.login(view.getTextUsuario().getText(), view.getPassSenha().getText());  
    }
    
}
