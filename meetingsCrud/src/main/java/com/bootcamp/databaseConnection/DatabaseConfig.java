
package com.bootcamp.databaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DatabaseConfig {

    public DatabaseConfig() {}

    private final String DB_DRIVER = "com.mysql.jdbc.Driver";

    private final String DB_PASSWORD = "mysql";

    private final String DB_URL = "jdbc:mysql://localhost:3306/meetings_bootcamp";

    private final String DB_USERNAME = "root";

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(DB_DRIVER);
        dataSource.setUrl(DB_URL);
        dataSource.setUsername(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);
        return dataSource;
    }
    
    @Bean
    public Connection openConnection() throws SQLException {
        DatabaseConfig db = new DatabaseConfig();
        DataSource ds = db.dataSource();
        Connection conn = ds.getConnection();
        Statement stt = conn.createStatement();
        stt.execute("USE `meetings_bootcamp`");
        return conn;
    }
}

