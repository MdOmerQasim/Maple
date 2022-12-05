/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.service;

import com.maple.backend.model.Hotel;
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
    
    
    
}
