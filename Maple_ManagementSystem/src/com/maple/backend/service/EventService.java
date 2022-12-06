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
import java.util.Date;
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
            System.out.println("use service");
        } catch (SQLException ex) {
            Logger.getLogger(EventService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    all events
    public ArrayList<Event> getEventsListService() throws SQLException{
        
        ArrayList<Event> eventsDataList = new ArrayList<>();
        ResultSet resultSet = eventRepository.getEventData();
        System.out.println("dataaaa");
        eventsDataList = eventDataMapper(resultSet);
        System.out.println("eventlistt");
        return eventsDataList; 
    
    }
    
//    user specific events
    public ArrayList<Event> getFilteredEventsListService(int userid, String status, String type) throws SQLException{
        ArrayList<Event> eventsDataList = new ArrayList<>();
        ResultSet resultSet = eventRepository.getFilteredEventData(userid, status, type);
        eventsDataList = eventDataMapper(resultSet);
        return eventsDataList; 
    }
    
    private ArrayList<Event> eventDataMapper(ResultSet rs) throws SQLException{
        ArrayList<Event> eventList = new ArrayList<>();
        //Mapping logic
        while(rs.next()){
            Event event = new Event();
            event.setEventID(rs.getInt("event_id"));
            event.setUserID(rs.getInt("event_user_id"));
            event.setEventManagerID(rs.getInt("event_manager_id"));
            event.setChosenHotelID(rs.getInt("chosen_hotel_id"));
            event.setChosenCateringID(rs.getInt("chosen_catering_id"));
            event.setChosenTravelAgentID(rs.getInt("chosen_travel_id"));
            event.setEventType(rs.getString("event_type"));
            event.setEventName(rs.getString("event_name"));
            event.setEventDescription(rs.getString("event_description"));
            event.setEventArea(rs.getString("event_area"));
            event.setAtendeesCount(rs.getString("attendees_count"));
            event.setEventFrom(rs.getString("event_from"));
            event.setEventTo(rs.getString("event_to"));
            event.setAccomodationNeeded(rs.getString("accomodation_needed"));
            event.setAccomodationCount(rs.getInt("accomodation_count"));
            event.setFunctionHallNeeded(rs.getString("function_hall_needed"));
            event.setFunctionHallCount(rs.getInt("function_hall_count"));
            event.setCateringNeeded(rs.getString("catering_needed"));
            event.setCateringCount(rs.getInt("catering_count"));
            event.setTravelNeeded(rs.getString("travel_needed"));
            event.setTravelCount(rs.getInt("travel_count"));

            eventList.add(event);
        }
        return eventList;
        
        
    }
}
