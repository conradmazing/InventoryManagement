package siomai.inventory.app;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Conrad Francisco Jr
 */
public class Sales extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public Sales() {
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
        btnGenerate = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtProdID = new javax.swing.JTextField();
        mnuMenu = new javax.swing.JMenuBar();
        menubar = new javax.swing.JMenu();
        mnuReturn = new javax.swing.JMenuItem();
        mnuGenerate = new javax.swing.JMenuItem();
        mnuTruncate = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Generate Sales");
        setBackground(new java.awt.Color(255, 0, 0));
        setForeground(new java.awt.Color(255, 0, 0));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("GENERATE SALES");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel19.setText("Choose a Product to generate its sales.");

        btnGenerate.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel20.setText("PRODUCT ID:");

        txtProdID.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtProdID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProdIDKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlInventLayout = new javax.swing.GroupLayout(pnlInvent);
        pnlInvent.setLayout(pnlInventLayout);
        pnlInventLayout.setHorizontalGroup(
            pnlInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInventLayout.createSequentialGroup()
                        .addGroup(pnlInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel2)
                            .addComponent(jLabel20)
                            .addGroup(pnlInventLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInventLayout.createSequentialGroup()
                        .addComponent(btnGenerate)
                        .addGap(85, 85, 85))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        mnuGenerate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuGenerate.setText("Generate Sales");
        mnuGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGenerateActionPerformed(evt);
            }
        });
        menubar.add(mnuGenerate);

        mnuTruncate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        mnuTruncate.setText("Truncate Sales ");
        mnuTruncate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTruncateActionPerformed(evt);
            }
        });
        menubar.add(mnuTruncate);

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

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
                   
        int id = Integer.parseInt(txtProdID.getText());
        String sales = "Sales";
        String query = "SELECT"
                + "(SELECT ProductID FROM PStockOut WHERE ProductID = "+id+" AND StockOutStatus = '"+sales+"' AND Date = (SELECT Date FROM PStockOut WHERE ProductID = "+id+")) as ProductID,"
                + "(SELECT Quantity FROM PStockOut WHERE ProductID = "+id+" AND StockOutStatus = '"+sales+"' AND Date = (SELECT Date FROM PStockOut WHERE ProductID = "+id+")) as Quantity,"
                + "(SELECT Price_Piece FROM Products WHERE ProductID= "+id+") as Price_Piece,"
                + "(SELECT Pieces_Pack FROM Products WHERE ProductID= "+id+") as Pieces_Pack,"
                + "(SELECT BeginningSteam FROM PStockIn WHERE ProductID= "+id+" AND Date = (SELECT Date FROM PStockIn WHERE ProductID = "+id+")) as BeginningSteam,"
                + "(SELECT EndingSteam FROM PStockOut WHERE ProductID= "+id+" AND StockOutStatus = '"+sales+"' AND Date = (SELECT Date FROM PStockOut WHERE ProductID = "+id+")) as EndingSteam";
        
        int quantity = 0;
        float price = 0;
        int pieces = 0;
        float total = 0;
        int beg = 0;
        int end = 0;
            
        try{
                
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            id = rs.getInt("ProductID");
            quantity = rs.getInt("Quantity");
            price = rs.getFloat("Price_Piece");
            pieces = rs.getInt("Pieces_Pack");
            beg = rs.getInt("BeginningSteam");
            end = rs.getInt("EndingSteam");
            
            Methods.closesDB();
            if(Methods.openDB()){
                
                if(id == 7){
                    
                    total = ((float) quantity*price);
                    String values = id+","+quantity+","+total+"";
                    Methods.createsales("Sales", values);
                    
                }
                else{
                    System.out.println(quantity);
                    System.out.println(pieces);
                    System.out.println(beg);
                    System.out.println(end);
                    System.out.println(price);
                    total = (((quantity*pieces)+beg)-end)*price;
                    String values = id+","+quantity+","+total+"";
                    Methods.createsales("Sales", values);
                
                }
                    
            }
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to generate sales again?", "Succesfully Generated!", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION) {
                  
                Methods.closeDB();
                new Sales().setVisible(true);
                dispose();
                
            }
            else if(dialogResult == JOptionPane.NO_OPTION){
                 
                new MainMenuAdmin().setVisible(true);
                dispose();
                
            } 
        }
        catch(Exception e){
                
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void mnuReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReturnActionPerformed
        new MainMenuAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuReturnActionPerformed

    private void txtProdIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdIDKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            int id = Integer.parseInt(txtProdID.getText());
            String sales = "Sales";
            String query = "SELECT"
                + "(SELECT ProductID FROM PStockOut WHERE ProductID = "+id+" AND StockOutStatus = '"+sales+"' AND Date = (SELECT Date FROM PStockOut WHERE ProductID = "+id+")) as ProductID,"
                + "(SELECT Quantity FROM PStockOut WHERE ProductID = "+id+" AND StockOutStatus = '"+sales+"' AND Date = (SELECT Date FROM PStockOut WHERE ProductID = "+id+")) as Quantity,"
                + "(SELECT Price_Piece FROM Products WHERE ProductID= "+id+") as Price_Piece,"
                + "(SELECT Pieces_Pack FROM Products WHERE ProductID= "+id+") as Pieces_Pack,"
                + "(SELECT BeginningSteam FROM PStockIn WHERE ProductID= "+id+" AND Date = (SELECT Date FROM PStockIn WHERE ProductID = "+id+")) as BeginningSteam,"
                + "(SELECT EndingSteam FROM PStockOut WHERE ProductID= "+id+" AND StockOutStatus = '"+sales+"' AND Date = (SELECT Date FROM PStockOut WHERE ProductID = "+id+")) as EndingSteam";
        
            int quantity = 0;
            float price = 0;
            int pieces = 0;
            float total = 0;
            int beg = 0;
            int end = 0;
            
            try{
                
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
                id = rs.getInt("ProductID");
                quantity = rs.getInt("Quantity");
                price = rs.getFloat("Price_Piece");
                pieces = rs.getInt("Pieces_Pack");
                beg = rs.getInt("BeginningSteam");
                end = rs.getInt("EndingSteam");
            
                Methods.closesDB();
                if(Methods.openDB()){
                
                    if(id == 7){
                    
                        total = ((float) quantity*price);
                        String values = id+","+quantity+","+total+"";
                        Methods.createsales("Sales", values);
                    
                    }
                    else{
                        
                        System.out.println(quantity);
                        System.out.println(pieces);
                        System.out.println(beg);
                        System.out.println(end);
                        System.out.println(price);
                        total = (((quantity*pieces)+beg)-end)*price;
                        String values = id+","+quantity+","+total+"";
                        Methods.createsales("Sales", values);
                
                    }
                    
                }
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to generate sales again?", "Succesfully Generated!", dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION) {
                  
                    Methods.closeDB();
                    new Sales().setVisible(true);
                    dispose();
                
                }
                else if(dialogResult == JOptionPane.NO_OPTION){
                 
                    new MainMenuAdmin().setVisible(true);
                    dispose();
                
                } 
            }
            catch(Exception e){
                
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }//GEN-LAST:event_txtProdIDKeyPressed

    private void mnuGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGenerateActionPerformed
        try{
            if(Methods.openDB()){
                String reportName = ("salesreport.jrxml");
                InputStream file = getClass().getResourceAsStream(reportName);
                Helper.Report.viewReport(file);
                Methods.closeDB();
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        } 
    }//GEN-LAST:event_mnuGenerateActionPerformed

    private void mnuTruncateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTruncateActionPerformed
        
        String truncate = "DELETE FROM Sales";
        String query = "SELECT Position FROM currentuser ORDER BY ID DESC LIMIT 1";
        try {
            if(Methods.openDB()){
            stmt = conn.createStatement();
            stmt.executeUpdate(truncate);
            stmt.close();
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            String type = "";
            type = rs.getString("Position");
            conn.close();
                if("Administrator".equals(type)){
                
                    new MainMenuAdmin().setVisible(true);
                    dispose(); 
                            
                }
                else if("Employee".equals(type)){
                
                    new MainMenuEmp().setVisible(true);
                    dispose(); 
                }
            }
        } 
        catch (Exception e) {
            
            javax.swing.JOptionPane.showMessageDialog(null, e);
            
        }
        
    }//GEN-LAST:event_mnuTruncateActionPerformed

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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerate;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JMenu menubar;
    private javax.swing.JMenuItem mnuGenerate;
    private javax.swing.JMenuBar mnuMenu;
    private javax.swing.JMenuItem mnuReturn;
    private javax.swing.JMenuItem mnuTruncate;
    private javax.swing.JPanel pnlInvent;
    private javax.swing.JTextField txtProdID;
    // End of variables declaration//GEN-END:variables
}
