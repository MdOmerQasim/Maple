/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.controller;

import com.maple.backend.model.Event;
import com.maple.backend.model.WorkRequest;
import com.maple.backend.service.EventService;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mohammedomerqasimshaik
 */
public class EventController {
    EventService eventService;
    
    public EventController() throws SQLException {
        eventService = new EventService();
    }
    
    // Get all events
    public ArrayList<Event> getEventsList() throws SQLException{
        return eventService.getEventsListService();
    }
    
    // Create Event    
     public void createAnEvent(Event newEvent) throws SQLException{
        eventService.createAnEventService(newEvent);
    }
}
