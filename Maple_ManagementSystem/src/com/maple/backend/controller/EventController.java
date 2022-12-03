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
import java.util.Date;

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
    
     // Get User events
    public ArrayList<Event> getFilteredEventsList(int userid, String status, Date date, String type) throws SQLException{
        return eventService.getFilteredEventsListService(userid, status, date, type);
    }
    
    // Create Event    
     public void createAnEvent(Event newEvent) throws SQLException{
        eventService.createAnEventService(newEvent);
    }
}
