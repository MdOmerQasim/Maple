/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.maple.frontend.businessAdminScreen;

import com.maple.backend.controller.WorkRequestController;
import com.maple.backend.model.User;
import com.maple.frontend.HomeJPanel;
import com.maple.frontend.HomeLeftJPanel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;

/**
 *
 * @author mohammedomerqasimshaik
 */

public class BusinessAdminScreen extends javax.swing.JPanel {
    
    JSplitPane mainSplitPane;
    
    WorkRequestController workRequestController;
    
    ArrayList<User> userData;
    
    int businessAdminId;
    
    public BusinessAdminScreen(JSplitPane jSplitPane, ArrayList<User> userData) throws SQLException {
        initComponents();
        this.mainSplitPane = jSplitPane;
        workRequestController = new WorkRequestController();
        this.userData = userData;
        businessAdminId = userData.get(0).getID();
        populateUserData();
        //Load Dashboard Screen (by default)
        BusinessAdminDashboard businessAdminDashboard = new BusinessAdminDashboard(userData);
        jRightSplitPane.setRightComponent(businessAdminDashboard);
    }
    
    public void populateUserData() throws SQLException{
        jUserImageIcon.setIcon(new ImageIcon(getClass().getResource("/com/maple/icons/p1.jpg"))); //TODO: get userImage from backend
        jUserName.setText(userData.get(0).getName());
        // get notification count
        int notification = workRequestController.getHotelEnterpriseData(businessAdminId, "PENDING").size() + 
                workRequestController.getCateringEnterpriseData(businessAdminId, "PENDING").size() + 
                workRequestController.getTravelAgentEnterpriseData(businessAdminId, "PENDING").size();
        notificationBadge.setBadges(notification); //TODO: get workRequest count for businessAdmin
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
        notificationBadge = new com.maple.resources.ButtonBadges();
        messageBadge = new com.maple.resources.ButtonBadges();
        burgerBadge = new com.maple.resources.ButtonBadges();
        jBottonRightPanel = new javax.swing.JPanel();
        jBaseLeftPanel = new javax.swing.JPanel();
        mapleLogo = new com.maple.resources.ImageAvatar();
        jDashboardBtn = new com.maple.resources.Button();
        jRequestsBtn = new com.maple.resources.Button();
        jLogoutBtn = new com.maple.resources.Button();
        jAnalyticsBtn = new com.maple.resources.Button();
        jSettingsBtn = new com.maple.resources.Button();

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

        jUserName.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jUserName.setForeground(new java.awt.Color(127, 127, 127));
        jUserName.setText("User Name");

        jUserRole.setForeground(new java.awt.Color(127, 127, 127));
        jUserRole.setText("Business Admin");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        notificationBadge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/notification.png"))); // NOI18N
        notificationBadge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationBadgeActionPerformed(evt);
            }
        });

        messageBadge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/message.png"))); // NOI18N

        burgerBadge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/menu.png"))); // NOI18N

        javax.swing.GroupLayout jTopRightPanelLayout = new javax.swing.GroupLayout(jTopRightPanel);
        jTopRightPanel.setLayout(jTopRightPanelLayout);
        jTopRightPanelLayout.setHorizontalGroup(
            jTopRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTopRightPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(burgerBadge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(620, 620, 620)
                .addComponent(messageBadge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notificationBadge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(notificationBadge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageBadge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(burgerBadge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

        jDashboardBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/dash.png"))); // NOI18N
        jDashboardBtn.setText("Dashboard");
        jDashboardBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/1.png"))); // NOI18N
        jDashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDashboardBtnActionPerformed(evt);
            }
        });

        jRequestsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/analytics.png"))); // NOI18N
        jRequestsBtn.setText("Requests");
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

        jAnalyticsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/charts.png"))); // NOI18N
        jAnalyticsBtn.setText("Analytics");
        jAnalyticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnalyticsBtnActionPerformed(evt);
            }
        });

        jSettingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/settings.png"))); // NOI18N
        jSettingsBtn.setText("Settings");
        jSettingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSettingsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jBaseLeftPanelLayout = new javax.swing.GroupLayout(jBaseLeftPanel);
        jBaseLeftPanel.setLayout(jBaseLeftPanelLayout);
        jBaseLeftPanelLayout.setHorizontalGroup(
            jBaseLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBaseLeftPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jBaseLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mapleLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRequestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAnalyticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSettingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jBaseLeftPanelLayout.setVerticalGroup(
            jBaseLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBaseLeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mapleLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jDashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jRequestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jAnalyticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSettingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                .addComponent(jLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
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

    private void notificationBadgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationBadgeActionPerformed
        try {
            notificationBadge.setBadges(0);
            BusinessAdminRequest businessAdminRequest = new BusinessAdminRequest(userData);
            jRightSplitPane.setBottomComponent(businessAdminRequest);
        } catch (SQLException ex) {}
    }//GEN-LAST:event_notificationBadgeActionPerformed

    private void jLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutBtnActionPerformed
        //Reset right panel
        HomeJPanel homeScreen = new HomeJPanel(this.mainSplitPane);
        this.mainSplitPane.setRightComponent(homeScreen);  
        //Reset left panel
        HomeLeftJPanel homeLeftPanel = new HomeLeftJPanel(this.mainSplitPane);
        this.mainSplitPane.setLeftComponent(homeLeftPanel);
    }//GEN-LAST:event_jLogoutBtnActionPerformed

    private void jRequestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRequestsBtnActionPerformed
        try {
            BusinessAdminRequest businessAdminRequest = new BusinessAdminRequest(userData);
            jRightSplitPane.setBottomComponent(businessAdminRequest);
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_jRequestsBtnActionPerformed

    private void jDashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDashboardBtnActionPerformed
        try {
            BusinessAdminDashboard businessAdminDashboard = new BusinessAdminDashboard(userData);
            jRightSplitPane.setBottomComponent(businessAdminDashboard);
        } catch (SQLException ex) {}
    }//GEN-LAST:event_jDashboardBtnActionPerformed

    private void jAnalyticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnalyticsBtnActionPerformed
        try {
            // TODO add your handling code here:
            BusinessAdminAnalytics businessAdminAnalytics = new BusinessAdminAnalytics(userData);
            jRightSplitPane.setBottomComponent(businessAdminAnalytics);
        } catch (SQLException ex) {
            Logger.getLogger(BusinessAdminScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jAnalyticsBtnActionPerformed

    private void jSettingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSettingsBtnActionPerformed
        try {
            BusinessAdminSettings businessAdminSettings = new BusinessAdminSettings(userData);
            jRightSplitPane.setBottomComponent(businessAdminSettings);
        } catch (SQLException ex) {
            Logger.getLogger(BusinessAdminScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jSettingsBtnActionPerformed

    public JSplitPane getBaseSplitPane(){
        return this.jBaseSplitPane;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.maple.resources.ButtonBadges burgerBadge;
    private com.maple.resources.Button jAnalyticsBtn;
    private javax.swing.JPanel jBaseLeftPanel;
    private javax.swing.JPanel jBaseRightPanel;
    private javax.swing.JSplitPane jBaseSplitPane;
    private javax.swing.JPanel jBottonRightPanel;
    private com.maple.resources.Button jDashboardBtn;
    private com.maple.resources.Button jLogoutBtn;
    private com.maple.resources.Button jRequestsBtn;
    private javax.swing.JSplitPane jRightSplitPane;
    private javax.swing.JSeparator jSeparator1;
    private com.maple.resources.Button jSettingsBtn;
    private javax.swing.JPanel jTopRightPanel;
    private com.maple.resources.ImageAvatar jUserImageIcon;
    private javax.swing.JLabel jUserName;
    private javax.swing.JLabel jUserRole;
    private com.maple.resources.ImageAvatar mapleLogo;
    private com.maple.resources.ButtonBadges messageBadge;
    private com.maple.resources.ButtonBadges notificationBadge;
    // End of variables declaration//GEN-END:variables

}
