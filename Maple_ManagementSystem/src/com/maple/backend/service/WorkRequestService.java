/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.service;

import com.maple.backend.model.Catering;
import com.maple.backend.model.Hotel;
import com.maple.backend.model.TravelAgent;
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
    
    private ArrayList<Hotel> hotelDataMapper(ResultSet rs) throws SQLException{
        ArrayList<Hotel> hotelList = new ArrayList<>();
        //Mapping logic
        while(rs.next()){
            Hotel hotel = new Hotel();
            hotel.setHotelID(Integer.parseInt(rs.getString("H_ID")));
            hotel.setHotelName(rs.getString("H_NAME"));
            hotel.setHotelAddress(rs.getString("H_ADDRESS"));
            hotel.setHotelArea(rs.getString("H_AREA"));
            hotel.setHotelType(rs.getString("H_TYPE"));
            hotel.setCapacity(rs.getString("H_CAPACITY"));
            hotel.setHotelAdmin(rs.getString("H_ADMIN_ID"));
            hotel.setBookedDates(rs.getString("H_BOOKED_DATES"));
            hotel.setPhoto(rs.getString("H_PHOTO"));
            hotel.setEmail(rs.getString("H_EMAIL"));
            hotel.setPhone(rs.getString("H_PHONE"));
            hotelList.add(hotel);
        }
        return hotelList;
    }
    
    private ArrayList<Catering> cateringDataMapper(ResultSet rs) throws SQLException{
        ArrayList<Catering> cateringList = new ArrayList<>();
        //Mapping logic
        while(rs.next()){
            Catering catering = new Catering();
            catering.setCateringID(Integer.parseInt(rs.getString("C_ID")));
            catering.setCateringName(rs.getString("C_NAME"));
//            wk.setFromID(Integer.parseInt(rs.getString("FROM_ID")));
//            wk.setToID(Integer.parseInt(rs.getString("TO_ID")));
//            wk.setStatus(rs.getString("STATUS"));
//            wk.setEventID(Integer.parseInt(rs.getString("EVENT_ID")));
//            wk.setEventManagerID(Integer.parseInt(rs.getString("EVENT_MANAGER_ID")));

            cateringList.add(catering);
        }
        return cateringList;
    }
    
    private ArrayList<TravelAgent> travelAgentDataMapper(ResultSet rs) throws SQLException{
        ArrayList<TravelAgent> travelAgentList = new ArrayList<>();
        //Mapping logic
        while(rs.next()){
            TravelAgent travelAgent = new TravelAgent();
            travelAgent.setTravelAgentID(Integer.parseInt(rs.getString("TA_ID")));
            travelAgent.setTravelAgentName(rs.getString("TA_NAME"));
//            wk.setFromID(Integer.parseInt(rs.getString("FROM_ID")));
//            wk.setToID(Integer.parseInt(rs.getString("TO_ID")));
//            wk.setStatus(rs.getString("STATUS"));
//            wk.setEventID(Integer.parseInt(rs.getString("EVENT_ID")));
//            wk.setEventManagerID(Integer.parseInt(rs.getString("EVENT_MANAGER_ID")));

            travelAgentList.add(travelAgent);
        }
        return travelAgentList;
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
    
    public ArrayList<Hotel> getHotelDataService(int toId)throws SQLException{
        ArrayList<Hotel> hotelDataList = new ArrayList<>();
        ResultSet resultSet = workRequestRepository.getHotelData(toId);
        hotelDataList = hotelDataMapper(resultSet);
        return hotelDataList; 
    }
    
    public ArrayList<Catering> getCateringDataService(int toId)throws SQLException{
        ArrayList<Catering> cateringDataList = new ArrayList<>();
        ResultSet resultSet = workRequestRepository.getCateringData(toId);
        cateringDataList = cateringDataMapper(resultSet);
        return cateringDataList; 
    }
    
    public ArrayList<TravelAgent> getTravelAgentDataService(int toId)throws SQLException{
        ArrayList<TravelAgent> travelAgentDataList = new ArrayList<>();
        ResultSet resultSet = workRequestRepository.getTravelAgentData(toId);
        travelAgentDataList = travelAgentDataMapper(resultSet);
        return travelAgentDataList; 
    }
    
    public ArrayList<WorkRequest> getWorkRequestByEventID(int eventId) throws SQLException{
        ArrayList<WorkRequest> filteredWorkRequestList = new ArrayList<>();
        ResultSet resultSet = workRequestRepository.getWorkRequestData();
        ArrayList<WorkRequest> workRequestList = workRequestDataMapper(resultSet);
        
        workRequestList.stream()
                .filter(wk -> wk.getEventID()==eventId)
                .forEach(wk -> filteredWorkRequestList.add(wk));
        
        return filteredWorkRequestList;
    }
    
}
