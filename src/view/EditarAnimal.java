
package view;

import controller.AnimalDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.Animal;
import model.DbConnection;

public class EditarAnimal extends javax.swing.JFrame {
    Animal animalAntes;
    int id;
    String urlIcon;
    
    public EditarAnimal() {
        initComponents();
    }

    public EditarAnimal(Animal animal){
        initComponents();
        txt_nome.setText(animal.getNome());
        txt_idade.setText(animal.getIdade());
        txt_raca.setText(animal.getRaca());
        txt_obs.setText(animal.getObservacoes());
        lbl_imagem.setIcon(animal.getImage());
        animalAntes = animal;
        urlIcon = animal.getUrlImagem();
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_obs = new javax.swing.JTextArea();
        txt_nome = new javax.swing.JTextField();
        txt_raca = new javax.swing.JTextField();
        txt_idade = new javax.swing.JTextField();
        btn_escolherFoto = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboboxTipo = new javax.swing.JComboBox();
        lbl_imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_bg.setBackground(new java.awt.Color(249, 227, 203));
        panel_bg.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panel_bgComponentShown(evt);
            }
        });

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

        btn_update.setText("Atualizar");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(168, 74, 92));
        jLabel6.setText("Atualizar informações");

        comboboxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "gato", "cachorro", "pássaro" }));

        org.jdesktop.layout.GroupLayout panel_bgLayout = new org.jdesktop.layout.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel_bgLayout.createSequentialGroup()
                .add(19, 19, 19)
                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(panel_bgLayout.createSequentialGroup()
                        .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(panel_bgLayout.createSequentialGroup()
                                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel5)
                                    .add(jLabel3)
                                    .add(jLabel1)
                                    .add(jLabel2))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(panel_bgLayout.createSequentialGroup()
                                            .add(comboboxTipo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(38, 38, 38)
                                            .add(jLabel4)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(txt_idade))
                                        .add(txt_nome)
                                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 385, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(txt_raca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 234, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jLabel6))
                        .add(29, 29, 29)
                        .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lbl_imagem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btn_escolherFoto)))
                    .add(panel_bgLayout.createSequentialGroup()
                        .add(btn_cancelar)
                        .add(18, 18, 18)
                        .add(btn_update)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel_bgLayout.createSequentialGroup()
                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panel_bgLayout.createSequentialGroup()
                        .add(21, 21, 21)
                        .add(jLabel6)
                        .add(18, 18, Short.MAX_VALUE)
                        .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel1)
                            .add(txt_nome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(13, 13, 13)
                        .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(comboboxTipo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel4)
                            .add(txt_idade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3))
                        .add(18, 18, 18)
                        .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(txt_raca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel5)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(panel_bgLayout.createSequentialGroup()
                        .add(37, 37, 37)
                        .add(lbl_imagem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(btn_escolherFoto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 41, Short.MAX_VALUE)
                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btn_cancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btn_update, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(25, 25, 25))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel_bg, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel_bg, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel_bgComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panel_bgComponentShown
        
    }//GEN-LAST:event_panel_bgComponentShown

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        Animal updatedAnimal = new Animal(animalAntes.getId(),
                                           comboboxTipo.getSelectedItem().toString(),
                                            txt_raca.getText(), 
                                            txt_nome.getText(),
                                            txt_idade.getText(),
                                            txt_obs.getText(), 
                                            animalAntes.isAdotado(),
                                            animalAntes.getAdotante());
                                            
        updatedAnimal.setImagem(urlIcon);
        AnimalDAO animalDAO = new AnimalDAO(new DbConnection());
        try {
            animalDAO.updateAnimal(updatedAnimal);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(EditarAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_escolherFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_escolherFotoActionPerformed
        JFileChooser filechooser = new JFileChooser();
        filechooser.showDialog(null, null);
        urlIcon = filechooser.getSelectedFile().getPath();
        lbl_imagem.setIcon(new ImageIcon(urlIcon));
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
            java.util.logging.Logger.getLogger(EditarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarAnimal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_escolherFoto;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox comboboxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_imagem;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JTextField txt_idade;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextArea txt_obs;
    private javax.swing.JTextField txt_raca;
    // End of variables declaration//GEN-END:variables
}
