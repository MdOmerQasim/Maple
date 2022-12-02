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
public class EventDirectory {
    
    private ArrayList<Event> eventList;

    public ArrayList<Event> getEventList() {
        return eventList;
    }

    public void setEventList(ArrayList<Event> eventList) {
        this.eventList = eventList;
    }
    
    
    //Add event profile
    public void addEvent(Event event) {
        eventList.add(event);
    }

    //Update event profile
    public void updateEvent(Event event, ArrayList<Event> list) {
        //Iterate to find eventID
        for (Event eve : list) {
            if (event.getEventID() == eve.getEventID()) {
                eve.setEventID(event.getEventID());
                eve.setUserID(event.getUserID());
                eve.setEventType(event.getEventType());
                eve.setEventName(event.getEventName());
                eve.setEventDescription(event.getEventDescription());
                eve.setEventArea(event.getEventArea());
                eve.setAtendeesCount(event.getAtendeesCount());
                eve.setServicesNeeded(event.getServicesNeeded());
                eve.setEventFrom(event.getEventFrom());
                eve.setEventTo(event.getEventTo());
                eve.setEventManagerID(event.getEventManagerID());
                eve.setChosenHotelID(event.getChosenHotelID());
                eve.setChosenCateringID(event.getChosenCateringID());
                eve.setChosenTravelAgentID(event.getChosenTravelAgentID());
            }
        }
    }
    
    //Remove event profile
    public void removeEvent(Event event){
       eventList.remove(event);
    }
    
}
