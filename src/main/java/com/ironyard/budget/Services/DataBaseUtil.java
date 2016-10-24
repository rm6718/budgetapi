package com.ironyard.budget.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by sam on 10/12/16.
 */
public class DataBaseUtil {
    /**
     * Creates a connection to the database
     * @return
     * @throws SQLException
     */



    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");
    }



}
