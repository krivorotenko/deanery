/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deanery;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author okryvortc
 */
public class DeaneryTest {
    
    public DeaneryTest() {
    }
         Student A = new Student(1, "123","123",332,4.5);
        Student C = new Student(2, "1235","1235",432,4.3);
        Student B = new Student(3, "1234","1234",232,4.0);
    @BeforeClass
    public static void setUpClass() throws Exception {
     
        
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
     * Test of addStudent method, of class Deanery.
     */
  

    /**
     * Test of serialize method, of class Deanery.
     */
   /* @Test
    public void testSerialize() throws Exception {
        System.out.println("serialize");
        ArrayList<Student> StudentsList = new ArrayList<Student>();
        
        Deanery.serialize(StudentsList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }   */

    /**
     * Test of deserialize method, of class Deanery.
     */
    @Test
    public void testDeserialize() throws Exception {
        System.out.println("deserialize");
           ArrayList <Student> StudentsList = new ArrayList<Student>();
           ArrayList <Student> expResult = new ArrayList<Student>();
         expResult.add(A);
         expResult.add(B);
         expResult.add(C);
          StudentsList.add(A);
          StudentsList.add(B);
          StudentsList.add(C);
        Deanery.serialize(StudentsList);
        ArrayList result = Deanery.deserialize();
        assertEquals(expResult, result);
        
       
    }

    /**
     * Test of showsAllStudents method, of class Deanery.
     */
    @Test
    public void testShowsAllStudents() {
        System.out.println("showsAllStudents");
        ArrayList<Student> StudentsList = new ArrayList<Student>();
        Deanery.showsAllStudents(StudentsList);
        
    }

    /**
     * Test of createXML method, of class Deanery.
     */
   /* @Test
    public void testCreateXML() {
        System.out.println("createXML");
        ArrayList<Student> StudentsList = new ArrayList<Student>();
        StudentsList.add(A);
        Deanery.createXML(StudentsList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of readXML method, of class Deanery.
     */
    @Test
    public void testReadXML() {
        System.out.println("readXML");
        ArrayList<Student> StudentsList = new ArrayList<Student>();
       /// StudentsList.add(A);
       /// StudentsList.add(B);
        //StudentsList.add(C);
        Deanery.createXML(StudentsList);
        ArrayList expResult = new ArrayList<Student>();
        expResult.add(A);
        expResult.add(B);
        expResult.add(C);
        ArrayList result = new ArrayList<Student>();
        result = Deanery.readXML(StudentsList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of findByGroup method, of class Deanery.
     */
    @Test
    public void testFindByGroup() {
        Student A = new Student(1, "123","123", 332, 4.5);
        Student C = new Student(2, "1235","1235", 432, 4.3);
        Student B = new Student(3, "1234","1234", 232, 4.0);
        System.out.println("findByGroup");
        ArrayList<Student> StudentsList = new ArrayList<Student>();
        StudentsList.add(A);
        StudentsList.add(B);
        StudentsList.add(C);
        int group = 432;
        ArrayList expResult = new ArrayList<Student>();
        expResult.add(C);
        ArrayList result = Deanery.findByGroup(StudentsList, group);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of findByID method, of class Deanery.
     */
    @Test
    public void testFindByID() {
        Student A = new Student(1, "123","123",332,4.5);
        Student C = new Student(2, "1235","1235",432,4.3);
        Student B = new Student(3, "1234","1234",232,4.0);
        System.out.println("findByID");
        ArrayList<Student> StudentsList = new ArrayList<Student>();
        StudentsList.add(B);
        StudentsList.add(A);
        StudentsList.add(C);
        int id = 0;
        ArrayList expResult = new ArrayList<Student>();
        expResult.add(A);
        ArrayList result = Deanery.findByID(StudentsList, 1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of findByGPA method, of class Deanery.
     */
    @Test
    public void testFindByGPA() {
        Student A = new Student(1, "123","123",332,4.5);
        Student C = new Student(2, "1235","1235",432,4.3);
        Student B = new Student(3, "1234","1234",232,4.0);
        System.out.println("findByGPA");
        ArrayList<Student> StudentsList = new ArrayList<Student>();
        StudentsList.add(A);
        StudentsList.add(B);
        StudentsList.add(C);
        double GPA = 4.5;
        ArrayList expResult = new ArrayList<Student>();
        expResult.add(A);
        ArrayList result = Deanery.findByGPA(StudentsList, GPA);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of studentsWithGPALess method, of class Deanery.
     */
    @Test
    public void testStudentsWithGPALess() {
        Student A = new Student(1, "123","123",332,4.5);
        Student C = new Student(2, "1235","1235",432,4.3);
        Student B = new Student(3, "1234","1234",232,4.0);
        System.out.println("studentsWithGPALess");
        ArrayList<Student> StudentsList = new ArrayList<Student>();
        StudentsList.add(A);
        StudentsList.add(B);
        StudentsList.add(C);
        double GPA = 4.6;
        ArrayList expResult = new ArrayList<Student>();
        expResult.add(A);
        expResult.add(B);
        expResult.add(C);
        ArrayList result = Deanery.studentsWithGPALess(StudentsList, GPA);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of studentsWithGPAOver method, of class Deanery.
     */
    @Test
    public void testStudentsWithGPAOver() {
        System.out.println("studentsWithGPAOver");
        Student A = new Student(1, "123","123",332,4.5);
        Student C = new Student(2, "1235","1235",432,4.3);
        Student B = new Student(3, "1234","1234",232,4.0);
        System.out.println("studentsWithGPALess");
        ArrayList<Student> StudentsList = new ArrayList<Student>();
        StudentsList.add(A);
        StudentsList.add(B);
        StudentsList.add(C);
        double GPA = 4.1;
        ArrayList expResult = new ArrayList<Student>();
        expResult.add(A);
        //expResult.add(B);
        expResult.add(C);
        ArrayList result = Deanery.studentsWithGPAOver(StudentsList, GPA);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findByName method, of class Deanery.
     */
    @Test
    public void testFindByName() {
        System.out.println("findByName");
        ArrayList<Student> StudentsList = new ArrayList<Student>();
        String name = "123";
        Student A = new Student(1, "123","123",332,4.5);
        Student C = new Student(2, "1235","1235",432,4.3);
        Student B = new Student(3, "1234","1234",232,4.0);
        ArrayList expResult = new ArrayList<Student>();
        StudentsList.add(A);
        StudentsList.add(B);
        StudentsList.add(C);
        expResult.add(A);
        ArrayList result = Deanery.findByName(StudentsList, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of findBySurName method, of class Deanery.
     */
    @Test
    public void testFindBySurName() {
        System.out.println("findBySurName");
        Student A = new Student(1, "123","123",332,4.5);
        Student C = new Student(2, "1235","1235",432,4.3);
        Student B = new Student(3, "1234","1234",232,4.0);
        ArrayList<Student> StudentsList = new ArrayList<Student>();
        StudentsList.add(A);
        StudentsList.add(B);
        StudentsList.add(C);
        String surName = "1235";
        ArrayList expResult = new ArrayList<Student>();
        expResult.add(C);
        ArrayList result = Deanery.findBySurName(StudentsList, surName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of findMaxID method, of class Deanery.
     */
   

    /**
     * Test of main method, of class Deanery.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Deanery.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
