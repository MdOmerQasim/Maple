/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.service;

import com.maple.backend.model.Event;
import com.maple.backend.model.Hotel;
import com.maple.backend.model.WorkRequest;
import com.maple.backend.repository.EventRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohammedomerqasimshaik
 */
public class EventService {
    EventRepository eventRepository;

    public EventService() throws SQLException {
        eventRepository = new EventRepository();
    }
    
    public void createAnEventService(Event newEvent) {
        try {
            eventRepository.createAnEvent(newEvent);
        } catch (SQLException ex) {
            Logger.getLogger(EventService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Event> getEventsListService() throws SQLException{
        ArrayList<Event> eventsDataList = new ArrayList<>();
        ResultSet resultSet = eventRepository.getEventData();
        eventsDataList = eventDataMapper(resultSet);
        return eventsDataList; 
    }
    
    private ArrayList<Event> eventDataMapper(ResultSet rs) throws SQLException{
        ArrayList<Event> eventList = new ArrayList<>();
        //Mapping logic
        while(rs.next()){
            Event event = new Event();
            event.setEventID(rs.getInt("event id"));
            event.setUserID(rs.getInt("user id"));
            event.setEventManagerID(rs.getInt("user id"));
            event.setChosenHotelID(rs.getInt("user id"));
            event.setChosenCateringID(rs.getInt("user id"));
            event.setChosenTravelAgentID(rs.getInt("user id"));
            event.setEventType(rs.getString("type"));
            event.setEventName(rs.getString("name"));
            event.setEventDescription(rs.getString("descrip"));
            event.setEventArea(rs.getString("area"));
            event.setAtendeesCount(rs.getString("attendees"));
            event.setEventFrom(rs.getDate("From date"));
            event.setEventTo(rs.getDate("To date"));
            event.setAccomodationNeeded(rs.getBoolean("AccomodationNeeded"));
            event.setAccomodationCount(rs.getInt("acco count"));
            event.setFunctionHallNeeded(rs.getBoolean("func hall needed"));
            event.setFunctionHallCount(rs.getInt("function hall count"));
            event.setCateringNeeded(rs.getBoolean("caterNEeeded"));
            event.setCateringCount(rs.getInt("cater count"));
            event.setTravelNeeded(rs.getBoolean("travelNeeded"));
            event.setTravelCount(rs.getInt("travel count"));

            eventList.add(event);
        }
        return eventList;
    }
}
