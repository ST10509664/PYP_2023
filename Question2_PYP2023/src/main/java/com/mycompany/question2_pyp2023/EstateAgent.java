/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2_pyp2023;

/**
 *
 * @author bibia
 */
public class EstateAgent implements IEstateAgent{

    
    @Override
    public double CalculateCommission(String propertyprice, String agentCommission){
        //convert from string to double to perform calculation
        return Double.parseDouble(propertyprice)*(Double.parseDouble(agentCommission)/100);
    }
    
    @Override
    public boolean ValidateData(Data dataToValidate){
        String location = dataToValidate.getLocation();
        String name = dataToValidate.getName();
        String price = dataToValidate.getPrice();
        String commission = dataToValidate.getCommission();

        //check the location
        if (location == null || location.trim().isEmpty()){
            return false;
        }
        //check the name
        if (name == null || name.trim().isEmpty()){
            return false;
        }

        // must look like a number before we parse it
        if (price == null || !price.trim().matches("\\d+(\\.\\d+)?")){
            return false;
        }
        
        if (commission == null || !commission.trim().matches("\\d+(\\.\\d+)?")){
            return false;
        }

        // safe to parse now, because the format was checked above
        if (Double.parseDouble(price.trim()) <= 0){
            return false;
        }
        
        //check the commision percentage
        if (Double.parseDouble(commission.trim()) <= 0){
            return false;
        }
        return true;
    }
    
}
