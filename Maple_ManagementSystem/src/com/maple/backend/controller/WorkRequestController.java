/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.controller;

import com.maple.backend.model.Catering;
import com.maple.backend.model.Hotel;
import com.maple.backend.model.TravelAgent;
import com.maple.backend.model.WorkRequest;
import com.maple.backend.service.WorkRequestService;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mohammedomerqasimshaik
 */
public class WorkRequestController {
    
    WorkRequestService workRequestService; 

    public WorkRequestController() throws SQLException {
        workRequestService = new WorkRequestService();
    }
    
    // get workRequest based on toId
    public ArrayList<WorkRequest> getWorkRequestByRoleService(int toId) throws SQLException{
        return workRequestService.getWorkRequestByRole(toId);
    }
      
    // get enterprise data from HOTEL table based on toId
    public ArrayList<Hotel> getHotelEnterpriseData(int toId) throws SQLException{
        return workRequestService.getHotelDataService(toId);
    }
    
    // get enterprise data from CATERING table based on toId
    public ArrayList<Catering> getCateringEnterpriseData(int toId) throws SQLException{
        return workRequestService.getCateringDataService(toId);
    }

    // get enterprise data from TRAVELAGENT table based on toId
    public ArrayList<TravelAgent> getTravelAgentEnterpriseData(int toId) throws SQLException{
        return workRequestService.getTravelAgentDataService(toId);
    }
    
}
