package siomai.inventory.app;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author Conrad Francisco Jr
 */
public class Products extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form Logs
     */
    public Products() {
        initComponents();
        conn = Methods.opensDB();
        this.refresh();
        this.setLocationRelativeTo(null);
        URL iconURL = getClass().getResource("icon.jpg");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(Color.RED);
    }
    public void refresh(){
        //Load data
        if(Methods.openDB()){
            String[] columns = {"ProductID", "ProductName", "Price_Piece", "Pieces_Pack", "Quantity"};
            String[][] records = Methods.read("Products",columns);
            javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(records, columns){
                @Override
                public boolean isCellEditable(int row, int column) {

                    return false;
                }
            };
            this.tblLogs.setModel(model);
            
            ListSelectionListener lsl = new ListSelectionListener(){
                public void valueChanged(javax.swing.event.ListSelectionEvent event) {
                    if (tblLogs.getSelectedRow() > -1) {
                        int row = tblLogs.getSelectedRow();
                        if(Methods.openDB()){
                            String sr_id = tblLogs.getValueAt(tblLogs.getSelectedRow(), 0).toString();
                            int id = Integer.parseInt(sr_id);
                            String[][] result = Methods.read("Products", "ProductID=" + id);
                            txtProdID.setText(result[0][0]);
                            txtProdName.setText(result[0][1]);
                            Methods.closeDB();
                        }
                    }
                }
            };
            this.tblLogs.getSelectionModel().addListSelectionListener(lsl);
            Methods.closeDB();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogs = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLogs = new javax.swing.JTable();
        lblLogID = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtProdID = new javax.swing.JTextField();
        txtProdName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuReturn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Products Master List");
        setResizable(false);

        pnlLogs.setBackground(new java.awt.Color(0, 0, 0));

        tblLogs.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        tblLogs.setForeground(new java.awt.Color(255, 0, 0));
        tblLogs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Price per Piece", "Pieces per Pack", "Quantity"
            }
        ));
        tblLogs.getTableHeader().setResizingAllowed(false);
        tblLogs.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblLogs);

        lblLogID.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblLogID.setForeground(new java.awt.Color(255, 0, 0));
        lblLogID.setText("Product ID:");

        lblUsername.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 0, 0));
        lblUsername.setText("Product Name:");

        txtProdID.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtProdID.setForeground(new java.awt.Color(255, 0, 0));
        txtProdID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProdIDKeyPressed(evt);
            }
        });

        txtProdName.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        txtProdName.setForeground(new java.awt.Color(255, 0, 0));

        btnDelete.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 0, 0));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 0, 0));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLogsLayout = new javax.swing.GroupLayout(pnlLogs);
        pnlLogs.setLayout(pnlLogsLayout);
        pnlLogsLayout.setHorizontalGroup(
            pnlLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(pnlLogsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefresh)
                .addGap(14, 14, 14)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLogsLayout.setVerticalGroup(
            pnlLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogID)
                    .addComponent(lblUsername)
                    .addComponent(txtProdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete)
                    .addComponent(btnSearch)
                    .addComponent(btnRefresh))
                .addContainerGap())
        );

        jMenu1.setText("Menu");

        mnuReturn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mnuReturn.setText("Main Menu");
        mnuReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReturnActionPerformed(evt);
            }
        });
        jMenu1.add(mnuReturn);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to delete user??", "Delete Employee Details", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION) {
        if(Methods.openDB()){
            int id = Integer.parseInt(txtProdID.getText());
                
                if(Methods.deleteproduct("Products", id)){
                   
                        int dialogButton1 = JOptionPane.YES_NO_OPTION;
                        int dialogResult1 = JOptionPane.showConfirmDialog(this, "Would you like to delete some more?", "Succesfully Deleted!", dialogButton1);
                        if(dialogResult1 == JOptionPane.YES_OPTION) {
                            
                            txtProdID.setText(null);
                        }
                        else if(dialogResult1 == JOptionPane.NO_OPTION){
                            
                            new Products().setVisible(true);
                            dispose();
                        }
                        else{
                
                            javax.swing.JOptionPane.showMessageDialog(null, "Error!!");
                        }       
                }
            }
        }
        else if(dialogResult == JOptionPane.NO_OPTION){
            
            new Products().setVisible(true);
            dispose();
            
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        int id = Integer.parseInt(txtProdID.getText());
        if(Methods.openDB()){
            String[] column = {"ProductID","ProductName","Quantity","Price_Piece","Pieces_Pack"};
            String[][] data = Methods.searchproduct("Products", id);
            txtProdID.setText(data[0][0]);
            txtProdName.setText(data[0][1]);
            javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(data, column){
                boolean[] canEdit = new boolean[]{
                    false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            this.tblLogs.setModel(model);
        }
        Methods.closeDB();
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtProdIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdIDKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            int id = Integer.parseInt(txtProdID.getText());
            if(Methods.openDB()){
            String[] column = {"ProductID","ProductName","Quantity","Price_Piece","Pieces_Pack"};
            String[][] data = Methods.searchproduct("Products", id);
            txtProdID.setText(data[0][0]);
            txtProdName.setText(data[0][1]);
            javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(data, column){
                boolean[] canEdit = new boolean[]{
                    false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            this.tblLogs.setModel(model);
        }
        Methods.closeDB();
        }
    }//GEN-LAST:event_txtProdIDKeyPressed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
       
        this.refresh();
        txtProdID.setText(null);
        txtProdName.setText(null);
        
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogID;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JMenuItem mnuReturn;
    private javax.swing.JPanel pnlLogs;
    private javax.swing.JTable tblLogs;
    private javax.swing.JTextField txtProdID;
    private javax.swing.JTextField txtProdName;
    // End of variables declaration//GEN-END:variables
}
