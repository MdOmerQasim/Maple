/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.maple.frontend.businessAdminScreen;

import java.awt.Cursor;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author mohammedomerqasimshaik
 */
public class BusinessAdminSettings extends javax.swing.JPanel {

    /**
     * Creates new form BusinessAdminSettings
     */
    public BusinessAdminSettings() {
        initComponents();
        
        jUserPhoto.setIcon(new ImageIcon(getClass().getResource("/com/maple/icons/p1.jpg")));
        jName.setText("John");
        jName.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocation = new javax.swing.JLabel();
        jUserPhoto = new com.maple.resources.ImageAvatar();
        jName = new com.maple.resources.TextField();
        jNewPasswordField = new com.maple.resources.PasswordField();
        jConfirmPasswordField = new com.maple.resources.PasswordField();
        jOldPasswordField = new com.maple.resources.PasswordField();
        jClearBtn = new com.maple.resources.ButtonBadges();
        jSaveBtn = new com.maple.resources.ButtonBadges();

        jLocation.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLocation.setForeground(new java.awt.Color(4, 72, 210));
        jLocation.setText("Admin / Settings");

        jUserPhoto.setBackground(new java.awt.Color(255, 255, 255));
        jUserPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUserPhotoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jUserPhotoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jUserPhotoMouseExited(evt);
            }
        });

        jName.setLabelText("");

        jNewPasswordField.setLabelText("New Password");

        jConfirmPasswordField.setLabelText("Confirm Password");
        jConfirmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmPasswordFieldActionPerformed(evt);
            }
        });

        jOldPasswordField.setLabelText("Old Password");
        jOldPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jOldPasswordFieldKeyReleased(evt);
            }
        });

        jClearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/cross.png"))); // NOI18N
        jClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearBtnActionPerformed(evt);
            }
        });

        jSaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/tick.png"))); // NOI18N
        jSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jNewPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jOldPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLocation)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(587, 587, 587)
                        .addComponent(jSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLocation)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jOldPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNewPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(376, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jConfirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConfirmPasswordFieldActionPerformed

    private void jClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearBtnActionPerformed
        jOldPasswordField.setText("");
        jNewPasswordField.setText("");
        jConfirmPasswordField.setText("");
    }//GEN-LAST:event_jClearBtnActionPerformed

    private void jSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveBtnActionPerformed
        
        //Validate Old Password
        String oldPassword = new String(jOldPasswordField.getPassword());
        //TODO: get password from userDirectory & compare
        
        //Validate New Password
        String newPassword = new String(jNewPasswordField.getPassword());
        
        if(!validatePassword(newPassword)){
            //show validation message
            return;
        }
        
        //Validate Confirm Password
        String confirmPassword = new String(jConfirmPasswordField.getPassword());
        
        if(!validatePassword(confirmPassword)){
            //show validation message
            return;
        }
        
        //Compare new & confirm password
        if(!newPassword.equals(confirmPassword)){
            //show validation message
            return;
        }
        
        //Update newPassword in UserDirectory
        
    }//GEN-LAST:event_jSaveBtnActionPerformed

    private boolean validatePassword(String password){
        boolean isValid;
        String validPassword = password;
        Pattern pattern = Pattern.compile("[A-Za-z0-9]+");
        Matcher matcher = pattern.matcher(validPassword);
        isValid = matcher.matches();
        return isValid;
    }
    
    private void jUserPhotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUserPhotoMouseEntered
        
        //Change Cursor
        jUserPhoto.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jUserPhoto.setBorderSize(2);
         
    }//GEN-LAST:event_jUserPhotoMouseEntered

    private void jUserPhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUserPhotoMouseClicked
        
        //Upload image
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.showOpenDialog(null);
        File file = jFileChooser.getSelectedFile();
        if(file == null){ // If no image is selected
            //show validation
            return; 
        }
        String filename = file.getAbsolutePath(); 
        ImageIcon icon = new ImageIcon(filename);
        jUserPhoto.setIcon(icon);
      
    }//GEN-LAST:event_jUserPhotoMouseClicked

    private void jOldPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jOldPasswordFieldKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jOldPasswordFieldKeyReleased

    private void jUserPhotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUserPhotoMouseExited
        // TODO add your handling code here:
        jUserPhoto.setBorderSize(0);
    }//GEN-LAST:event_jUserPhotoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.maple.resources.ButtonBadges jClearBtn;
    private com.maple.resources.PasswordField jConfirmPasswordField;
    private javax.swing.JLabel jLocation;
    private com.maple.resources.TextField jName;
    private com.maple.resources.PasswordField jNewPasswordField;
    private com.maple.resources.PasswordField jOldPasswordField;
    private com.maple.resources.ButtonBadges jSaveBtn;
    private com.maple.resources.ImageAvatar jUserPhoto;
    // End of variables declaration//GEN-END:variables
}
