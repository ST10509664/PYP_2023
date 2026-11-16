/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.question2_pyp2023;

/**
 *
 * @author bibia
 */
public interface IEstateAgent {
    double CalculateCommission(String propertyprice, String agentCommission);
    //had to create a class called Data. We know this because of the parameter within this methid
    boolean ValidateData(Data dataToValidate);    
}
