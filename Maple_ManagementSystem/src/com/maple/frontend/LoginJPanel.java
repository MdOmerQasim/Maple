/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.maple.frontend;

import com.maple.backend.controller.UserController;
import com.maple.backend.model.User;
import com.maple.frontend.businessAdminScreen.BusinessAdminScreen;
import com.maple.frontend.hotelAdminScreen.HotelAdminScreen;
import com.maple.frontend.userScreen.UserLayoutScreen;
import com.maple.frontend.userScreen.UserWelcomeScreen;
import java.sql.SQLException;
import javax.swing.JSplitPane;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DKapoor
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
   
    JSplitPane mainSplitPane;
    
    UserController userController;
    
    public LoginJPanel(JSplitPane jSplitPane) throws SQLException {
        this.mainSplitPane = jSplitPane;
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

        jLoginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jUsernameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLoginAsComboBox = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(810, 620));
        setMinimumSize(new java.awt.Dimension(810, 620));
        setPreferredSize(new java.awt.Dimension(810, 620));

        jLoginButton.setText("Login");
        jLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Maple Management System");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");

        jLabel3.setText("Username");

        jUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsernameTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        jLabel5.setText("Login as");

        jLoginAsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Hotel Admin", "Catering Admin", "Travel Agent Admin", "HR Admin", "Business Admin", "Event Admin", "Public Event Manager", "Private Event Manager" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jUsernameTextField)
                            .addComponent(jPasswordTextField)
                            .addComponent(jLoginAsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)))
                .addGap(254, 254, 254))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jLabel3)
                    .addComponent(jUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLoginAsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLoginButton)
                .addContainerGap(337, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUsernameTextFieldActionPerformed

    private void jLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginButtonActionPerformed
        if(jUsernameTextField.getText().equals("")){  
            System.out.println("username Cant be null bro");
        }
        else if(jPasswordTextField.getText().equals("")){  
            System.out.println("Password Cant be null bro");
        }
        
        String username = jUsernameTextField.getText();
        String password = jPasswordTextField.getText();
        String role = jLoginAsComboBox.getSelectedItem().toString();

        try {

            int validUser = userController.validateUser(username, password, role);
            
            if (validUser == -1){
                JOptionPane.showMessageDialog(null, "Invalid credentials");
            } else {

            ArrayList<User> userData = userController.getUserById(validUser);
          
            if(role.equals("Customer")){
                UserLayoutScreen userLayoutScreen = new UserLayoutScreen(this.mainSplitPane, userData);
                this.mainSplitPane.setRightComponent(userLayoutScreen.getBaseSplitPane().getRightComponent());
                this.mainSplitPane.setLeftComponent(userLayoutScreen.getBaseSplitPane().getLeftComponent());
            }
            else if(role.equals("Business Admin")){
                BusinessAdminScreen businessAdminScreen = new BusinessAdminScreen(this.mainSplitPane, userData);
                this.mainSplitPane.setRightComponent(businessAdminScreen.getBaseSplitPane().getRightComponent());
                this.mainSplitPane.setLeftComponent(businessAdminScreen.getBaseSplitPane().getLeftComponent());
            } else if(role.equals("Hotel Admin")){
                HotelAdminScreen hotelAdminScreen = new HotelAdminScreen(this.mainSplitPane, userData);
                this.mainSplitPane.setRightComponent(hotelAdminScreen.getBaseSplitPane().getRightComponent());
                this.mainSplitPane.setLeftComponent(hotelAdminScreen.getBaseSplitPane().getLeftComponent());
            }
            }
        } catch (SQLException ex) {
            System.out.println("error here");
        }
        
//        if(jUsernameTextField.getText().equalsIgnoreCase("admin")){  
//            try {
//                BusinessAdminScreen businessAdminScreen = new BusinessAdminScreen(this.mainSplitPane);
//                this.mainSplitPane.setRightComponent(businessAdminScreen.getBaseSplitPane().getRightComponent());
//                this.mainSplitPane.setLeftComponent(businessAdminScreen.getBaseSplitPane().getLeftComponent());
//            } catch (SQLException ex) {
//             System.out.println("EROROROR");   
//            }
//        } else {
//             // If User Logs In
//            UserLeftPanelOptions UserLeftPanelOptions = new UserLeftPanelOptions(this.mainSplitPane);
//            this.mainSplitPane.setLeftComponent(UserLeftPanelOptions);
//
//            UserWelcomeScreen UserRightPanelWelcome = new UserWelcomeScreen(this.mainSplitPane);
//            this.mainSplitPane.setRightComponent(UserRightPanelWelcome);
//
//        }
        
    }//GEN-LAST:event_jLoginButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> jLoginAsComboBox;
    private javax.swing.JButton jLoginButton;
    private javax.swing.JTextField jPasswordTextField;
    private javax.swing.JTextField jUsernameTextField;
    // End of variables declaration//GEN-END:variables
}
