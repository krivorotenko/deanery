/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deanery;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author win7
 */
public class DeaneryNGTest {
    
    public DeaneryNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Тест метод addStudent, класса Deanery.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        int id = 0;
        String name = "";
        String surName = "";
        int group = 0;
        double GPA = 0.0;
        Deanery.addStudent(id, name, surName, group, GPA);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод serialize, класса Deanery.
     */
    @Test
    public void testSerialize() throws Exception {
        System.out.println("serialize");
        ArrayList<Student> StudentsList = null;
        Deanery.serialize(StudentsList);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод deserialize, класса Deanery.
     */
    @Test
    public void testDeserialize() throws Exception {
        System.out.println("deserialize");
        ArrayList expResult = null;
        ArrayList result = Deanery.deserialize();
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод showsAllStudents, класса Deanery.
     */
    @Test
    public void testShowsAllStudents() {
        System.out.println("showsAllStudents");
        ArrayList<Student> StudentsList = null;
        Deanery.showsAllStudents(StudentsList);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод createXML, класса Deanery.
     */
    @Test
    public void testCreateXML() {
        System.out.println("createXML");
        ArrayList<Student> StudentsList = null;
        Deanery.createXML(StudentsList);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод readXML, класса Deanery.
     */
    @Test
    public void testReadXML() {
        System.out.println("readXML");
        ArrayList<Student> StudentsList = null;
        ArrayList expResult = null;
        ArrayList result = Deanery.readXML(StudentsList);
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод findByGroup, класса Deanery.
     */
    @Test
    public void testFindByGroup() {
        System.out.println("findByGroup");
        ArrayList<Student> StudentsList = null;
        int group = 0;
        ArrayList expResult = null;
        ArrayList result = Deanery.findByGroup(StudentsList, group);
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод findByID, класса Deanery.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        ArrayList<Student> StudentsList = null;
        int id = 0;
        ArrayList expResult = null;
        ArrayList result = Deanery.findByID(StudentsList, id);
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод findByGPA, класса Deanery.
     */
    @Test
    public void testFindByGPA() {
        System.out.println("findByGPA");
        ArrayList<Student> StudentsList = null;
        double GPA = 0.0;
        ArrayList expResult = null;
        ArrayList result = Deanery.findByGPA(StudentsList, GPA);
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод studentsWithGPALess, класса Deanery.
     */
    @Test
    public void testStudentsWithGPALess() {
        System.out.println("studentsWithGPALess");
        ArrayList<Student> StudentsList = null;
        double GPA = 0.0;
        ArrayList expResult = null;
        ArrayList result = Deanery.studentsWithGPALess(StudentsList, GPA);
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод studentsWithGPAOver, класса Deanery.
     */
    @Test
    public void testStudentsWithGPAOver() {
        System.out.println("studentsWithGPAOver");
        ArrayList<Student> StudentsList = null;
        double GPA = 0.0;
        ArrayList expResult = null;
        ArrayList result = Deanery.studentsWithGPAOver(StudentsList, GPA);
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод findByName, класса Deanery.
     */
    @Test
    public void testFindByName() {
        System.out.println("findByName");
        ArrayList<Student> StudentsList = null;
        String name = "";
        ArrayList expResult = null;
        ArrayList result = Deanery.findByName(StudentsList, name);
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод findBySurName, класса Deanery.
     */
    @Test
    public void testFindBySurName() {
        System.out.println("findBySurName");
        ArrayList<Student> StudentsList = null;
        String surName = "";
        ArrayList expResult = null;
        ArrayList result = Deanery.findBySurName(StudentsList, surName);
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод findMaxID, класса Deanery.
     */
    @Test
    public void testFindMaxID() {
        System.out.println("findMaxID");
        ArrayList<Student> StudentsList = null;
        int expResult = 0;
        int result = Deanery.findMaxID(StudentsList);
        assertEquals(result, expResult);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }

    /**
     * Тест метод main, класса Deanery.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Deanery.main(args);
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }
}