/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.maple.frontend.userScreen;

import com.maple.backend.controller.EventController;
import com.maple.backend.controller.UserController;
import com.maple.backend.controller.WorkRequestController;
import com.maple.backend.model.Event;
import com.maple.backend.model.User;
import com.maple.backend.model.WorkRequest;
import com.maple.frontend.RegisterJPanel;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author deva
 */
public class UserCreateEvent extends javax.swing.JPanel {

    /**
     * Creates new form UserCreateEvent
     */
     JSplitPane mainSplitPane;
     User loggedInUser;
     EventController eventController;
     WorkRequestController wrController;
     UserController userController;
    public UserCreateEvent(JSplitPane jSplitPane, User loggedUser) throws SQLException {
       this.mainSplitPane = jSplitPane;
       this.loggedInUser = loggedUser;
       eventController = new EventController();
       wrController = new WorkRequestController();
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

        systemColor1 = new com.maple.resources.SystemColor();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        typeDropdown = new javax.swing.JComboBox<>();
        toDate = new com.toedter.calendar.JDateChooser();
        fromDate = new com.toedter.calendar.JDateChooser();
        hotelCheckbox = new javax.swing.JCheckBox();
        cateringCheckbox = new javax.swing.JCheckBox();
        travelCheckbox = new javax.swing.JCheckBox();
        hotelCount = new javax.swing.JTextField();
        travelCount = new javax.swing.JTextField();
        cateringCount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        hotelDropdown = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        areaText = new com.maple.resources.TextField();
        nameText = new com.maple.resources.TextField();
        descText = new com.maple.resources.TextField();
        attendeesCountText = new com.maple.resources.TextField();
        callbackBtn = new com.maple.resources.Button();
        button1 = new com.maple.resources.Button();

        jLabel1.setText("Type");

        jLabel2.setText("Name");

        jLabel3.setText("Description");

        jLabel4.setText("Area");

        jLabel5.setText("Attendees Count");

        jLabel6.setText("From");

        jLabel7.setText("To");

        jLabel8.setText("Services Needed");

        typeDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Public", "Private" }));
        typeDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeDropdownActionPerformed(evt);
            }
        });

        hotelCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelCheckboxActionPerformed(evt);
            }
        });

        cateringCheckbox.setText("  Catering");
        cateringCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateringCheckboxActionPerformed(evt);
            }
        });

        travelCheckbox.setText("  Travel");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CREATE PUBLIC / PRIVATE EVENT");

        hotelDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accomodation", "Function Hall" }));

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*");

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*");

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");

        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");

        callbackBtn.setText("Request Callback");
        callbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callbackBtnActionPerformed(evt);
            }
        });

        button1.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(48, 48, 48))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(travelCheckbox)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(hotelCheckbox)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(cateringCheckbox))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cateringCount, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hotelCount, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(travelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(typeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descText, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(areaText, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(callbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(toDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fromDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(attendeesCountText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(typeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(descText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(areaText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attendeesCountText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hotelCheckbox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hotelCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cateringCheckbox)
                            .addComponent(cateringCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(travelCheckbox)
                            .addComponent(travelCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addComponent(callbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void typeDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeDropdownActionPerformed

    private void hotelCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotelCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hotelCheckboxActionPerformed

    private void cateringCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cateringCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cateringCheckboxActionPerformed

    private void callbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callbackBtnActionPerformed
        // TODO add your handling code here:
        try {
            Event newEvent = new Event();
            int eventId = 0;
            try {
                eventId = eventController.getEventsList();
            } catch (SQLException ex) {
                Logger.getLogger(RegisterJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        
//            int eventId = eventController.getEventsList().size() + 1;
            newEvent.setEventID(eventId);
            newEvent.setUserID(this.loggedInUser.getID());
            newEvent.setEventType((String) typeDropdown.getSelectedItem());
            newEvent.setEventName(nameText.getText());
            newEvent.setEventDescription(descText.getText());
            newEvent.setEventArea(areaText.getText());
            newEvent.setAtendeesCount(attendeesCountText.getText());
            newEvent.setEventFrom(fromDate.getDate().toString());
            newEvent.setEventTo(toDate.getDate().toString());
            newEvent.setEventManagerID(-1);
            newEvent.setChosenHotelID(-1);
            newEvent.setChosenCateringID(-1);
            newEvent.setChosenTravelAgentID(-1);
            newEvent.setStatus("Pending");
            System.out.println("dddddd");
            if(hotelCheckbox.isSelected()){
                if(hotelDropdown.getSelectedItem().toString() == "Accomodation") {
                    newEvent.setAccomodationNeeded("yes");
                    newEvent.setAccomodationCount(Integer.parseInt(hotelCount.getText()));
                } else {
                    newEvent.setFunctionHallNeeded("yes");
                    newEvent.setFunctionHallCount(Integer.parseInt(hotelCount.getText()));
                }
            }
            if(cateringCheckbox.isSelected()){
                    newEvent.setCateringNeeded("yes");
                    newEvent.setCateringCount(Integer.parseInt(cateringCount.getText()));
            }
            if(travelCheckbox.isSelected()){
                newEvent.setTravelNeeded("yes");
                newEvent.setTravelCount(Integer.parseInt(travelCount.getText()));
            }
            System.out.println("hgvg");
            // create an event
            eventController.createAnEvent(newEvent);
            
            // create work request
            WorkRequest wk = new WorkRequest();
            
            
            wk.setID( wrController.getAllWorkRequestData().size() + 1);
            wk.setType("CUSTOMER_EVENTADMIN");
            wk.setFromID(this.loggedInUser.getID());
            ArrayList<User> eventAdmin  = userController.getUserDataByRole("Event Admin");
            wk.setToID(WIDTH);
            wk.setStatus("Pending");
            wk.setEventID(eventId);
           
            wk.setToID(eventAdmin.get(0).getID());
            wrController.createWorkRequest(wk);
            
        } catch (SQLException e){
            
        }
//        System.out.println(newEvent.toString());

    }//GEN-LAST:event_callbackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.maple.resources.TextField areaText;
    private com.maple.resources.TextField attendeesCountText;
    private com.maple.resources.Button button1;
    private com.maple.resources.Button callbackBtn;
    private javax.swing.JCheckBox cateringCheckbox;
    private javax.swing.JTextField cateringCount;
    private com.maple.resources.TextField descText;
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JCheckBox hotelCheckbox;
    private javax.swing.JTextField hotelCount;
    private javax.swing.JComboBox<String> hotelDropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.maple.resources.TextField nameText;
    private com.maple.resources.SystemColor systemColor1;
    private com.toedter.calendar.JDateChooser toDate;
    private javax.swing.JCheckBox travelCheckbox;
    private javax.swing.JTextField travelCount;
    private javax.swing.JComboBox<String> typeDropdown;
    // End of variables declaration//GEN-END:variables
}
