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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLoginAsComboBox = new javax.swing.JComboBox<>();
        jPasswordTextField = new com.maple.resources.TextField();
        jUsernameTextField = new com.maple.resources.TextField();
        button1 = new com.maple.resources.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(810, 620));
        setMinimumSize(new java.awt.Dimension(810, 620));
        setPreferredSize(new java.awt.Dimension(810, 620));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Maple Management System");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        jLabel5.setText("Login as");

        jLoginAsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Hotel Admin", "Catering Admin", "Travel Agent Admin", "HR Admin", "Business Admin", "Event Admin", "Public Event Manager", "Private Event Manager" }));
        jLoginAsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginAsComboBoxActionPerformed(evt);
            }
        });

        jPasswordTextField.setLabelText("");

        jUsernameTextField.setLabelText("");

        button1.setBackground(new java.awt.Color(255, 153, 0));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Login");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPasswordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(jLoginAsComboBox, 0, 1, Short.MAX_VALUE)))
                .addGap(0, 254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLoginAsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(52, 52, 52)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginAsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginAsComboBoxActionPerformed
        // TODO add your handling code here:
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
            } else if(validUser == -2){
                JOptionPane.showMessageDialog(null, "Awaiting business Admin approval!");
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
    }//GEN-LAST:event_jLoginAsComboBoxActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.maple.resources.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> jLoginAsComboBox;
    private com.maple.resources.TextField jPasswordTextField;
    private com.maple.resources.TextField jUsernameTextField;
    // End of variables declaration//GEN-END:variables
}
