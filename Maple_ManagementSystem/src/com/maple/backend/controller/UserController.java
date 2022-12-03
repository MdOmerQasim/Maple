/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.controller;

import com.maple.backend.model.User;
import com.maple.backend.service.UserService;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
    public ArrayList<User> getUserDataByRole(String role) throws SQLException{
        return userService.getUserDataService(role);
    }
    
    public int validateUser(String userName, String password, String role) throws SQLException{
        ArrayList<User> userList = getUserDataByRole(role);
        for(User user: userList){
            if(user.getUserName().equals(userName) && user.getPassword().equals(password)){
                return user.getID();
            }
        }
        return -1;
    }
    
    public int getAllUsers() throws SQLException{
        ArrayList<User> userList = userService.getAllUsers();
        return userList.size()+1;
    }
}
