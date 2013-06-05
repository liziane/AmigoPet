
package view;

import controller.AnimalDAO;
import java.io.File;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.Animal;
import model.DbConnection;
import model.ShowMessageDialog;

public class CadastrarAnimal extends javax.swing.JFrame {

    public CadastrarAnimal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_obs = new javax.swing.JTextArea();
        txt_nomeAnimal = new javax.swing.JTextField();
        txt_raca = new javax.swing.JTextField();
        txt_idade = new javax.swing.JTextField();
        btn_escolherFoto = new javax.swing.JButton();
        btn_cadAnimal = new javax.swing.JButton();
        btn_limpaForm = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        opt_tipoAnimal = new javax.swing.JComboBox();
        pn_mostrarImagem = new javax.swing.JPanel();
        lbl_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(249, 227, 203));

        jLabel1.setText("Nome");

        jLabel2.setText("Raça");

        jLabel3.setText("Tipo");

        jLabel4.setText("Idade");

        jLabel5.setText("Observações");

        txt_obs.setColumns(20);
        txt_obs.setRows(5);
        jScrollPane1.setViewportView(txt_obs);

        btn_escolherFoto.setText("Escolher foto...");
        btn_escolherFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_escolherFotoActionPerformed(evt);
            }
        });

        btn_cadAnimal.setText("Cadastrar");
        btn_cadAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadAnimalActionPerformed(evt);
            }
        });

        btn_limpaForm.setText("Limpar campos");
        btn_limpaForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpaFormActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(168, 74, 92));
        jLabel6.setText("Cadastro de novo animal");

        opt_tipoAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "gato", "cachorro", "pássaro" }));

        org.jdesktop.layout.GroupLayout pn_mostrarImagemLayout = new org.jdesktop.layout.GroupLayout(pn_mostrarImagem);
        pn_mostrarImagem.setLayout(pn_mostrarImagemLayout);
        pn_mostrarImagemLayout.setHorizontalGroup(
            pn_mostrarImagemLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pn_mostrarImagemLayout.createSequentialGroup()
                .addContainerGap()
                .add(lbl_image, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_mostrarImagemLayout.setVerticalGroup(
            pn_mostrarImagemLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pn_mostrarImagemLayout.createSequentialGroup()
                .addContainerGap()
                .add(lbl_image, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel5)
                    .add(jLabel3)
                    .add(jLabel1)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(jPanel2Layout.createSequentialGroup()
                            .add(txt_raca)
                            .add(18, 18, 18)
                            .add(jLabel4)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(txt_idade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(txt_nomeAnimal)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 385, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(opt_tipoAnimal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 151, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btn_escolherFoto)
                    .add(pn_mostrarImagem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
            .add(jPanel2Layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel6)
                        .add(56, 56, 56))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(btn_limpaForm)
                        .add(18, 18, 18)
                        .add(btn_cadAnimal)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 36, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel1)
                            .add(txt_nomeAnimal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(txt_raca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel4)
                            .add(txt_idade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(opt_tipoAnimal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel5)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(pn_mostrarImagem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(btn_escolherFoto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(55, 55, 55)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btn_cadAnimal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btn_limpaForm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(25, 25, 25))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpaFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpaFormActionPerformed
        txt_nomeAnimal.setText("");
        txt_raca.setText("");
        txt_idade.setText("");
        //opt_tipoAnimal.set;
        txt_obs.setText("");
    }//GEN-LAST:event_btn_limpaFormActionPerformed

    private void btn_cadAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadAnimalActionPerformed
        Animal novoAnimal = new Animal(opt_tipoAnimal.getSelectedItem().toString(),
                                       txt_raca.getText(), 
                                       txt_nomeAnimal.getText(),
                                       txt_idade.getText(),
                                       txt_obs.getText());
        
        AnimalDAO animalDAO = new AnimalDAO(new DbConnection());
        try {
            animalDAO.salvar(novoAnimal);
            ShowMessageDialog.success(evt, "Amigão cadastrado com sucesso! =ˆ;ˆ=");
            btn_limpaFormActionPerformed(evt);
        } catch (SQLException ex) {
            ShowMessageDialog.error(ex.getMessage(), "Não foi possível cadastrar um novo animal :(");
        }
    }//GEN-LAST:event_btn_cadAnimalActionPerformed

    private void btn_escolherFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_escolherFotoActionPerformed
        JFileChooser filechooser = new JFileChooser();
        String file = filechooser.getSelectedFile().getPath();
        lbl_image.setIcon(new ImageIcon(file));
    }//GEN-LAST:event_btn_escolherFotoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAnimal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadAnimal;
    private javax.swing.JButton btn_escolherFoto;
    private javax.swing.JButton btn_limpaForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JComboBox opt_tipoAnimal;
    private javax.swing.JPanel pn_mostrarImagem;
    private javax.swing.JTextField txt_idade;
    private javax.swing.JTextField txt_nomeAnimal;
    private javax.swing.JTextArea txt_obs;
    private javax.swing.JTextField txt_raca;
    // End of variables declaration//GEN-END:variables
}
