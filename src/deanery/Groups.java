/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deanery;

/**
 *
 * @author okryvortc
 */
public class Groups {
    
    private int idGroup;
    private int groupNumber;
    private String formEduc;
    private Student A;
    
    Groups(){
        this.idGroup=0;
        this.groupNumber=0;
        this.formEduc="-----";
    }
    
    public void setId(int idGroup){
          this.idGroup=idGroup;    
      }
    
   public void setGroupNumber(int grNum){
         this.groupNumber=grNum;
   }
   
   public void setFormEduc(String formEduc){
       this.formEduc=formEduc;
   }
   
   public int getId(){
       return this.idGroup;
   }
    
   public int getGroupNumber(){
       return this.groupNumber;
       }
   
   public String getFormEduc(){
       return this.formEduc;
   }

   public Student getStudent(){
       return this.A;
   }
   
   public void setStudent(Student stud){
       this.A=stud;
   }
}

