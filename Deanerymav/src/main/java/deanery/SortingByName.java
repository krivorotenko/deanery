/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deanery;

import java.util.Comparator;

public class SortingByName implements Comparator<Student>{

    @Override
    public int compare(Student t, Student t1) {
        String str1 = t.getName();
        String str2 = t1.getName();
        return str1.compareTo(str2);
    }
    
}
