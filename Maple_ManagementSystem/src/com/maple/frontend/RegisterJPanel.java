/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.maple.frontend;
import com.maple.backend.controller.EnterpriseController;
import com.maple.backend.controller.UserController;
import com.maple.backend.model.User;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import com.maple.backend.controller.WorkRequestController;
import com.maple.backend.model.Catering;
import com.maple.backend.model.Hotel;
import com.maple.backend.model.TravelAgent;
import com.maple.backend.model.WorkRequest;
import com.maple.resources.sendMail;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JSplitPane;

/**
 *
 * @author DKapoor
 */
public class RegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterJPanel
     */
    JSplitPane mainSplitPane;
    String path;
    WorkRequestController workRequestController;
    User user;
    UserController userController;
    EnterpriseController enterpriseController;
    sendMail sendMail;
    
    public RegisterJPanel(JSplitPane jSplitPane) throws SQLException {
        initComponents();
        this.mainSplitPane = jSplitPane;
        user = new User();
        userController = new UserController();
        workRequestController = new WorkRequestController();
        enterpriseController = new EnterpriseController();
        sendMail = new sendMail();
        jUserPhoto.setIcon(new ImageIcon(getClass().getResource("/com/maple/icons/user.png"))); 
        jEnterprise.setVisible(false);
//        disableAdditionalFields();
        
    }
    
    private void disableAdditionalFields(){
       
        //disable additional data
        jAddress.setVisible(false);
        jCapacity.setVisible(false);
        jType.setVisible(false);
        jArea.setVisible(false);
        jCompanyName.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRegisterBtn = new com.maple.resources.Button();
        jLocation = new javax.swing.JLabel();
        jUserPhoto = new com.maple.resources.ImageAvatar();
        jEnterprise = new javax.swing.JPanel();
        jAddress = new com.maple.resources.TextField();
        jCapacity = new com.maple.resources.TextField();
        jType = new com.maple.resources.TextField();
        jArea = new com.maple.resources.TextField();
        jCompanyName = new com.maple.resources.TextField();
        jPanel2 = new javax.swing.JPanel();
        jRegisterAsComboBox = new javax.swing.JComboBox<>();
        jNameTextField = new com.maple.resources.TextField();
        jPhoneNumberTextField = new com.maple.resources.TextField();
        jPostalCodeTextField = new com.maple.resources.TextField();
        jConfirmPasswordTextField = new com.maple.resources.TextField();
        jEmailTextField = new com.maple.resources.TextField();
        jUsernameTextField = new com.maple.resources.TextField();
        jPasswordTextField = new com.maple.resources.TextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1196, 720));
        setMinimumSize(new java.awt.Dimension(1196, 720));
        setPreferredSize(new java.awt.Dimension(1196, 720));

        jRegisterBtn.setBackground(new java.awt.Color(255, 153, 0));
        jRegisterBtn.setText("Register");
        jRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterBtnActionPerformed(evt);
            }
        });

        jLocation.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLocation.setForeground(new java.awt.Color(4, 72, 210));
        jLocation.setText("Maple / Register");

        jUserPhoto.setBackground(new java.awt.Color(255, 255, 255));
        jUserPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUserPhotoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jUserPhotoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jUserPhotoMouseExited(evt);
            }
        });

        jEnterprise.setBackground(new java.awt.Color(255, 255, 255));
        jEnterprise.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Enterprise"));

        jAddress.setLabelText("Address");

        jCapacity.setLabelText("Capacity");

        jType.setLabelText("Type");

        jArea.setLabelText("Area");

        jCompanyName.setLabelText("Company Name");

        javax.swing.GroupLayout jEnterpriseLayout = new javax.swing.GroupLayout(jEnterprise);
        jEnterprise.setLayout(jEnterpriseLayout);
        jEnterpriseLayout.setHorizontalGroup(
            jEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEnterpriseLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCapacity, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jArea, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jEnterpriseLayout.setVerticalGroup(
            jEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEnterpriseLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Basic Information"));

        jRegisterAsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Hotel Admin", "Catering Admin", "Travel Agent Admin" }));
        jRegisterAsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterAsComboBoxActionPerformed(evt);
            }
        });

        jNameTextField.setLabelText("Name");

        jPhoneNumberTextField.setLabelText("Contact Number");

        jPostalCodeTextField.setLabelText("Postal Code");

        jConfirmPasswordTextField.setLabelText("Confirm Password");
        jConfirmPasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmPasswordTextFieldActionPerformed(evt);
            }
        });

        jEmailTextField.setLabelText("Email");
        jEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmailTextFieldActionPerformed(evt);
            }
        });

        jUsernameTextField.setLabelText("Username");

        jPasswordTextField.setLabelText("Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jConfirmPasswordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jUsernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRegisterAsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jEmailTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jPhoneNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPostalCodeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jConfirmPasswordTextField, jNameTextField, jPasswordTextField, jPhoneNumberTextField, jPostalCodeTextField, jRegisterAsComboBox, jUsernameTextField});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jRegisterAsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jConfirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPostalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLocation)
                        .addGap(684, 684, 684))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)))
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLocation)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jUserPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addComponent(jEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
//        String role = jRegisterAsComboBox.getSelectedIndex(selectedHospitalAdmin.getGender());

        
        
    }                                               

    private void jRegisterAsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterAsComboBoxActionPerformed
        // TODO add your handling code here:
        String role = jRegisterAsComboBox.getSelectedItem().toString();
        
        if(!role.equalsIgnoreCase("Customer")){
//            jAddress.setVisible(true);
//            jCapacity.setVisible(true);
//            jType.setVisible(true);
//            jArea.setVisible(true);
//            jCompanyName.setVisible(true);
              jEnterprise.setVisible(true);
              return;
        }
        jEnterprise.setVisible(false);
