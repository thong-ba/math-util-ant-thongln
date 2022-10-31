/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.thongln.mathutil.main;

import com.thongln.mathutil.core.MathUtility;

/**
 *
 * @author Thong Ly Ngoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This message come from the main() method");
        System.out.println("This jar file is built base on Ant");
        System.out.println("Move over, this message come from US - BUILD JAR FILE");
        tryTDDFirst();
    }
    
    public static void  tryTDDFirst(){
        
        long expected = 1;
        long actual = MathUtility.getFactorial(1);
        System.out.println("Test 1! | status: "+ "Expected: "+expected + " | Actual: "+actual);
        System.out.println("Test 2! | status: "+ "Expected: 2 | Actual: "+ MathUtility.getFactorial(2));
        System.out.println("Test 3! | status: "+ "Expected: 6 | Actual: "+ MathUtility.getFactorial(3));
        System.out.println("Test 4! | status: "+ "Expected: 24 | Actual: "+ MathUtility.getFactorial(4));
        System.out.println("Test 5! | status: "+ "Expected: 120 | Actual: "+ MathUtility.getFactorial(5));
        System.out.println("Test 6! | status: "+ "Expected: 720 | Actual: "+ MathUtility.getFactorial(6));
        System.out.println("Test 7! | status: "+ "Expected: 5040 | Actual: "+ MathUtility.getFactorial(7));
        System.out.println("Test 8! | status: "+ "Expected: 40320 | Actual: "+ MathUtility.getFactorial(8));
        System.out.println("Test 9! | status: "+ "Expected: 362880 | Actual: "+ MathUtility.getFactorial(9));
        System.out.println("Test 10! | status: "+ "Expected: 3628800 | Actual: "+ MathUtility.getFactorial(10));
        
        
        //System.out.println("Test -5! | status: "+ "Expected: Exception | Actual: "+ MathUtility.getFactorial(-5));
        
        
    }
    
    
}
