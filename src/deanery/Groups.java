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
    
    Groups(){
        this.idGroup=0;
        this.groupNumber=0;
        this.formEduc="-----";
    }
    
    public void setIdGroup(int idGroup){
          this.idGroup=idGroup;    
      }
    
   public void setGroupNumber(int grNum){
         this.groupNumber=grNum;
   }
   
   public void setFormEduc(String formEduc){
       this.formEduc=formEduc;
   }
   
   public int getIdGroup(){
       return this.idGroup;
   }
    
   public int getGroupNumber(){
       return this.groupNumber;
       }
   
   public String getFormEduc(){
       return this.formEduc;
   }


}

