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
public class StudentTest {
    
    public StudentTest() {
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
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String n = "";
        Student instance = null;
        instance.setName(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = null;
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Student.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int a = 0;
        Student instance = null;
        instance.setAge(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDOB method, of class Student.
     */
    @Test
    public void testGetDOB() {
        System.out.println("getDOB");
        Student instance = null;
        DateTime expResult = null;
        DateTime result = instance.getDOB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDOB method, of class Student.
     */
    @Test
    public void testSetDOB() {
        System.out.println("setDOB");
        DateTime d = null;
        Student instance = null;
        instance.setDOB(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Student.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Student instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Student.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int i = 0;
        Student instance = null;
        instance.setID(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserame method, of class Student.
     */
    @Test
    public void testGetUserame() {
        System.out.println("getUserame");
        Student instance = null;
        String expResult = "";
        String result = instance.getUserame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createUsername method, of class Student.
     */
    @Test
    public void testCreateUsername() {
        System.out.println("createUsername");
        String n = "";
        int a = 0;
        Student instance = null;
        String expResult = "";
        String result = instance.createUsername(n, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourseProgramme method, of class Student.
     */
    @Test
    public void testGetCourseProgramme() {
        System.out.println("getCourseProgramme");
        Student instance = null;
        CourseProgramme[] expResult = null;
        CourseProgramme[] result = instance.getCourseProgramme();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourseProgramme method, of class Student.
     */
    @Test
    public void testSetCourseProgramme() {
        System.out.println("setCourseProgramme");
        CourseProgramme[] c = null;
        Student instance = null;
        instance.setCourseProgramme(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
