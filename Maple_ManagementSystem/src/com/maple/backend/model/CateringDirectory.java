/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.model;

import java.util.ArrayList;

/**
 *
 * @author bharv
 */
public class CateringDirectory {
    
    private ArrayList<Catering> cateringList;

    public ArrayList<Catering> getCateringList() {
        return cateringList;
    }

    public void setCateringList(ArrayList<Catering> cateringList) {
        this.cateringList = cateringList;
    }
    
    
    //Add catering profile
    public void addCatering(Catering catering) {
        cateringList.add(catering);
    }

    //Update catering profile
    public void updateCatering(Catering catering, ArrayList<Catering> list) {
        //Iterate to find cateringID
        for (Catering cat : list) {
            if (catering.getCateringID() == cat.getCateringID()) {
                cat.setCateringID(catering.getCateringID());
                cat.setCateringAddress(catering.getCateringAddress());
                cat.setCateringName(catering.getCateringName());
                cat.setCateringArea(catering.getCateringArea());
                cat.setCateringType(catering.getCateringType());
                cat.setPhoto(catering.getPhoto());
                cat.setCapacity(catering.getCapacity());
                cat.setBookedDates(catering.getBookedDates());
                cat.setCateringAdmin(catering.getCateringAdmin());
            }
        }
    }
    
    //Remove catering profile
    public void removeCatering(Catering catering){
       cateringList.remove(catering);
    }
    
}
