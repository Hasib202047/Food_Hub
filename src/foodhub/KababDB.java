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
public class KababDB {
    public static ArrayList<Kabab_List> TableGenerator() throws ClassNotFoundException{
        ArrayList<Kabab_List> list = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          Connection   con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectfoodHUB;selectMethod=cursor", "sa", "123456");
            
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT Food_ID,Food_Item,Restaurant_Name,Price,Avg_rating,Photo FROM Kabab_Items");
            
            Kabab_List k;
            
            while(rs.next()){
                k = new Kabab_List(rs.getString("Food_Item"),rs.getString("Restaurant_Name"),
                        rs.getInt("Price"),rs.getFloat("Avg_rating"),
                        rs.getString("Photo"),rs.getString("Food_ID"));
                
                list.add(k);

            }

        } catch (SQLException ex) {
            Logger.getLogger(KababDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
}
   
    
}
