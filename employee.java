import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class employee{
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java EmployeeWriter <employee name> <employee designation>");
            System.exit(1);
        }

        String id = args[0];
        String name = args[1];
        String designation = args[2];

        try {
            // Set up the connection to the database
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5434/postgres", "postgres", "1234");


            // Prepare the SQL statement
            String sql = "INSERT INTO employeess (id,name, designation) VALUES (?,?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, designation);

            // Execute the statement
            pstmt.executeUpdate();

            System.out.println("Employee data written to database.");
        } catch (SQLException e) {
            System.out.println("Error writing employee data to database: " + e.getMessage());
        }
    }
}
