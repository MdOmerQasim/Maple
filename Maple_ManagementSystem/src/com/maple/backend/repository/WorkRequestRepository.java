/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.repository;

import com.maple.DBConnection.JDBC;
import com.maple.backend.model.WorkRequest;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mohammedomerqasimshaik
 */
public class WorkRequestRepository {
    
    JDBC obj;

    public WorkRequestRepository() throws SQLException {
        obj = new JDBC();
    }
    
    public ResultSet getWorkRequestData() throws SQLException{
        String fetchQuery = "SELECT * FROM WORK_REQUEST";
        return this.obj.query(fetchQuery, new String[]{});           
    }
    
//    public void addWorkRequestData(WorkRequest workRequest) throws SQLException{
//        String insertQuery = "INSERT INTO WORK_REQUEST";
//        this.obj.update(insertQuery, new String[]{});           
//    }
    
//    public void updateWorkRequestDataStatus(int wkId, String status) throws SQLException{
//        String updateQuery = "UPDATE WORK_REQUEST SET event_name = 'newestName' WHERE WK_ID = '1'";
//        this.obj.update(updateQuery, new String[]{});           
//    }
    
//    public void updateWorkRequestDataEventId(int wkId, int eventId) throws SQLException{
//        String updateQuery = "UPDATE WORK_REQUEST SET event_name = 'newestName' WHERE WK_ID = '1'";
//        this.obj.update(updateQuery, new String[]{});           
//    }
    
//    public void updateWorkRequestDataEventManagerId(int wkId, int eventManagerId) throws SQLException{
//        String updateQuery = "UPDATE WORK_REQUEST SET event_name = 'newestName' WHERE WK_ID = '1'";
//        this.obj.update(updateQuery, new String[]{});           
//    }
   
    
    
}
