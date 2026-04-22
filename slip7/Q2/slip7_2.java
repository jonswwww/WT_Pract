import java.sql.*;
class slip7_2
{
            public static void main(String args[])
            {           
                        try
                        {
                                    Class.forName("org.postgresql.Driver");
                Connection  con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/product","postgres","123456");
                                      System.out.println("Connection Established...");

                                    Statement stmt=con.createStatement();
          
 //insert record into product table
                           stmt.executeUpdate("insert into product "+"values(101,'pen',10)");
                               stmt.executeUpdate("insert into product "+"values(102,'pencil',5)");
                                stmt.executeUpdate("insert into product "+"values(103,'eraser',10)");
                                 stmt.executeUpdate("insert into product "+"values(104,'scale',20)");
					stmt.executeUpdate("insert into  product "+"values(105,'book',30)");
                                    System.out.println("Succesfully inserted in table....");

                                    //display details
                                    ResultSet rs=stmt.executeQuery("select * from product");
                                    System.out.println("Pid\t"+"Pname\t"+"price\t");
                                    while(rs.next())
                                    {
  System.out.println("\n"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
                                    }

                        }          
                        catch(Exception e)
                        {
                                    
                        }
            }
}

