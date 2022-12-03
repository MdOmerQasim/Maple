/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.maple.frontend;
import com.maple.backend.controller.UserController;
import com.maple.backend.model.User;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

/**
 *
 * @author DKapoor
 */
public class RegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterJPanel
     */
    JSplitPane mainSplitPane;
//    JDBC obj;
    String path;
    User user;
    UserController userController;
    public RegisterJPanel(JSplitPane jSplitPane) throws SQLException {
        this.mainSplitPane = jSplitPane;
//        obj = new JDBC();
        user = new User();
        userController = new UserController();
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

        jLabel3 = new javax.swing.JLabel();
        jConfirmPasswordTextField = new javax.swing.JTextField();
        jEmailTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPhotoLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPhoneNumberTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNameTextField = new javax.swing.JTextField();
        jUsernameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jRegisterAsComboBox = new javax.swing.JComboBox<>();
        jPasswordTextField = new javax.swing.JTextField();
        jRegisterButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jUploadButton = new javax.swing.JButton();
        jPostalCodeTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jLabel3.setText("Username");

        jEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmailTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Postal Code");

        jLabel4.setText("Password");

        jLabel6.setText("Name");

        jPhoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPhoneNumberTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Email");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Maple Management System");

        jLabel8.setText("Phone Number");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register");

        jNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("Confirm password");

        jRegisterAsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Hotel Admin", "Catering Admin", "Travel Agent Admin", "HR Admin", "Business Admin", "Event Admin", "Public Event Manager", "Private Event Manager" }));

        jRegisterButton.setText("Register");
        jRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Register as");

        jUploadButton.setText("Upload");
        jUploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUploadButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Photo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jEmailTextField)
                                .addComponent(jUsernameTextField)
                                .addComponent(jRegisterAsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPhoneNumberTextField)
                                .addComponent(jNameTextField)
                                .addComponent(jPasswordTextField)
                                .addComponent(jConfirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jUploadButton)
                                    .addGap(12, 12, 12)
                                    .addComponent(jPhotoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPostalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(235, 235, 235))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(338, 338, 338))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jRegisterAsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jPhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jConfirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPostalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jUploadButton)
                        .addComponent(jLabel11))
                    .addComponent(jPhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRegisterButton)
                .addGap(77, 77, 77))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmailTextFieldActionPerformed

    private void jPhoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPhoneNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPhoneNumberTextFieldActionPerformed

    private void jNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameTextFieldActionPerformed

    private void jRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterButtonActionPerformed
//        String role = jRegisterAsComboBox.getSelectedIndex(selectedHospitalAdmin.getGender());
        String role = jRegisterAsComboBox.getSelectedItem().toString();
        String name = jNameTextField.getText();
        String email = jEmailTextField.getText();
        String phoneNum = jPhoneNumberTextField.getText();
        String userName = jUsernameTextField.getText();
        String password = jPasswordTextField.getText();
        String rePassword = jConfirmPasswordTextField.getText();
        String postalCode = jPostalCodeTextField.getText();
        
        if (role.equals("")){
            JOptionPane.showMessageDialog(this, "Please select a valid role to register.");
        }
        else if (name.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter your name.");
        }
        else if (email.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter your email id.");
        }
        else if (phoneNum.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter your phone number.");
        }
        else if (userName.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter a username.");
        }
        else if (password.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter a password.");
        }
        else if (rePassword.equals("")){
            JOptionPane.showMessageDialog(this, "Please re-enter the password.");
        }
        else if (!rePassword.equals(password)){
            JOptionPane.showMessageDialog(this, "Your passwords do not match.");
        }
        else if (path.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter a photo.");
        }
        else{
            String status = null ;
        

        if ("customer".equals(role)){
            status = "active";
        }
//        int ID = user.getID();

        int ID = 0;
            try {
                ID = userController.getAllUsers();
            } catch (SQLException ex) {
                Logger.getLogger(RegisterJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {
            userController.insertUserDataController(ID, role, name, email, phoneNum, userName, password, path, postalCode, status);
//        String sql = "insert into user (id, role, name, email, phoneNumber, username, password, photo, postalCode, status)" +
//        "values('" + ID + "','" + role + "','" + name + "','" + email + "','" + phoneNum + "','" + userName + "','" + password + "','" + path + "','" + postalCode + "','" + status + "')";

//        try {
//
//            
//        } catch (SQLException ex) {
//           System.out.println("Exception is" + ex.getMessage());
//        }
//
        } catch (SQLException ex) {
            System.out.println("Error sql exception");
        }
        
        jNameTextField.setText("");
        jEmailTextField.setText("");
        jPhoneNumberTextField.setText("");
        jUsernameTextField.setText("");
        jPasswordTextField.setText("");
        jConfirmPasswordTextField.setText("");
        jPhotoLabel.setIcon(null);
        jPostalCodeTextField.setText("");
        }
    }//GEN-LAST:event_jRegisterButtonActionPerformed

    private void jUploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUploadButtonActionPerformed
        JFileChooser img_upload = new JFileChooser();
        img_upload.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = img_upload.showDialog(null, "Choose my file");
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = img_upload.getSelectedFile();
            String path = file.getAbsolutePath();
            this.path = path;
            try {
                Image photo = ImageIO.read(file).getScaledInstance(65, 105, 65);
//                user.setPhoto(photo);
                jPhotoLabel.setIcon(new ImageIcon(photo));
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error while saving image.");
            }
        }
        else{
                JOptionPane.showMessageDialog(this, "Upload is cancelled.");
            }
    }//GEN-LAST:event_jUploadButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jConfirmPasswordTextField;
    private javax.swing.JTextField jEmailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNameTextField;
    private javax.swing.JTextField jPasswordTextField;
    private javax.swing.JTextField jPhoneNumberTextField;
    private javax.swing.JLabel jPhotoLabel;
    private javax.swing.JTextField jPostalCodeTextField;
    private javax.swing.JComboBox<String> jRegisterAsComboBox;
    private javax.swing.JButton jRegisterButton;
    private javax.swing.JButton jUploadButton;
    private javax.swing.JTextField jUsernameTextField;
    // End of variables declaration//GEN-END:variables
}
