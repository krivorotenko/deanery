
package deanery;

import java.io.Serializable;
import java.io.ObjectOutputStream;

public class Student implements Serializable{
        private  int id;
        private String name;
        private String surname;
        private int group;
        private double GPA;
        
        
        public Student(int id, String name, String surname, int group, double GPA){
            this.id=id;
            this.name=name;
            this.surname=surname;
            this.group=group;
            this.GPA=GPA;
           }
        
        public void setID(int id1){
            
            id=id1;
        }
        
        public void setName(String name){
            
            this.name=name;
        }
        
        public void setSurName(String Surname){
            
            this.surname=Surname;
        }
        
        public void setGroup(int group){
            
            this.group=group;
        }
        
        public void setGPA(double GPA){
            
            this.GPA=GPA;
        }
        
        public int getID(){
            return this.id;
        }
        
        public String getName(){
            return this.name;
        }
        
        public String getSurName(){
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
        
        public void aaaa(){
    
             }
}
