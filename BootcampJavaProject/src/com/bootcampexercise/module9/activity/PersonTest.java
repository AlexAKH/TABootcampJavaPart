package com.bootcampexercise.module9.activity;
import com.bootcampexercise.module9.sample.Product;
import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }


    //TODO: create teardown
    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testSetAndGetWeight1() {
        int testWeight1 = 120;
        person.setWeight(testWeight1);
        assertEquals(testWeight1, person.getWeight());
    }
        public void testSetAndGetWeight2() {
        int testWeight2 = 80;
        person.setWeight(testWeight2);
        assertEquals(testWeight2, person.getWeight());
    }


    public void testSetAndGetHeight1() {
        float testHeight1 = 150;
        person.setHeight(testHeight1);
        assertEquals(testHeight1, person.getHeight());
    }
    public void testSetAndGetHeight2() {
        float testHeight2 = 120;
        person.setHeight(testHeight2);
        assertEquals(testHeight2, person.getHeight());
    }


    //TODO: create unit test for getBodyMassIndex method

    public void testBmi0() {
        double bmi = person.getBmi(0, 0);
        assertEquals(0.0, bmi);
    }
    public void testBmi() {
        double bmi = person.getBmi(100, 176);
        double bmiExpected = 100 / (176 * 176);
        assertEquals(bmiExpected,bmi);
    }

    public void testBmi1() {
        double bmi = person.getBmi(59, 173);
        double bmiExpected = 59 / (173 * 173);
        assertEquals(bmiExpected,bmi);
    }



}




