/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siomai.inventory.app;

import java.awt.Color;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;

/**
 *
 * @author Conrad Francisco Jr
 */
public class UpdateNProduct extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    PreparedStatement pst = null;
    Statement st = null;
    /**
     * Creates new form Inventory
     */
    public UpdateNProduct() {
        initComponents();
        conn = Methods.opensDB();
        this.setLocationRelativeTo(null);
        URL iconURL = getClass().getResource("icon.jpg");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(Color.RED);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInvent = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        lblProductName = new javax.swing.JLabel();
        mnuMenu = new javax.swing.JMenuBar();
        menubar = new javax.swing.JMenu();
        mnuReturn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Update Supply");
        setBackground(new java.awt.Color(255, 0, 0));
        setForeground(new java.awt.Color(255, 0, 0));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("UPDATE SUPPLY");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel19.setText("Fill in the necessary Information:");

        btnUpdate.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel20.setText("SUPPLY ID:");

        txtID.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtProductName.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtProductName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductNameKeyPressed(evt);
            }
        });

        lblProductName.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblProductName.setText("SUPPLY NAME:");

        javax.swing.GroupLayout pnlInventLayout = new javax.swing.GroupLayout(pnlInvent);
        pnlInvent.setLayout(pnlInventLayout);
        pnlInventLayout.setHorizontalGroup(
            pnlInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInventLayout.createSequentialGroup()
                        .addGroup(pnlInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductName)
                            .addGroup(pnlInventLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInventLayout.createSequentialGroup()
                        .addGroup(pnlInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdate)
                            .addGroup(pnlInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19)
                                .addComponent(jLabel2)
                                .addComponent(jLabel20)
                                .addGroup(pnlInventLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(164, 164, 164))))
        );
        pnlInventLayout.setVerticalGroup(
            pnlInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProductName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        menubar.setText("Menu");

        mnuReturn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mnuReturn.setText("Main Menu");
        mnuReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReturnActionPerformed(evt);
            }
        });
        menubar.add(mnuReturn);

        mnuMenu.add(menubar);

        setJMenuBar(mnuMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInvent, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
                
        try{
            int id = Integer.parseInt(txtID.getText());
            String name = txtProductName.getText();
            int quantity = 0;
            if(Methods.openDB()){
                String values = "ProductName= '"+name+"'";
                Methods.update1("NProducts", values, id);
            }
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to update again?", "Succesfully Updated!", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION) {
                
                Methods.closeDB();
                new UpdateNProduct().setVisible(true);
                dispose();
                
            }
            else if(dialogResult == JOptionPane.NO_OPTION){
                 
                new MainMenuAdmin().setVisible(true);
                dispose();
                
            } 
               else{
                    javax.swing.JOptionPane.showMessageDialog(null, "Error!!");
                }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);  
            
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void mnuReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReturnActionPerformed
        new MainMenuAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuReturnActionPerformed

    private void txtProductNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductNameKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try{
                int id = Integer.parseInt(txtID.getText());
                String name = txtProductName.getText();
                int quantity = 0;
                if(Methods.openDB()){
                    String values = "ProductName= '"+name+"'";
                    Methods.update1("NProducts", values, id);
                }
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to update again?", "Succesfully Updated!", dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION) {
                
                    Methods.closeDB();
                    new UpdateNProduct().setVisible(true);
                    dispose();
                
                }
                else if(dialogResult == JOptionPane.NO_OPTION){
                 
                    new MainMenuAdmin().setVisible(true);
                    dispose();
                
                } 
                else{
                    javax.swing.JOptionPane.showMessageDialog(null, "Error!!");
                }
            }
            catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);  
            }
        }
    }//GEN-LAST:event_txtProductNameKeyPressed

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
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateNProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JMenu menubar;
    private javax.swing.JMenuBar mnuMenu;
    private javax.swing.JMenuItem mnuReturn;
    private javax.swing.JPanel pnlInvent;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}
