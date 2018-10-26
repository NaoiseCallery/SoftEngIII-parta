package ie.nuigalway.callery.mavenproject1;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Testing {
    private Student s;
    private Module m;
    private CourseProgramme c;

    ArrayList<CourseProgramme> Courses = new ArrayList<>();
    ArrayList<Student> Students = new ArrayList<>();
    ArrayList<Module> Modules = new ArrayList<>();
    
    public Testing() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new CourseProgramme("4BCT", new DateTime("2000-01-11"), new DateTime("2004-01-11"), Modules, Students);
        s = new Student("Naoise Callery", 22, new DateTime("1996-06-09"), 1542, c);
        m = new Module("CT414", s, c);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Naoise Callery";
        String result = s.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String n = "Callery Naoise";
        s.setName(n);
    }

    @Test
    public void testGetAge() {
        System.out.println("getAge");
        int expResult = 22;
        int result = s.getAge();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int a = 0;
        s.setAge(a);
    }

    @Test
    public void testGetDOB() {
        System.out.println("getDOB");
        DateTime expResult = new DateTime("1996-06-09");
        DateTime result = s.getDOB();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDOB() {
        System.out.println("setDOB");
        DateTime d = new DateTime("1999-10-10");
        s.setDOB(d);
    }

    @Test
    public void testGetID() {
        System.out.println("getID");
        int expResult = 1542;
        int result = s.getID();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetID() {
        System.out.println("setID");
        int i = 0;
        s.setID(i);
    }

    @Test
    public void testGetUserame() {
        System.out.println("getUserame");
        String expResult = "Naoise Callery22";
        String result = s.getUserame();
        assertEquals(expResult, result);
    }

    @Test
    public void testCreateUsername() {
        System.out.println("createUsername");
        String n = "Noel";
        int a = 412;
        String expResult = "Noel412";
        String result = s.createUsername(n, a);
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCourseProgramme() {
        System.out.println("setCourseProgramme");
        CourseProgramme[] test = new CourseProgramme[3];
        test[0] = new CourseProgramme("3BCT", new DateTime("2001-01-11"), new DateTime("2005-01-11"), Modules, Students);
        s.setCourseProgramme(test);
    }  
    
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        String expResult = "4BCT";
        String result = c.getCourseName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCourseName() {
        System.out.println("setName");
        String n = "3BCT";
        c.setName(n);
    }

    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        DateTime expResult = new DateTime("2000-01-11");
        DateTime result = c.getStartDate();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        DateTime start = new DateTime("2011-01-11");
        c.setStartDate(start);
    }

    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        DateTime expResult = new DateTime("2004-01-11");
        DateTime result = c.getEndDate();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        DateTime e = new DateTime("2015-01-11");
        c.setEndDate(e);
    }

    @Test
    public void testSetModules() {
        System.out.println("setModules");
        Module[] test = new Module[3];
        test[0] = m;
        c.setModules(test);
    }

    @Test
    public void testSetStudents() {
        System.out.println("setStudents");
        Student[] exp = new Student[3];
        exp[0] = new Student("Naory", 2, new DateTime("1998-06-09"), 152, c);
        c.setStudents(exp);
    }
    
    @Test
    public void testModuleGetName() {
        System.out.println("getName");
        String expResult = "CT414";
        String result = m.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testModuleSetName() {
        System.out.println("setName");
        String Name = "ct324";
        m.setName(Name);
    }  
}
