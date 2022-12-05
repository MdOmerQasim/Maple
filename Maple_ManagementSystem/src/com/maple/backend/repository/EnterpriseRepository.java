/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.repository;

import com.maple.DBConnection.JDBC;
import com.maple.backend.model.Hotel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mohammedomerqasimshaik
 */
public class EnterpriseRepository {
    
    JDBC obj;

    public EnterpriseRepository() throws SQLException {
        obj = new JDBC();
    }
    
    public ResultSet getAllHotelData() throws SQLException{
        String fetchQuery = "SELECT * FROM HOTEL";
        return this.obj.query(fetchQuery, new String[]{}); 
    }
    
    public ResultSet getEnterpriseData(String type, int id) throws SQLException{
        
        String fetchQuery = "";
        
        if(type.equalsIgnoreCase("HOTEL")){
            fetchQuery = "SELECT * FROM HOTEL WHERE H_ADMIN_ID = " + id;
        } else if (type.equalsIgnoreCase("CATERING")){
            fetchQuery = "SELECT * FROM CATERING WHERE C_ADMIN = " + id;
        } else if (type.equalsIgnoreCase("TRAVEL")){
            fetchQuery = "SELECT * FROM TRAVEL WHERE TA_ADMIN = " + id;
        }
        
        return this.obj.query(fetchQuery, new String[]{});           
    }
    
    public void insertHotelData(Hotel hotelData) throws SQLException{
        String insertQuery = "INSERT INTO HOTEL (H_ID, H_NAME, H_ADDRESS, H_AREA, H_TYPE, H_CAPACITY, H_ADMIN_ID, H_BOOKED_DATES, H_PHOTO, H_EMAIL, H_PHONE, H_STATUS)" + 
        "values('" + hotelData.getHotelID() + "','" + hotelData.getHotelName() + "','" + hotelData.getHotelAddress() + "','" + hotelData.getHotelArea() + "','" + hotelData.getHotelType() + "','" + hotelData.getCapacity() + "','" + hotelData.getHotelAdmin() 
                + "','" + hotelData.getBookedDates() + "','" + hotelData.getPhoto() + "','" + 
                hotelData.getEmail()+ "','" + hotelData.getPhone() + "','" + hotelData.getStatus() + "')";
        this.obj.update(insertQuery, new String[]{}); 
    }
    
    public void updateHotelStatus(int hotelAdminId, String status) throws SQLException {
        String sql = "UPDATE HOTEL SET H_STATUS = '" + status + "' WHERE H_ADMIN_ID = '" + hotelAdminId + "'";
        this.obj.update(sql, new String[]{});
    }
    
    
}
