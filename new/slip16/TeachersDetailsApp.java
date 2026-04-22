import java.sql.*;

public class TeacherDetailsApp {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/your_database_name";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Accept the details of teachers using a Scanner
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter teacher number: ");
            int tno = scanner.nextInt();
            System.out.print("Enter teacher name: ");
            String tname = scanner.next();
            System.out.print("Enter subject: ");
            String subject = scanner.next();

            // Insert at least 5 records into the Teacher table using a PreparedStatement
            String insertQuery = "INSERT INTO Teacher (TNo, TName, Subject) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, tno);
            preparedStatement.setString(2, tname);
            preparedStatement.setString(3, subject);

            int numRowsInserted = preparedStatement.executeUpdate();
            if (numRowsInserted > 0) {
                System.out.println("Record inserted successfully");
            }

            // Display the details of teachers who are teaching "JAVA" subject
            String selectQuery = "SELECT TNo, TName, Subject FROM Teacher WHERE Subject = ?";
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, "JAVA");
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("Teachers teaching \"JAVA\" subject:");
            while (resultSet.next()) {
                int teacherNumber = resultSet.getInt("TNo");
                String teacherName = resultSet.getString("TName");
                String teacherSubject = resultSet.getString("Subject");

                System.out.println("Teacher Number: " + teacherNumber + ", Teacher Name: " + teacherName + ", Subject: " + teacherSubject);
            }
        } catch (SQLException e) {
            System.out.println("Error executing SQL statement: " + e.getMessage());
        }
    }
}
