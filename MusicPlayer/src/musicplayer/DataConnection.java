/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplayer;

import java.sql.*;

public class DataConnection {
    public static Connection connectMusicDB(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:musicDB.db");
        con.createStatement().execute("PRAGMA busy_timeout = 10000");

        System.out.println("Connected");
      
        return con;
        
    }
    catch (Exception e){
    System.out.println("Failed");
    return null;
    
    }
    
    }
}
