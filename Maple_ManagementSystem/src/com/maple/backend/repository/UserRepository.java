/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.repository;

import com.maple.DBConnection.JDBC;
import java.sql.SQLException;

/**
 *
 * @author DKapoor
 */
public class UserRepository {
    JDBC obj;

    public UserRepository() throws SQLException {
        obj = new JDBC();
    }
    
    public void insertUserData(int ID, String role, String name, String email, String phoneNum, String userName, String password, String path, String postalCode, String status) throws SQLException{
        String sql = "insert into user (id, role, name, email, phoneNumber, username, password, photo, postalCode, status)" + 
        "values('" + ID + "','" + role + "','" + name + "','" + email + "','" + phoneNum + "','" + userName + "','" + password + "','" + path + "','" + postalCode + "','" + status + "')";
        obj.update(sql, new String[]{});
    }
    
}
