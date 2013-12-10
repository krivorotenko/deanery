/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deanery;

import java.sql.SQLException;

/**
 *
 * @author win7
 */
public interface GroupsDAO {
     public void addGroup(Groups gr) throws SQLException;
     public void deleteGroup(int groupID) throws  SQLException;
     public void showGroups() throws SQLException;
}
