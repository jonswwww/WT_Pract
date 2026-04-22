import java.sql.*;

public class ProductTableApp {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "password";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);

            // Create the Product table
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE Product " +
                    "(Pid INTEGER not NULL, " +
                    " Pname VARCHAR(255), " +
                    " Price FLOAT, " +
                    " PRIMARY KEY ( Pid ))";
            stmt.executeUpdate(sql);
            System.out.println("Created Product table");

            // Insert five records into the table
            sql = "INSERT INTO Product (Pid, Pname, Price) VALUES (101, 'Product A', 10.99)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Product (Pid, Pname, Price) VALUES (102, 'Product B', 20.99)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Product (Pid, Pname, Price) VALUES (103, 'Product C', 30.99)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Product (Pid, Pname, Price) VALUES (104, 'Product D', 40.99)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Product (Pid, Pname, Price) VALUES (105, 'Product E', 50.99)";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into Product table");

            // Display all records from the table
            sql = "SELECT * FROM Product";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("Product table contents:");
            while (rs.next()) {
                int pid = rs.getInt("Pid");
                String pname = rs.getString("Pname");
                float price = rs.getFloat("Price");
                System.out.println("Pid: " + pid + ", Pname: " + pname + ", Price: " + price);
            }

            // Clean up resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
