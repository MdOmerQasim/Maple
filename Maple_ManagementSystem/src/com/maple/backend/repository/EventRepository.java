/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.repository;

import com.maple.DBConnection.JDBC;
import com.maple.backend.model.Event;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author deva
 */
public class EventRepository {
    JDBC obj;

    public EventRepository() throws SQLException {
        obj = new JDBC();
    }
    
    public void createAnEvent(Event newEvent) throws SQLException{
        String fetchQuery = "INSERT";
        this.obj.update(fetchQuery, new String[]{});        
    }
     
    public ResultSet getEventData() throws SQLException{
        String fetchQuery = "SELECT * FROM EVENTS";
        return this.obj.query(fetchQuery, new String[]{});           
    }
}
