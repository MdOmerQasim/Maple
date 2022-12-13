/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.maple.frontend;

import com.maple.backend.controller.UserController;
import com.maple.backend.model.User;
import com.maple.frontend.businessAdminScreen.BusinessAdminScreen;
import com.maple.frontend.cateringAdminScreen.CateringAdminScreen;
import com.maple.frontend.eventAdminScreen.EventAdminScreen;
import com.maple.frontend.eventManagerScreen.EventManagerScreen;
import com.maple.frontend.hotelAdminScreen.HotelAdminScreen;
import com.maple.frontend.hrAdminScreen.HRAdminScreen;
import com.maple.frontend.travelAgentAdminScreen.TravelAgentAdminScreen;
import com.maple.frontend.userScreen.UserLayoutScreen;
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
        initComponents();
        userController = new UserController();
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
        jUsernameTextField = new com.maple.resources.TextField();
        jLoginBtn = new com.maple.resources.Button();
        jPasswordTextField = new com.maple.resources.PasswordField();

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

        jLoginAsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Customer", "Hotel Admin", "Catering Admin", "Travel Agent Admin", "HR Admin", "Business Admin", "Event Admin", "Event Manager" }));
        jLoginAsComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jUsernameTextField.setLabelText("");

        jLoginBtn.setBackground(new java.awt.Color(255, 153, 0));
        jLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        jLoginBtn.setText("Login");
        jLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginBtnActionPerformed(evt);
            }
        });

        jPasswordTextField.setLabelText("");

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
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLoginAsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(0, 254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLoginAsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginBtnActionPerformed
//        System.out.println("sdb" + jUsernameTextField.getText());
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
                } else if(role.equals("Business Admin")){
                    BusinessAdminScreen businessAdminScreen = new BusinessAdminScreen(this.mainSplitPane, userData);
                    this.mainSplitPane.setRightComponent(businessAdminScreen.getBaseSplitPane().getRightComponent());
                    this.mainSplitPane.setLeftComponent(businessAdminScreen.getBaseSplitPane().getLeftComponent());         
                } else if(role.equals("Hotel Admin")){
                    HotelAdminScreen hotelAdminScreen = new HotelAdminScreen(this.mainSplitPane, userData);
                    this.mainSplitPane.setRightComponent(hotelAdminScreen.getBaseSplitPane().getRightComponent());
                    this.mainSplitPane.setLeftComponent(hotelAdminScreen.getBaseSplitPane().getLeftComponent());
                } else if(role.equals("Event Admin")){
                    EventAdminScreen eventAdminScreen = new EventAdminScreen(this.mainSplitPane, userData);
                    this.mainSplitPane.setRightComponent(eventAdminScreen.getBaseSplitPane().getRightComponent());
                    this.mainSplitPane.setLeftComponent(eventAdminScreen.getBaseSplitPane().getLeftComponent());
                } else if(role.equals("HR Admin")){
                    HRAdminScreen hrAdminScreen = new HRAdminScreen(this.mainSplitPane, userData);
                    this.mainSplitPane.setRightComponent(hrAdminScreen.getBaseSplitPane().getRightComponent());
                    this.mainSplitPane.setLeftComponent(hrAdminScreen.getBaseSplitPane().getLeftComponent());
                } else if(role.equals("Event Manager")){
                    EventManagerScreen eventManagerScreen = new EventManagerScreen(this.mainSplitPane, userData);
                    this.mainSplitPane.setRightComponent(eventManagerScreen.getBaseSplitPane().getRightComponent());
                    this.mainSplitPane.setLeftComponent(eventManagerScreen.getBaseSplitPane().getLeftComponent());
                } else if(role.equals("Catering Admin")){
                    CateringAdminScreen cateringAdminScreen = new CateringAdminScreen(this.mainSplitPane, userData);
                    this.mainSplitPane.setRightComponent(cateringAdminScreen.getBaseSplitPane().getRightComponent());
                    this.mainSplitPane.setLeftComponent(cateringAdminScreen.getBaseSplitPane().getLeftComponent());
                } else if(role.equals("Travel Agent Admin")){
                    TravelAgentAdminScreen travelAdminScreen = new TravelAgentAdminScreen(this.mainSplitPane, userData);
                    this.mainSplitPane.setRightComponent(travelAdminScreen.getBaseSplitPane().getRightComponent());
                    this.mainSplitPane.setLeftComponent(travelAdminScreen.getBaseSplitPane().getLeftComponent());
                }

            }
        } catch (SQLException ex) {
            System.out.println("error here");
        }
    }//GEN-LAST:event_jLoginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> jLoginAsComboBox;
    private com.maple.resources.Button jLoginBtn;
    private com.maple.resources.PasswordField jPasswordTextField;
    private com.maple.resources.TextField jUsernameTextField;
    // End of variables declaration//GEN-END:variables
}
