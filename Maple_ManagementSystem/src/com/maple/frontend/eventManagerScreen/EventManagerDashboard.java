/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.maple.frontend.eventManagerScreen;
import com.maple.backend.controller.EventController;
import com.maple.backend.model.Event;
import com.maple.backend.model.User;
import com.maple.backend.service.EventService;
import com.maple.backend.service.UserService;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DKapoor
 */
public class EventManagerDashboard extends javax.swing.JPanel {

    /**
     * Creates new form EventManagerDashboard
     */
    ArrayList<User> userData;
    EventService eventService;
    UserService userService;
    JSplitPane jRightSplitPane;
    EventController eventController;
    int publicClick = 0;
    int privateClick = 0;
    public EventManagerDashboard(ArrayList<User> userData, JSplitPane jRightSplitPane) throws SQLException {
        
        initComponents();
        
        this.userData = userData;
        this.jRightSplitPane = jRightSplitPane;
        eventService = new EventService();
        eventController = new EventController();
        populateTableData("all");
        eventTable.fixTable(jScrollPane3);
        AccomodationCount.setVisible(false);
        CaterCount.setVisible(false);
        TravelCount.setVisible(false);
        populateCardData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLocation2 = new javax.swing.JLabel();
        jPrivateEvent = new com.maple.resources.Card();
        jRefreshTableBtn2 = new com.maple.resources.ButtonBadges();
        jPublicEvent = new com.maple.resources.Card();
        jScrollPane3 = new javax.swing.JScrollPane();
        eventTable = new com.maple.resources.Table();
        Name = new com.maple.resources.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EmailId = new com.maple.resources.TextField();
        PhoneNumber = new com.maple.resources.TextField();
        PostalCode = new com.maple.resources.TextField();
        Accomodation = new com.maple.resources.TextField();
        Catering = new com.maple.resources.TextField();
        Travel = new com.maple.resources.TextField();
        EventDate = new com.maple.resources.TextField();
        AccomodationCount = new com.maple.resources.TextField();
        TravelCount = new com.maple.resources.TextField();
        CaterCount = new com.maple.resources.TextField();
        requestButton = new com.maple.resources.Button();

        setMaximumSize(new java.awt.Dimension(1196, 720));
        setMinimumSize(new java.awt.Dimension(1196, 720));
        setPreferredSize(new java.awt.Dimension(1196, 720));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setMaximumSize(new java.awt.Dimension(1196, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1196, 720));

        jLocation2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLocation2.setForeground(new java.awt.Color(4, 72, 210));
        jLocation2.setText("Event Manager / Dashboard");

        jPrivateEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPrivateEventMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPrivateEventMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPrivateEventMouseExited(evt);
            }
        });

        jRefreshTableBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maple/icons/refresh.png"))); // NOI18N
        jRefreshTableBtn2.setMaximumSize(new java.awt.Dimension(20, 20));
        jRefreshTableBtn2.setMinimumSize(new java.awt.Dimension(20, 20));
        jRefreshTableBtn2.setPreferredSize(new java.awt.Dimension(20, 20));
        jRefreshTableBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRefreshTableBtn2ActionPerformed(evt);
            }
        });

        jPublicEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPublicEventMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPublicEventMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPublicEventMouseExited(evt);
            }
        });

        eventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Event ID", "Name", "Type", "Description", "Area", "Attendees Count", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eventTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(eventTable);

        Name.setEditable(false);
        Name.setLabelText("Name");

        jLabel3.setText("Customer details");

        jLabel4.setText("Event details");

        EmailId.setEditable(false);
        EmailId.setLabelText("Email ID");

        PhoneNumber.setEditable(false);
        PhoneNumber.setLabelText("Phone Number");

        PostalCode.setEditable(false);
        PostalCode.setLabelText("Postal Code");

        Accomodation.setEditable(false);
        Accomodation.setLabelText("Accomodation needed");

        Catering.setEditable(false);
        Catering.setLabelText("Catering needed");

        Travel.setEditable(false);
        Travel.setLabelText("Travel needed");

        EventDate.setEditable(false);
        EventDate.setLabelText("Event To-From");

        AccomodationCount.setEditable(false);
        AccomodationCount.setLabelText("Count");

        TravelCount.setEditable(false);
        TravelCount.setLabelText("Count");

        CaterCount.setEditable(false);
        CaterCount.setLabelText("Count");

        requestButton.setText("Manage requests");
        requestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLocation2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPrivateEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jPublicEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRefreshTableBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Travel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TravelCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Catering, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CaterCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(EventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(Accomodation, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AccomodationCount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel3)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226)
                        .addComponent(requestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(374, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AccomodationCount, CaterCount, TravelCount});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLocation2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPrivateEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPublicEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(181, Short.MAX_VALUE)
                        .addComponent(jRefreshTableBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(requestButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Accomodation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AccomodationCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Catering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CaterCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Travel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TravelCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EventDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1196, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPrivateEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPrivateEventMouseClicked
            
    jPrivateEvent.setBackground(Color.CYAN);
        jPublicEvent.setBackground(Color.white);
        
        try {
            //Refresh Table Data
            populateTableData("PRIVATE");
        } catch (SQLException ex) {
        }
         publicClick = 0;
        privateClick = 1;
    }//GEN-LAST:event_jPrivateEventMouseClicked

    private void jPrivateEventMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPrivateEventMouseEntered
        //        // TODO add your handling code here:
                jPrivateEvent.setBackground(Color.CYAN);
    }//GEN-LAST:event_jPrivateEventMouseEntered

    private void jPrivateEventMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPrivateEventMouseExited
        // TODO add your handling code here:
                if(privateClick==1 && publicClick==0){
                        jPrivateEvent.setBackground(Color.CYAN);
                        return;
                    }
                jPrivateEvent.setBackground(Color.white);
                privateClick = 0;
    }//GEN-LAST:event_jPrivateEventMouseExited

    private void jRefreshTableBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRefreshTableBtn2ActionPerformed
                try {
                        populateTableData("ALL");
                    } catch (SQLException ex) {}
                //Reset card colors
                jPrivateEvent.setBackground(Color.white);
                jPublicEvent.setBackground(Color.white);
                //Reset card click counter
                publicClick = 0;
                privateClick = 0;
