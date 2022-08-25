
package br.comLogin.view;

import br.comLogin.controller.LoginController;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends javax.swing.JFrame {
    
    public LoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUsuario = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        passSenha = new javax.swing.JPasswordField();
        labelFrase = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        buttonRealizarCadastro = new javax.swing.JButton();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelUsuario.setText("Usuário");
        getContentPane().add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 330, -1));

        labelSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelSenha.setText("Senha");
        getContentPane().add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 330, -1));

        textUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, 30));

        passSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(passSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 330, 30));

        labelFrase.setBackground(new java.awt.Color(255, 255, 255));
        labelFrase.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelFrase.setText("Bem-Vindo");
        labelFrase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 130, 40));

        btnEntrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 0, 153), new java.awt.Color(204, 0, 153)));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 110, 40));

        buttonRealizarCadastro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonRealizarCadastro.setText("Realizar Cadastro");
        buttonRealizarCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 0, 153), new java.awt.Color(204, 0, 153)));
        buttonRealizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRealizarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRealizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 110, 20));

        labelFundo.setBackground(new java.awt.Color(255, 255, 255));
        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/11VqiiIOrhL._AC_SY450_.jpg"))); // NOI18N
        getContentPane().add(labelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRealizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRealizarCadastroActionPerformed
        
        CadastroView1 telaCadastroView1 = new CadastroView1();
        telaCadastroView1.setVisible(true);  
    }//GEN-LAST:event_buttonRealizarCadastroActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        
        if(textUsuario.getText().matches("") || passSenha.getText().matches("")){
            
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
            
        } else {
            
            try {
                LoginController login = new LoginController();
                login.loginUsuario(this);
            }catch (SQLException sql) {
                
            }
        }   
    }//GEN-LAST:event_btnEntrarActionPerformed

    public void setBtnEntrar(JButton btnEntrar) {
        this.btnEntrar = btnEntrar;
    }

    public void setButtonRealizarCadastro(JButton buttonRealizarCadastro) {
        this.buttonRealizarCadastro = buttonRealizarCadastro;
    }

    public void setLabelFrase(JLabel labelFrase) {
        this.labelFrase = labelFrase;
    }

    public void setLabelFundo(JLabel labelFundo) {
        this.labelFundo = labelFundo;
    }

    public void setLabelSenha(JLabel labelSenha) {
        this.labelSenha = labelSenha;
    }

    public void setLabelUsuario(JLabel labelUsuario) {
        this.labelUsuario = labelUsuario;
    }

    public void setPassSenha(JPasswordField passSenha) {
        this.passSenha = passSenha;
    }

    public void setTextUsuario(JTextField textUsuario) {
        this.textUsuario = textUsuario;
    }

//////////////////////////////////    
    
    public JButton getBtnEntrar() {
        return btnEntrar;
    }

    public JButton getButtonRealizarCadastro() {
        return buttonRealizarCadastro;
    }

    public JLabel getLabelFrase() {
        return labelFrase;
    }

    public JLabel getLabelFundo() {
        return labelFundo;
    }

    public JLabel getLabelSenha() {
        return labelSenha;
    }

    public JLabel getLabelUsuario() {
        return labelUsuario;
    }

    public JPasswordField getPassSenha() {
        return passSenha;
    }

    public JTextField getTextUsuario() {
        return textUsuario;
    }


    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton buttonRealizarCadastro;
    private javax.swing.JLabel labelFrase;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPasswordField passSenha;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
