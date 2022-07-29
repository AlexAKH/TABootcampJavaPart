package com.bootcampexercise.module10;
import junit.framework.TestCase;


public class CalculatorTest extends TestCase {

    private Calculator theCalculator;

    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        theCalculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        theCalculator = null;
        super.tearDown();
    }
    public void testSumI() {

        int x = 6;
        int y = 8;
        assertEquals(14, (theCalculator.add(x,y)));
        assertEquals(14, (theCalculator.add(y,x)));

        x = -3;
        y = 12;
        assertEquals(9, (theCalculator.add(x,y)));
        assertEquals(9, (theCalculator.add(y,x)));

        x = -6;
        y = -11;
        assertEquals(-17, (theCalculator.add(x,y)));
        assertEquals(-17, (theCalculator.add(y,x)));
    }

    public void testSubTract() {

        int x = 4;
        int y = 2;

        assertEquals(2, (theCalculator.subtract(x,y)));
        assertEquals(-2, (theCalculator.subtract(y,x)));

        x = 6;
        y = -4;
        assertEquals(10, (theCalculator.subtract(x,y)));
        assertEquals(-10, (theCalculator.subtract(y,x)));

        x = -12;
        y = -4;
        assertEquals(-8, (theCalculator.subtract(x,y)));
        assertEquals(8, (theCalculator.subtract(y,x)));
    }
    public void testDivideC() {

        int x = 10;
        int y = 20;

        assertEquals(0.5, (theCalculator.divide(x,y)), 0);
        assertEquals(2, (theCalculator.divide(y,x)), 0);

        x = -5;
        y = 10;

        assertEquals(-0.5, (theCalculator.divide(x,y)), 0);
        assertEquals(-2, (theCalculator.divide(y,x)), 0);
    }


    public void testMultiply() {

        int x = 20;
        int y = 10;
        //	Checks if b is lesser than a
        assertEquals(200, (theCalculator.multiply(x,y)),0);
        //	Checks if b is greater than a
        assertEquals(200, (theCalculator.multiply(y,x)),0);

        x = 10;
        y = -4;

        assertEquals(-40, (theCalculator.multiply(x,y)),0);
        assertEquals(-40, (theCalculator.multiply(y,x)),0);

        x = -20;
        y = -10;

        assertEquals(200, (theCalculator.multiply(x,y)),0);
        assertEquals(200, (theCalculator.multiply(y,x)),0);
    }



}
