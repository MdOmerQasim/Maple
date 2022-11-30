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
public class Hotel {
    
    public int hotelID;
    public String hotelAddress;
    public String hotelName;
    public String hotelArea;
    public String hotelType;
    public ImageIcon photo;
    public String capacity;
    public Date bookedDates;
    public String hotelAdmin;

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelArea() {
        return hotelArea;
    }

    public void setHotelArea(String hotelArea) {
        this.hotelArea = hotelArea;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
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

    public String getHotelAdmin() {
        return hotelAdmin;
    }

    public void setHotelAdmin(String hotelAdmin) {
        this.hotelAdmin = hotelAdmin;
    }


    
    
}
