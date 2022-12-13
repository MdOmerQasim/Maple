/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.maple.frontend.userScreen;

import com.maple.backend.model.User;
import com.maple.frontend.businessAdminScreen.*;
import com.maple.frontend.HomeJPanel;
import com.maple.frontend.HomeLeftJPanel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSplitPane;

/**
 *
 * @author mohammedomerqasimshaik
 */

public class UserLayoutScreen extends javax.swing.JPanel {

    /**
     * Creates new form BusinessAdminScreen
     */
    
    JSplitPane mainSplitPane;
    User loggedInUser;
    
    public UserLayoutScreen(JSplitPane jSplitPane, ArrayList<User> userData) {
        initComponents();
        this.mainSplitPane = jSplitPane;
        this.loggedInUser = userData.get(0);
         
        //custom
        jUserName.setText(this.loggedInUser.getName());
        jUserRole.setText(this.loggedInUser.getRole());
        btnBadgeNotification.setBadges(9);
        UserWelcomeScreen userWelcomeScreen = new UserWelcomeScreen();
        jRightSplitPane.setRightComponent(userWelcomeScreen);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBaseSplitPane = new javax.swing.JSplitPane();
        jBaseRightPanel = new javax.swing.JPanel();
        jRightSplitPane = new javax.swing.JSplitPane();
        jTopRightPanel = new javax.swing.JPanel();
        jUserImageIcon = new com.maple.resources.ImageAvatar();
        jUserName = new javax.swing.JLabel();
        jUserRole = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnBadgeNotification = new com.maple.resources.ButtonBadges();
        btnBadgeMessage = new com.maple.resources.ButtonBadges();
        btnBadgeMessage1 = new com.maple.resources.ButtonBadges();
        jBottonRightPanel = new javax.swing.JPanel();
        jBaseLeftPanel = new javax.swing.JPanel();
        mapleLogo = new com.maple.resources.ImageAvatar();
        jRequestsBtn = new com.maple.resources.Button();
        jLogoutBtn = new com.maple.resources.Button();
        jRequestsBtn1 = new com.maple.resources.Button();

        jBaseSplitPane.setDividerSize(0);
        jBaseSplitPane.setMaximumSize(new java.awt.Dimension(1100, 800));
        jBaseSplitPane.setMinimumSize(new java.awt.Dimension(1100, 800));
        jBaseSplitPane.setPreferredSize(new java.awt.Dimension(1100, 800));
        jBaseSplitPane.setRequestFocusEnabled(false);

        jRightSplitPane.setDividerSize(0);
        jRightSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jRightSplitPane.setMaximumSize(new java.awt.Dimension(985, 880));
        jRightSplitPane.setOpaque(false);
        jRightSplitPane.setPreferredSize(new java.awt.Dimension(985, 880));

        jTopRightPanel.setBackground(new java.awt.Color(255, 255, 255));
        jTopRightPanel.setMaximumSize(new java.awt.Dimension(985, 80));
        jTopRightPanel.setMinimumSize(new java.awt.Dimension(985, 80));
        jTopRightPanel.setPreferredSize(new java.awt.Dimension(985, 80));

        jUserImageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/cat.jpeg"))); // NOI18N

        jUserName.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jUserName.setForeground(new java.awt.Color(127, 127, 127));
        jUserName.setText("User Name");

        jUserRole.setForeground(new java.awt.Color(127, 127, 127));
        jUserRole.setText("Business Admin");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnBadgeNotification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/notification.png"))); // NOI18N
        btnBadgeNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadgeNotificationActionPerformed(evt);
            }
        });

        btnBadgeMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/message.png"))); // NOI18N
        btnBadgeMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadgeMessageActionPerformed(evt);
            }
        });

        btnBadgeMessage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/menu.png"))); // NOI18N
        btnBadgeMessage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBadgeMessage1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTopRightPanelLayout = new javax.swing.GroupLayout(jTopRightPanel);
        jTopRightPanel.setLayout(jTopRightPanelLayout);
        jTopRightPanelLayout.setHorizontalGroup(
            jTopRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTopRightPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBadgeMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(620, 620, 620)
                .addComponent(btnBadgeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBadgeNotification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jTopRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jUserRole, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jUserImageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jTopRightPanelLayout.setVerticalGroup(
            jTopRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTopRightPanelLayout.createSequentialGroup()
                .addGroup(jTopRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTopRightPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jUserRole))
                    .addGroup(jTopRightPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(jTopRightPanelLayout.createSequentialGroup()
                .addGroup(jTopRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTopRightPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jUserImageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jTopRightPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jTopRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBadgeNotification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBadgeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBadgeMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jRightSplitPane.setTopComponent(jTopRightPanel);

        jBottonRightPanel.setMaximumSize(new java.awt.Dimension(1100, 800));
        jBottonRightPanel.setMinimumSize(new java.awt.Dimension(1100, 800));
        jBottonRightPanel.setPreferredSize(new java.awt.Dimension(1100, 800));

        javax.swing.GroupLayout jBottonRightPanelLayout = new javax.swing.GroupLayout(jBottonRightPanel);
        jBottonRightPanel.setLayout(jBottonRightPanelLayout);
        jBottonRightPanelLayout.setHorizontalGroup(
            jBottonRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jBottonRightPanelLayout.setVerticalGroup(
            jBottonRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jRightSplitPane.setRightComponent(jBottonRightPanel);

        javax.swing.GroupLayout jBaseRightPanelLayout = new javax.swing.GroupLayout(jBaseRightPanel);
        jBaseRightPanel.setLayout(jBaseRightPanelLayout);
        jBaseRightPanelLayout.setHorizontalGroup(
            jBaseRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRightSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jBaseRightPanelLayout.setVerticalGroup(
            jBaseRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRightSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jBaseSplitPane.setRightComponent(jBaseRightPanel);

        jBaseLeftPanel.setBackground(new java.awt.Color(255, 255, 255));

        mapleLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/maple.png"))); // NOI18N

        jRequestsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/analytics.png"))); // NOI18N
        jRequestsBtn.setText("Create Event");
        jRequestsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRequestsBtnActionPerformed(evt);
            }
        });

        jLogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/logout.png"))); // NOI18N
        jLogoutBtn.setText("Logout");
        jLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutBtnActionPerformed(evt);
            }
        });

        jRequestsBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/analytics.png"))); // NOI18N
        jRequestsBtn1.setText("View My Events");
        jRequestsBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRequestsBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jBaseLeftPanelLayout = new javax.swing.GroupLayout(jBaseLeftPanel);
        jBaseLeftPanel.setLayout(jBaseLeftPanelLayout);
        jBaseLeftPanelLayout.setHorizontalGroup(
            jBaseLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBaseLeftPanelLayout.createSequentialGroup()
                .addGroup(jBaseLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBaseLeftPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jBaseLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mapleLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jBaseLeftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRequestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jBaseLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jBaseLeftPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jRequestsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        jBaseLeftPanelLayout.setVerticalGroup(
            jBaseLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBaseLeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mapleLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jRequestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 547, Short.MAX_VALUE)
                .addComponent(jLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jBaseLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jBaseLeftPanelLayout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addComponent(jRequestsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(554, Short.MAX_VALUE)))
        );

        jBaseSplitPane.setLeftComponent(jBaseLeftPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBaseSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBaseSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBadgeMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadgeMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBadgeMessageActionPerformed

    private void btnBadgeNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadgeNotificationActionPerformed
        // TODO add your handling code here:
        btnBadgeNotification.setBadges(0);
    }//GEN-LAST:event_btnBadgeNotificationActionPerformed

    private void btnBadgeMessage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBadgeMessage1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBadgeMessage1ActionPerformed

    private void jLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutBtnActionPerformed
        // TODO add your handling code here:
        HomeJPanel homeScreen = new HomeJPanel(this.mainSplitPane);
        this.mainSplitPane.setRightComponent(homeScreen);
        
        // reset left panel
        HomeLeftJPanel homeLeftPanel = new HomeLeftJPanel(this.mainSplitPane);
        this.mainSplitPane.setLeftComponent(homeLeftPanel);
      
    }//GEN-LAST:event_jLogoutBtnActionPerformed

    private void jRequestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRequestsBtnActionPerformed
        try {
            // TODO add your handling code here:
            
            UserCreateEvent userCreateRightPanel = new UserCreateEvent(this.mainSplitPane, this.loggedInUser);
            jRightSplitPane.setBottomComponent(userCreateRightPanel);
        } catch (SQLException ex) {
            Logger.getLogger(UserLayoutScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRequestsBtnActionPerformed

    private void jRequestsBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRequestsBtn1ActionPerformed
        // TODO add your handling code here:
        UserViewMyEvent userViewMyEventRightPanel = new UserViewMyEvent(this.mainSplitPane, this.loggedInUser);
        jRightSplitPane.setBottomComponent(userViewMyEventRightPanel);
    }//GEN-LAST:event_jRequestsBtn1ActionPerformed

    public JSplitPane getBaseSplitPane(){
        return this.jBaseSplitPane;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.maple.resources.ButtonBadges btnBadgeMessage;
    private com.maple.resources.ButtonBadges btnBadgeMessage1;
    private com.maple.resources.ButtonBadges btnBadgeNotification;
    private javax.swing.JPanel jBaseLeftPanel;
    private javax.swing.JPanel jBaseRightPanel;
    private javax.swing.JSplitPane jBaseSplitPane;
    private javax.swing.JPanel jBottonRightPanel;
    private com.maple.resources.Button jLogoutBtn;
    private com.maple.resources.Button jRequestsBtn;
    private com.maple.resources.Button jRequestsBtn1;
    private javax.swing.JSplitPane jRightSplitPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jTopRightPanel;
    private com.maple.resources.ImageAvatar jUserImageIcon;
    private javax.swing.JLabel jUserName;
    private javax.swing.JLabel jUserRole;
    private com.maple.resources.ImageAvatar mapleLogo;
    // End of variables declaration//GEN-END:variables

}
