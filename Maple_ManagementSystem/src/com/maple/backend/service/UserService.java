/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.service;

import com.maple.backend.repository.UserRepository;
import java.sql.SQLException;

/**
 *
 * @author DKapoor
 */
public class UserService {
    UserRepository userRepository;

    public UserService() throws SQLException {
        userRepository = new UserRepository();
    }
    public void insertUserDataService(int ID, String role, String name, String email, String phoneNum, String userName, String password, String path, String postalCode, String status) throws SQLException{
        userRepository.insertUserData(ID, role, name, email, phoneNum, userName, password, path, postalCode, status);
    }
    
}
