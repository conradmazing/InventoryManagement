package siomai.inventory.app;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Conrad Francisco Jr
 */
public class NPStockOut extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public NPStockOut() {
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
        btnAdd = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtProdID = new javax.swing.JTextField();
        mnuMenu = new javax.swing.JMenuBar();
        menubar = new javax.swing.JMenu();
        mnuReturn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Deduct Supplies");
        setBackground(new java.awt.Color(255, 0, 0));
        setForeground(new java.awt.Color(255, 0, 0));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("DEDUCT SUPPLIES ");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel19.setText("Choose a Supply and enter the Required Values:");

        btnAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAdd.setText("Deduct Supplies");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel20.setText("SUPPLY ID:");

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel21.setText("QUANTITY:");

        txtQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantityKeyPressed(evt);
            }
        });

        txtProdID.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlInventLayout = new javax.swing.GroupLayout(pnlInvent);
        pnlInvent.setLayout(pnlInventLayout);
        pnlInventLayout.setHorizontalGroup(
            pnlInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInventLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19)
                        .addComponent(jLabel2)
                        .addComponent(jLabel21)
                        .addComponent(jLabel20)
                        .addGroup(pnlInventLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(pnlInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnAdd))
                .addGap(164, 164, 164))
        );
        pnlInventLayout.setVerticalGroup(
            pnlInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int id1 = Integer.parseInt(txtProdID.getText());
        String query = "SELECT"
                + "(SELECT EmployeeID FROM Logs WHERE LogID = (SELECT MAX(rowid) FROM Logs)) as EmployeeIDFinal,"
                + "(SELECT Quantity FROM NProducts WHERE ProductID = "+id1+") as QuantityFinal";
        
        int emp = 0;
        float tempq = 0;
        try{
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            emp = rs.getInt("EmployeeIDFinal");
            tempq = rs.getFloat("QuantityFinal");
            int id = Integer.parseInt(txtProdID.getText());
            float quantity = Float.parseFloat(txtQuantity.getText());
            Methods.closesDB();
                if(Methods.openDB()){
                        float finalq = 0;
                        String date = "(DATETIME('now', 'localtime'))";
                        finalq = tempq-quantity;
                        String values = ""+date+","+id+","+quantity+","+emp+"";
                        String values2 = "Quantity = "+finalq+"";
                        if(tempq == 0){
                            
                            javax.swing.JOptionPane.showMessageDialog(null, "Cannot Perform Deduction!!  Product Quantity is 0");
                            txtProdID.setText(null);
                            txtQuantity.setText(null);
                        }
                        else if(quantity>tempq){
                            
                            javax.swing.JOptionPane.showMessageDialog(null, "Cannot Perform Deduction!!  Entered Quantity is greater than Current Quantity.");
                            txtProdID.setText(null);
                            txtQuantity.setText(null);
                        }
                        else{
                            Methods.createzn("NPStockOut", values);
                            Methods.update1("NProducts", values2, id);
                        
                        
                    }
                }
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to deduct the stocks again?", "Succesfully Updated!", dialogButton);
                    if(dialogResult == JOptionPane.YES_OPTION) {
                  
                        Methods.closeDB();
                        new NPStockOut().setVisible(true);
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
    }//GEN-LAST:event_btnAddActionPerformed

    private void mnuReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReturnActionPerformed
        String query = "SELECT Position FROM currentuser ORDER BY ID DESC LIMIT 1";
            
        try{
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            String type = "";  
            type = rs.getString("Position");
            System.out.println(type);
            conn.close();
            Methods.closesDB();
            if("Administrator".equals(type)){
                
                new MainMenuAdmin().setVisible(true);
                dispose(); 
                            
            }
            else if("Employee".equals(type)){
                
                new MainMenuEmp().setVisible(true);
                dispose(); 
            }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_mnuReturnActionPerformed

    private void txtQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            int id1 = Integer.parseInt(txtProdID.getText());
            String query = "SELECT"
                + "(SELECT EmployeeID FROM Logs WHERE LogID = (SELECT MAX(rowid) FROM Logs)) as EmployeeIDFinal,"
                + "(SELECT Quantity FROM NProducts WHERE ProductID = "+id1+") as QuantityFinal";
        
            int emp = 0;
            float tempq = 0;
            try{
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
                emp = rs.getInt("EmployeeIDFinal");
                tempq = rs.getFloat("QuantityFinal");
                int id = Integer.parseInt(txtProdID.getText());
                float quantity = Float.parseFloat(txtQuantity.getText());
                Methods.closesDB();
                if(Methods.openDB()){
                        float finalq = 0;
                        String date = "(DATETIME('now', 'localtime'))";
                        finalq = tempq-quantity;
                        String values = ""+date+","+id+","+quantity+","+emp+"";
                        String values2 = "Quantity = "+finalq+"";
                        if(tempq == 0){
                            
                            javax.swing.JOptionPane.showMessageDialog(null, "Cannot Perform Deduction!!  Product Quantity is 0");
                            txtProdID.setText(null);
                            txtQuantity.setText(null);
                        }
                        else if(quantity>tempq){
                            
                            javax.swing.JOptionPane.showMessageDialog(null, "Cannot Perform Deduction!!  Entered Quantity is greater than Current Quantity.");
                            txtProdID.setText(null);
                            txtQuantity.setText(null);
                        }
                        else{
                            Methods.createzn("NPStockOut", values);
                            Methods.update1("NProducts", values2, id);
                        
                        
                }
            }
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to deduct the stocks again?", "Succesfully Updated!", dialogButton);
                    if(dialogResult == JOptionPane.YES_OPTION) {
                  
                        Methods.closeDB();
                        new NPStockOut().setVisible(true);
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
    }//GEN-LAST:event_txtQuantityKeyPressed

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
            java.util.logging.Logger.getLogger(NPStockOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NPStockOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NPStockOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NPStockOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new NPStockOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JMenu menubar;
    private javax.swing.JMenuBar mnuMenu;
    private javax.swing.JMenuItem mnuReturn;
    private javax.swing.JPanel pnlInvent;
    private javax.swing.JTextField txtProdID;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}