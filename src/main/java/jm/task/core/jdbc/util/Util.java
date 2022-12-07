package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    // реализуйте настройку соеденения с БД

    static final String URL = "jdbc:mysql://localhost:3306/dbtest";
    static final String USER = "root";
    static final String PASSWORD = "root";
    static Connection connection=null;

    public static Connection getConnection() {
        try{
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("connet OKEY");
    } catch( SQLException e)
    {
        System.out.println("connect ERROR");

    } return  connection;

}

}
