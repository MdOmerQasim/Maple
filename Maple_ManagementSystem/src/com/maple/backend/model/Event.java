/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mohammedomerqasimshaik
 */
public class Event {

    public int eventID;
    public int userID;
    public String eventType;
    public String eventName;
    public String eventDescription;
    public String eventArea;
    public String atendeesCount;
    public ArrayList<EventServiceClass> servicesNeeded;
    public Date eventFrom;
    public Date eventTo;
    public int eventManagerID;
    public int chosenHotelID;
    public int chosenCateringID;
    public int chosenTravelAgentID;

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventArea() {
        return eventArea;
    }

    public void setEventArea(String eventArea) {
        this.eventArea = eventArea;
    }

    public String getAtendeesCount() {
        return atendeesCount;
    }

    public void setAtendeesCount(String atendeesCount) {
        this.atendeesCount = atendeesCount;
    }

    public ArrayList<EventServiceClass> getServicesNeeded() {
        return servicesNeeded;
    }

    public void setServicesNeeded(ArrayList<EventServiceClass> servicesNeeded) {
        this.servicesNeeded = servicesNeeded;
    }

    public Date getEventFrom() {
        return eventFrom;
    }

    public void setEventFrom(Date eventFrom) {
        this.eventFrom = eventFrom;
    }

    public Date getEventTo() {
        return eventTo;
    }

    public void setEventTo(Date eventTo) {
        this.eventTo = eventTo;
    }

    public int getEventManagerID() {
        return eventManagerID;
    }

    public void setEventManagerID(int eventManagerID) {
        this.eventManagerID = eventManagerID;
    }

    public int getChosenHotelID() {
        return chosenHotelID;
    }

    public void setChosenHotelID(int chosenHotelID) {
        this.chosenHotelID = chosenHotelID;
    }

    public int getChosenCateringID() {
        return chosenCateringID;
    }

    public void setChosenCateringID(int chosenCateringID) {
        this.chosenCateringID = chosenCateringID;
    }

    public int getChosenTravelAgentID() {
        return chosenTravelAgentID;
    }

    public void setChosenTravelAgentID(int chosenTravelAgentID) {
        this.chosenTravelAgentID = chosenTravelAgentID;
    }
    
    @Override
    public String toString() {
        return "Event{" + "eventID=" + eventID + ", userID=" + userID + ", eventType=" + eventType + ", eventName=" + eventName + ", eventDescription=" + eventDescription + ", eventArea=" + eventArea + ", atendeesCount=" + atendeesCount + ", servicesNeeded=" + servicesNeeded + ", eventFrom=" + eventFrom + ", eventTo=" + eventTo + ", eventManagerID=" + eventManagerID + ", chosenHotelID=" + chosenHotelID + ", chosenCateringID=" + chosenCateringID + ", chosenTravelAgentID=" + chosenTravelAgentID + '}';
    }
}
