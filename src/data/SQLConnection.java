package data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SQLConnection {

    public static void main(String[] args) {
        // SQLite darabase URL (create new database if doesn´t exist)
        String url = "/home/seppl972/Schreibtisch/Insurance2.0/src/data/sample.db"; // replace with your database file path

        // SQL statement to create a table
        String createTableSQL = "CREATE TABLE IF NOT EXISTS user (" +
                                "id INTEGER PRIMARY KEY AUTOINCREMENT;" +
                                "name TEXT NOT NULL," +
                                "email TEXT NOT NULL" +
                                ");";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            
                stmt.execute(createTableSQL);
                System.err.println("Database connection established, table created.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
            
    }

}