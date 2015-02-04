/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabootcamp.high.school;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author roberta
 */
public class HighSchoolAccess {

    private static final Logger LOG = Logger.getLogger(HighSchoolAccess.class.getName());

    private static Connection conection = null;

    private static void initConnection() {
        if (conection != null) {
            return;
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            LOG.info("Loaded MySQL Driver");
        } catch (ClassNotFoundException e) {
            LOG.log(Level.SEVERE, "ERROR: failed to load MySQL driver - {0}", e.getMessage());
            return;
        }

        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/high-school", "root", "famas");
            LOG.info("Connection established");
        } catch (SQLException e) {
            LOG.log(Level.SEVERE, "db connection error Exception: {0}", e.getMessage());
        }
    }

    public void printStudentsByCourse(int courseId) {
        try {
            checkValidCourse(courseId);
            PreparedStatement prepareStatement;
            ResultSet rs;
            prepareStatement = conection.prepareStatement("SELECT s.last_name, s.first_name FROM student s JOIN student_course sc on s.reg_num = sc.id_student\n"
                    + "WHERE sc.id_course = ? "
                    + "ORDER BY s.last_name;");
            prepareStatement.setInt(1, courseId);
            rs = prepareStatement.executeQuery();
            System.out.println("Students:");
            while (rs.next()) {
                System.out.println(rs.getString("last_name") + "\t" + rs.getString("first_name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(HighSchoolAccess.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }

    public void finalNotesEstudent(String lastName) {
        try {
            initConnection();
            PreparedStatement prepareStatement = conection.prepareStatement("SELECT sc.final_note, c.name_course, s.reg_num FROM"
                    + " student_course sc "
                    + " JOIN course c ON c.id=sc.id_course"
                    + " JOIN student s on s.reg_num = sc.id_student"
                    + " WHERE s.last_name = ? "
                    + "ORDER BY sc.final_note DESC");
            prepareStatement.setString(1, lastName);
            ResultSet rs = prepareStatement.executeQuery();
            System.out.println("Note\tCourse");
            while (rs.next()) {
                System.out.println(rs.getDouble("final_note") + "\t" + rs.getString("name_course"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(HighSchoolAccess.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }

    public void finalNotesEstudent(int reg_num) {
        try {
            initConnection();
            PreparedStatement prepareStatement = conection.prepareStatement("SELECT sc.final_note, c.name_course, s.reg_num FROM"
                    + " student_course sc "
                    + " JOIN course c ON c.id=sc.id_course"
                    + " JOIN student s on s.reg_num = sc.id_student"
                    + " WHERE s.reg_num = ? "
                    + "ORDER BY sc.final_note DESC");
            prepareStatement.setInt(1, reg_num);
            ResultSet rs = prepareStatement.executeQuery();
            System.out.println("Note\tCourse");
            while (rs.next()) {
                System.out.println(rs.getDouble("final_note") + "\t" + rs.getString("name_course"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(HighSchoolAccess.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }

    public void printPercentajeOfApprovedStudents(int courseId) {
        try {
            checkValidCourse(courseId);
            PreparedStatement prepareStatement;
            ResultSet rs;
            prepareStatement = conection.prepareStatement("select sc.id_course,\n"
                    + "count(1) as pass_count,\n"
                    + "(select count(1) from student_course sc1 \n"
                    + "where sc1.id_course = sc.id_course ) as total_count\n"
                    + "from\n"
                    + "student s JOIN student_course sc on s.reg_num = sc.id_student\n"
                    + "WHERE sc.id_course = ?\n"
                    + "and sc.final_note>=6\n"
                    + ";");
            prepareStatement.setInt(1, courseId);
            rs = prepareStatement.executeQuery();
            if (rs.next()) {
                System.out.println("Percentage of approved students:");
                double totalCnt = rs.getDouble("total_count");
                double passCnt = rs.getDouble("pass_count");
                double percentage = (passCnt / totalCnt) * 100;
                System.out.println(percentage + " %");

            }
        } catch (SQLException ex) {
            Logger.getLogger(HighSchoolAccess.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }

    private void checkValidCourse(int courseId) throws IllegalArgumentException, SQLException {
        initConnection();
        PreparedStatement prepareStatement = conection.prepareStatement("SELECT c.name_course, t.first_name,t.last_name FROM course c JOIN teacher t ON t.id = c.assigned_teacher_id "
                + "WHERE c.id = ? ");
        prepareStatement.setInt(1, courseId);

        ResultSet rs;
        rs = prepareStatement.executeQuery();
        if (rs.next()) {
            System.out.println("Course:" + rs.getString("name_course"));
            System.out.println("Teacher:" + rs.getString("last_name") + ", " + rs.getString("first_name"));
        } else {
            throw new IllegalArgumentException("Invalid course id!");
        }
    }

    public void printPercentajeOfFailedStudents(int courseId) {
        try {
            checkValidCourse(courseId);
            PreparedStatement prepareStatement;
            ResultSet rs;
            prepareStatement = conection.prepareStatement("select sc.id_course,\n"
                    + "count(1) as pass_count,\n"
                    + "(select count(1) from student_course sc1 \n"
                    + "where sc1.id_course = sc.id_course ) as total_count\n"
                    + "from\n"
                    + "student s JOIN student_course sc on s.reg_num = sc.id_student\n"
                    + "WHERE sc.id_course = ?\n"
                    + "and sc.final_note<6\n"
                    + ";");
            prepareStatement.setInt(1, courseId);
            rs = prepareStatement.executeQuery();
            if (rs.next()) {
                System.out.println("Percentage of failed students:");
                double totalCnt = rs.getDouble("total_count");
                double passCnt = rs.getDouble("pass_count");
                double percentage = (passCnt / totalCnt) * 100;
                System.out.println(percentage + " %");

            }
        } catch (SQLException ex) {
            Logger.getLogger(HighSchoolAccess.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }

    public void printTeacherSchedule(int teacherId) {
        try {

            PreparedStatement prepareStatement;
            ResultSet rs;

            prepareStatement = conection.prepareStatement("SELECT last_name,first_name FROM teacher where id =?");
            prepareStatement.setInt(1, teacherId);
            rs = prepareStatement.executeQuery();
            if (rs.next()) {
                System.out.println("Teacher: " + rs.getString("last_name") + ", " + rs.getString("first_name"));

            } else {
                throw new IllegalArgumentException("Invalid teacher ID");
            }

            prepareStatement = conection.prepareStatement("SELECT s.week_day, s.start_time, s.end_time, c.name_course FROM \n"
                    + "schedules s \n"
                    + "JOIN course c on c.id \n"
                    + "WHERE c.assigned_teacher_id = ? \n"
                    + "ORDER BY s.week_day ASC \n"
                    + ";");

            prepareStatement.setInt(1, teacherId);
            rs = prepareStatement.executeQuery();
            System.out.println("Scheludes:");
            while (rs.next()) {
                StringBuilder sb = new StringBuilder();
                sb.append(calculateWeekDayName(rs.getInt("week_day")));
                sb.append(" ");
                sb.append(rs.getTime("start_time"));
                sb.append(" - ");
                sb.append(rs.getTime("end_time"));
                sb.append(" - ");
                sb.append(rs.getString("name_course"));
                System.out.println(sb.toString());

            }
        } catch (SQLException ex) {
            Logger.getLogger(HighSchoolAccess.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }

    private String calculateWeekDayName(int index) {
        switch (index) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thurdsday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
        }
        return null;
    }
}
