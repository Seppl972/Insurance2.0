package data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLConnection {

    public static void main(String[] args) {
        // ✅ SQLite database URL (copied from DBeaver)
        String url = "jdbc:sqlite:/home/seppl972/Schreibtisch/Insurance2.0/bin/ui/buttons/SQL_Datenbank";

        // Optional: name of the table you want to print
        String tableName = "Customor";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            System.out.println("✅ Database connection established.");

            // Run SELECT query and print results
            String selectSQL = "SELECT * FROM " + tableName + ";";
            ResultSet rs = stmt.executeQuery(selectSQL);

            System.out.println("📋 Data from table '" + tableName + "':");
            while (rs.next()) {
                int id = rs.getInt("id");                     // adjust columns if different
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String place = rs.getString("place");
                System.out.println("[ID: " + id + ", Name: " + name + ", age: " + age + ", place: " + place + "]");
            }

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}