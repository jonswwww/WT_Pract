import java.sql.*;  
import java.io.*;  
class slip30_2
{  
public static void main(String args[])throws Exception
{  
Class.forName("org.postgresql.Driver");
System.out.println("driver loded");
Connection c1= DriverManager.getConnection("jdbc:postgresql://localhost:5432/teacher","postgres","123456");
   System.out.println("connection established");
c1.setAutoCommit (false);
Statement s=c1.createStatement();
String str="select * from teacher ";
ResultSet  rs=s.executeQuery(str);
while(rs.next())
{
   System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
}
  
c1.close();  
}}  
