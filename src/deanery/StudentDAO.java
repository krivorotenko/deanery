/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deanery;


import java.util.Collection;
import java.sql.SQLException;


public interface StudentDAO {
    public void addStudent(Student A) throws SQLException;
    public void updateStudentGPA(Integer id) throws SQLException;
    public Collection getAllStudents() throws SQLException;
    public void deleteStudent(int id) throws SQLException;
    public Collection getStudentByName(Student s) throws SQLException;
}