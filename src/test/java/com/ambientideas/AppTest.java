package com.ambientideas;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//Pending comments

//Some comments on the master branch
//Added some comments on the branch for the egit demo

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigorous Test :-)
     * This time it should work
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
