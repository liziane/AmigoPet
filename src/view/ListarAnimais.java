package view;

import controller.AnimalDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import model.AnimaisTableModel;
import model.Animal;
import model.DbConnection;

public class ListarAnimais extends javax.swing.JFrame {
    private boolean adminMode = false;
    private Animal selectedAnimal;

    public ListarAnimais() {
        initComponents();
        tableAnimais.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        populateTable();
    }
    
     public ListarAnimais(boolean adminMode) {
        initComponents();
        tableAnimais.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        populateTable();
        adminMode = true;
    }
    
    public void populateTable(){
        AnimalDAO animalDAO = new AnimalDAO(new DbConnection());
        AnimaisTableModel model = new AnimaisTableModel();
        try {
            List<Animal> listaAnimais = animalDAO.getListAnimais();
            model.setLinhas(listaAnimais);
            tableAnimais.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public JTable getTableAnimais(){
        return tableAnimais;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_msgStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAnimais = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_verDetalhes = new javax.swing.JButton();
        btn_excluirAnimais = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bgPanel.setBackground(new java.awt.Color(249, 227, 203));

        lbl_titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(168, 74, 92));
        lbl_titulo.setText("Gerenciar animais cadastrados");

        lbl_msgStatus.setBackground(new java.awt.Color(245, 213, 188));
        lbl_msgStatus.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_msgStatus.setForeground(new java.awt.Color(130, 60, 43));
        lbl_msgStatus.setOpaque(true);

        tableAnimais.setBackground(new java.awt.Color(251, 220, 196));
        tableAnimais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableAnimais.setSelectionBackground(new java.awt.Color(153, 51, 0));
        tableAnimais.setShowGrid(true);
        tableAnimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAnimaisMouseClicked(evt);
            }
        });
        tableAnimais.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableAnimaisComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tableAnimais);

        jPanel1.setBackground(new java.awt.Color(245, 213, 188));

        btn_verDetalhes.setText("Ver detalhes");
        btn_verDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verDetalhesActionPerformed(evt);
            }
        });

        btn_excluirAnimais.setText("Excluir");
        btn_excluirAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirAnimaisActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(btn_excluirAnimais, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .add(btn_editar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(btn_verDetalhes, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(btn_verDetalhes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btn_editar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btn_excluirAnimais, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(102, 51, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("/Users/lbrandin/Desktop/Screen Shot 2013-06-25 at 9.22.35 PM.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout bgPanelLayout = new org.jdesktop.layout.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bgPanelLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(bgPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lbl_titulo)
                    .add(bgPanelLayout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(bgPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 666, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, bgPanelLayout.createSequentialGroup()
                                .add(lbl_msgStatus, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bgPanelLayout.createSequentialGroup()
                .add(16, 16, 16)
                .add(lbl_titulo)
                .add(18, 18, 18)
                .add(bgPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(bgPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton1)
                    .add(lbl_msgStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bgPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bgPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableAnimaisComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableAnimaisComponentShown
        AnimalDAO animalDAO = new AnimalDAO(new DbConnection());
        try {
            animalDAO.getListAnimais();
        } catch (SQLException ex) {
            Logger.getLogger(ListarAnimais.class.getName()).log(Level.SEVERE, null, ex);
        }
        tableAnimais.getSelectionModel().addListSelectionListener(tableAnimais);
        
        
        
    }//GEN-LAST:event_tableAnimaisComponentShown

    private void btn_verDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verDetalhesActionPerformed
        int row = tableAnimais.getSelectedRow();
        Animal animalSelected;
        AnimaisTableModel model = (AnimaisTableModel) tableAnimais.getModel();
        if(row != -1) {
            animalSelected = model.getAnimal(row);
            DetalheAnimal detalheAnimal = new DetalheAnimal(animalSelected);
            detalheAnimal.setVisible(true);
        } else {
            lbl_msgStatus.setText("Nenhum animal foi selecionado");
        }
        
    }//GEN-LAST:event_btn_verDetalhesActionPerformed

    private void btn_excluirAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirAnimaisActionPerformed
        int row = tableAnimais.getSelectedRow();
        Animal animalSelected;
        AnimaisTableModel model = (AnimaisTableModel) tableAnimais.getModel();
        if(row != -1) {
            animalSelected = model.getAnimal(row);
            animalSelected.excluir();
            populateTable();
            lbl_msgStatus.setText("Registro excluído com sucesso!");
        } else {
            lbl_msgStatus.setText("Nenhum animal foi selecionado");
        }
    }//GEN-LAST:event_btn_excluirAnimaisActionPerformed

    private void tableAnimaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAnimaisMouseClicked
        lbl_msgStatus.setText("");
    }//GEN-LAST:event_tableAnimaisMouseClicked

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
       int row = tableAnimais.getSelectedRow();
        Animal animalSelected;
        AnimaisTableModel model = (AnimaisTableModel) tableAnimais.getModel();
        if(row != -1) {
            animalSelected = model.getAnimal(row);
        EditarAnimal editAnimal = new EditarAnimal(animalSelected);
        editAnimal.setVisible(true);
        } else {
            lbl_msgStatus.setText("Nenhum animal selecionado.");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        populateTable();
        lbl_msgStatus.setText("");
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
            java.util.logging.Logger.getLogger(ListarAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarAnimais().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluirAnimais;
    private javax.swing.JButton btn_verDetalhes;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_msgStatus;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tableAnimais;
    // End of variables declaration//GEN-END:variables
}
