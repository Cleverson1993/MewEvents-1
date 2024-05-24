/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.andrelima.projetologin;


public class CadastroUsuarioTela extends javax.swing.JFrame {

    public CadastroUsuarioTela() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        novoUsuarioTextField = new javax.swing.JTextField();
        novaSenhaPasswordField = new javax.swing.JPasswordField();
        confirmaNovaSenhaPasswordField = new javax.swing.JPasswordField();
        cadastrarUsuarioButton = new javax.swing.JButton();
        txtNomeUsuario = new javax.swing.JLabel();
        txtSenha = new javax.swing.JLabel();
        txtConfirSenha = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        novoUsuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoUsuarioTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(novoUsuarioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 375, -1));
        getContentPane().add(novaSenhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 133, 375, -1));
        getContentPane().add(confirmaNovaSenhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 196, 375, -1));

        cadastrarUsuarioButton.setText("Cadastrar");
        cadastrarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUsuarioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarUsuarioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 248, 375, 60));

        txtNomeUsuario.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txtNomeUsuario.setText("Nome do usuário");
        getContentPane().add(txtNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 48, -1, -1));

        txtSenha.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txtSenha.setText("Senha");
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 111, -1, -1));

        txtConfirSenha.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txtConfirSenha.setText("Confirmar senha");
        getContentPane().add(txtConfirSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 174, -1, -1));

        jButton1.setText(" Já tenho uma conta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 180, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Praia.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioButtonActionPerformed
        var novoLogin = novoUsuarioTextField.getText();
        var novaSenha = new String(novaSenhaPasswordField.getPassword());
        var confirmaNovaSenha =
                new String(confirmaNovaSenhaPasswordField.getPassword());
        //string pool
        if (novaSenha.equals(confirmaNovaSenha)){

        }
    }//GEN-LAST:event_cadastrarUsuarioButtonActionPerformed

    private void novoUsuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoUsuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novoUsuarioTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new LoginTela().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuarioTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarUsuarioButton;
    private javax.swing.JPasswordField confirmaNovaSenhaPasswordField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField novaSenhaPasswordField;
    private javax.swing.JTextField novoUsuarioTextField;
    private javax.swing.JLabel txtConfirSenha;
    private javax.swing.JLabel txtNomeUsuario;
    private javax.swing.JLabel txtSenha;
    // End of variables declaration//GEN-END:variables
}
