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
    public void updateStudentGPA(int idStudent, Double GPA) throws SQLException {
        //String hql = "UPDATE student set GPA = :GPA "+"WHERE id_student = :idStudent";
        Session session = null;
          try{ session = HibernateUtil.getSessionFactory().openSession();
               session.getTransaction().begin();
               Query query = session.createQuery("update Student set GPA =:GPA where id_student=:idStudent");
               query.setParameter("GPA", GPA);
               query.setParameter("idStudent", idStudent);
               System.out.println("Data updated succesfully");
               int result = query.executeUpdate();
               session.getTransaction().commit();
               session.close();
          }catch(Exception e){
             JOptionPane.showMessageDialog(null, e.getMessage(), "Fail", JOptionPane.OK_OPTION);     
          }
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection getAllStudents() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet.");
        ArrayList<Student> student = new ArrayList<Student>();
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("from Student");
            List list = query.list();
        }catch(Exception e){
          JOptionPane.showMessageDialog(null, e.getMessage(), "Fail", JOptionPane.OK_OPTION);  
        }
        return student;
    }

    @Override
    public void deleteStudent(Student stud) throws SQLException {
       Session session = null;
       try{
           session = HibernateUtil.getSessionFactory().openSession();
           session.getTransaction().begin();
           session.delete(stud);
           session.getTransaction().commit();
           session.close();
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Fail", JOptionPane.OK_OPTION);
       }
    }

    @Override
    public Collection getStudentByName(Student s) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
