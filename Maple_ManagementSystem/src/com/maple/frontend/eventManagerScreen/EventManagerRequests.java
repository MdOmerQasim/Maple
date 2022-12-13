/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.maple.frontend.eventManagerScreen;

import com.maple.backend.model.Catering;
import com.maple.backend.model.Event;
import com.maple.backend.model.Hotel;
import com.maple.backend.model.TravelAgent;
import com.maple.backend.model.User;
import com.maple.backend.model.WorkRequest;
import com.maple.backend.service.EnterpriseService;
import com.maple.backend.controller.WorkRequestController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author DKapoor
 */
public class EventManagerRequests extends javax.swing.JPanel {

    /**
     * Creates new form EventManagerRequests
     */
    ArrayList<User> userData;
    Event e;
    EnterpriseService enterpriseService;
    WorkRequestController workRequestController;
    public EventManagerRequests(ArrayList<User> userData, Event e) throws SQLException {
        initComponents();
        this.userData = userData;
        this.e = e;
        enterpriseService = new EnterpriseService();
        workRequestController = new WorkRequestController();
        accoPanel.setVisible(false);
        caterPanel.setVisible(false);
        travelPanel.setVisible(false);
        
        AccoLabel.setVisible(false);
        AccoTextField.setVisible(false);
        
        if (e.getAccomodationNeeded().equalsIgnoreCase("yes")){
            accoPanel.setVisible(true);
            populateAccoDropDown();
        }
        if (e.getCateringNeeded().equalsIgnoreCase("yes")){
            caterPanel.setVisible(true);
            populateCaterDropDown();
        }
        if (e.getTravelNeeded().equalsIgnoreCase("yes")){
            travelPanel.setVisible(true);
            populateTravelDropDown();
        }
        
    }
    
    public void populateAccoDropDown() throws SQLException{
        
        ArrayList<WorkRequest> workRequest = workRequestController.getAllWorkRequestData();
        int event_id = e.getEventID();
        int event_manager_id = e.getEventManagerID();
        
        for (WorkRequest wr: workRequest){
            if(wr.getEventID() == event_id && wr.getEventManagerID()== event_manager_id){
                if(wr.getType().equalsIgnoreCase("eventmanager_hoteladmin")){
                    selectAcco.setVisible(false);
            jLabel4.setVisible(false);
            buttonAcco.setVisible(false);
            AccoLabel.setVisible(true);
            AccoTextField.setVisible(true);
            
            AccoTextField.setText(wr.getStatus());
                }
            }
        }
        
        ArrayList<Hotel> hotelList = enterpriseService.getAllHotelDataService();
        ArrayList<String> hList = new ArrayList<>();
        
        hotelList.stream().forEach(hotel -> hList.add(hotel.getHotelName()));
        selectAcco.setModel(new DefaultComboBoxModel<>(hList.toArray(new String[0])));
    }
    
    public void populateCaterDropDown() throws SQLException{
        
        ArrayList<WorkRequest> workRequest = workRequestController.getAllWorkRequestData();
        int event_id = e.getEventID();
        int event_manager_id = e.getEventManagerID();
        
        for (WorkRequest wr: workRequest){
            if(wr.getEventID() == event_id && wr.getEventManagerID()== event_manager_id){
                if(wr.getType().equalsIgnoreCase("eventmanager_cateringadmin")){
                    selectCater.setVisible(false);
            jLabel5.setVisible(false);
            buttonCater.setVisible(false);
            CaterLabel.setVisible(true);
            CaterTextField.setVisible(true);
            
            CaterTextField.setText(wr.getStatus());
                }
            }
        }
        
        ArrayList<Catering> cList = enterpriseService.getAllCateringDataService();
        ArrayList<String> cater = new ArrayList<>();
        
        cList.stream().forEach(c -> cater.add(c.getCateringName()));
        selectCater.setModel(new DefaultComboBoxModel<>(cater.toArray(new String[0])));
    }
    
