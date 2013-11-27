/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deanery;

import java.util.Comparator;

public class SortingBySurname implements Comparator<Student>{

    @Override
    public int compare(Student t, Student t1) {
        String str1 = t.getSurName();
        String str2 = t1.getSurName();
        return str1.compareTo(str2);        
    }
    
}
