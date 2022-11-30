/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.model;

import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author bharv
 */
public class TravelAgent {
    
    public int travelAgentID;
    public String travelAgentAddress;
    public String travelAgentName;
    public String travelAgentArea;
    public String travelAgentType;
    public ImageIcon photo;
    public String capacity;
    public Date bookedDates;
    public String travelAgentAdmin;

    public int getTravelAgentID() {
        return travelAgentID;
    }

    public void setTravelAgentID(int travelAgentID) {
        this.travelAgentID = travelAgentID;
    }

    public String getTravelAgentAddress() {
        return travelAgentAddress;
    }

    public void setTravelAgentAddress(String travelAgentAddress) {
        this.travelAgentAddress = travelAgentAddress;
    }

    public String getTravelAgentName() {
        return travelAgentName;
    }

    public void setTravelAgentName(String travelAgentName) {
        this.travelAgentName = travelAgentName;
    }

    public String getTravelAgentArea() {
        return travelAgentArea;
    }

    public void setTravelAgentArea(String travelAgentArea) {
        this.travelAgentArea = travelAgentArea;
    }

    public String getTravelAgentType() {
        return travelAgentType;
    }

    public void setTravelAgentType(String travelAgentType) {
        this.travelAgentType = travelAgentType;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public Date getBookedDates() {
        return bookedDates;
    }

    public void setBookedDates(Date bookedDates) {
        this.bookedDates = bookedDates;
    }

    public String getTravelAgentAdmin() {
        return travelAgentAdmin;
    }

    public void setTravelAgentAdmin(String travelAgentAdmin) {
        this.travelAgentAdmin = travelAgentAdmin;
    }
    
    
    
}
