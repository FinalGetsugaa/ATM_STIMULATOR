/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
package ATM_Stimulator;
        
import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","1234");
            s = c.createStatement();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
