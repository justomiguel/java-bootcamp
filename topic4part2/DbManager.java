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
            createTables();
        }
        catch(SQLException e){
            log.log(Level.INFO, "db connection error Exception: {0}", e.getMessage());
        }
    }
    
    private static void createTables() throws SQLException{
        stm = con.createStatement();
        stm.execute("CREATE TABLE Users (Account varchar(20), Password varchar(20) NOT NULL, FirstName varchar(20), LastName varchar(20) NOT NULL, PRIMARY KEY (Account))");
        System.out.println("Created table Users");
        
        
        stm = con.createStatement();
        stm.execute("CREATE TABLE Photos (PhotoId integer IDENTITY, UserId varchar(20) NOT NULL, URL varchar(50) NOT NULL, LikeCount integer NOT NULL, FOREIGN KEY(UserId) REFERENCES Users(Account))");
        System.out.println("Created table Photos");
        
        stm = con.createStatement();
        stm.execute("CREATE TABLE Friends (UserId varchar(20) NOT NULL, FriendId varchar(20) NOT NULL, Foreign key (UserId) REFERENCES Users(Account), Foreign key (FriendId) References Users(Account))");
        System.out.println("Created table Friends");
        
        System.out.println("Populating tables !!");
        stm.execute("INSERT INTO Users VALUES 'cuentanum1', 'contrasena123', 'santiago', 'schumacher'");
        stm.execute("INSERT INTO Users VALUES 'cuentanum2', 'contrasena123', 'marcelo', 'gomez'");
        stm.execute("INSERT INTO Users VALUES 'cuentanum3', 'contrasena123', 'carlos', 'acosta'");
        stm.execute("INSERT INTO Photos(UserId, URL, LikeCount) VALUES 'cuentanum1', 'www.mipagina.com/photo.jpeg', '0'");
        stm.execute("INSERT INTO Photos(UserId, URL, LikeCount) VALUES 'cuentanum1', 'www.mipagina.com/anotherphoto.jpeg', '0'");
        stm.execute("INSERT INTO Friends VALUES 'cuentanum1', 'cuentanum2'");
        stm.execute("INSERT INTO Friends VALUES 'cuentanum1', 'cuentanum3'");
        
        //Throws error, violates integrity restriction as expected
        //stm.execute("INSERT INTO Photos(UserId, URL, LikeCount) VALUES 'cuentanoexiste', 'www.mipagina.com/photo.jpeg', '0'");
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