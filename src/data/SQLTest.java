package data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLTest {

    public static void main(String[] args) {
        // SQLite example database URL -> works constantly, isn´t saved localy? 
        String url = "jdbc:sqlite:/home/seppl972/.local/share/DBeaverData/workspace6/.metadata/sample-database-sqlite-1/Chinook.db";

        // Optional: name of the table you want to print
        String tableName = "Customer";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            System.out.println("✅ Database connection established.");

            // Run SELECT query and print results
            String selectSQL = "SELECT * FROM " + tableName + ";";
            ResultSet rs = stmt.executeQuery(selectSQL);

            System.out.println("📋 Data from table '" + tableName + "':");
            while (rs.next()) {
                int id = rs.getInt("CustomerId");                     // adjust columns if different
                String firstname = rs.getString("FirstName");
                String lastname = rs.getString("LastName");
                String adress = rs.getString("Address");

                System.out.println("ID: " + id + ", Name: " + firstname + ", " + lastname + ", Place: " + adress);
            }

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}