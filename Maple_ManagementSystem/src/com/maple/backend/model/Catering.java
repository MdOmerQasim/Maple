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
public class Catering {
    
    public int cateringID;
    public String cateringAddress;
    public String cateringName;
    public String cateringArea;
    public String cateringType;
    public ImageIcon photo;
    public String capacity;
    public Date bookedDates;
    public String cateringAdmin;

    public int getCateringID() {
        return cateringID;
    }

    public void setCateringID(int cateringID) {
        this.cateringID = cateringID;
    }

    public String getCateringAddress() {
        return cateringAddress;
    }

    public void setCateringAddress(String cateringAddress) {
        this.cateringAddress = cateringAddress;
    }

    public String getCateringName() {
        return cateringName;
    }

    public void setCateringName(String cateringName) {
        this.cateringName = cateringName;
    }

    public String getCateringArea() {
        return cateringArea;
    }

    public void setCateringArea(String cateringArea) {
        this.cateringArea = cateringArea;
    }

    public String getCateringType() {
        return cateringType;
    }

    public void setCateringType(String cateringType) {
        this.cateringType = cateringType;
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

    public String getCateringAdmin() {
        return cateringAdmin;
    }

    public void setCateringAdmin(String cateringAdmin) {
        this.cateringAdmin = cateringAdmin;
    }
    
    
}
