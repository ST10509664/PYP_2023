/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.question2_pyp2023;

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
    public void CalculateCommission_CalculatedSuccessfully(){
        EstateAgent ea = new EstateAgent();

        double expected = 80000;
        double actual = ea.CalculateCommission("800000", "10");

        assertEquals(expected, actual, 0.001);
    }

    @Test
    //make it wrong on purpose
    public void CalculateCommission_CalculatedUnSuccessfully(){
        EstateAgent ea = new EstateAgent();

        double wrongValue = 800000;   // deliberately incorrect
        double actual = ea.CalculateCommission("800000", "10");

        assertNotEquals(wrongValue, actual, 0.001);
    }

    @Test
    public void ValidationTest(){
        EstateAgent ea = new EstateAgent();

        Data data = new Data("Cape Town", "Joe Bloggs", "800000", "10");

        assertTrue(ea.ValidateData(data));
    }
    
}
