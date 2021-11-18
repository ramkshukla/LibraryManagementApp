package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;


public class BookDao{
    public static boolean insertIntoBookDB(Library lib) {
    boolean f = false;
    try {
        Connection con = CP.createC();
        String q = "insert into Library(book_id, book_name, book_author_name)" + "values (?, ?, ?)";

        PreparedStatement stmt = con.prepareStatement(q);
        stmt.setInt(1, lib.getBook_id());
        stmt.setString(2, lib.getBook_name());
        stmt.setString(3, lib.getBook_author_name());

        stmt.executeUpdate();
        f = true;
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return f;
    }
    public static boolean deleteStudent(int book_id){
        boolean f = false;
        try{
            Connection con = CP.createC();
            String q = "delete from Library where book_id = ?";

            PreparedStatement stmt = con.prepareStatement(q);
            stmt.setInt(1, book_id);
            stmt.executeUpdate();
            f = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

}
