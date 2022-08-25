
package br.comLogin.model;

public class Login {
    
    String nome, email, senha;

    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    public void cadastrar(String nome, String email, String senha){
        this.email = email;
        this.senha = senha;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
  
}