//                travelClick = 0;
    }//GEN-LAST:event_jRefreshTableBtn2ActionPerformed

    private void eventTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventTableMouseClicked
        
        
        int selectedRowIndex = eventTable.getSelectedRow();
            System.out.println(selectedRowIndex);
            if(selectedRowIndex < 0 ){
                JOptionPane.showMessageDialog(this, "Please select a row to view");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) eventTable.getModel();
            Event e = (Event) model.getValueAt(selectedRowIndex, 0);
            System.out.println("selectedEvent");
            
            int user_id = e.getUserID();
        try {
            UserService userService = new UserService();
            ArrayList <User> userList = userService.getAllUsers();
            
            for(User u: userList){
                
                if(u.getID() == user_id){
                    Name.setText(u.getName());
                    EmailId.setText(u.getEmail());
                    PhoneNumber.setText(u.getPhoneNum());
                    PostalCode.setText(u.getPostalCode());
            }
            }
//            
//            Email
        } catch (SQLException ex) {
            Logger.getLogger(EventManagerDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

            Accomodation.setText(e.getAccomodationNeeded());
            if (e.getAccomodationNeeded().equalsIgnoreCase("yes")){
                AccomodationCount.setVisible(true);
                AccomodationCount.setText(String.valueOf(e.getAccomodationCount()));
            }
            Catering.setText(e.getCateringNeeded());
            if (e.getCateringNeeded().equalsIgnoreCase("yes")){
                CaterCount.setVisible(true);
                CaterCount.setText(String.valueOf(e.getCateringCount()));
            }
            Travel.setText(e.getTravelNeeded());
            if (e.getTravelNeeded().equalsIgnoreCase("yes")){
                TravelCount.setVisible(true);
                TravelCount.setText(String.valueOf(e.getTravelCount()));
            }
            String event_to = e.getEventTo();
            String event_from = e.getEventFrom();
            EventDate.setText(event_to.substring(0, 10) + "-" + event_from.substring(0, 10));
    }//GEN-LAST:event_eventTableMouseClicked

    private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButtonActionPerformed
            int selectedRowIndex = eventTable.getSelectedRow();
            System.out.println(selectedRowIndex);
            if(selectedRowIndex < 0 ){
                JOptionPane.showMessageDialog(this, "Please select a row first");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) eventTable.getModel();
            Event e = (Event) model.getValueAt(selectedRowIndex, 0);
            System.out.println("selectedEvent");
        
        EventManagerRequests eventManagerRequests;
        try {
            eventManagerRequests = new EventManagerRequests(userData, e);
                        jRightSplitPane.setBottomComponent(eventManagerRequests);

        } catch (SQLException ex) {
            Logger.getLogger(EventManagerDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
//            BusinessAdminDashboard businessAdminDashboard = new BusinessAdminDashboard(userData);
    }//GEN-LAST:event_requestButtonActionPerformed

    private void jPublicEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPublicEventMouseClicked
        jPrivateEvent.setBackground(Color.white);
        jPublicEvent.setBackground(Color.CYAN);
        
        try {
            //Refresh Table Data
            populateTableData("PUBLIC");
        } catch (SQLException ex) {
        }
        
        publicClick = 1;
        privateClick = 0;
    }//GEN-LAST:event_jPublicEventMouseClicked

    private void jPublicEventMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPublicEventMouseEntered
        jPublicEvent.setBackground(Color.CYAN);
    }//GEN-LAST:event_jPublicEventMouseEntered

    private void jPublicEventMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPublicEventMouseExited
        if(privateClick==0 && publicClick==1){
                        jPublicEvent.setBackground(Color.CYAN);
                        return;
                    }
                jPublicEvent.setBackground(Color.white);
                publicClick = 0;
    }//GEN-LAST:event_jPublicEventMouseExited

    private void populateTableData(String type) throws SQLException {
//        System.out.println("dfjb");
        DefaultTableModel dtmodel = (DefaultTableModel) eventTable.getModel();
        dtmodel.setRowCount(0);
//        ArrayList<Event> eventList = new ArrayList<>(); 
        
        if (type.equalsIgnoreCase("all")){
            ArrayList<Event> eventList = eventService.getEventsListService();
            for (Event e: eventList){
                
                if(e.status.equalsIgnoreCase("assigned manager")){
                Object[] obj = new Object[7];
                obj[0] = e;
                obj[1] = e.eventName;
                obj[2] = e.eventType;
                obj[3] = e.eventDescription;
                obj[4] = e.eventArea;
                obj[5] = e.atendeesCount;
                obj[6] = e.status;
                dtmodel.addRow(obj);
            }
          }
            
        }
        
        else if (type.equalsIgnoreCase("private")){
            ArrayList<Event> eventList = eventService.getEventsListService();
            for (Event e: eventList){
                
                if(e.status.equalsIgnoreCase("assigned manager") && e.eventType.equalsIgnoreCase("private")){
                Object[] obj = new Object[7];
                obj[0] = e;
                obj[1] = e.eventName;
                obj[2] = e.eventType;
                obj[3] = e.eventDescription;
                obj[4] = e.eventArea;
                obj[5] = e.atendeesCount;
                obj[6] = e.status;
                dtmodel.addRow(obj);
            }
        }
        }
        
        else if (type.equalsIgnoreCase("public")){
            ArrayList<Event> eventList = eventService.getEventsListService();
            for (Event e: eventList){
                
                if(e.status.equalsIgnoreCase("assigned manager") && e.eventType.equalsIgnoreCase("public")){
                Object[] obj = new Object[7];
                obj[0] = e;
                obj[1] = e.eventName;
                obj[2] = e.eventType;
                obj[3] = e.eventDescription;
                obj[4] = e.eventArea;
                obj[5] = e.atendeesCount;
                obj[6] = e.status;
                dtmodel.addRow(obj);
            }
        }
        }
//        ArrayList<Catering> cateringFilteredList = new ArrayList<>();
//        ArrayList<TravelAgent> travelAgentFilteredList = new ArrayList<>();
        
//        if(type.equalsIgnoreCase("HOTEL")){
//            hotelFilteredList = workRequestController.getHotelEnterpriseData(businessAdminId, "ACCEPTED"); 
//            for(Hotel ht: hotelFilteredList){
//                Object[] obj = new Object[7];
//                obj[0] = ht;
//                obj[1] = "HOTEL";
//                obj[2] = ht.getHotelAddress();
//                obj[3] = ht.getHotelArea();
//                obj[4] = ht.getCapacity();
//                obj[5] = ht.getEmail();
//                obj[6] = ht.getPhone();
//                dtmodel.addRow(obj);
//            }
//        } else if(type.equalsIgnoreCase("CATERING")){
//            cateringFilteredList = workRequestController.getCateringEnterpriseData(businessAdminId, "ACCEPTED");
//            for(Catering ct: cateringFilteredList){
//                Object[] obj = new Object[7];
//                obj[0] = ct;
//                obj[1] = "CATERING";
//                obj[2] = ct.getCateringAddress();
//                obj[3] = ct.getCateringArea();
//                obj[4] = ct.getCapacity();
//                obj[5] = ct.getEmail();
//                obj[6] = ct.getPhone();
//                dtmodel.addRow(obj);
//            }
//        } else if(type.equalsIgnoreCase("TRAVEL")){
//            travelAgentFilteredList = workRequestController.getTravelAgentEnterpriseData(businessAdminId, "ACCEPTED"); 
//            for(TravelAgent ta: travelAgentFilteredList){
//                Object[] obj = new Object[7];
//                obj[0] = ta;
//                obj[1] = "TRAVEL";
//                obj[2] = ta.getTravelAgentAddress();
//                obj[3] = ta.getTravelAgentArea();
//                obj[4] = ta.getCapacity();
//                obj[5] = ta.getEmail();
//                obj[6] = ta.getPhone();
//                dtmodel.addRow(obj);
//            }
//        } else {
//            //Load hotel data
//            hotelFilteredList = workRequestController.getHotelEnterpriseData(businessAdminId, "ACCEPTED"); //TODO: Pass toId from USER table
//            for(Hotel ht: hotelFilteredList){
//                Object[] obj = new Object[7];
//                obj[0] = ht;
//                obj[1] = "HOTEL";
//                obj[2] = ht.getHotelAddress();
//                obj[3] = ht.getHotelArea();
//                obj[4] = ht.getCapacity();
//                obj[5] = ht.getEmail();
//                obj[6] = ht.getPhone();
//                dtmodel.addRow(obj);
//            }
//            //Load catering data
//            cateringFilteredList = workRequestController.getCateringEnterpriseData(businessAdminId, "ACCEPTED");
//            for(Catering ct: cateringFilteredList){
//                Object[] obj = new Object[7];
//                obj[0] = ct;
//                obj[1] = "CATERING";
//                obj[2] = ct.getCateringAddress();
//                obj[3] = ct.getCateringArea();
//                obj[4] = ct.getCapacity();
//                obj[5] = ct.getEmail();
//                obj[6] = ct.getPhone();
//                dtmodel.addRow(obj);
//            }
//            //Load travelAgent data
//            travelAgentFilteredList = workRequestController.getTravelAgentEnterpriseData(businessAdminId, "ACCEPTED"); 
//            for(TravelAgent ta: travelAgentFilteredList){
//                Object[] obj = new Object[7];
//                obj[0] = ta;
//                obj[1] = "TRAVEL";
//                obj[2] = ta.getTravelAgentAddress();
//                obj[3] = ta.getTravelAgentArea();
//                obj[4] = ta.getCapacity();
//                obj[5] = ta.getEmail();
//                obj[6] = ta.getPhone();
//                dtmodel.addRow(obj);
//            }
//        } 
    }
    
    private void populateCardData() throws SQLException{
        
        //Load Icons
        jPrivateEvent.setIcon(new ImageIcon(getClass().getResource("/com/maple/icons/hotel.png")));
        jPublicEvent.setIcon(new ImageIcon(getClass().getResource("/com/maple/icons/hotel.png")));
          
        //Set Description
        jPrivateEvent.setDescription("Private Events");
        jPublicEvent.setDescription("Public Events");
        
        ArrayList<Event> publicCompletedEventList = new ArrayList<>();
        eventController.getPublicEventList().stream()
                .filter(evt -> evt.getStatus().equalsIgnoreCase("ASSIGNED MANAGER"))
                .forEach(evt -> publicCompletedEventList.add(evt));
        
        ArrayList<Event> privateCompletedEventList = new ArrayList<>();
        eventController.getPrivateEventList().stream()
                .filter(evt -> evt.getStatus().equalsIgnoreCase("ASSIGNED MANAGER"))
                .forEach(evt -> privateCompletedEventList.add(evt));
        //Assign Request Values
        jPrivateEvent.setValues("# " + privateCompletedEventList.size());
        jPublicEvent.setValues("# " + publicCompletedEventList.size());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.maple.resources.TextField Accomodation;
    private com.maple.resources.TextField AccomodationCount;
    private com.maple.resources.TextField CaterCount;
    private com.maple.resources.TextField Catering;
    private com.maple.resources.TextField EmailId;
    private com.maple.resources.TextField EventDate;
    private com.maple.resources.TextField Name;
    private com.maple.resources.TextField PhoneNumber;
    private com.maple.resources.TextField PostalCode;
    private com.maple.resources.TextField Travel;
    private com.maple.resources.TextField TravelCount;
    private com.maple.resources.Table eventTable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLocation2;
    private javax.swing.JPanel jPanel1;
    private com.maple.resources.Card jPrivateEvent;
    private com.maple.resources.Card jPublicEvent;
    private com.maple.resources.ButtonBadges jRefreshTableBtn2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private com.maple.resources.Button requestButton;
    // End of variables declaration//GEN-END:variables
}
