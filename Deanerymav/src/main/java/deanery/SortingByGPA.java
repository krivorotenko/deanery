/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deanery;


import java.util.Comparator;
import java.util.Collections;

public class SortingByGPA implements Comparator<Student>{

    @Override
    public int compare(Student t, Student t1) {
           if(t.getGPA() > t1.getGPA()) {
                    return 1;
             }
             else if(t.getGPA() < t1.getGPA()) {
                    return -1;
             }
             else {
                    return 0;
             }
     
     
    }
    
}
