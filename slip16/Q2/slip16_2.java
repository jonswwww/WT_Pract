import java.sql.*;  
import java.io.*;  
class slip16_2
{  
public static void main(String args[])throws Exception
{  
Class.forName("org.postgresql.Driver");
System.out.println("driver loded");
Connection c1= DriverManager.getConnection("jdbc:postgresql://localhost:5432/teacher","postgres","123456");
   System.out.println("connection established");
c1.setAutoCommit (false);
PreparedStatement ps=c1.prepareStatement("insert into teacher values(?,?,?)");  
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 5 teachers details");  
  for(int i=1;i<=5;i++)
{
System.out.println("enter teacher id");  
int tid=Integer.parseInt(br.readLine());  
System.out.println("enter teacher name:");  
String tname=br.readLine();  
System.out.println("enter subject:");  
String sub=br.readLine();  
  ps.setInt(1,tid);  
ps.setString(2,tname);  
ps.setString(3,sub);  
ps.executeUpdate();    
System.out.println(i+"record inserted")
  c1.setAutoCommit(true);  
}  
Statement s=c1.createStatement();
String str="select * from teacher where sub='java'";
ResultSet  rs=s.executeQuery(str);
while(rs.next())
{
   System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
}
  
c1.close();  
}}  
