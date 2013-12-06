/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Deanery;

import deanery.Groups;
import java.sql.SQLException;
/**
 *
 * @author okryvortc
 */
public interface GroupDAO {
    public void addGroup(Groups group) throws SQLException;
    public void refreshGroup(int id) throws SQLException;
    public void deleteGroup(Groups group) throws SQLException;
    
    
    
}
