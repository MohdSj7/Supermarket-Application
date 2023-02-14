/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Dina Helmi
 */
public class ConnectingPostgres {
    private static String connection = "jdbc:postgresql://localhost:5432/postgres";
    private static String username = "postgres";
    private static String password ="tinytots";
    private static Connection connect;
    private static Statement statement,statement1;
    
     public static void main(String[]args){
         connect = null;
        try{
            connect = DriverManager.getConnection(connection, username, password);
            System.out.println("Connected");
        }catch(Exception exception){
            System.out.println("Not succesfull");
        }
        
        try{
            statement1 = connect.createStatement();
            String sqla = "CREATE TABLE ACCOUNT_C" + 
                    "(USERNAME TEXT PRIMARY KEY NOT NULL," 
                    +"PASSWORD TEXT NOT NULL,"
                    +"CONFIRMPASSWORD TEXT NOT NULL,"
                    +"FIRSTNAME TEXT NOT NULL," 
                    + "LASTNAME TEXT NOT NULL,"
                    +"EMAIL TEXT NOT NULL,"
                    + "ADDRESS TEXT NOT NULL)";
                    
            statement1.executeUpdate(sqla);
            statement1.close();
            connect.close();
            System.out.println("Table has been created");
        }catch(Exception exception){
            System.out.println("Table NOT created ");
        }
        try{
            statement1 = connect.createStatement();
            String sqlb = "CREATE TABLE ACCOUNT_E" + 
                    "(USERNAME TEXT PRIMARY KEY NOT NULL," 
                    +"PASSWORD TEXT NOT NULL,"
                    +"CONFIRMPASSWORD TEXT NOT NULL,"
                    +"FIRSTNAME TEXT NOT NULL," 
                    + "LASTNAME TEXT NOT NULL,"
                    +"EMAIL TEXT NOT NULL,"
                    + "POSITION TEXT NOT NULL)";
            statement1.executeUpdate(sqlb);
            statement1.close();
            connect.close();
            System.out.println("Table has been created");
        }catch(Exception exception){
            System.out.println("Table NOT created ");
        }
        
        try{
            statement1 = connect.createStatement();
            String sqlq = "CREATE TABLE ORDER_ITEMSS" + 
                    "(ITEM TEXT NOT NULL," 
                    +"PRICE INT NOT NULL,"
                    +"QUANTITY INT NOT NULL,"
                    + "TOTAL INT NOT NULL,"
                    +"USERNAME TEXT NOT NULL)";
            
            statement1.executeUpdate(sqlq);
            statement1.close();
            connect.close();
            System.out.println("Table has been created");
        }catch(Exception exception){
            System.out.println("Table NOT created ");
        }
        try{
            statement1 = connect.createStatement();
            String sqlA = "CREATE TABLE ORDER_CONF" + 
                    "(ORDERNO INT PRIMARY KEY NOT NULL," 
                    +"TOTAL INT NOT NULL,"
                    +"USERNAME TEXT NOT NULL)";
            
            statement1.executeUpdate(sqlA);
            statement1.close();
            connect.close();
            System.out.println("Table has been created");
        }catch(Exception exception){
            System.out.println("Table NOT created ");
        }
        
    }
}


