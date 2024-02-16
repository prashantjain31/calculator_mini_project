package org.prashant;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        TestSuite suite = new TestSuite();

        suite.addTest(new AppTest("testLog"));
        suite.addTest(new AppTest("testPow"));
        suite.addTest(new AppTest("testFact"));
        suite.addTest(new AppTest("testSqrt"));

        return suite;
    }

    public void testLog() {
        CalculatorFunctions calculator = new CalculatorFunctions();
        assertEquals(2.302585092994046, calculator.log(10));
    }

    public void testPow() {
        CalculatorFunctions calculator = new CalculatorFunctions();
        assertEquals(1024.0, calculator.pow(2, 10));
    }

    public void testFact() {
        CalculatorFunctions calculator = new CalculatorFunctions();
        assertEquals(120.0, calculator.fact(5));
    }

    public void testSqrt() {
        CalculatorFunctions calculator = new CalculatorFunctions();
        assertEquals(9.539392014169456, calculator.sqrt(91));
    }

//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }
}
