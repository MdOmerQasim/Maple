/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maple.backend.service;

import com.maple.backend.repository.Repository;

/**
 *
 * @author mohammedomerqasimshaik
 */

public class BusinessWorkflowService {
    
    Repository repository;

    public BusinessWorkflowService() {
        repository = new Repository();
    }

    public String appendService(String value){
        return value + "_user";
    }
}
