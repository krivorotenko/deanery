
package deanery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class DB {
    
    public static Connection dbCreateConnection(){
      Connection conn = null;
    try
    {
    String userName = "root";
    String password = "root";
    String url = "jdbc:mysql://localhost:3306/Student"; 
    Class.forName ("com.mysql.jdbc.Driver").newInstance ();
    conn = DriverManager.getConnection (url, userName, password);
    System.out.println ("Connected to database succesfully");
    System.out.println("");
    }   
    catch (Exception e)
      {
        System.err.println ("Cannot connect to database server");
        e.printStackTrace();
      }
        /*finally
           {
            if (conn != null)
                {
                    try
                        {
                            conn.close ();
                            System.out.println ("Database connection terminated"); 
                        }
                        catch (Exception e) { }
                }
            }     */  


    return conn;
    }
    
    public static ResultSet showTableStudent(){
        ResultSet rs=null;
        try {
    Connection dbConnection = DB.dbCreateConnection();
    Statement  state = dbConnection.createStatement();
    //statement.executeQuery("Select * From "+tableName+";");
    // выбираем данные с БД
     rs = state.executeQuery("SELECT * From student;");
 
    // И если что то было получено то цикл while сработает   
    while (rs.next()) {
        String idStudent = rs.getString("id_student");
        String name = rs.getString("name");
        String surname = rs.getString("surname");
        String GPA = rs.getString("GPA");
        String idGroup = rs.getString("id_group");
        
        System.out.println("    Student's id : " + idStudent);
        System.out.println("    name: " + name);
        System.out.println("    surname: " + surname);
        System.out.println("    GPA: " + GPA);
        System.out.println("    Group: " + idGroup);
        System.out.println("-----------------------");
    }
} catch (SQLException e) {
    System.out.println(e.getMessage());
}
    return rs;
    }

    public static void showTableGroups(){
        ResultSet rs = null;
        
        try{
            Connection dbConnection = DB.dbCreateConnection();
            Statement  state = dbConnection.createStatement();
            
            rs = state.executeQuery("SELECT * From groups;");
       
            while (rs.next()) {
                
          String idGroup = rs.getString("id_group");
          String groupNumber = rs.getString("group_number");
          String formEduc = rs.getString("form_educ");
         
        
          System.out.println("    Student's id : " + idGroup);
          System.out.println("    name: " + groupNumber);
          System.out.println("    surname: " + formEduc);
          System.out.println("-----------------------");
    } 
           }catch(SQLException e){
              System.out.println(e.getMessage());
            }
        
    }
    
    public static void addNewStudent(String name, String surName, Double GPA, int idGroup){
        ResultSet rs=null; int res=0;
        String request="INSERT INTO `student`(name, surname, gpa, id_group) VALUES('"+name+"','"+surName+"',"+GPA+","+idGroup+");";
       try{
        Connection dbConnection = DB.dbCreateConnection();
        Statement  state = dbConnection.createStatement();
       // rs = state.exe
        //if (rs) 
        res = state.executeUpdate(request);
        System.out.println("Data added succesfully");
       } catch(SQLException e) {
              System.out.println(e.getMessage()); }
    
    }
    
    
    public static void deleteStudent(int idStudent){
        ResultSet rs=null; int res=0;
        String request="DELETE FROM student WHERE id_student="+idStudent+";";
           try{
                 Connection dbConnection = DB.dbCreateConnection();
                 Statement  state = dbConnection.createStatement();
               
                 res = state.executeUpdate(request);
                 
                 if (res>0) System.out.println("Data added succesfully");
                 else System.out.println("Transaction failed");
              }catch(SQLException e)
                                     {
                                       System.out.println(e.getMessage());
                                     }
    }
    
    public static void updateStudentsGPA(int idStudent, double GPA){
        ResultSet rs=null; int res=0;
        String request="UPDATE student SET GPA="+GPA+" WHERE id_student="+idStudent+";";
        try { 
              Connection dbConnection = DB.dbCreateConnection();
              Statement  state = dbConnection.createStatement();
              res = state.executeUpdate(request);
            }catch(SQLException e)
           { 
               System.out.println(e.getMessage());
           }
     }
    
    public static ResultSet sortStudentByField(String field){
        ResultSet requestResult = null;
        String request = "SELECT * FROM student ORDER BY "+field+";";
        
           try{ 
               
                 Connection dbConnection = DB.dbCreateConnection();
                 Statement  state = dbConnection.createStatement();
                 requestResult = state.executeQuery(request);
                 
               }catch(SQLException e)
                 {
                     System.out.println(e.getMessage()); 
                 }
        
        return requestResult;
    }
    
    public static String printResultSet(ResultSet rs){
        String res = "\tStudent's id\t\t\tname\t\t\tsurname\t\t\tGPA\t\t\tGroup\t\t\t\n";
                try{ 
                 while (rs.next()) {
                 String idStudent = rs.getString("id_student");
                 String name = rs.getString("name");
                 String surname = rs.getString("surname");
                 String GPA = rs.getString("GPA");
                 String idGroup = rs.getString("id_group");
        
                 res+= "\t\t" + idStudent +"\t\t\t" + name +"\t\t\t" + surname + "\t\t\t" + GPA+"\t\t\t" + idGroup+";" + "\n";
                 
    }
                }catch(SQLException e){
                     System.out.println(e.getMessage()); 
                   }
                  return res;
    }
    
    public static void addGroup(int number, String formEducation){
        String request; 
        ResultSet rs=null; int res=0;
        Connection dbConnection = DB.dbCreateConnection();
        request = "INSERT INTO groups(group_number, form_educ) VALUES ("+number+", '"+formEducation+"');";
         try {
                 
                 Statement  state = dbConnection.createStatement();
                 res = state.executeUpdate(request);
                 if(res>0)  
                          System.out.println("Data insserted.");
                 else System.out.println("Something was wrong.");
             } catch(SQLException e) {
                                     System.out.println(e.getMessage());
                                   }
       }
    
     
}
    
