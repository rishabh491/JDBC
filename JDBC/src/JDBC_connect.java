import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class JDBC_connect {
    public static void main(String[] args) throws Exception {
   try (Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","rishabh@491");
   )
   {
    String sql="select *from cricket;";
    PreparedStatement pstmt=conn.prepareStatement(sql);
    ResultSet rs=pstmt.executeQuery();
    while(rs.next()){
        System.out.println(rs.getString(1));
        System.out.println(rs.getInt(2));
    }
   
    System.out.println("data inserted");
    conn.close();
   } catch (Exception e) {
       e.printStackTrace();
   }
    }
}