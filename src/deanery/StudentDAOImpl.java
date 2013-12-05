/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deanery;

import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Query;

/**
 *
 * @author okryvortc
 */
public class StudentDAOImpl implements StudentDAO{

    @Override
    public void addStudent(Student A) throws SQLException {
        Session session = null;
        try{ session = HibernateUtil.getSessionFactory().openSession();
             session.beginTransaction();
             session.save(A);
             session.getTransaction().commit();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Fail", JOptionPane.OK_OPTION);  
          }finally{
            if(session!=null && session.isOpen())
                session.close();
           }
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateStudentGPA(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection getAllStudents() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteStudent(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection getStudentByName(Student s) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