//        disableAdditionalFields();
       
    }//GEN-LAST:event_jRegisterAsComboBoxActionPerformed

    private void jRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterBtnActionPerformed
        // TODO add your handling code here:
        String role = jRegisterAsComboBox.getSelectedItem().toString();
        String name = jNameTextField.getText();
        String email = jEmailTextField.getText();
        String phoneNum = jPhoneNumberTextField.getText();
        String userName = jUsernameTextField.getText();
        String password = jPasswordTextField.getText();
        String rePassword = jConfirmPasswordTextField.getText();
        String postalCode = jPostalCodeTextField.getText();
        String address = "";
        String area = "";
        String capacity = "";
        String type = "";
        String companyName = "";
        
        //TODO: pass these too
        if(!role.equalsIgnoreCase("CUSTOMER")){
            address = jAddress.getText();
            area = jArea.getText();
            capacity = jCapacity.getText();
            type = jType.getText();
            companyName = jCompanyName.getText();
        }
        
        if (role.equals("")){
            JOptionPane.showMessageDialog(this, "Please select a valid role to register.");
        }
        else if (name.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter your name.");
jNameTextField.setBackground(new Color(255, 204, 203));
        }
        else if (email.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter your email id.");
            jEmailTextField.setBackground(new Color(255, 204, 203));

        }
        else if (phoneNum.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter your phone number.");
            jPhoneNumberTextField.setBackground(new Color(255, 204, 203));

        }
        else if (valCellNo(phoneNum)){
            JOptionPane.showMessageDialog(this, "Please enter valid phone number.");
            jPhoneNumberTextField.setBackground(new Color(255, 204, 203));
        }
