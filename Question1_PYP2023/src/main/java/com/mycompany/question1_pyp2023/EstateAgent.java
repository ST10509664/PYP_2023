/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1_pyp2023;

/**
 *
 * @author bibia
 */
public class EstateAgent implements IEstateAgent{
    
    @Override
    public double EstateAgentSales(double[] propertySales){
        double total = 0;
        for (int i = 0 ; i < propertySales.length; i++){
                total += propertySales[i];
        }
        return total;
    }
    
    @Override
    public double EstateAgentCommission(double propertySales){
        return propertySales*0.02;
    }
    
    
    @Override
    public int TopEstateAgent(double[] totalSales){
        int index = 0;
        if (totalSales[0] < totalSales[1]){
            index++;
        }
        return index;
    }
    
    
    
    
    
    
}
