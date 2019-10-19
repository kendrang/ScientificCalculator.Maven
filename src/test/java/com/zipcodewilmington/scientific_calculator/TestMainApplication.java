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

  @Test
    public void testcalcMultiply (){
        //given
      CoreMethods testMethods = new CoreMethods();;
        double a = 2;
        double b = 4;
        double expected = 8;
        //when
        double outcome = testMethods.calcMultiply(a,b);
        //then
        Assert.assertEquals(expected,outcome); }

    @Test
    public void testcalcMultiply2 (){
        //given
        CoreMethods testMethods = new CoreMethods();;
        double a = 5;
        double b = 5;
        double expected = 25;
        //when
        double outcome = testMethods.calcMultiply(a,b);
        //then
        Assert.assertEquals(expected,outcome); }

    @Test
    public void testcalcMultiply3 (){
        //given
        CoreMethods testMethods = new CoreMethods();
        int a = 10;
        int b = 5;
        Integer expected = 50;
        //when
        Integer outcome = testMethods.calcMultiply(a,b);
        //then
        Assert.assertEquals(expected,outcome); }

    //TESTING THE SQUARE OF A NUMBER
    @Test
    public void testcalcSquared (){
        //given
        CoreMethods testMethods = new CoreMethods();
        int a = 10;
        Integer expected = 100;
        //when
        Integer outcome = testMethods.calcSquared(a);
        //then
        Assert.assertEquals(expected,outcome); }

    @Test
    public void testcalcSquared2 (){
        //given
        CoreMethods testMethods = new CoreMethods();
        int a = 5;
        Integer expected = 25;
        //when
        Integer outcome = testMethods.calcSquared(a);
        //then
        Assert.assertEquals(expected,outcome); }

    @Test
    public void testcalcSquared3 (){
        //given
        CoreMethods testMethods = new CoreMethods();
        int a = 2;
        Integer expected = 4;
        //when
        Integer outcome = testMethods.calcSquared(a);
        //then
        Assert.assertEquals(expected,outcome); }

    //TESTING TO THE POWER

    @Test
    public void testcalcToPower (){
        //given
        CoreMethods testMethods = new CoreMethods();
        int a = 2;
        int b = 2;
        int expected = 4;
        //when
        int outcome = testMethods.calcToPower(a,b);
        //then
        Assert.assertEquals(expected,outcome);}

    @Test
    public void testcalcToPower2 (){
        //given
        CoreMethods testMethods = new CoreMethods();
        int a = 5;
        int b = 5;
        int expected = 3125;
        //when
        int outcome = testMethods.calcToPower(a,b);
        //then
        Assert.assertEquals(expected,outcome);}

    @Test
    public void testcalcToPower3 (){
        //given
        CoreMethods testMethods = new CoreMethods();
        int a = 4;
        int b = 3;
        int expected = 64;
        //when
        int outcome = testMethods.calcToPower(a,b);
        //then
        Assert.assertEquals(expected,outcome);}
}
