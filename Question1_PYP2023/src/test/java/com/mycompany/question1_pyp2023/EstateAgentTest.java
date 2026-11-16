/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.question1_pyp2023;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bibia
 */
public class EstateAgentTest {
    
    @Test
    public void CalculateTotalSales_ReturnTotalSales(){
        EstateAgent ea = new EstateAgent();

        double[] joeSales = {800000, 1500000, 2000000};
        double expected = 4300000;
        double actual = ea.EstateAgentSales(joeSales);

        assertEquals(expected, actual);
    }
    
    @Test
    public void CalculateTotalCommission_ReturnTotalCommission(){
        EstateAgent ea = new EstateAgent();

        double expected = 86000;
        double actual = ea.EstateAgentCommission(4300000);

        assertEquals(expected, actual);
    }

    @Test
    public void TopAgent_ReturnsTopPosition(){
        EstateAgent ea = new EstateAgent();

        double[] totals = {4300000, 3500000};
        int expected = 0;
        int actual = ea.TopEstateAgent(totals);

        assertEquals(expected, actual);
    }
    
}
