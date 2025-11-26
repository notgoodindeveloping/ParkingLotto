package proyekbesar.backend;

import java.sql.*;

public class AuthDao {
    private DBConnection dbConnection;  // Deklarasi variable
    
    // Constructor
    public AuthDao() {
        this.dbConnection = new DBConnection();  // Inisialisasi
    }
    
    public boolean login(User user) {
        final String query = "SELECT username FROM users WHERE username = ? AND password = ?";
        
        try(
            Connection conn = dbConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
        ) {
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch(SQLException e) {
            System.err.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
    
    public void vehicleIn(Vehicle vehicle) {
        final String query = "INSERT INTO vehicles (license_plate, type, fee) VALUES (?, ?, ?)";
        
        try(
            Connection conn = dbConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
        ) {
            pstmt.setString(1, vehicle.getLicensePlate());
            pstmt.setString(2, vehicle.getType());
            pstmt.setInt(3, vehicle.getFee());
            
            pstmt.executeUpdate();
        } catch(SQLException e) {
            System.err.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
