/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2_pyp2023;

/**
 *
 * @author bibia
 */
public class Data {
    private String location;
    private String name;
    private String price;
    private String commission;

    //constructor
    public Data(String location, String name, String price, String commission){
        this.location = location;
        this.name = name;
        this.price = price;
        this.commission = commission;
    }

    //getters
    public String getLocation(){ 
        return location; 
    }
    
    public String getName(){
        return name; 
    }
    
    public String getPrice(){ 
        return price; 
    }
    
    public String getCommission(){
        return commission; 
    }
    
}
