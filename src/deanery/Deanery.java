
        
package deanery;

//import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Collections;
import java.lang.Enum;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deanery {
    
        
    public static void addStudent(String name, String surName, int group, double GPA){
//      Student B = new Student(name, surName, group, GPA);
      /* B.setID(id);
       B.setName(name);
       B.setSurName(surName);
       B.setGroup(group);
       B.setGPA(GPA);
     return B;   */
    }

    public static void serialize(ArrayList<Student> StudentsList) throws IOException{
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("temp.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(StudentsList);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Deanery.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Deanery.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public static ArrayList deserialize() throws IOException, ClassNotFoundException{
        ArrayList<Student> StudentsList = new ArrayList<Student>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("temp.out");
            ObjectInputStream oin = new ObjectInputStream(fis);
            StudentsList = (ArrayList) oin.readObject();
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Deanery.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Deanery.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       System.out.println("Deserialization finished successfully");
       return StudentsList; 
    }
    
    public static void showsAllStudents(ArrayList<Student> StudentsList){
        for(int i=0; i<StudentsList.size(); i++){
             System.out.println("ID: "+StudentsList.get(i).getId()+" Name: "+StudentsList.get(i).getName()+" Surname: "+StudentsList.get(i).getSurname()+" Group# " +StudentsList.get(i).getGroup()+" Student's GPA: "+StudentsList.get(i).getGPA());             
         }  
    }
 
  
    
    public static void createXML(ArrayList<Student> StudentsList) {  
  try {  
  
   DocumentBuilderFactory documentFactory = DocumentBuilderFactory  
     .newInstance();  
   DocumentBuilder documentBuilder = documentFactory  
     .newDocumentBuilder();  
  
   // define root element  
   Document document = documentBuilder.newDocument();  
   Element rootElement = document.createElement("List");  
   document.appendChild(rootElement);  
  
   for(int i=0; i<StudentsList.size(); i++){
   // define student elements  
   Element xml = document.createElement("Student");  
   rootElement.appendChild(xml);  
  
   // add attributes to student  
   Attr attribute = document.createAttribute("id");  
   attribute.setValue(""+StudentsList.get(i).getId());  
   xml.setAttributeNode(attribute);  
  
   // name element  
   Element firstname = document.createElement("name");  
   firstname.appendChild(document.createTextNode(""+StudentsList.get(i).getName()));  
   xml.appendChild(firstname);  
  
   // surname element  
   Element lastname = document.createElement("surname");  
   lastname.appendChild(document.createTextNode(""+StudentsList.get(i).getSurname()));  
   xml.appendChild(lastname);  
  
   // group elements  
   Element group = document.createElement("group");  
   group.appendChild(document.createTextNode(""+StudentsList.get(i).getGroup()));  
   xml.appendChild(group);  
  
   // GPA elements  
   Element GPA = document.createElement("GPA");  
   GPA.appendChild(document.createTextNode(""+StudentsList.get(i).getGPA()));  
   xml.appendChild(GPA);  
  
   // creating and writing to xml file  
   TransformerFactory transformerFactory = TransformerFactory  
     .newInstance();  
   Transformer transformer = transformerFactory.newTransformer();  
   DOMSource domSource = new DOMSource(document);  
   StreamResult streamResult = new StreamResult(new File("Student.xml"));  
  
   transformer.transform(domSource, streamResult);  
  
   System.out.println("File saved to specified path!");  
  
   }
  } catch (ParserConfigurationException pce) {  
   pce.printStackTrace();  
  } catch (TransformerException tfe) {  
   tfe.printStackTrace();  
  }  
 }
   
    public static ArrayList<Student> readXML(ArrayList<Student> StudentsList) {  
       int id1=0; int group=0;  
        String name=""; String surName=""; double GPA=0;
        
  try {  
  
   File xmlFile = new File("Student.xml");  
   DocumentBuilderFactory documentFactory = DocumentBuilderFactory  
     .newInstance();  
   DocumentBuilder documentBuilder = documentFactory  
     .newDocumentBuilder();  
   Document doc = documentBuilder.parse(xmlFile);  
  
   doc.getDocumentElement().normalize();  
   NodeList nodeList = doc.getElementsByTagName("Student");  
  
   for (int temp = 0; temp < nodeList.getLength(); temp++) {  
       
       Node node = nodeList.item(temp);  
         
  
    if (node.getNodeType() == Node.ELEMENT_NODE) {  
  
     Element student = (Element) node;  
  
   /*  System.out.println("Student id : "  
       + student.getAttribute("id"));  
     System.out.println("First Name : "  
       + student.getElementsByTagName("name").item(0)  
         .getTextContent());  
     System.out.println("Last Name : "  
       + student.getElementsByTagName("surname").item(0)  
         .getTextContent());  
     System.out.println("Group # : "  
       + student.getElementsByTagName("group").item(0)  
         .getTextContent());  
     System.out.println("GPA : "  
       + student.getElementsByTagName("GPA").item(0)  
         .getTextContent());  */
      //---------
      
      id1=Integer.parseInt(student.getAttribute("id"));
      name=student.getElementsByTagName("name").item(0).getTextContent();
      surName=student.getElementsByTagName("surname").item(0).getTextContent();
      group=Integer.parseInt(student.getElementsByTagName("group").item(0).getTextContent());
      GPA=Double.parseDouble(student.getElementsByTagName("GPA").item(0).getTextContent());
      //----
     
      
      StudentsList.add(new Student(/*id1, */name, surName, group, GPA));
      
    } 
    
   }  
  } catch (Exception e) {  
   e.printStackTrace();  
  }
  return StudentsList;
 } 
  
  
    public static ArrayList<Student> findByGroup(ArrayList<Student> StudentsList, int group){
      ArrayList<Student>result= new ArrayList<Student>();
      for(int i=0; i<StudentsList.size(); i++){
         if (StudentsList.get(i).getGroup()==group)
                        result.add(StudentsList.get(i));
     }    
      return result;
 }   
  
 
    public static ArrayList<Student> findByID(ArrayList<Student> StudentsList, int id){
      ArrayList<Student>result= new ArrayList<Student>();
      for(int i=0; i<StudentsList.size(); i++){
         if (StudentsList.get(i).getId()==id)
                        result.add(StudentsList.get(i));
     }    
      return result;
      }
 
    public static ArrayList<Student> findByGPA(ArrayList<Student> StudentsList, double GPA){
      ArrayList<Student>result= new ArrayList<Student>();
     for(int i=0; i<StudentsList.size(); i++){
         if (StudentsList.get(i).getGPA()==GPA)
                        result.add(StudentsList.get(i));
     }    
        return result;
     }
 
 
    public static ArrayList<Student> studentsWithGPALess(ArrayList<Student> StudentsList, double GPA){
      ArrayList<Student>result= new ArrayList<Student>();
      for(int i=0; i<StudentsList.size(); i++){
         if (StudentsList.get(i).getGPA()<=GPA)
                        result.add(StudentsList.get(i));
     }    
       return result;
      }
 
 
     public static ArrayList<Student> studentsWithGPAOver(ArrayList<Student> StudentsList, double GPA){
         ArrayList<Student>result= new ArrayList<Student>();
         for(int i=0; i<StudentsList.size(); i++){
           if (StudentsList.get(i).getGPA()>=GPA)
                          result.add(StudentsList.get(i));
       }    
         return result;
       }
 
    public static ArrayList<Student> findByName(ArrayList<Student> StudentsList, String name){
      ArrayList<Student>result= new ArrayList<Student>();
      for(int i=0; i<StudentsList.size(); i++){
         if (name.equals(StudentsList.get(i).getName()))
                        result.add(StudentsList.get(i));
     }
      return result;
 } 
    
  
 
    public static ArrayList<Student> findBySurName(ArrayList<Student> StudentsList, String surName){
      ArrayList<Student>result= new ArrayList<Student>();
      for(int i=0; i<StudentsList.size(); i++){
         if (surName.equals(StudentsList.get(i).getSurname()))
                        result.add(StudentsList.get(i));
     }
       return result;
 } 
    
    /*public static int findMaxID(ArrayList<Student> StudentsList){
        int maxID=0;
        for(int i=0; i<StudentsList.size(); i++){
            if(StudentsList.get(i).getID() > maxID)
                   maxID = StudentsList.get(i).getID();
            }
        
        return maxID;
    }*/
 
 
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, TransformerException, SQLException {
      ArrayList<Student> StudentsList = new ArrayList<Student>();  
      ArrayList<Student> result = new ArrayList<Student>();  
      Scanner in= new Scanner(System.in);
      int maxID=0;
        int id=0; int group=0;  
        String name=""; String surName=""; double GPA=0;
        
           
      /*  for(int i=0; i<10; i++){
            System.out.println("Enter id:");
            id=in.nextInt();
            System.out.println("Enter name:");
            name=in.next();
            System.out.println("Enter surname:");
            surName=in.next();
            System.out.println("Enter group:");
            group=in.nextInt();
            System.out.println("Enter GPA:");
            GPA=in.nextDouble();
            StudentsList.add(Deanery.addStudent(id, name, surName, group, GPA));
        }*/
        
     

        // Deanery.Serialize(StudentsList);
        
                
         /*StudentsList=Deanery.Deserialize();
         Deanery.ShowsAllStudents(StudentsList);
         System.out.println("Sorting Students by GPA :"); 
         
         Collections.sort(StudentsList, new SortingByGPA());
         Deanery.ShowsAllStudents(StudentsList);
         
         System.out.println("Sorting Students by group :");
         Collections.sort(StudentsList, new SortingByGroup());
         Deanery.ShowsAllStudents(StudentsList);
         
         System.out.println("Sorting students by name :");
         Collections.sort(StudentsList, new SortingByName());
         Deanery.ShowsAllStudents(StudentsList);
         
         System.out.println("Sorting students by Surname :");
         Collections.sort(StudentsList, new SortingBySurname());
         Deanery.ShowsAllStudents(StudentsList);*/
         
         
         //Deanery.createXML(StudentsList);
        // Deanery.readXML(StudentsList);
        // System.out.println("");
        // Deanery.showsAllStudents(StudentsList);
        // System.out.println("");
         
         //result = Deanery.studentsWithGPALess(StudentsList, 4.2);
         //Deanery.showsAllStudents(result);
         //Connection connect = DB.dbCreateConnection();
         ResultSet requestResult = DB.showTableStudent();
         //DB.addNewStudent("Olga", "Eeeee", 3.5, 2);
         //DB.deleteStudent(1);
         //DB.updateStudentsGPA(3, 3.8);
         //requestResult = 
          DB.showTableGroups();
         //requestResult = 
         //DB.sortStudentByField("name");
         // DB.addGroup(421, "stationary");
         requestResult = DB.sortStudentByField("name");
         
         String str = DB.printResultSet(requestResult);
         System.out.println(str);
         
       //  Student st1  = new Student();
       //  Student st2 = new Student();
       //  Student st3 = new Student();
       //  ArrayList<Student> arr = new ArrayList<Student>();
       //  arr.add(st1);
         
         //arr.sortByName();
       Student a = new Student();
       a.setName("sasha");
       a.setSurname("krivorotenko");
       a.setGPA(4.4);
       a.setGroup(2);
       Factory.getStudentDAO().addStudent(a);
       
    }
}
