package view;

import model.AdotanteTableModel;
import controller.AdotanteDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import model.Adotante;
import model.DbConnection;

public class ListarAdotantes extends javax.swing.JFrame {

    public ListarAdotantes() {
        initComponents();
        tableAdotantes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jscroll_listaAdotantes = new javax.swing.JScrollPane();
        tableAdotantes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 227, 203));

        jLabel1.setBackground(new java.awt.Color(168, 74, 92));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(168, 74, 92));
        jLabel1.setText("Adotantes cadastrados");

        jscroll_listaAdotantes.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jscroll_listaAdotantesComponentShown(evt);
            }
        });

        tableAdotantes.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAdotantes.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableAdotantesComponentShown(evt);
            }
        });
        jscroll_listaAdotantes.setViewportView(tableAdotantes);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(36, 36, 36)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jscroll_listaAdotantes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 850, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(30, 30, 30)
                .add(jLabel1)
                .add(18, 18, 18)
                .add(jscroll_listaAdotantes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jscroll_listaAdotantesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jscroll_listaAdotantesComponentShown
        
    }//GEN-LAST:event_jscroll_listaAdotantesComponentShown

    private void tableAdotantesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableAdotantesComponentShown
        AdotanteDAO adotanteDAO = new AdotanteDAO(new DbConnection());
        try {
            adotanteDAO.getListAdotantes();
        } catch (SQLException ex) {
            Logger.getLogger(ListarAdotantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        tableAdotantes.getSelectionModel().addListSelectionListener(tableAdotantes);
    }//GEN-LAST:event_tableAdotantesComponentShown

    private void populateTable(){
        AdotanteDAO adotanteDAO = new AdotanteDAO(new DbConnection());
        AdotanteTableModel model = new AdotanteTableModel();
        try {
            List<Adotante> listaAdotantes = adotanteDAO.getListAdotantes();
            model.setLinhas(listaAdotantes);
            tableAdotantes.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(ListarAdotantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarAdotantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarAdotantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarAdotantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarAdotantes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jscroll_listaAdotantes;
    private javax.swing.JTable tableAdotantes;
    // End of variables declaration//GEN-END:variables
}
