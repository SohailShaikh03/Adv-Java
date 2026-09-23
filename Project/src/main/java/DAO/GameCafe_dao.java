package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;

import POJO.Game_cafe;

public class GameCafe_dao {

    public void insertData(Game_cafe gc) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/gamesession";

        Connection c = DriverManager.getConnection(url, "root", "root");

        PreparedStatement ps = c.prepareStatement(
                "INSERT INTO gamecafe(customer_name, pc_no, gamee_name, duration, amount) VALUES(?,?,?,?,?)"
        );

        ps.setString(1, gc.getCustomer_name());
        ps.setInt(2, gc.getPc_no());
        ps.setString(3, gc.getGame_name());
        ps.setInt(4, gc.getDuration());
        ps.setFloat(5, gc.getAmount());

        int checked = ps.executeUpdate();

        if (checked > 0) {
            System.out.println("Session Inserted!");
        } else {
            System.out.println("Insert Unsuccessful..!");
        }

        c.close();
    }


    public void updateData(Game_cafe gc) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/gamesession";

        Connection c = DriverManager.getConnection(url, "root", "root");

        String st = "UPDATE gamecafe SET customer_name=? WHERE session_id=?";

        PreparedStatement ps = c.prepareStatement(st);

        ps.setString(1, gc.getCustomer_name());
        ps.setInt(2, gc.getSession_id());

        int checked = ps.executeUpdate();

        if (checked > 0) {
            System.out.println("Customer name updated!");
        } else {
            System.out.println("Session not found!");
        }

        c.close();
    }


    public void fetchData(Game_cafe gc) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/gamesession";

        Connection c = DriverManager.getConnection(url, "root", "root");

        String st = "SELECT * FROM gamecafe";

        PreparedStatement ps = c.prepareStatement(st);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            System.out.println( "Id: " + rs.getInt(1)+ " Name: " + rs.getString(2)+ " Pc NO: " + rs.getInt(3)+ " Game_Name: " + rs.getString(4)+ " Duration: " + rs.getInt(5)+ " Amount: " + rs.getFloat(6));
        }

        
    }

    
    public void searchData(Game_cafe gc) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/gamesession";

        Connection c = DriverManager.getConnection(url, "root", "root");

        String st = "SELECT * FROM gamecafe WHERE session_id=?";

        PreparedStatement ps = c.prepareStatement(st);

        ps.setInt(1, gc.getSession_id());

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            System.out.println("ID: " + rs.getInt("session_id"));
            System.out.println("Name: " + rs.getString("customer_name"));
            System.out.println("PC No: " + rs.getInt("pc_no"));
            System.out.println("Game: " + rs.getString("gamee_name"));
            System.out.println("Duration: " + rs.getInt("duration"));
            System.out.println("Amount: " + rs.getFloat("amount"));
        }

        c.close();
    }
    	
    	
    	
    	
    	
    	
    	
    

    public void deleteData(Game_cafe gc) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/gamesession";

        Connection c = DriverManager.getConnection(url, "root", "root");

        String st = "DELETE FROM gamecafe WHERE session_id=?";

        PreparedStatement ps = c.prepareStatement(st);

        ps.setInt(1, gc.getSession_id());

        int checked = ps.executeUpdate();

        if (checked > 0) {
            System.out.println("Session deleted!");
        } else {
            System.out.println("Session not found!");
        }

        c.close();
    }

}