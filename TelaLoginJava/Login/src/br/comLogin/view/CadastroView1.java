
package br.comLogin.view;

import br.comLogin.controller.LoginController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class CadastroView1 extends javax.swing.JFrame {


    public CadastroView1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEmail = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        passSenha = new javax.swing.JPasswordField();
        labelFrase = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelEmail.setText("E-mail");
        getContentPane().add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, -1));

        labelSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelSenha.setText("Senha");
        getContentPane().add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 330, -1));

        textUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 330, 30));

        passSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(passSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 330, 30));

        labelFrase.setBackground(new java.awt.Color(255, 255, 255));
        labelFrase.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelFrase.setText("Cadastro Novo Usuário");
        labelFrase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 280, 40));

        btnCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 102, 255), new java.awt.Color(255, 102, 255), new java.awt.Color(255, 102, 255), new java.awt.Color(255, 102, 255)));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 110, 40));

        labelNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNome.setText("Nome");
        getContentPane().add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 330, -1));

        textNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 330, 30));

        labelFundo.setBackground(new java.awt.Color(255, 255, 255));
        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/11VqiiIOrhL._AC_SY450_.jpg"))); // NOI18N
        getContentPane().add(labelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        if(textNome.getText().matches("") || textUsuario.getText().matches("") || passSenha.getText().matches("")){
           
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
            
        } else {
            try {
                LoginController cadastro = new LoginController();
                cadastro.cadastroUsuario(this);
            } catch (SQLException sql) {

            }
            JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso");         
            this.setVisible(false);            
        }   
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public void setBtnCadastrar(JButton btnCadastrar) {
        this.btnCadastrar = btnCadastrar;
    }

    public void setLabelEmail(JLabel labelEmail) {
        this.labelEmail = labelEmail;
    }

    public void setLabelFrase(JLabel labelFrase) {
        this.labelFrase = labelFrase;
    }

    public void setLabelFundo(JLabel labelFundo) {
        this.labelFundo = labelFundo;
    }

    public void setLabelNome(JLabel labelNome) {
        this.labelNome = labelNome;
    }

    public void setLabelSenha(JLabel labelSenha) {
        this.labelSenha = labelSenha;
    }

    public void setPassSenha(JPasswordField passSenha) {
        this.passSenha = passSenha;
    }

    public void setTextNome(JTextField textNome) {
        this.textNome = textNome;
    }

    public void setTextUsuario(JTextField textUsuario) {
        this.textUsuario = textUsuario;
    }

//////////////////////////////////////////////    
    
    public JButton getBtnCadastrar() {
        return btnCadastrar;
    }

    public JLabel getLabelEmail() {
        return labelEmail;
    }

    public JLabel getLabelFrase() {
        return labelFrase;
    }

    public JLabel getLabelFundo() {
        return labelFundo;
    }

    public JLabel getLabelNome() {
        return labelNome;
    }

    public JLabel getLabelSenha() {
        return labelSenha;
    }

    public JPasswordField getPassSenha() {
        return passSenha;
    }

    public JTextField getTextNome() {
        return textNome;
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
            java.util.logging.Logger.getLogger(CadastroView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroView1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFrase;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPasswordField passSenha;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
