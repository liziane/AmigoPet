package view;

import controller.AdotanteDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Adotante;
import model.DbConnection;
import model.ShowMessageDialog;

public class CadastrarAdotante extends javax.swing.JFrame {

    public CadastrarAdotante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_nomeAdotante = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_fone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        btn_cadAdotante = new javax.swing.JButton();
        btn_limparForm = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(168, 74, 92));
        jLabel6.setText("Cadastro de novo animal");

        jLabel1.setText("Nome");

        jLabel2.setText("Raça");

        jLabel4.setText("Idade");

        jLabel3.setText("Tipo");

        jLabel5.setText("Observações");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Cadastrar");

        jButton2.setText("Limpar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(249, 227, 203));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(168, 74, 92));
        jLabel7.setText("Cadastro de novo adotante");

        jLabel8.setText("Nome");

        jLabel9.setText("CPF");

        jLabel10.setText("Fone");

        jLabel11.setText("Endereço");

        jLabel12.setText("E-mail");

        btn_cadAdotante.setText("Cadastrar");
        btn_cadAdotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadAdotanteActionPerformed(evt);
            }
        });

        btn_limparForm.setText("Limpar campos");
        btn_limparForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparFormActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(jPanel2Layout.createSequentialGroup()
                            .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btn_limparForm)
                            .add(18, 18, 18)
                            .add(btn_cadAdotante))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                            .add(50, 50, 50)
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jLabel9)
                                .add(jLabel8)
                                .add(jLabel11)
                                .add(jLabel12))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(txt_nomeAdotante)
                                .add(jPanel2Layout.createSequentialGroup()
                                    .add(txt_cpf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 156, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(25, 25, 25)
                                    .add(jLabel10)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(txt_fone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 171, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(txt_endereco)
                                .add(txt_email))))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(30, 30, 30)
                        .add(jLabel7)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(32, 32, 32)
                .add(jLabel7)
                .add(29, 29, 29)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(txt_nomeAdotante, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(txt_cpf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel10)
                    .add(txt_fone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel11)
                    .add(txt_endereco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel12)
                    .add(txt_email, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 45, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btn_cadAdotante, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btn_limparForm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(41, 41, 41))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limparFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparFormActionPerformed
            txt_nomeAdotante.setText("");
            txt_cpf.setText("");
            txt_endereco.setText("");
            txt_email.setText("");
            txt_fone.setText("");
    }//GEN-LAST:event_btn_limparFormActionPerformed

    private void btn_cadAdotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadAdotanteActionPerformed
       Adotante novoAdotante = new Adotante(txt_nomeAdotante.getText(),
                                            txt_cpf.getText(), 
                                            txt_email.getText(), 
                                            txt_endereco.getText(), 
                                            txt_fone.getText());
       AdotanteDAO novoAdotanteDAO = new AdotanteDAO(new DbConnection());
        try {
            novoAdotanteDAO.salvar(novoAdotante);
            ShowMessageDialog.success(evt, "Adotante cadastrado com sucesso! :)");
            btn_limparFormActionPerformed(evt);
            
        } catch (SQLException ex) {
            ShowMessageDialog.error(ex.getMessage(), "Não foi possível cadastrar um novo adotante :(");
        }
    }//GEN-LAST:event_btn_cadAdotanteActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(CadastrarAdotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAdotante().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadAdotante;
    private javax.swing.JButton btn_limparForm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_fone;
    private javax.swing.JTextField txt_nomeAdotante;
    // End of variables declaration//GEN-END:variables
}
