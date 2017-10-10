package siomai.inventory.app;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Conrad Francisco Jr
 */
public class Create extends javax.swing.JFrame {
    
    private byte[] imgdata;
    /**
     * Creates new form Create
     */
    public Create() {
        initComponents();
        this.setLocationRelativeTo(null);
        ButtonGroup group = new ButtonGroup();
        group.add(this.radioMale);
        group.add(this.radioFemale);
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

        jPanel1 = new javax.swing.JPanel();
        lblPic = new javax.swing.JLabel();
        lblDisplay = new javax.swing.JLabel();
        lblFname = new javax.swing.JLabel();
        lblMname = new javax.swing.JLabel();
        lblLname = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtMname = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblMaster = new javax.swing.JLabel();
        btnReg = new javax.swing.JButton();
        lblBirthDate = new javax.swing.JLabel();
        bdaychoose = new com.toedter.calendar.JDateChooser();
        lblMaster1 = new javax.swing.JLabel();
        lblPic1 = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        lblMaster2 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        cmbType = new javax.swing.JComboBox<>();
        lblEmployeeID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loginmenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Create New Account");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblDisplay.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblDisplay.setForeground(new java.awt.Color(255, 0, 0));
        lblDisplay.setText("                                                   CREATE ACCOUNT");

        lblFname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFname.setForeground(new java.awt.Color(255, 0, 0));
        lblFname.setText("First Name:");

        lblMname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblMname.setForeground(new java.awt.Color(255, 0, 0));
        lblMname.setText("Middle Name:");

        lblLname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblLname.setForeground(new java.awt.Color(255, 0, 0));
        lblLname.setText("Last Name:");

        lblUsername.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 0, 0));
        lblUsername.setText("User Name:");

        lblPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 0, 0));
        lblPassword.setText("Password:");

        txtMname.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtMname.setForeground(new java.awt.Color(0, 0, 255));

        txtUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 0, 255));

        txtFname.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtFname.setForeground(new java.awt.Color(0, 0, 255));

        txtLname.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtLname.setForeground(new java.awt.Color(0, 0, 255));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblMaster.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblMaster.setForeground(new java.awt.Color(255, 0, 0));
        lblMaster.setText("Account Type:");

        btnReg.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnReg.setForeground(new java.awt.Color(255, 0, 0));
        btnReg.setText("Register");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        lblBirthDate.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblBirthDate.setForeground(new java.awt.Color(255, 0, 0));
        lblBirthDate.setText("Birth Date:");

        lblMaster1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblMaster1.setForeground(new java.awt.Color(255, 0, 0));
        lblMaster1.setText("ID Picture:");

        lblPic1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), null));

        btnBrowse.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnBrowse.setForeground(new java.awt.Color(255, 0, 0));
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        btnBrowse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBrowseKeyPressed(evt);
            }
        });

        lblMaster2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblMaster2.setForeground(new java.awt.Color(255, 0, 0));
        lblMaster2.setText("Gender:");

        radioMale.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        radioMale.setForeground(new java.awt.Color(255, 0, 0));
        radioMale.setText("Male");

        radioFemale.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        radioFemale.setForeground(new java.awt.Color(255, 0, 0));
        radioFemale.setText("Female");

        cmbType.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cmbType.setForeground(new java.awt.Color(255, 0, 0));
        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Master", "Apprentice" }));

        lblEmployeeID.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblEmployeeID.setForeground(new java.awt.Color(255, 0, 0));
        lblEmployeeID.setText("Employee ID:");

        txtId.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMname)
                    .addComponent(lblFname)
                    .addComponent(lblLname)
                    .addComponent(lblUsername)
                    .addComponent(lblPassword)
                    .addComponent(lblMaster)
                    .addComponent(lblBirthDate)
                    .addComponent(lblMaster2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioMale)
                                .addGap(5, 5, 5)
                                .addComponent(radioFemale))
                            .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bdaychoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnReg))
                    .addComponent(lblMaster1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEmployeeID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPic1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblDisplay)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFname)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeID)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMname)
                    .addComponent(txtMname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaster1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLname)
                            .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBirthDate)
                            .addComponent(bdaychoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaster2)
                            .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaster)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPic1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrowse)))
                .addGap(18, 18, 18)
                .addComponent(btnReg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");

        loginmenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        loginmenu.setText("Login Menu");
        loginmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginmenuActionPerformed(evt);
            }
        });
        jMenu1.add(loginmenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        
        //raw image to bytes
        File fimage = new File(filename);
        try{
            FileInputStream fis = new FileInputStream(fimage);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            imgdata = bos.toByteArray(); 
            
            //update JLabel to load image
            java.awt.Image image = stretchImage(filename,this.lblPic1);
            this.lblPic1.setIcon(new javax.swing.ImageIcon(image));
        }
        catch(Exception e){
            System.out.println("FileInputStream Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
       if(Methods.openDB()){
           int id = Integer.parseInt(txtId.getText());
           String fname = txtFname.getText();
           String mname = txtMname.getText();
           String lname = txtLname.getText();
           String user = txtUsername.getText();
           String pass = txtPassword.getText();
           Date birthdate = bdaychoose.getDate();
           String gender = "";
           int x = cmbType.getSelectedIndex();
           String type = "";
           byte[] image = this.imgdata;
           if(this.radioMale.isSelected() && x == 0){
            
               gender = "Male";
               type = "Administrator";
               String values = id+",'"+fname+"','"+mname+"','"+lname+"','"+birthdate+"','"+user+"','"+pass+"','','"+gender+"','"+type+"'";
               if(Methods.create("Employees", values)){
                    Methods.update("Employees", image, "IDPic", id);
                }
                Methods.closeDB();
                SiomaiMain s1 = new SiomaiMain();
                s1.setVisible(true);
                dispose();
                
            }
           else if(this.radioMale.isSelected() && x == 1){
            
               gender = "Male";
               type = "Employee";
               String values = id+", '"+fname+"','"+mname+"','"+lname+"','"+birthdate+"','"+user+"','"+pass+"','','"+gender+"','"+type+"'";
               if(Methods.create("Employees", values)){
                    Methods.update("Employees", image, "IDPic", id);
                }
                Methods.closeDB();
                SiomaiMain s1 = new SiomaiMain();
                s1.setVisible(true);
                dispose();
                
            }
            else if(this.radioFemale.isSelected() && x == 0){
            
               gender = "Female";
               type = "Administrator";
               String values = id+", '"+fname+"','"+mname+"','"+lname+"','"+birthdate+"','"+user+"','"+pass+"','','"+gender+"','"+type+"'";
               if(Methods.create("Employees", values)){
                    Methods.update("Employees", image, "IDPic", id);
                }
                Methods.closeDB();
                SiomaiMain s1 = new SiomaiMain();
                s1.setVisible(true);
                dispose();
                
            }
            else if(this.radioFemale.isSelected() && x == 1){
            
               gender = "Female";
               type = "Employee";
               String values = id+", '"+fname+"','"+mname+"','"+lname+"','"+birthdate+"','"+user+"','"+pass+"','','"+gender+"','"+type+"'";
               if(Methods.create("Employees", values)){
                    Methods.update("Employees", image, "IDPic", id);
                }
                Methods.closeDB();
                SiomaiMain s1 = new SiomaiMain();
                s1.setVisible(true);
                dispose();
                
            }
        }
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnBrowseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBrowseKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           if(Methods.openDB()){
           int id = Integer.parseInt(txtId.getText());
           String fname = txtFname.getText();
           String mname = txtMname.getText();
           String lname = txtLname.getText();
           String user = txtUsername.getText();
           String pass = txtPassword.getText();
           Date birthdate = bdaychoose.getDate();
           String gender = "";
           int x = cmbType.getSelectedIndex();
           String type = "";
           byte[] image = this.imgdata;
           if(this.radioMale.isSelected() && x == 0){
            
               gender = "Male";
               type = "Administrator";
               String values = id+",'"+fname+"','"+mname+"','"+lname+"','"+birthdate+"','"+user+"','"+pass+"','','"+gender+"','"+type+"'";
               if(Methods.create("Employees", values)){
                   Methods.update("Employees", image, "IDPic", id);
                }
                Methods.closeDB();
                SiomaiMain s1 = new SiomaiMain();
                s1.setVisible(true);
                dispose();
                
            }
           else if(this.radioMale.isSelected() && x == 1){
            
               gender = "Male";
               type = "Employee";
               String values = id+", '"+fname+"','"+mname+"','"+lname+"','"+birthdate+"','"+user+"','"+pass+"','','"+gender+"','"+type+"'";
               if(Methods.create("Employees", values)){
                    Methods.update("Employees", image, "IDPic", id); 
                }
                Methods.closeDB();
                SiomaiMain s1 = new SiomaiMain();
                s1.setVisible(true);
                dispose();
                
            }
            else if(this.radioFemale.isSelected() && x == 0){
            
               gender = "Female";
               type = "Administrator";
               String values = id+", '"+fname+"','"+mname+"','"+lname+"','"+birthdate+"','"+user+"','"+pass+"','','"+gender+"','"+type+"'";
               if(Methods.create("Employees", values)){
                    Methods.update("Employees", image, "IDPic", id);
                }
                Methods.closeDB();
                SiomaiMain s1 = new SiomaiMain();
                s1.setVisible(true);
                dispose();
                
            }
            else if(this.radioFemale.isSelected() && x == 1){
            
               gender = "Female";
               type = "Employee";
               String values = id+", '"+fname+"','"+mname+"','"+lname+"','"+birthdate+"','"+user+"','"+pass+"','','"+gender+"','"+type+"'";
               if(Methods.create("Employees", values)){
                    Methods.update("Employees", image, "IDPic", id);
                }
                Methods.closeDB();
                SiomaiMain s1 = new SiomaiMain();
                s1.setVisible(true);
                dispose();
                
            }
        }
       }
    }//GEN-LAST:event_btnBrowseKeyPressed

    private void loginmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginmenuActionPerformed
        
        new SiomaiMain().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_loginmenuActionPerformed
    public Image stretchImage(String path,JLabel label)
        {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Image image = toolkit.getImage(path);
            Image scaledImage = image.getScaledInstance(157,137, Image.SCALE_DEFAULT);
            return scaledImage;
        }  
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
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser bdaychoose;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblMaster;
    private javax.swing.JLabel lblMaster1;
    private javax.swing.JLabel lblMaster2;
    private javax.swing.JLabel lblMname;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblPic1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JMenuItem loginmenu;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtMname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}