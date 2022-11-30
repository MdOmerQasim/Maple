/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.model;

import java.util.Date;

/**
 *
 * @author bharv
 */
public class WorkRequest {
    
    public int ID;
    public String type;
    public Date fromID;
    public Date toID;
    public String status;
    public int eventID;
    public int eventManagerID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getFromID() {
        return fromID;
    }

    public void setFromID(Date fromID) {
        this.fromID = fromID;
    }

    public Date getToID() {
        return toID;
    }

    public void setToID(Date toID) {
        this.toID = toID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getEventManagerID() {
        return eventManagerID;
    }

    public void setEventManagerID(int eventManagerID) {
        this.eventManagerID = eventManagerID;
    }
    
    
    
}
