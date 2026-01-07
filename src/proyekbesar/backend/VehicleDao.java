package proyekbesar.backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class VehicleDao {
    private DBConnection dbConnection; 
    
    public VehicleDao() {
        this.dbConnection = new DBConnection(); 
    }
    
    public void vehicleIn(Vehicle vehicle) {
        final String query = "INSERT INTO vehicles (licensePlate, type, fee) VALUES (?, ?, ?)";
        
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
    
    public void vehicleOut(String licensePlate) {
        final String query = "UPDATE vehicles SET exitTime = current_timestamp(), status = 'Keluar' WHERE licensePlate = ?";
        
        try(
            Connection conn = dbConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
        ) {
            pstmt.setString(1, licensePlate);
            pstmt.executeUpdate();
        } catch(SQLException e) {
            System.err.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void report(DefaultTableModel model) {
        final String query = "SELECT * FROM vehicles";
        
        try(
            Connection conn = dbConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
        ) {
           model.setRowCount(0);
           
           while(rs.next()) {
                model.addRow(new Object[] {
                    rs.getString("licensePlate"),
                    rs.getString("type"),
                    rs.getString("entryTime"),
                    rs.getString("exitTime"),
                    rs.getInt("fee"),
                    rs.getString("status")
                });
            }
        } catch (Exception e) {
            System.err.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
