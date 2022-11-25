/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.maple.frontend;

import javax.swing.ImageIcon;

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
        
        jUserPhoto.setIcon(new ImageIcon(getClass().getResource("/com/maple/icons/cat.jpeg")));
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

        jName.setLabelText("");

        jNewPasswordField.setLabelText("New Password");

        jConfirmPasswordField.setLabelText("Confirm Password");
        jConfirmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmPasswordFieldActionPerformed(evt);
            }
        });

        jOldPasswordField.setLabelText("Old Password");

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
        // TODO add your handling code here:
    }//GEN-LAST:event_jClearBtnActionPerformed

    private void jSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSaveBtnActionPerformed


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