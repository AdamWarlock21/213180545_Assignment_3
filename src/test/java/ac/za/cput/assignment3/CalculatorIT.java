/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.assignment3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author BooBoo
 */
public class CalculatorIT {
    private Calculator calc;
    public CalculatorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calc = new Calculator();
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testFail() {
        //Test Fail test
        int result = calc.divide(10, 2);
        if(result != 5){
            Assert.assertEquals(10, result);
        }
        else{
            Assert.fail("The test case is a fail.");
        }
        }
    @Test
    public void testAdd(){
        //Equality test
        int result = calc.add(5, 2);
        Assert.assertEquals(7, result);
    }
    @Test
    public void testMinus(){
        //Identity test
        int result = calc.subtract(19, 7);
        Assert.assertSame(12,result);
    }
    //Timeout test   
    @Test (timeout = 1000)
    public void testTimeout(){
        int result = calc.add(6, 2);
        Assert.assertEquals(8, result);
    }
    //Ignore Test
    @Ignore
    @Test
    public void ignoreTest(){
        int result = calc.multiply(5, 5);
        Assert.assertEquals(25,result);
    }
}
