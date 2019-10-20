package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CoreMethods;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    // TESTING MULTIPLICATION
    private final CoreMethods testMethods = new CoreMethods();

    @Test
    public void testcalcMultiply() {
        //given
//        CoreMethods testMethods =com/zipcodewilmington/scientific_calculator/TestMainApplication.java:16 new CoreMethods();
        double a = 2;
        double b = 4;
        double expected = a * b;
        //when
        double outcome = testMethods.calcMultiply(a, b);
        //then
        Assert.assertEquals(expected, outcome, .00);
    }

    @Test
    public void testcalcMultiply2() {
        //given
//        CoreMethods testMethods = new CoreMethods();
        double a = 5;
        double b = 5;
        double expected = 5 * 5;
        //when
        double outcome = testMethods.calcMultiply(a, b);
        //then
        Assert.assertEquals(expected, outcome, .00); }

    @Test
    public void testcalcMultiply3() {
        //given
//        CoreMethods testMethods = new CoreMethods();
        double a = 10;
        double b = 5;
        double expected = 10 * 5;
        //when
        double outcome = (double) testMethods.calcMultiply(a, b);
        //then
        Assert.assertEquals(expected, outcome, .00); }


    //TESTING THE SQUARE OF A NUMBER
    @Test
    public void testcalcSquared (){
        //given
//        CoreMethods testMethods = new CoreMethods();
        double a = 10;
        double expected = 10*10 ;
        //when
        double outcome = testMethods.calcSquared(a);
        //then
        Assert.assertEquals(expected, outcome,.00); }

    @Test
    public void testcalcSquared2 (){
        //given
//        CoreMethods testMethods = new CoreMethods();
        double a = 5;
        double expected = 5 * 5;
        //when
        double outcome = testMethods.calcSquared(a);
        //then
        Assert.assertEquals(expected, outcome,.00); }


    @Test
    public void testcalcSquared3 (){
        //given
//        CoreMethods testMethods = new CoreMethods();
        double a = 2;
        double expected = 4;
        //when
        double outcome = testMethods.calcSquared(a);
        //then
        Assert.assertEquals(expected, outcome,.00); }

    //TESTING TO THE POWER

    @Test
    public void testcalcToPower (){
        //given
//        CoreMethods testMethods = new CoreMethods();
        double a = 2;
        double b = 2;
        double expected = 4;
        //when
        double outcome = testMethods.calcToPower(a,b);
        //then
        Assert.assertEquals(expected, outcome,.00);}

    @Test
    public void testcalcToPower2 (){
        //given
//        CoreMethods testMethods = new CoreMethods();
        double a = 5;
        double b = 5;
        double expected = 3125;
        //when
        double outcome = testMethods.calcToPower(a,b);
        //then
        Assert.assertEquals(expected, outcome,.00);}

    @Test
    public void testcalcToPower3 (){
        //given
//        CoreMethods testMethods = new CoreMethods();
        double a = 4;
        double b = 3;
        double expected = 64;
        //when
        double outcome = testMethods.calcToPower(a,b);
        //then
        Assert.assertEquals(expected, outcome,.00);}

    @Test
    public void testcalcDiv() {
        //given
     //   CoreMethods testMethodsDiv = new CoreMethods();
        double a = 100;
        double b = 10;
        double expected = a / b;
        //when
        double outcome = testMethods.calcDiv(a, b);
        //then
        Assert.assertEquals(expected, outcome, .00);
    }
    @Test
    public void testcalcDiv1() {
        //given
      //  CoreMethods testMethodsDiv = new CoreMethods();
        double a = 9;
        double b = 3;
        double expected = a / b;
        //when
        double outcome = testMethods.calcDiv(a, b);
        //then
        Assert.assertEquals(expected, outcome, .00);
    }
    @Test
    public void testcalcDiv2() {
        //given
       // CoreMethods testMethodsDiv = new CoreMethods();
        double a = 15;
        double b = 5;
        double expected = a / b;
        //when
        double outcome = testMethods.calcDiv(a, b);
        //then
        Assert.assertEquals(expected, outcome, .00);
    }
    @Test
    public void testcalcSqrt() {
        //given
       // CoreMethods testMethodsSqrt = new CoreMethods();
        double a = 100;
        Double expected = Math.sqrt(a);
        //when
        Double outcome = testMethods.calcSqrt(a);
        //then
        Assert.assertEquals(expected, outcome);
    }
    @Test
    public void testcalcSqrt1() {
        //given
       // CoreMethods testMethodsSqrt = new CoreMethods();
        double a = 25;
        Double expected = Math.sqrt(a);
        //when
        Double outcome = testMethods.calcSqrt(a);
        //then
        Assert.assertEquals(expected, outcome);
    }
    @Test
    public void testcalcSqrt2() {
        //given
       // CoreMethods testMethodsSqrt = new CoreMethods();
        double a = 64;
        Double expected = Math.sqrt(a);
        //when
        Double outcome = testMethods.calcSqrt(a);
        //then
        Assert.assertEquals(expected, outcome);
    }

    // KAIS TESTS
    @Test
    public void testcalcInverse() {
        //given
       // CoreMethods testMethodsIn = new CoreMethods();
        double a = 20;
        Double expected = 1 / a;
        //when
        Double outcome = testMethods.calcInverse(a);
        //then
        Assert.assertEquals(expected, outcome);
    }
    @Test
    public void testcalcInverse1() {
        //given
       // CoreMethods testMethodsIn = new CoreMethods();
        double a = 5;
        Double expected = 1 / a;
        //when
        Double outcome = testMethods.calcInverse(a);
        //then
        Assert.assertEquals(expected, outcome);
    }
    @Test
    public void testcalcInverse2() {
        //given
        //CoreMethods testMethodsIn = new CoreMethods();
        double a = 10;
        Double expected = 1 / a;
        //when
        Double outcome = testMethods.calcInverse(a);
        //then
        Assert.assertEquals(expected, outcome);
    }
}