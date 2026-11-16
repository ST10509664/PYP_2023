/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1_pyp2023;

/**
 *
 * @author bibia
 */
public class Question1_PYP2023 {
    //declare the 2d array
   static double[][] propertySales = {{800000,1500000, 2000000},{700000,1200000,1600000}};
    //declare the 1d arrays
   static double[] total1 = new double[3];
   static double[] total2 = new double[3];
   static double[] totalSales = new double[2];
   static String[] names = {"Joe Bloggs","Jane Doe"};
   static String[] months = {"JAN","FEB","MAR"};
   
    public static void main(String[] args) {
        //transfer the appropriate sales to each person using 1d arrays
        for (int r = 0 ; r < propertySales.length; r++){
            for (int c = 0 ; c < propertySales[r].length; c++){
                if (r == 0){
                    total1[c] = propertySales[r][c];
                }else{
                    total2[c] = propertySales[r][c];  
                }
                    
            }
         }
        
        //establish connecttion to EstateAgent class
        EstateAgent ea = new EstateAgent();
        
        System.out.println("ESTATE AGENTS SALE REPORT");
        
        //print out the table
        System.out.println("");
        System.out.printf("%-20s","");

        for (String m : months){
            System.out.printf("%-20s", m);
        }
        System.out.println("");
        System.out.println("---------------------------------------------------------------------");
        for (int n = 0; n < propertySales.length; n++){
            System.out.printf("%-20s", names[n]);
            for (double sale : propertySales[n]){
                System.out.printf("R %-18.1f", sale);
            }
            System.out.println("");
        }
        
        
        System.out.println("");
        double totalJoe = ea.EstateAgentSales(total1);
        double totalJane = ea.EstateAgentSales(total2);
        System.out.printf("Total property sales for Joe Bloggs = R %,.0f%n", totalJoe);
        System.out.printf("Total property sales for Jane Doe = R %,.0f%n", totalJane);
        System.out.println();
        //calculate the commission for each agent
        System.out.printf("Sales Commission for Joe Bloggs = R %,.0f%n", ea.EstateAgentCommission(totalJoe));
        System.out.printf("Sales Commission for Jane Doe = R %,.0f%n",  ea.EstateAgentCommission(totalJane));
        System.out.println("");  
        //populate the totalSales array to use in method
        totalSales[0] = totalJoe;
        totalSales[1] = totalJane;
        System.out.println("Top performing estate agent: " + names[ea.TopEstateAgent(totalSales)]);

        
    }
    
}
