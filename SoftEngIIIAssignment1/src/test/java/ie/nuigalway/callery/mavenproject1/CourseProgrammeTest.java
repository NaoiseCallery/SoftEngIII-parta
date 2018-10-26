/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.callery.mavenproject1;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Naoise Callery
 */
public class CourseProgrammeTest {
    
    public CourseProgrammeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCourseName method, of class CourseProgramme.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        CourseProgramme instance = null;
        String expResult = "";
        String result = instance.getCourseName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class CourseProgramme.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String n = "";
        CourseProgramme instance = null;
        instance.setName(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class CourseProgramme.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        CourseProgramme instance = null;
        DateTime expResult = null;
        DateTime result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class CourseProgramme.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        DateTime s = null;
        CourseProgramme instance = null;
        instance.setStartDate(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class CourseProgramme.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        CourseProgramme instance = null;
        DateTime expResult = null;
        DateTime result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndDate method, of class CourseProgramme.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        DateTime e = null;
        CourseProgramme instance = null;
        instance.setEndDate(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModules method, of class CourseProgramme.
     */
    @Test
    public void testGetModules() {
        System.out.println("getModules");
        CourseProgramme instance = null;
        Module[] expResult = null;
        Module[] result = instance.getModules();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModules method, of class CourseProgramme.
     */
    @Test
    public void testSetModules() {
        System.out.println("setModules");
        Module[] m = null;
        CourseProgramme instance = null;
        instance.setModules(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudent method, of class CourseProgramme.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        CourseProgramme instance = null;
        Student[] expResult = null;
        Student[] result = instance.getStudent();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudents method, of class CourseProgramme.
     */
    @Test
    public void testSetStudents() {
        System.out.println("setStudents");
        Student[] s = null;
        CourseProgramme instance = null;
        instance.setStudents(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
