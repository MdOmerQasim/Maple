/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.service;

import com.maple.backend.model.Catering;
import com.maple.backend.model.Hotel;
import com.maple.backend.model.TravelAgent;
import com.maple.backend.repository.EnterpriseRepository;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author mohammedomerqasimshaik
 */
public class EnterpriseService {
    
    EnterpriseRepository enterpriseRepository;

    public EnterpriseService() throws SQLException {
        enterpriseRepository = new EnterpriseRepository();
    }
    
    private ArrayList<Hotel> hotelMapper(ResultSet resultSet) throws SQLException{
        ArrayList<Hotel> hotelData = new ArrayList<>();
        
        while(resultSet.next()){
            Hotel hotel = new Hotel();
            hotel.setHotelID(Integer.parseInt(resultSet.getString("H_ID")));
            hotel.setHotelName(resultSet.getString("H_NAME"));
            hotel.setHotelAddress(resultSet.getString("H_ADDRESS"));
            hotel.setHotelArea(resultSet.getString("H_AREA"));
            hotel.setHotelType(resultSet.getString("H_TYPE"));
            hotel.setCapacity(resultSet.getString("H_CAPACITY"));
            hotel.setHotelAdmin(resultSet.getString("H_ADMIN_ID"));
            hotel.setBookedDates(resultSet.getString("H_BOOKED_DATES"));
            hotel.setPhoto(resultSet.getString("H_PHOTO"));
            hotel.setEmail(resultSet.getString("H_EMAIL"));
            hotel.setPhone(resultSet.getString("H_PHONE"));
            hotel.setStatus(resultSet.getString("H_STATUS"));
            hotelData.add(hotel);
        }
        
        return hotelData; 
    }
    
    private ArrayList<Catering> cateringMapper(ResultSet resultSet) throws SQLException{
        ArrayList<Catering> cateringData = new ArrayList<>();
        
        while(resultSet.next()){
            Catering cater = new Catering();
            cater.setCateringID(Integer.parseInt(resultSet.getString("C_ID")));
            cater.setCateringName(resultSet.getString("C_NAME"));
            cater.setCateringAddress(resultSet.getString("C_ADDRESS"));
            cater.setCateringArea(resultSet.getString("C_AREA"));
            cater.setPhoto(resultSet.getString("C_PHOTO"));
            cater.setCapacity(resultSet.getString("C_CAPACITY"));
            cater.setBookedDates(resultSet.getString("C_BOOKED_DATES"));
//            cater.set
            cater.setCateringAdmin(resultSet.getString("C_ADMIN"));

            
//            hotel.setHotelID(Integer.parseInt(resultSet.getString("H_ID")));
//            hotel.setHotelName(resultSet.getString("H_NAME"));
//            hotel.setHotelAddress(resultSet.getString("H_ADDRESS"));
//            hotel.setHotelArea(resultSet.getString("H_AREA"));
//            hotel.setHotelType(resultSet.getString("H_TYPE"));
            cater.setEmail(resultSet.getString("C_EMAIL"));
            cater.setPhone(resultSet.getString("C_PHONE"));
            cater.setStatus(resultSet.getString("C_STATUS"));
            cateringData.add(cater);
        }
        
        return cateringData; 
    }
    
    private ArrayList<TravelAgent> travelMapper(ResultSet resultSet) throws SQLException{
        ArrayList<TravelAgent> travelData = new ArrayList<>();
        
        while(resultSet.next()){
            TravelAgent t = new TravelAgent();
            t.setTravelAgentID(Integer.parseInt(resultSet.getString("TA_ID")));
            t.setTravelAgentName(resultSet.getString("TA_NAME"));
            t.setTravelAgentAddress(resultSet.getString("TA_ADDRESS"));
            t.setTravelAgentArea(resultSet.getString("TA_AREA"));
//            hotel.setHotelType(resultSet.getString("H_TYPE"));
            t.setCapacity(resultSet.getString("TA_CAPACITY"));
            t.setTravelAgentAdmin(resultSet.getString("TA_ADMIN"));
            t.setBookedDates(resultSet.getString("TA_BOOKED_DATES"));
            t.setPhoto(resultSet.getString("TA_PHOTO"));
            t.setEmail(resultSet.getString("TA_EMAIL"));
            t.setPhone(resultSet.getString("TA_PHONE"));
            t.setStatus(resultSet.getString("TA_STATUS"));
            travelData.add(t);
        }
        
        return travelData; 
    }
    
    public ResultSet getEnterpriseDataService(String type, int id) throws SQLException{
        return enterpriseRepository.getEnterpriseData(type, id);
    }
    
    public void insertHotelDataService(Hotel hotelData) throws SQLException{
        enterpriseRepository.insertHotelData(hotelData);
    }
    
    public ArrayList<Hotel> getAllHotelDataService() throws SQLException{
        ResultSet resultSet = enterpriseRepository.getAllHotelData();
        return hotelMapper(resultSet);
    }
    
    public ArrayList<Catering> getAllCateringDataService() throws SQLException{
        ResultSet resultSet = enterpriseRepository.getAllCateringData();
        return cateringMapper(resultSet);
    }
    
    public ArrayList<TravelAgent> getAllTravelDataService() throws SQLException{
        ResultSet resultSet = enterpriseRepository.getAllTravelData();
        return travelMapper(resultSet);
    }
    
    
}
