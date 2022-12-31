/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodhub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Hasib
 */
public class Biriyani_IteamsDB {
   
    public static ArrayList<Biriyani_List> TableGenerator() throws ClassNotFoundException{
        ArrayList<Biriyani_List> list = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          Connection   con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectfoodHUB;selectMethod=cursor", "sa", "123456");
            
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT Food_ID,Food_Item,Restaurant_Name,Price,Avg_rating,Photo FROM Biriyani_Items");
            
            Biriyani_List b;
            
            while(rs.next()){
                b = new Biriyani_List(rs.getString("Food_Item"),rs.getString("Restaurant_Name"),
                        rs.getInt("Price"),rs.getFloat("Avg_rating"),
                        rs.getString("Photo"),rs.getString("Food_ID"));
                
                list.add(b);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Biriyani_IteamsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
}
    
    
}
