/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.service;

import com.maple.backend.model.WorkRequest;
import com.maple.backend.repository.WorkRequestRepository;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author mohammedomerqasimshaik
 */
public class WorkRequestService {
    
    WorkRequestRepository workRequestRepository;

    public WorkRequestService() throws SQLException {
        workRequestRepository = new WorkRequestRepository();
    }
    
    private ArrayList<WorkRequest> workRequestDataMapper(ResultSet rs) throws SQLException{
        ArrayList<WorkRequest> workRequestList = new ArrayList<>();
        //Mapping logic
        while(rs.next()){
            WorkRequest wk = new WorkRequest();
            wk.setID(Integer.parseInt(rs.getString("WK_ID")));
            wk.setType(rs.getString("TYPE"));
            wk.setFromID(Integer.parseInt(rs.getString("FROM_ID")));
            wk.setToID(Integer.parseInt(rs.getString("TO_ID")));
            wk.setStatus(rs.getString("STATUS"));
            wk.setEventID(Integer.parseInt(rs.getString("EVENT_ID")));
            wk.setEventManagerID(Integer.parseInt(rs.getString("EVENT_MANAGER_ID")));

            workRequestList.add(wk);
        }
        return workRequestList;
    }
    
    public ArrayList<WorkRequest> getWorkRequestByRole(int toId) throws SQLException{
        ArrayList<WorkRequest> filteredWorkRequestList = new ArrayList<>();
        ResultSet resultSet = workRequestRepository.getWorkRequestData();
        ArrayList<WorkRequest> workRequestList = workRequestDataMapper(resultSet);
        
        workRequestList.stream()
                .filter(wk -> wk.getToID()==toId)
                .forEach(wk -> filteredWorkRequestList.add(wk));
        
        return filteredWorkRequestList;
    }
    
}
