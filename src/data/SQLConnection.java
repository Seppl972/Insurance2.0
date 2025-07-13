package data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnection {

    // WICHTIG: conn als Instanzvariable definieren
    private Connection conn;

    // Konstruktor
    public SQLConnection(String dbPath) {
        try {
            String url = "jdbc:sqlite:" + dbPath;
            conn = DriverManager.getConnection(url);  // conn hier zuweisen!
            System.out.println("Verbindung zur DB hergestellt: " + url);
        } catch (SQLException e) {
            System.out.println("Fehler bei Verbindung: " + e.getMessage());
        }
    }

    // Methode, um eine Abfrage auszuführen
    public ResultSet executeQuery(String query) {
        try {
            Statement stmt = conn.createStatement();  // conn hier verwenden
            System.out.println("Führe Query aus: " + query);
            return stmt.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Fehler bei Query: " + e.getMessage());
            return null;
        }
    }

    // Verbindung schließen
    public void close() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Verbindung geschlossen.");
            }
        } catch (SQLException e) {
            System.out.println("Fehler beim Schließen: " + e.getMessage());
        }
    }
}