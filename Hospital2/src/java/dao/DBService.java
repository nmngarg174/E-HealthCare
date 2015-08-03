package dao;
import java.sql.*;
public class DBService {
    private static Connection con;   
    static{
     try{
     Class.forName("com.mysql.jdbc.Driver");
     String url="jdbc:mysql://localhost:3306/healthcare";
     con = DriverManager.getConnection(url,"root","1234");
     }catch(Exception e){
         System.out.println("CONNECTION ERROR : "+e.getMessage());
     }
    }
    
    public static Connection getConnection(){
     return con;
    }
    
    public static int updateData(String DMLQuery){
     try{
     Statement st = con.createStatement();
     int ur = st.executeUpdate(DMLQuery);
     return ur;
     }catch(Exception e){
         System.out.println("UPDATE ERROR : "+e.getMessage());
         return -1;
     }
    }
    
    public static ResultSet selectData(String projQuery){
     try{
     Statement st = con.createStatement();
     ResultSet rs = st.executeQuery(projQuery);
     return rs;
     }catch(Exception e){
         System.out.println("SELECT ERROR : "+e.getMessage());
         return null;
     }
    }
    
    public static PreparedStatement getPS(String icQuery){
     try{
     PreparedStatement pst = con.prepareStatement(icQuery);
     return pst;
     }catch(Exception e){
         System.out.println("PS ERROR : "+e.getMessage());
         return null;
     }
    }
}
