/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaInterfaz;

import Gestiones.GestionUsuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author RamDel
 */
public class Interfaz extends javax.swing.JFrame {

    GestionUsuario usuario = new GestionUsuario ();
    
   
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtCed = new javax.swing.JTextField();
        btnInser = new javax.swing.JButton();
        btnConsul = new javax.swing.JButton();
        btnModi = new javax.swing.JButton();
        btnElimiinar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbusuarios = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btntodo = new javax.swing.JButton();
        btntodo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setText("Id");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Cedula ");

        btnInser.setText("Insertar");
        btnInser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserActionPerformed(evt);
            }
        });

        btnConsul.setText("Consultar");
        btnConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulActionPerformed(evt);
            }
        });

        btnModi.setText("Modificar");
        btnModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiActionPerformed(evt);
            }
        });

        btnElimiinar.setText("Eliminar");
        btnElimiinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimiinarActionPerformed(evt);
            }
        });

        tbusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbusuarios);

        btntodo.setText("Mostrar Todo");
        btntodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntodoActionPerformed(evt);
            }
        });

        btntodo1.setText("Mostrar Todo");
        btntodo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntodo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnConsul)
                .addGap(28, 28, 28)
                .addComponent(btntodo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(txtCed, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApe, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnInser)
                        .addComponent(btnModi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnElimiinar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btntodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInser))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntodo1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnElimiinar)
                    .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsul)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntodo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserActionPerformed
        usuario.getUsuario().setId(Integer.parseInt(txtId.getText()));
        usuario.getUsuario().setNombre(txtNombre.getText());
        usuario.getUsuario().setApellido(txtApe.getText());
        usuario.getUsuario().setCedula(txtCed.getText());
        
        try {
         usuario.Insertar();
         JOptionPane.showMessageDialog(this, "Dato insertado correctamente");
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnInserActionPerformed

    private void btnElimiinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimiinarActionPerformed
       usuario.getUsuario().setId(Integer.parseInt(txtId.getText()));
       try{
           usuario.Eliminar();
           JOptionPane.showMessageDialog(this, "Dato Eliminado correctamente");
       }
       catch(SQLException ex)
       {
         JOptionPane.showMessageDialog(this, ex.getMessage());
       }
    }//GEN-LAST:event_btnElimiinarActionPerformed

    private void btnConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulActionPerformed
        usuario.getUsuario().setCedula(txtCed.getText());
        try{
            usuario.Consultar();
            JOptionPane.showMessageDialog(this,"Dato Consultado es:");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnConsulActionPerformed

    private void btntodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntodoActionPerformed

    private void btntodo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntodo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntodo1ActionPerformed

    private void btnModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiActionPerformed
        usuario.getUsuario().setId(Integer.parseInt(txtId.getText()));
        usuario.getUsuario().setNombre(txtNombre.getText());
            usuario.getUsuario().setApellido(txtApe.getText());
            usuario.getUsuario().setCedula(txtCed.getText());
            try
        {
            usuario.Modificar();
            JOptionPane.showMessageDialog(this, "Dato Modificado");
        }
        catch(SQLException ex)
        {JOptionPane.showMessageDialog(this, ex.getMessage());}
    }//GEN-LAST:event_btnModiActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsul;
    private javax.swing.JButton btnElimiinar;
    private javax.swing.JButton btnInser;
    private javax.swing.JButton btnModi;
    private javax.swing.JButton btntodo;
    private javax.swing.JButton btntodo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbusuarios;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCed;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}