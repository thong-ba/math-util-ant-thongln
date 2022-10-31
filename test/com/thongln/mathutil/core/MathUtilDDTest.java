/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.thongln.mathutil.core;


import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.thongln.mathutil.core.MathUtility.*;

/**
 *
 * @author Thong Ly Ngoc
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTest {
    
    @Parameterized.Parameters
    public  static Object[][] initData(){
    int a[] = {5,10,15,20};
    int b[][] = {{1,0},{1,1},{2,2},{6,3},{24,4},{120,5},{720,6},{5040,7}};
    int c[][] = {{1,0},
                    {1,1},
                        {2,2},
                            {6,3},
                                {24,4},
                                    {120,5},
                                        {720,6},
                                            {5040,7},
                                                {40320,8},
                                                    {362880,9},
                                                        {3628800,10},
                };
    return new Integer[][] {{1,0},
                                {1,1},
                                    {2,2},
                                        {6,3},
                                            {24,4},
                                                {120,5},
                                                    {720,6},
                                                        {5040,7},
                                                            {40320,8},
                                                                {362880,9},
                                                                    {3628800,10},
                            };
}
    
    @Parameterized.Parameter(value = 0)
    public long expected;
    @Parameterized.Parameter(value = 1)
    public int n ;
    
    
    @Test
    public void testFactorial(){
       // assertEquals(expected, n,MathUtility.getFactorial(n));
        assertEquals(expected, getFactorial(n));
    }
    
    
    
    
    
    
}
