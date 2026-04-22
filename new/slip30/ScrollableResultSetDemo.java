import java.sql.*;

public class ScrollableResultSetDemo {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish a connection to the database
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "root";
            String password = "password";
            Connection conn = DriverManager.getConnection(url, username, password);
            
            // Create a Statement object with a scrollable ResultSet
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            // Execute the SQL query
            String sql = "SELECT * FROM Teacher";
            ResultSet rs = stmt.executeQuery(sql);
            
            // Move the cursor to the last row
            rs.last();
            
            // Get the total number of rows in the ResultSet
            int rowCount = rs.getRow();
            
            // Print the total number of rows to the console
            System.out.println("Total number of rows: " + rowCount);
            
            // Move the cursor to the first row
            rs.first();
            
            // Loop through the ResultSet and print each row to the console
            while (rs.next()) {
                int tid = rs.getInt("TID");
                String tname = rs.getString("TName");
                double salary = rs.getDouble("Salary");
                
                System.out.println(tid + "\t" + tname + "\t" + salary);
            }
            
            // Close the ResultSet, Statement, and Connection objects
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
