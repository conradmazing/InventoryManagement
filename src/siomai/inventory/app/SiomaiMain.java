package siomai.inventory.app;

import java.awt.Color;
import java.awt.Image;
import java.net.URL;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Conrad Francisco Jr
 */
public class SiomaiMain extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    
    public SiomaiMain() {
        initComponents();
        conn = Methods.opensDB();
        this.setLocationRelativeTo(null);
        lblPic.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("banner.png")).getImage().getScaledInstance(lblPic.getWidth(), lblPic.getHeight(), Image.SCALE_SMOOTH)));
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

        pnlLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblPic = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        mnuMenu = new javax.swing.JMenu();
        mnuItemQuit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inventory Management System v.1.1");
        setResizable(false);

        pnlLogin.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("User Name:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Password:");

        txtUser.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("                MASTER SIOMAI INVENTORY MANAGEMENT SYSTEM");

        btnReset.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnCreate.setText("Register");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                        .addGap(0, 139, Short.MAX_VALUE)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addComponent(btnLogin)
                                .addGap(23, 23, 23)
                                .addComponent(btnReset)))
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addGap(19, 19, 19))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addGap(19, 19, 19))
        );

        mnuMenu.setText("Menu");

        mnuItemQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnuItemQuit.setText("Exit");
        mnuItemQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemQuitActionPerformed(evt);
            }
        });
        mnuMenu.add(mnuItemQuit);

        menubar.add(mnuMenu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String query = "SELECT EmployeeID, UserName, Password, Position FROM Employees WHERE UserName = ? AND Password = ?";
            
            try{
                pst = conn.prepareStatement(query);
                pst.setString(1, txtUser.getText());
                pst.setString(2, txtPassword.getText());
                String value = "";
                int empid = 0;
                rs = pst.executeQuery();
                value = rs.getString("Position");
                empid = rs.getInt("EmployeeID");
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Credentials Verified!" );
                        Methods.closesDB();
                        if(Methods.openDB()){
                            String time = "DATETIME('now', 'localtime')";
                            String logout = "Online";
                            String values = ""+empid+","+time+",'"+logout+"'";
                            String values1 = ""+empid+",'"+value+"'";
                            Methods.createlogs("Logs", values);
                            Methods.createuser("currentuser", values1);
                            if("Administrator".equals(value)){
                            
                                new MainMenuAdmin().setVisible(true);
                                dispose(); 
                            
                            }
                            else if ("Employee".equals(value)){
                            
                                new MainMenuEmp().setVisible(true);
                                dispose(); 
                            }
                        }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Entered Credentials is incorrect!" );
                }
            }
            catch(Exception e){
            
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtUser.setText(null);
        txtPassword.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed

    private void mnuItemQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuItemQuitActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        new Create().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            String query = "SELECT EmployeeID, UserName, Password, Position FROM Employees WHERE UserName = ? AND Password = ?";
            
            try{
                pst = conn.prepareStatement(query);
                pst.setString(1, txtUser.getText());
                pst.setString(2, txtPassword.getText());
                String value = "";
                int empid = 0;
                rs = pst.executeQuery();
                value = rs.getString("Position");
                empid = rs.getInt("EmployeeID");
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Credentials Verified!" );
                        Methods.closesDB();
                        if(Methods.openDB()){
                            String time = "DATETIME('now', 'localtime')";
                            String logout = "Online";
                            String values = ""+empid+","+time+",'"+logout+"'";
                            String values1 = ""+empid+",'"+value+"'";
                            Methods.createlogs("Logs", values);
                            Methods.createuser("currentuser", values1);
                            if("Administrator".equals(value)){
                            
                                new MainMenuAdmin().setVisible(true);
                                dispose(); 
                            
                            }
                            else if ("Employee".equals(value)){
                            
                                new MainMenuEmp().setVisible(true);
                                dispose(); 
                            }
                        }
                }
                else{
                    
                    JOptionPane.showMessageDialog(null, "Entered Credentials is incorrect!" );
                }
            }
            catch(Exception e){
            
                JOptionPane.showMessageDialog(null, "Account not Found!");
            }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

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
            java.util.logging.Logger.getLogger(SiomaiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiomaiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiomaiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiomaiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiomaiMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblPic;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem mnuItemQuit;
    private javax.swing.JMenu mnuMenu;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
