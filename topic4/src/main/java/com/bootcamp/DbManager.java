/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbManager {

    private static final Logger log = Logger.getLogger(DbManager.class.toString());

    private static Connection con=null;
    
    private static Statement stm = null;
    
    private static void openConnection(){
        try {
            Class.forName("org.hsqldb.jdbcDriver" );
            log.info("Loaded JDBC Driver");
        } 
        catch (Exception e) {
            log.log(Level.INFO, "ERROR: failed to load JDBC driver - {0}", e.getMessage());
            return;
        }

        try {
            con = DriverManager.getConnection("jdbc:hsqldb:mem:userdb", "sa", "");
            log.info("Connection established");     
            createUsers();
        }
        catch(SQLException e){
            log.log(Level.INFO, "db connection error Exception: {0}", e.getMessage());
        }
    }
    
    private static void createUsers() throws SQLException{
        stm = con.createStatement();
        stm.execute("CREATE TABLE PUBLIC.Users (Account varchar(20), Password varchar(20) NOT NULL, FirstName varchar(20), LastName varchar(20) NOT NULL, PRIMARY KEY (Account))");
        System.out.println("Created table Users");
        
        System.out.println("Sample account inserted into table Users: ");
        stm.execute("INSERT INTO Users VALUES 'cuentanum1', 'contrasena123', 'santiago', 'schumacher'");
    
        ResultSet rs = stm.executeQuery("SELECT * FROM Users");
        while (rs.next()){
            String account = rs.getString("Account");
            String pass = rs.getString("Password");
            String fname = rs.getString("FirstName");
            String lname = rs.getString("LastName");
            System.out.println(account + "  " + pass + "    " + fname + "    " + lname);
        }
        stm.close();
    }
    
    public static void closeConnection() {
        try {
            con.close();
            log.info("DB conn closed");
        }
        catch(SQLException e) {
            log.info("Error at closing" + e.getMessage());
        }
    }

    public static Connection getConnection() {
        if (con==null){
            openConnection();
        }
        else {
            try {
                if(con.isClosed()){
                    con = DriverManager.getConnection("jdbc:hsqldb:mem:testdb", "sa", "");
                    log.info("DB connection re-opened.");
                }
            } catch(SQLException e){
                log.info("re-open mistake" + e.getMessage());
                return null;
            }
        }

        return con;
    }
    
    public static void shutdown() throws SQLException{
        Statement st = con.createStatement();
        st.execute("SHUTDOWN");
        st.close();
    }
            
}