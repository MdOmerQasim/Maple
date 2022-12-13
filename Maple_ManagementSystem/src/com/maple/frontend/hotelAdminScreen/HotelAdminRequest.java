/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.maple.frontend.hotelAdminScreen;

import com.maple.backend.controller.EventController;
import com.maple.backend.controller.WorkRequestController;
import com.maple.backend.model.Event;
import com.maple.backend.model.Hotel;
import com.maple.backend.model.User;
import com.maple.backend.model.WorkRequest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohammedomerqasimshaik
 */
public class HotelAdminRequest extends javax.swing.JPanel {

    /**
     * Creates new form HotelAdminRequest
     */
    
    ArrayList<User> userData;
    WorkRequestController workRequestController;
    EventController eventController;
    int hotelAdminId;

    public HotelAdminRequest(ArrayList<User> userData) throws SQLException {
        initComponents();
        this.userData = userData;
        workRequestController = new WorkRequestController();
        eventController = new EventController();
        hotelAdminId = userData.get(0).getID();
        table.fixTable(jScrollPane2);
        jAcceptBtn.setEnabled(false);
        jRejectBtn.setEnabled(false);
        populateTableData();
    }
    
    //Table Data
    private void populateTableData() throws SQLException {
        
        DefaultTableModel dtmodel = (DefaultTableModel) table.getModel();
        dtmodel.setRowCount(0);
        ArrayList<WorkRequest> wkList = new ArrayList<>(); 
        wkList = workRequestController.getWorkRequestByRoleService(hotelAdminId);
        ArrayList<Event> eventList = eventController.getEventDataByEnterprise(wkList, hotelAdminId);
        for(Event evt: eventList){
            Object[] obj = new Object[6];
            obj[0] = evt.getEventName();
            obj[1] = evt.getEventType();
            obj[2] = evt.getEventDescription();
            obj[3] = evt.getAccomodationCount();
            obj[4] = evt.getEventFrom();
            obj[5] = evt.getEventTo();
            dtmodel.addRow(obj);
        }
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRoute = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new com.maple.resources.Table();
        jAcceptBtn = new com.maple.resources.ButtonBadges();
        jRejectBtn = new com.maple.resources.ButtonBadges();
        jRefreshTableBtn = new com.maple.resources.ButtonBadges();

        setBackground(new java.awt.Color(245, 241, 241));

        jRoute.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jRoute.setForeground(new java.awt.Color(4, 72, 210));
        jRoute.setText("Admin / Requests");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Event Name", "Event Description", "Event Type", "Accomodation", "Event From", "Event To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jAcceptBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/tick.png"))); // NOI18N
        jAcceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAcceptBtnActionPerformed(evt);
            }
        });

        jRejectBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/cross.png"))); // NOI18N
        jRejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRejectBtnActionPerformed(evt);
            }
        });

        jRefreshTableBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/refresh.png"))); // NOI18N
        jRefreshTableBtn.setMaximumSize(new java.awt.Dimension(20, 20));
        jRefreshTableBtn.setMinimumSize(new java.awt.Dimension(20, 20));
        jRefreshTableBtn.setPreferredSize(new java.awt.Dimension(20, 20));
        jRefreshTableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRefreshTableBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(456, 456, 456)
                        .addComponent(jAcceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRefreshTableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRoute)))))
                .addContainerGap(346, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jRoute)
                .addGap(25, 25, 25)
                .addComponent(jRefreshTableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAcceptBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRejectBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        //Enable buttons
        jAcceptBtn.setEnabled(true);
        jRejectBtn.setEnabled(true);

    }//GEN-LAST:event_tableMouseClicked

    private void jAcceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAcceptBtnActionPerformed

        try {
            //Select row data
            int selectedRow = table.getSelectedRow();
            DefaultTableModel dtmodel = (DefaultTableModel) table.getModel();
            Object eventName = (Object) dtmodel.getValueAt(selectedRow, 0); //hotelName
            //update STATUS in WORK_REQUEST & HOTEL table
            workRequestController.updateHotelAdminWorkFlowStatus(eventName.toString(), hotelAdminId, "ACCEPTED");

            //refresh data in table
            populateTableData();


            //Disable buttons
            jAcceptBtn.setEnabled(false);
            jRejectBtn.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(HotelAdminRequest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jAcceptBtnActionPerformed

    private void jRejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRejectBtnActionPerformed


        try {
            //Select row data
            int selectedRow = table.getSelectedRow();
            DefaultTableModel dtmodel = (DefaultTableModel) table.getModel();
            Object eventName = (Object) dtmodel.getValueAt(selectedRow, 0); //hotelName
            //update STATUS in WORK_REQUEST & HOTEL table
            workRequestController.updateHotelAdminWorkFlowStatus(eventName.toString(), hotelAdminId, "REJECTED");

            //refresh data in table
            populateTableData();


            //Disable buttons
            jAcceptBtn.setEnabled(false);
            jRejectBtn.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(HotelAdminRequest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jRejectBtnActionPerformed

    private void jRefreshTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRefreshTableBtnActionPerformed

        try {
            //Disable buttons
            jAcceptBtn.setEnabled(false);
            jRejectBtn.setEnabled(false);

            populateTableData();

            
        } catch (SQLException ex) {
//            Logger.getLogger(BusinessAdminRequest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jRefreshTableBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.maple.resources.ButtonBadges jAcceptBtn;
    private com.maple.resources.ButtonBadges jRefreshTableBtn;
    private com.maple.resources.ButtonBadges jRejectBtn;
    private javax.swing.JLabel jRoute;
    private javax.swing.JScrollPane jScrollPane2;
    private com.maple.resources.Table table;
    // End of variables declaration//GEN-END:variables
}
