/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.maple.frontend.hotelAdminScreen;

import com.maple.backend.model.User;
import java.util.ArrayList;

/**
 *
 * @author mohammedomerqasimshaik
 */
public class HotelAdminRequest extends javax.swing.JPanel {

    /**
     * Creates new form HotelAdminRequest
     */
    
    ArrayList<User> userData;

    public HotelAdminRequest(ArrayList<User> userData) {
        initComponents();
        this.userData = userData;

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
        jHotelCard = new com.maple.resources.Card();

        jRoute.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jRoute.setForeground(new java.awt.Color(4, 72, 210));
        jRoute.setText("Admin / Requests");

        jHotelCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHotelCardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jHotelCardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jHotelCardMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jHotelCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRoute))
                .addContainerGap(904, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jRoute)
                .addGap(20, 20, 20)
                .addComponent(jHotelCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(519, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jHotelCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHotelCardMouseClicked

       

    }//GEN-LAST:event_jHotelCardMouseClicked

    private void jHotelCardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHotelCardMouseEntered
       
    }//GEN-LAST:event_jHotelCardMouseEntered

    private void jHotelCardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHotelCardMouseExited
        
    }//GEN-LAST:event_jHotelCardMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.maple.resources.Card jHotelCard;
    private javax.swing.JLabel jRoute;
    // End of variables declaration//GEN-END:variables
}