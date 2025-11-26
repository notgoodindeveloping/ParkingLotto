package proyekbesar.backend;

public class Vehicle {
    private int id;
    private String licensePlate;
    private String type;
    private String entryTime;
    private String exitTime;
    private int fee;
    private String status;
    
    public Vehicle(String licensePlate, String type) {
        this.licensePlate = licensePlate;
        this.type = type;
        
        if(this.type.equals("Motor")) this.fee = 2000;
        else this.fee = 5000;
    }
    
    public String getLicensePlate() {
        return this.licensePlate;
    }
    
    public String getType() {
        return this.type;
    }
    
    public int getFee() {
        return this.fee;
    }
}
