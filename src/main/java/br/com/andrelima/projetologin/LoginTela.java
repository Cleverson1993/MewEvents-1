/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.andrelima.projetologin;

import javax.swing.JOptionPane;


public class LoginTela extends javax.swing.JFrame {

    public LoginTela() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtLogin = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        txtSenha = new javax.swing.JLabel();
        senhaPasswordField = new javax.swing.JPasswordField();
        entrarButton = new javax.swing.JButton();
        criarContaButton = new javax.swing.JButton();
        iconMew = new javax.swing.JLabel();
        cancelarButton = new javax.swing.JButton();
        ImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLogin.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txtLogin.setText("Login:");
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 244, 300, -1));

        loginTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(loginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 264, 300, 34));

        txtSenha.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        txtSenha.setText("Senha:");
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 310, 300, -1));

        senhaPasswordField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(senhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 330, 300, 32));

        entrarButton.setBackground(new java.awt.Color(244, 196, 179));
        entrarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        entrarButton.setText("Entrar");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(entrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 415, 100, 40));

        criarContaButton.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        criarContaButton.setForeground(new java.awt.Color(0, 153, 204));
        criarContaButton.setText("Criar conta");
        criarContaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarContaButtonActionPerformed(evt);
            }
        });
        jPanel1.add(criarContaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 374, 100, -1));

        iconMew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mew_icon-icons.com_67542.png"))); // NOI18N
        iconMew.setText("jLabel2");
        jPanel1.add(iconMew, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 113, 101, -1));

        cancelarButton.setBackground(new java.awt.Color(244, 196, 179));
        cancelarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.setMaximumSize(new java.awt.Dimension(72, 23));
        cancelarButton.setMinimumSize(new java.awt.Dimension(72, 23));
        cancelarButton.setPreferredSize(new java.awt.Dimension(72, 23));
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 415, 100, 40));

        ImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundGrass.jpg"))); // NOI18N
        ImagemFundo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ImagemFundo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray));
        jPanel1.add(ImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldActionPerformed

   private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    try {
        String login = loginTextField.getText();
        String senha = new String(senhaPasswordField.getPassword());
        var usuario = new Usuario(login, senha);
        var dao = new UsuarioDAO();
        if (dao.existe(usuario)) {
            this.setVisible(false);
            if (usuario.getTipo() == 1) {
                new AdminTela().setVisible(true);
            } else if (usuario.getTipo() == 2) {
                new ComumTela().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de usuário inválido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Par usuário/senha inválido");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
    }
}

    private void criarContaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarContaButtonActionPerformed
      this.setVisible(false);
      new CadastroUsuarioTela().setVisible(true);
    }//GEN-LAST:event_criarContaButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagemFundo;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton criarContaButton;
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel iconMew;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtSenha;
    // End of variables declaration//GEN-END:variables
}
