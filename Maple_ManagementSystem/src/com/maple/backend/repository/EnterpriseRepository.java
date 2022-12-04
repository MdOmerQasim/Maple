/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.repository;

import com.maple.DBConnection.JDBC;
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
    
    
}
