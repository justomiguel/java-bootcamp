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
}
