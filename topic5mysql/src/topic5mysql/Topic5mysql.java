/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic5mysql;

import java.sql.SQLException;

/**
 *
 * @author Santiago
 */
public class Topic5mysql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        DbManager db = new DbManager();
        
        db.getStudentsAndTeachersByCourse("History");
        
        db.getPercentages("History");
        
        db.listFinalNotesForStudent(123946);
        
        db.listFinalNotesForStudent("Puig");
        
        db.printTeacherSchedule(1);
    }
    
}
