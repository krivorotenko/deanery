/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deanery;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author okryvortc
 */
public class StudentTest {
    Student A=null;
    
    public StudentTest() {
    }

    @BeforeClass
    public  void setUpClass() throws Exception {
         A = new Student(1, "Vasia","Vasyl", 443, 4.5);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setID method, of class Student.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int id1 = 0;
        Student instance = null;
        instance.setID(id1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurName method, of class Student.
     */
    @Test
    public void testSetSurName() {
        System.out.println("setSurName");
        String Surname = "";
        Student instance = null;
        instance.setSurName(Surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGroup method, of class Student.
     */
    @Test
    public void testSetGroup() {
        System.out.println("setGroup");
        int group = 0;
        Student instance = null;
        instance.setGroup(group);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGPA method, of class Student.
     */
    @Test
    public void testSetGPA() {
        System.out.println("setGPA");
        double GPA = 0.0;
        Student instance = null;
        instance.setGPA(GPA);
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
     * Test of getSurName method, of class Student.
     */
    @Test
    public void testGetSurName() {
        System.out.println("getSurName");
        Student instance = null;
        String expResult = "";
        String result = instance.getSurName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroup method, of class Student.
     */
    @Test
    public void testGetGroup() {
        System.out.println("getGroup");
        Student instance = null;
        int expResult = 0;
        int result = instance.getGroup();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGPA method, of class Student.
     */
    @Test
    public void testGetGPA() {
        System.out.println("getGPA");
        Student instance = null;
        double expResult = 0.0;
        double result = instance.getGPA();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
