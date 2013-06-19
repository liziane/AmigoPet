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
import model.ShowMessageDialog;

public class ListarAnimais extends javax.swing.JFrame {

    public ListarAnimais() {
        initComponents();
        tableAnimais.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        populateTable();
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
        jscrollpListaAnimais = new javax.swing.JScrollPane();
        panel_gridAnimais = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAnimais = new javax.swing.JTable();
        btn_verDetalhes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bgPanel.setBackground(new java.awt.Color(249, 227, 203));

        lbl_titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(168, 74, 92));
        lbl_titulo.setText("Clique sobre uma imagem para saber mais sobre o animal");

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
        tableAnimais.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableAnimaisComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tableAnimais);

        org.jdesktop.layout.GroupLayout panel_gridAnimaisLayout = new org.jdesktop.layout.GroupLayout(panel_gridAnimais);
        panel_gridAnimais.setLayout(panel_gridAnimaisLayout);
        panel_gridAnimaisLayout.setHorizontalGroup(
            panel_gridAnimaisLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
        panel_gridAnimaisLayout.setVerticalGroup(
            panel_gridAnimaisLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel_gridAnimaisLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 231, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 164, Short.MAX_VALUE))
        );

        jscrollpListaAnimais.setViewportView(panel_gridAnimais);

        btn_verDetalhes.setText("Ver detalhes");
        btn_verDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verDetalhesActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout bgPanelLayout = new org.jdesktop.layout.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bgPanelLayout.createSequentialGroup()
                .add(40, 40, 40)
                .add(bgPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(btn_verDetalhes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bgPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jscrollpListaAnimais, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(lbl_titulo)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bgPanelLayout.createSequentialGroup()
                .add(17, 17, 17)
                .add(lbl_titulo)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jscrollpListaAnimais, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 337, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btn_verDetalhes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bgPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bgPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            ShowMessageDialog.error("Erro", "Nenhum animal foi selecionado");
        }
        
    }//GEN-LAST:event_btn_verDetalhesActionPerformed

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
    private javax.swing.JButton btn_verDetalhes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jscrollpListaAnimais;
    private javax.swing.JLabel lbl_titulo;
    private java.awt.Panel panel_gridAnimais;
    private javax.swing.JTable tableAnimais;
    // End of variables declaration//GEN-END:variables
}
