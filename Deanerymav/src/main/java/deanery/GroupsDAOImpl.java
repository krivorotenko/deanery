/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deanery;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author win7
 */
public class GroupsDAOImpl implements GroupsDAO{

    @Override
    public void addGroup(Groups gr) throws SQLException {
         Session session = null;
        try{ session = HibernateUtil.getSessionFactory().openSession();
             session.beginTransaction();
             session.save(gr);
             session.getTransaction().commit();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Fail", JOptionPane.OK_OPTION);  
          }finally{
            if(session!=null && session.isOpen())
                session.close();
           }
    }

    @Override
    public void deleteGroup(int groupID) throws SQLException {
       Session session = null;
        String s = new String();
       try{
           session = HibernateUtil.getSessionFactory().openSession();
           session.getTransaction().begin();
           Query query = session.createQuery("delete Groups where id_group=:id");
               query.setParameter("id", groupID);
               int result = query.executeUpdate();
               session.getTransaction().commit();
               System.out.println("Data deleted succesfully");
               session.close();
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Fail", JOptionPane.OK_OPTION);
       }  
    }

    @Override
    public void showGroups() throws SQLException {
        Session session = null;
         String s = new String();
        try{
           session = HibernateUtil.getSessionFactory().openSession();
           session.getTransaction().begin();
           Query query = session.createQuery("from Groups");
               int result = query.executeUpdate();
               session.getTransaction().commit();
               //List list = query.list();
               session.close();
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Fail", JOptionPane.OK_OPTION);
       }
        
    }
   
}
