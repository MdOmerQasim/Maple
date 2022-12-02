/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.controller;

import com.maple.backend.service.UserService;
import java.sql.SQLException;

/**
 *
 * @author DKapoor
 */
public class UserController {
    UserService userService;

    public UserController() throws SQLException {
        userService = new UserService();
        
    }
    
    public void insertUserDataController(int ID, String role, String name, String email, String phoneNum, String userName, String password, String path, String postalCode, String status) throws SQLException{
        userService.insertUserDataService(ID, role, name, email, phoneNum, userName, password, path, postalCode, status);
    }
}
