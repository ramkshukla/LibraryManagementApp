package com.company;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP{
    static Connection con;
    public static Connection createC(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "password";
            String url = "jdbc:mysql://localhost:3306/Library";
            con = DriverManager.getConnection(url, user, password);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}