    public void populateTravelDropDown() throws SQLException{
        
        ArrayList<WorkRequest> workRequest = workRequestController.getAllWorkRequestData();
        int event_id = e.getEventID();
        int event_manager_id = e.getEventManagerID();
        
        for (WorkRequest wr: workRequest){
            if(wr.getEventID() == event_id && wr.getEventManagerID()== event_manager_id){
                if(wr.getType().equalsIgnoreCase("eventmanager_travelagentadmin")){
                    selectTravel.setVisible(false);
            jLabel6.setVisible(false);
            buttonTravel.setVisible(false);
            TravelLabel.setVisible(true);
            TravelTextField.setVisible(true);
            
            TravelTextField.setText(wr.getStatus());
                }
            }
        }
        
        ArrayList<TravelAgent> tList = enterpriseService.getAllTravelDataService();
        ArrayList<String> travelList = new ArrayList<>();
        
        tList.stream().forEach(t -> travelList.add(t.getTravelAgentName()));
        selectTravel.setModel(new DefaultComboBoxModel<>(travelList.toArray(new String[0])));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocation2 = new javax.swing.JLabel();
        accoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        selectAcco = new javax.swing.JComboBox<>();
        buttonAcco = new com.maple.resources.Button();
        AccoLabel = new javax.swing.JLabel();
        AccoTextField = new javax.swing.JTextField();
        caterPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        selectCater = new javax.swing.JComboBox<>();
        buttonCater = new com.maple.resources.Button();
        CaterTextField = new javax.swing.JTextField();
        CaterLabel = new javax.swing.JLabel();
        travelPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        selectTravel = new javax.swing.JComboBox<>();
        buttonTravel = new com.maple.resources.Button();
        TravelLabel = new javax.swing.JLabel();
        TravelTextField = new javax.swing.JTextField();

        jLocation2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLocation2.setForeground(new java.awt.Color(4, 72, 210));
        jLocation2.setText("Event Manager / Request");

        jLabel1.setText("Accomodation");

        jLabel4.setText("Select a hotel");

        selectAcco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonAcco.setText("REQUEST");
        buttonAcco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAccoActionPerformed(evt);
            }
        });

        AccoLabel.setText("Status");

        AccoTextField.setEditable(false);
        AccoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccoTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accoPanelLayout = new javax.swing.GroupLayout(accoPanel);
        accoPanel.setLayout(accoPanelLayout);
        accoPanelLayout.setHorizontalGroup(
            accoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accoPanelLayout.createSequentialGroup()
                .addGroup(accoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(accoPanelLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(selectAcco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(accoPanelLayout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(buttonAcco, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(accoPanelLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(AccoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(AccoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        accoPanelLayout.setVerticalGroup(
            accoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(selectAcco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonAcco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(accoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccoLabel)
                    .addComponent(AccoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setText("Catering");

        jLabel5.setText("Select a caterer");

        selectCater.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonCater.setText("REQUEST");
        buttonCater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCaterActionPerformed(evt);
            }
        });

        CaterTextField.setEditable(false);
        CaterTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaterTextFieldActionPerformed(evt);
            }
        });

        CaterLabel.setText("Status");

        javax.swing.GroupLayout caterPanelLayout = new javax.swing.GroupLayout(caterPanel);
        caterPanel.setLayout(caterPanelLayout);
        caterPanelLayout.setHorizontalGroup(
            caterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caterPanelLayout.createSequentialGroup()
                .addGroup(caterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(caterPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(caterPanelLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(selectCater, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(caterPanelLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(CaterLabel)
                        .addGap(18, 18, 18)
                        .addGroup(caterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CaterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCater, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        caterPanelLayout.setVerticalGroup(
            caterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(caterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(selectCater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonCater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(caterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CaterLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Travel");

        jLabel6.setText("Select a travel agent");

        selectTravel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonTravel.setText("REQUEST");
        buttonTravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTravelActionPerformed(evt);
            }
        });

        TravelLabel.setText("Status");

        TravelTextField.setEditable(false);
        TravelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TravelTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout travelPanelLayout = new javax.swing.GroupLayout(travelPanel);
        travelPanel.setLayout(travelPanelLayout);
        travelPanelLayout.setHorizontalGroup(
            travelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(travelPanelLayout.createSequentialGroup()
                .addGroup(travelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(travelPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(travelPanelLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(selectTravel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(travelPanelLayout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(buttonTravel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(travelPanelLayout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(TravelLabel)
                        .addGap(18, 18, 18)
                        .addComponent(TravelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(440, Short.MAX_VALUE))
        );
        travelPanelLayout.setVerticalGroup(
            travelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(travelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(travelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(selectTravel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonTravel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(travelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TravelLabel)
                    .addComponent(TravelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLocation2)
                    .addComponent(accoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(travelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLocation2)
                .addGap(18, 18, 18)
                .addComponent(accoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(caterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(travelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAccoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAccoActionPerformed
        String hotel = selectAcco.getSelectedItem().toString();
        
        ArrayList<Hotel> hotelList;
        try {
            hotelList = enterpriseService.getAllHotelDataService();
                    for (Hotel h : hotelList){
            if(h.getHotelName().equalsIgnoreCase(hotel)){
                int hotel_id = h.getHotelID();
                String ha_id = h.getHotelAdmin();
                WorkRequest wr = new WorkRequest();
                int event_manager_id = e.getEventManagerID();
                int event_id = e.getEventID();
            wr.setID(workRequestController.getAllWorkRequestData().size()+1);
            wr.setType("EVENTMANAGER_HOTELADMIN");
            wr.setFromID(event_manager_id);
            wr.setToID(Integer.parseInt(ha_id)); 
            wr.setStatus("PENDING");
            wr.setEventID(event_id);
            wr.setEventManagerID(event_manager_id);
            workRequestController.createWorkRequest(wr);
            
            JOptionPane.showMessageDialog(this, "Request sent to hotel admin!");
            selectAcco.setVisible(false);
            jLabel4.setVisible(false);
            buttonAcco.setVisible(false);
            AccoLabel.setVisible(true);
            AccoTextField.setVisible(true);
            
            AccoTextField.setText("PENDING");
            }
        }
        }catch (SQLException ex) {
            Logger.getLogger(EventManagerRequests.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
    }//GEN-LAST:event_buttonAccoActionPerformed

    private void AccoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccoTextFieldActionPerformed

    private void buttonCaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCaterActionPerformed
        String catering = selectCater.getSelectedItem().toString();
        
        ArrayList<Catering> cList;
        try {
            cList = enterpriseService.getAllCateringDataService();
                    for (Catering c : cList){
            if(c.getCateringName().equalsIgnoreCase(catering)){
//                int hotel_id = h.getHotelID();
                String ca_id = c.getCateringAdmin();
                WorkRequest wr = new WorkRequest();
                int event_manager_id = e.getEventManagerID();
                int event_id = e.getEventID();
            wr.setID(workRequestController.getAllWorkRequestData().size()+1);
            wr.setType("EVENTMANAGER_CATERINGADMIN");
            wr.setFromID(event_manager_id);
            wr.setToID(Integer.parseInt(ca_id)); 
            wr.setStatus("PENDING");
            wr.setEventID(event_id);
            wr.setEventManagerID(event_manager_id);
            workRequestController.createWorkRequest(wr);
            
            JOptionPane.showMessageDialog(this, "Request sent to catering admin!");
            selectCater.setVisible(false);
            jLabel5.setVisible(false);
            buttonCater.setVisible(false);
            CaterLabel.setVisible(true);
            CaterTextField.setVisible(true);
            
            CaterTextField.setText("PENDING");
            }
        }
        }catch (SQLException ex) {
            Logger.getLogger(EventManagerRequests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonCaterActionPerformed

    private void CaterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaterTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaterTextFieldActionPerformed

    private void TravelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TravelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TravelTextFieldActionPerformed

    private void buttonTravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTravelActionPerformed
        String travel = selectTravel.getSelectedItem().toString();
        
        ArrayList<TravelAgent> tList;
        try {
            tList = enterpriseService.getAllTravelDataService();
                    for (TravelAgent t : tList){
            if(t.getTravelAgentName().equalsIgnoreCase(travel)){
//                int hotel_id = h.getHotelID();
                int ta_id = t.getTravelAgentID();
                WorkRequest wr = new WorkRequest();
                int event_manager_id = e.getEventManagerID();
                int event_id = e.getEventID();
            wr.setID(workRequestController.getAllWorkRequestData().size()+1);
            wr.setType("EVENTMANAGER_TRAVELAGENTADMIN");
            wr.setFromID(event_manager_id);
            wr.setToID(ta_id); 
            wr.setStatus("PENDING");
            wr.setEventID(event_id);
            wr.setEventManagerID(event_manager_id);
            workRequestController.createWorkRequest(wr);
            
            JOptionPane.showMessageDialog(this, "Request sent to travel agent admin!");
            selectTravel.setVisible(false);
            jLabel6.setVisible(false);
            buttonTravel.setVisible(false);
            TravelLabel.setVisible(true);
            TravelTextField.setVisible(true);
            
            TravelTextField.setText("PENDING");
            }
        }
        }catch (SQLException ex) {
            Logger.getLogger(EventManagerRequests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonTravelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccoLabel;
    private javax.swing.JTextField AccoTextField;
    private javax.swing.JLabel CaterLabel;
    private javax.swing.JTextField CaterTextField;
    private javax.swing.JLabel TravelLabel;
    private javax.swing.JTextField TravelTextField;
    private javax.swing.JPanel accoPanel;
    private com.maple.resources.Button buttonAcco;
    private com.maple.resources.Button buttonCater;
    private com.maple.resources.Button buttonTravel;
    private javax.swing.JPanel caterPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLocation2;
    private javax.swing.JComboBox<String> selectAcco;
    private javax.swing.JComboBox<String> selectCater;
    private javax.swing.JComboBox<String> selectTravel;
    private javax.swing.JPanel travelPanel;
    // End of variables declaration//GEN-END:variables
}
