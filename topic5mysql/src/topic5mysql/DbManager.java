/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic5mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago
 */
public class DbManager {
        private static final Logger log = Logger.getLogger(DbManager.class.toString());

    private static Connection conn =null;
    
    private static Statement stm = null;
    
    /**
     * Loads drivers and connects to database
     */
    public DbManager(){
        openConnection();
    }
            
    
    private static void openConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver" );
            log.info("Loaded MySQL Driver");
        } 
        catch (Exception e) {
            log.log(Level.INFO, "ERROR: failed to load MySQL driver - {0}", e.getMessage());
            return;
        }

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "mysql");
            log.info("Connection established");     
        }
        catch(SQLException e){
            log.log(Level.INFO, "db connection error Exception: {0}", e.getMessage());
        }
    }
    
    
    
    
   /**
    * Lists the teacher and the students for a given course name
    * @param courseName name of the course
    * @throws SQLException 
    */ 
    public void getStudentsAndTeachersByCourse(String courseName) throws , badInputException {
        try {            
            Statement stt = conn.createStatement();
            stt.execute("USE `high-school`");
            PreparedStatement ps = null;
            System.out.println("Course: " + courseName);
            ps = conn.prepareStatement("SELECT t.lastName, t.firstName FROM teacher AS t, course AS c WHERE c.idTeacher = t.idTeacher AND c.courseName = ? ");
            ps.setString(1, courseName);
            ResultSet res = ps.executeQuery();
            if (res.next()){
            System.out.println("Teacher: " + res.getString("lastName") +", " + res.getString("firstName"));
            System.out.println("Students: ");
            } else {
                throw new badInputException();
            }
            ps = conn.prepareStatement("SELECT s.lastName, s.firstName FROM notes n, student s, course c WHERE n.idCourse = c.idCourse AND c.courseName = ? AND n.idStudent = s.idStudent ORDER BY s.lastName ASC");
            ps.setString(1, courseName);
            res = ps.executeQuery();
             while (res.next()) {
                 System.out.println("   " + res.getString("lastName") + ", " + res.getString("firstName"));
             }
             
            }catch (badInputException e) {
            throw new badInputException("Course name not found");
 }
    }
    
    /**
     * Lists final notes of all students with a given Last name, ordered by Note
     * @param lastName Last name of the student
     * @throws SQLException 
     */
    public void listFinalNotesForStudent(String lastName) throws SQLException, badInputException{
            try{
            Statement stt = conn.createStatement();
            stt.execute("USE `high-school`");
            PreparedStatement ps = null;
            
            System.out.println("Students: " + lastName);
            
            ps = conn.prepareStatement("SELECT n.finalNote, c.courseName, s.idStudent FROM notes n, course c, student s WHERE n.idStudent = s.idStudent AND n.idCourse = c.idCourse AND s.lastName = ?  ORDER BY n.finalNote DESC");
            ps.setString(1, lastName);
            
            ResultSet res = ps.executeQuery();
            if (!res.next()){
                throw new badInputException();
            } else {
            while (res.next()){
         
                System.out.println("Student id: " +res.getString("idStudent"));
                System.out.println("Course: " + res.getString("courseName"));
                System.out.println("Final note: " + res.getDouble("finalNote"));
                System.out.println("*************");
            }
    } }
        catch (badInputException e) {
            throw new badInputException("Last name not found");
    }
    }
 
    /**
     * List final notes for a single student given his registration number
     * @param regNumber Student registration number
     * @throws SQLException 
     */
    public void listFinalNotesForStudent(int regNumber) throws SQLException, badInputException{
            try{
            Statement stt = conn.createStatement();
            stt.execute("USE `high-school`");
            PreparedStatement ps = null;
            
            System.out.println("Student registration number: " + regNumber);
            
            ps = conn.prepareStatement("SELECT n.finalNote, c.courseName FROM notes n, student s, course c WHERE n.idCourse = c.idCourse AND n.idStudent = s.idStudent AND s.registrationNumber = ? ORDER BY n.finalNote DESC");
            ps.setInt(1, regNumber);
            
            ResultSet res = ps.executeQuery();
            if (!res.next()){
                throw new badInputException();
            } else {
            while (res.next()){
                System.out.println("Course: " + res.getString("courseName"));
                System.out.println("Final note: " + res.getDouble("finalNote"));
            }
    } } catch (badInputException e) {
            throw new badInputException("Registration number not found");
    }
    }
    
    /**
     * Prints percentage of students failing/passing a given course 
     * @param courseName Name of the course
     * @throws SQLException 
     */
    public void getPercentages(String courseName)throws SQLException, badInputException{
        try{
            int pass = 0;
            int fail = 0;
            int count = 0;
            
            Statement stt = conn.createStatement();
            stt.execute("USE `high-school`");
            PreparedStatement ps = null;
                      
            ps = conn.prepareStatement("SELECT n.finalNote FROM notes n, course c WHERE n.idCourse = c.idCourse AND c.courseName = ? ");
            ps.setString(1, courseName);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()){
                throw new badInputException();
            } else {
            while (rs.next()){
                if (rs.getDouble("finalNote") < 6.0){
                    fail += 1;
                } else {
                    pass +=1;
                }
                count +=1 ;
            }
            double passingPercentage = (((double)pass/(double)count)*100);
            double failingPercentage = (((double)fail/(double)count)*100);
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println("Percentage of students failing the course: " + df.format(passingPercentage) + "%");
            System.out.println("Percentage of students passing the course: " + df.format(failingPercentage) + "%");
    } } catch (badInputException e) {
           throw new badInputException("Course name not found");
    }
}
    
    /**
     * Prints a teacher schedule
     * @param teacherId Id of the teacher
     * @throws SQLException 
     */
    public void printTeacherSchedule(int teacherId) throws SQLException, badInputException{
         try{
            Statement stt = conn.createStatement();
            stt.execute("USE `high-school`");
            PreparedStatement ps = null;
            
            ps = conn.prepareStatement("SELECT t.lastName, t.firstName FROM teacher t WHERE t.idTeacher = ?");
            ps.setInt(1, teacherId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
            System.out.println("Teacher: " + rs.getString("lastName") + ", " + rs.getString("firstName"));
            
            System.out.println("Schedule: ");
            
             ps = conn.prepareStatement("SELECT c.schedule, c.courseName FROM course c WHERE c.idTeacher = ?");
             ps.setInt(1, teacherId);
             
             rs = ps.executeQuery();
             
             while (rs.next()){
                 System.out.println("  " +rs.getString("schedule") + ", " + rs.getString("courseName"));
             }
    } 
                  else {
                throw new badInputException();
            }
        } catch (badInputException e) {
            throw new badInputException("Teacher id not found");
      
    }
}

        class badInputException extends Exception {

        public badInputException() {
        }

        public badInputException(String message) {
            super(message);
        }
    }

}
