/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.controller;

import com.maple.backend.service.EnterpriseService;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author mohammedomerqasimshaik
 */
public class EnterpriseController {
    
    EnterpriseService enterpriseService;

    public EnterpriseController() throws SQLException {
        enterpriseService = new EnterpriseService();
    }
    
    public ResultSet getEnterpriseData(String type, int id) throws SQLException{
        return enterpriseService.getEnterpriseDataService(type, id);
    }
    
}
