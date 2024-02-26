package Assi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SmartCalculatorTest {
	
	SmartCalculator calculator = new SmartCalculator();
	
    @Test
    public void testCalculateSimpleInterest_1() {
        assertEquals(100.0, calculator.calculateSimpleInterest(1000.0, 5.0, 2));
    }
    @Test
    public void testCalculateSimpleInterest_2() {
        assertEquals(250.0, calculator.calculateSimpleInterest(5000.0, 5.0, 1));    
    }
    @Test
    public void testCalculateSimpleInterest_3() {
        assertEquals(150.0, calculator.calculateSimpleInterest(3000.0, 5.0, 1));    
    }
    @Test
    public void testCalculateSimpleInterest_4() {
        assertEquals(75.0, calculator.calculateSimpleInterest(1500.0, 5.0, 1));    
    }
    

    @Test
    public void testCalculateCompoundInterest_1() {
        assertEquals(102.50, calculator.calculateCompoundInterest(1000.0, 5.0, 2));
    }
    @Test
    public void testCalculateCompoundInterest_2() {
    	assertEquals(70.0, calculator.calculateCompoundInterest(1000.0, 7.0, 1));
    }
    @Test
    public void testCalculateCompoundInterest_3() {
        assertEquals(8.0, calculator.calculateCompoundInterest(200.0, 4.0, 1));
    }
    @Test
    public void testCalculateCompoundInterest_4() {
        assertEquals(1200.0, calculator.calculateCompoundInterest(80.0, 100.0, 4));
    }

    
    @Test
    public void testCalculateMean_1() {
        double[] numbers = { 10.0, 20.0, 30.0, 40.0, 50.0 };
        assertEquals(30.0, calculator.calculateMean(numbers));
    }
    @Test
    public void testCalculateMean_2() {
    	double[] numbers = {12.5, 25.0, 37.5, 50.0};
        assertEquals(31.25, calculator.calculateMean(numbers));
    }
    @Test
    public void testCalculateMean_3() {
    	double[] numbers = {12.5, 15.0, 17.5};
        assertEquals(15.0, calculator.calculateMean(numbers));
    }
    @Test
    public void testCalculateMean_4() {
    	double[] numbers = {10.0, 20.0, 30.0};
        assertEquals(20.0, calculator.calculateMean(numbers));
    }

    @Test
    public void testCalculateFactorial_1() {
        assertEquals(120, calculator.calculateFactorial(5));
    }
    @Test
    public void testCalculateFactorial_2() {
        assertEquals(24, calculator.calculateFactorial(4));
    }
    @Test
    public void testCalculateFactorial_3() {
        assertEquals(720, calculator.calculateFactorial(6));
    }
    @Test
    public void testCalculateFactorial_4() {
        assertEquals(6, calculator.calculateFactorial(3));
    }

    
    @Test
    public void testCalculatePercentage_1() {
        assertEquals(90.0, calculator.calculatePercentage(500.0, 450.0));
    }
    @Test
    public void testCalculatePercentage_2() {
    	assertEquals(25.0, calculator.calculatePercentage(200.0, 50.0));
    }
    @Test
    public void testCalculatePercentage_3() {
    	assertEquals(80.0, calculator.calculatePercentage(500.0, 400.0));
    }
    @Test
    public void testCalculatePercentage_4() {
    	assertEquals(10.0, calculator.calculatePercentage(500.0, 50.0));
    }
}
