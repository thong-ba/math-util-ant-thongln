/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.thongln.mathutil.core;

import java.util.IllegalFormatException;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Thong Ly Ngoc
 */
public class MathUtilTest {
    
    @Test
    public void tryUnitComparison(){
        Assert.assertEquals(100, 100);
    }
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        long expected = 1;
        long actual = MathUtility.getFactorial(0);
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(1, MathUtility.getFactorial(1));
        Assert.assertEquals(2, MathUtility.getFactorial(2));
        Assert.assertEquals(6, MathUtility.getFactorial(3));
        Assert.assertEquals(24, MathUtility.getFactorial(4));
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentReturnThorwsException(){
        System.out.println("Hope to see Exception");
        MathUtility.getFactorial(-2);
        MathUtility.getFactorial(-23);
        MathUtility.getFactorial(25);
        MathUtility.getFactorial(-9);
    }
    
}
