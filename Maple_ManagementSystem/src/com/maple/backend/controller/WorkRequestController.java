/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.controller;

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
    
}
