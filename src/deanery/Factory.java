/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deanery;




public class Factory {
    private static StudentDAO studentDAO = null;
    private static Factory instance = null;
    
    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }   
       
    public static StudentDAO getStudentDAO(){
          if(studentDAO == null){
             studentDAO = new StudentDAOImpl(); 
          }
          return studentDAO;
       }
    
    
    
}
