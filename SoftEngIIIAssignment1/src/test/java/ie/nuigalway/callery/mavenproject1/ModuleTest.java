/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.callery.mavenproject1;

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
public class ModuleTest {
    
    public ModuleTest() {
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
     * Test of getName method, of class Module.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Module instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Module.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "";
        Module instance = null;
        instance.setName(Name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourseProgramme method, of class Module.
     */
    @Test
    public void testGetCourseProgramme() {
        System.out.println("getCourseProgramme");
        Module instance = null;
        CourseProgramme[] expResult = null;
        CourseProgramme[] result = instance.getCourseProgramme();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourseProgramme method, of class Module.
     */
    @Test
    public void testSetCourseProgramme() {
        System.out.println("setCourseProgramme");
        CourseProgramme[] c = null;
        Module instance = null;
        instance.setCourseProgramme(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudent method, of class Module.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        Module instance = null;
        Student[] expResult = null;
        Student[] result = instance.getStudent();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudents method, of class Module.
     */
    @Test
    public void testSetStudents() {
        System.out.println("setStudents");
        Student[] s = null;
        Module instance = null;
        instance.setStudents(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
