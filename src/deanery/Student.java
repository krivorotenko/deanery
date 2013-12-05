
package deanery;

import java.io.Serializable;
import java.io.ObjectOutputStream;

public class Student implements Serializable{
        private  int id;
        private String name;
        private String surname;
        private int group;
        private double GPA;
        
        public Student(){
            
        }
        
        
        public Student(String name, String surname, int group, double GPA){
            //this.id=id;
            this.name=name;
            this.surname=surname;
            this.group=group;
            this.GPA=GPA;
           }
        
        public void setId(int id1){
            
            id=id1;
        }
        
        public void setName(String name){
            
            this.name=name;
        }
        
        public void setSurname(String Surname){
            
            this.surname=Surname;
        }
        
        public void setGroup(int group){
            
            this.group=group;
        }
        
        public void setGPA(double GPA){
            
            this.GPA=GPA;
        }
        
        public int getId(){
            return this.id;
        }
        
        public String getName(){
            return this.name;
        }
        
        public String getSurname(){
            return this.surname;
        }
        
        public int getGroup(){
            return this.group;
        }
        
        public double getGPA(){
            return this.GPA;
        }
    
        @Override
        public String toString(){
            return this.id+" "+this.name+" "+this.surname+" "+this.group+" "+this.GPA ;
            
        }
        
       @Override
        public boolean equals(Object obj){
          if (this==obj)
              return true;
           if (obj instanceof Student){
               if ( ((Student)obj).getName().equals(this.getName()) &&
                   ((Student)obj).getSurname().equals(this.getSurname()) && 
                   ((Student)obj).getGroup()== this.getGroup() &&
                   ((Student)obj).getGPA()== this.getGPA() ) {  return true;
                                                             }
               else {
                     return false;
                     }
           
           } else {
                    return false;
                   }
        }
}
