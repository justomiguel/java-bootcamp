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
        stm.execute("CREATE TABLE IF NOT EXISTS Users (Account varchar(20), Password varchar(20) NOT NULL, FirstName varchar(20), LastName varchar(20) NOT NULL, PRIMARY KEY (Account))");
        log.info("Created table Users");
        
        stm = con.createStatement();
        stm.execute("CREATE TABLE IF NOT EXISTS Photos (userAccount varchar(20) NOT NULL, photoURL varchar(50) NOT NULL, likeCount integer NOT NULL, FOREIGN KEY(userAccount) REFERENCES Users(Account))");
        log.info("Created table Photos");
        
        stm = con.createStatement();
        stm.execute("CREATE TABLE IF NOT EXISTS Friends (Account varchar(20) NOT NULL, FriendAccount varchar(20) NOT NULL, Foreign key (Account) REFERENCES Users(Account), Foreign key (FriendAccount) References Users(Account))");
        log.info("Created table Friends");
        
        log.info("Sample account inserted into table Users: ");
        stm.execute("INSERT INTO Users VALUES 'cuentanum1', 'contrasena123', 'santiago', 'schumacher'");
        stm.execute("INSERT INTO Users VALUES 'cuentanum2', 'contrasena123', 'felipe', 'fulanodetal'");
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