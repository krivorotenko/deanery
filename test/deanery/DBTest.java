/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deanery;

import java.sql.Connection;
import java.sql.ResultSet;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author okryvortc
 */
public class DBTest {
    
    public DBTest() {
    }

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
     * Test of dbCreateConnection method, of class DB.
     */
    @Test
    public void testDbCreateConnection() {
        System.out.println("dbCreateConnection");
        Connection expResult = null;
        Connection result = DB.dbCreateConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTableStudent method, of class DB.
     */
    @Test
    public void testShowTableStudent() {
        System.out.println("showTableStudent");
        ResultSet expResult = null;
        ResultSet result = DB.showTableStudent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTableGroups method, of class DB.
     */
    @Test
    public void testShowTableGroups() {
        System.out.println("showTableGroups");
        DB.showTableGroups();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNewStudent method, of class DB.
     */
    @Test
    public void testAddNewStudent() {
        System.out.println("addNewStudent");
        String name = "";
        String surName = "";
        Double GPA = null;
        int idGroup = 0;
        DB.addNewStudent(name, surName, GPA, idGroup);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStudent method, of class DB.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        int idStudent = 0;
        DB.deleteStudent(idStudent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStudentsGPA method, of class DB.
     */
    @Test
    public void testUpdateStudentsGPA() {
        System.out.println("updateStudentsGPA");
        int idStudent = 0;
        double GPA = 0.0;
        DB.updateStudentsGPA(idStudent, GPA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortStudentByField method, of class DB.
     */
    @Test
    public void testSortStudentByField() {
        System.out.println("sortStudentByField");
        String field = "";
        ResultSet expResult = null;
        ResultSet result = DB.sortStudentByField(field);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printResultSet method, of class DB.
     */
    @Test
    public void testPrintResultSet() {
        System.out.println("printResultSet");
        ResultSet rs = null;
        String expResult = "";
        String result = DB.printResultSet(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGroup method, of class DB.
     */
    @Test
    public void testAddGroup() {
        System.out.println("addGroup");
        int number = 0;
        String formEducation = "";
        DB.addGroup(number, formEducation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