//        else if (valEmail(email)){
//            JOptionPane.showMessageDialog(this, "Please enter valid email.");
//            jEmailTextField.setBackground(new Color(255, 204, 203));
//        }
            
        
         else if (userName.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter a username.");
                        jUsernameTextField.setBackground(new Color(255, 204, 203));
        }
         
        else if (userName.length() < 3){
            JOptionPane.showMessageDialog(this, "Username should be of atleast 3 characters.");
            jUsernameTextField.setBackground(new Color(255, 204, 203));
        }
         
        else if (password.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter a password.");
            jPasswordTextField.setBackground(new Color(255, 204, 203));
        }
         
        else if (password.length() < 8){
            JOptionPane.showMessageDialog(this, "Password should be of atleast 8 characters.");
            jPasswordTextField.setBackground(new Color(255, 204, 203));
        }
         else if (rePassword.equals("")){
            JOptionPane.showMessageDialog(this, "Please re-enter the password.");
                        jConfirmPasswordTextField.setBackground(new Color(255, 204, 203));

        } else if (!rePassword.equals(password)){
            JOptionPane.showMessageDialog(this, "Your passwords do not match.");
                        jConfirmPasswordTextField.setBackground(new Color(255, 204, 203));

        } else if (path.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter a photo.");
        } else{
            try {
                String status = "PENDING" ;
                if ("customer".equalsIgnoreCase(role)){
                    status = "ACCEPTED";
                }
                
            int ID = userController.getAllUsers();

            
            //insert in USER table
            userController.insertUserDataController(ID, role, name, email, phoneNum, userName, password, path, postalCode, status);

            if(role.equalsIgnoreCase("HOTEL ADMIN")){
                //insert in HCT table
                Hotel hotelData = new Hotel();
                hotelData.setHotelID(enterpriseController.getAllHotelData().size()+1); //TODO: generate
                hotelData.setHotelName(companyName);
                hotelData.setBookedDates("");
                hotelData.setCapacity(capacity);
                hotelData.setEmail(email);
                hotelData.setHotelAddress(address);
                hotelData.setHotelAdmin(String.valueOf(ID));
                hotelData.setHotelArea(area);
                hotelData.setHotelType(type);
                hotelData.setPhone(phoneNum);
                hotelData.setStatus("PENDING");
                hotelData.setPhoto(path);

                enterpriseController.insertHotelData(hotelData);

                //Create WorkRequest
                WorkRequest wr = new WorkRequest();
                wr.setID(workRequestController.getAllWorkRequestData().size()+1);
                wr.setType("HOTELADMIN_BUSINESSADMIN");
                wr.setFromID(ID);
                wr.setToID(1); //TODO: pass businessAdmin Id
                wr.setStatus("PENDING");
                wr.setEventID(0);
                wr.setEventManagerID(0);
                workRequestController.createWorkRequest(wr);
                
                sendMail.sendEmailFunction("infomaple0@gmail.com","New Work Rquest has been created for Hotel" ,"New Hotel has been registered.Please login to the system and verify it" );
                
            } else if(role.equalsIgnoreCase("CATERING ADMIN")){
                //insert in HCT table
                Catering hotelData = new Catering();
                hotelData.setCateringID(enterpriseController.getAllCateringData().size()+1); //TODO: generate
                hotelData.setCateringName(companyName);
                hotelData.setBookedDates("");
                hotelData.setCapacity(capacity);
                hotelData.setEmail(email);
                hotelData.setCateringAddress(address);
                hotelData.setCateringAdmin(String.valueOf(ID));
                hotelData.setCateringArea(area);
                hotelData.setPhone(phoneNum);
                hotelData.setPhoto(path);
                hotelData.setStatus("PENDING");

                enterpriseController.insertCateringData(hotelData);
                
                
                //Create WorkRequest
                WorkRequest wr = new WorkRequest();
                wr.setID(workRequestController.getAllWorkRequestData().size()+1);
                wr.setType("CATERINGADMIN_BUSINESSADMIN");
                wr.setFromID(ID);
                wr.setToID(1); //TODO: pass businessAdmin Id
                wr.setStatus("PENDING");
                wr.setEventID(0);
                wr.setEventManagerID(0);
                workRequestController.createWorkRequest(wr);
                sendMail.sendEmailFunction("infomaple0@gmail.com","New Work Rquest has been created for Catering" ,"New Catering has been registered.Please login to the system and verify it" );

            } else if(role.equalsIgnoreCase("TRAVEL AGENT ADMIN")){
                //insert in HCT table
                TravelAgent hotelData = new TravelAgent();
                hotelData.setTravelAgentID(enterpriseController.getAllTravelData().size()+1); //TODO: generate
                hotelData.setTravelAgentName(companyName);
                hotelData.setBookedDates("");
                hotelData.setCapacity(capacity);
                hotelData.setEmail(email);
                hotelData.setTravelAgentAddress(address);
                hotelData.setTravelAgentAdmin(String.valueOf(ID));
                hotelData.setTravelAgentArea(area);
                hotelData.setPhone(phoneNum);
                hotelData.setPhoto(path);
                hotelData.setStatus("PENDING");

                enterpriseController.insertTravelData(hotelData);
                
                
                //Create WorkRequest
                WorkRequest wr = new WorkRequest();
                wr.setID(workRequestController.getAllWorkRequestData().size()+1);
                wr.setType("TRAVELADMIN_BUSINESSADMIN");
                wr.setFromID(ID);
                wr.setToID(1); //TODO: pass businessAdmin Id
                wr.setStatus("PENDING");
                wr.setEventID(0);
                wr.setEventManagerID(0);
                workRequestController.createWorkRequest(wr);
                sendMail.sendEmailFunction("infomaple0@gmail.com","New Work Rquest has been created for Travel" ,"New Travel has been registered.Please login to the system and verify it" );

            }
            
            jNameTextField.setText("");
            jEmailTextField.setText("");
            jPhoneNumberTextField.setText("");
            jUsernameTextField.setText("");
            jPasswordTextField.setText("");
            jConfirmPasswordTextField.setText("");
            jUserPhoto.setIcon(null);
            jPostalCodeTextField.setText("");
            jAddress.setText("");
            jType.setText("");
            jCapacity.setText("");
            jCompanyName.setText("");
            jArea.setText("");
//            disableAdditionalFields();
            jEnterprise.setVisible(false);
            jUserPhoto.setIcon(new ImageIcon(getClass().getResource("/com/maple/icons/user.png"))); 
            
            
            jConfirmPasswordTextField.setBackground(new Color(255, 255, 255));
            jUsernameTextField.setBackground(new Color(255, 255, 255));
            jNameTextField.setBackground(new Color(255, 255, 255));
            jEmailTextField.setBackground(new Color(255, 255, 255));
                    jPhoneNumberTextField.setBackground(new Color(255, 255, 255));
                            jUsernameTextField.setBackground(new Color(255, 255, 255));
                            jPasswordTextField.setBackground(new Color(255, 255, 255));
                                    jPostalCodeTextField.setBackground(new Color(255, 255, 255));
                                    jAddress.setBackground(new Color(255, 255, 255));
                                            jType.setBackground(new Color(255, 255, 255));
                                            jCapacity.setBackground(new Color(255, 255, 255));
                                                    jCompanyName.setBackground(new Color(255, 255, 255));
                                                    jArea.setBackground(new Color(255, 255, 255));

            } catch (SQLException ex) {
                Logger.getLogger(RegisterJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jRegisterBtnActionPerformed

    private void jEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmailTextFieldActionPerformed

    private void jConfirmPasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmPasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConfirmPasswordTextFieldActionPerformed

    private void jUserPhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUserPhotoMouseClicked

//        //Upload image
//        JFileChooser jFileChooser = new JFileChooser();
//        jFileChooser.showOpenDialog(null);
//        File file = jFileChooser.getSelectedFile();
//        if(file == null){ // If no image is selected
//            //show validation
//            return;
//        }
//        String filename = file.getAbsolutePath().replace("\\", "\\\\");
//        this.path = filename;
//        ImageIcon icon = new ImageIcon(filename);
//        jUserPhoto.setIcon(icon);
        
        


        JFileChooser img_upload = new JFileChooser();
        img_upload.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = img_upload.showDialog(null, "Choose my file");
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = img_upload.getSelectedFile();
            String path = file.getAbsolutePath().replace("\\", "\\\\");
            this.path = path;
            try {
                Image photo = ImageIO.read(file).getScaledInstance(65, 105, 65);
//                user.setPhoto(photo);
                jUserPhoto.setIcon(new ImageIcon(photo));
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error while saving image.");
            }
        }
        else{
                JOptionPane.showMessageDialog(this, "Upload is cancelled.");
            }
    }//GEN-LAST:event_jUserPhotoMouseClicked

    private void jUserPhotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUserPhotoMouseEntered

        //Change Cursor
        jUserPhoto.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jUserPhoto.setBorderSize(2);

    }//GEN-LAST:event_jUserPhotoMouseEntered
    
    public static boolean valCellNo(String input){
        String emailRegex = "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$";
        Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(input);
        return matcher.find();
    }
    
    public static boolean valEmail(String input){
        String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(input);
        return matcher.find();
    }
    
    private void jUserPhotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUserPhotoMouseExited
        // TODO add your handling code here:
        jUserPhoto.setBorderSize(0);
    }//GEN-LAST:event_jUserPhotoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.maple.resources.TextField jAddress;
    private com.maple.resources.TextField jArea;
    private com.maple.resources.TextField jCapacity;
    private com.maple.resources.TextField jCompanyName;
    private com.maple.resources.TextField jConfirmPasswordTextField;
    private com.maple.resources.TextField jEmailTextField;
    private javax.swing.JPanel jEnterprise;
    private javax.swing.JLabel jLocation;
    private com.maple.resources.TextField jNameTextField;
    private javax.swing.JPanel jPanel2;
    private com.maple.resources.TextField jPasswordTextField;
    private com.maple.resources.TextField jPhoneNumberTextField;
    private com.maple.resources.TextField jPostalCodeTextField;
    private javax.swing.JComboBox<String> jRegisterAsComboBox;
    private com.maple.resources.Button jRegisterBtn;
    private com.maple.resources.TextField jType;
    private com.maple.resources.ImageAvatar jUserPhoto;
    private com.maple.resources.TextField jUsernameTextField;
    // End of variables declaration//GEN-END:variables
}
