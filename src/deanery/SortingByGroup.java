/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deanery;

import java.util.Comparator;


public class SortingByGroup implements Comparator<Student>{

    @Override
    public int compare(Student t, Student t1) {
        
         if(t.getGroup() > t1.getGroup()) {
                    return 1;
             }
             else if(t.getGroup() < t1.getGroup()) {
                    return -1;
             }
             else {
                    return 0;
             }
    }
    
}
