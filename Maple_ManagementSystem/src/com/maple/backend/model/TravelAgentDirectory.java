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
public class TravelAgentDirectory {
    
    private ArrayList<TravelAgent> travelagentList;

    public ArrayList<TravelAgent> getTravelAgentList() {
        return travelagentList;
    }

    public void setTravelAgentList(ArrayList<TravelAgent> travelagentList) {
        this.travelagentList = travelagentList;
    }
    
    
    //Add travelagent profile
    public void addTravelAgent(TravelAgent travelagent) {
        travelagentList.add(travelagent);
    }

    //Update travelagent profile
    public void updateTravelAgent(TravelAgent travelagent, ArrayList<TravelAgent> list) {
        //Iterate to find travelagentID
        for (TravelAgent tragt : list) {
            if (travelagent.getTravelAgentID() == tragt.getTravelAgentID()) {
                tragt.setTravelAgentID(travelagent.getTravelAgentID());
                tragt.setTravelAgentAddress(travelagent.getTravelAgentAddress());
                tragt.setTravelAgentName(travelagent.getTravelAgentName());
                tragt.setTravelAgentArea(travelagent.getTravelAgentArea());
                tragt.setTravelAgentType(travelagent.getTravelAgentType());
                tragt.setPhoto(travelagent.getPhoto());
                tragt.setCapacity(travelagent.getCapacity());
                tragt.setBookedDates(travelagent.getBookedDates());
                tragt.setTravelAgentAdmin(travelagent.getTravelAgentAdmin());
            }
        }
    }
    
    //Remove travelagent profile
    public void removeTravelAgent(TravelAgent travelagent){
       travelagentList.remove(travelagent);
    }
}
