package proyekbesar.backend;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
         AuthDao authManager = new AuthDao();
         Scanner input = new Scanner(System.in);
         
        // LOGIN IMPLEMENTATION
        // INPUT DATA
         System.out.print("Masukkan username: ");
         String username = input.nextLine();
         System.out.print("Masukkan password: ");
         String password = input.nextLine();
        
        /*
        - Before execute login method, make sure to validate the input first(username, password)
        - IF licensePlate or type isBlank, showMessageDialog with related message
        - Always using trim() method
        - if user input type with "     Motor     ", trim method will remove the whitespaces
        - result = "Motor"
        - IF not using trim method, the variables value will be "       Motor     "
        - The output of login method is always TRUE/FALSE
        - IF the output is TRUE, LOGIN IS SUCCEED and direct the user to dashboard
        - IF the output is false, LOGIN IS FAILED and showMessageDialog with related message
        */
        
        // LOGIC CODE
         boolean result = authManager.login(new User(username.trim(), password.trim()));
         System.out.println(result);
        // LOGIN IMPLEMENTATION
  
        // VEHICLE IN IMPLEMENTATION
        // INPUT DATA
        // System.out.print("Masukkan license plate: ");
        // String licensePlate = input.nextLine();
        // System.out.print("Masukkan tipe kendaraan: ");
        // String type = input.nextLine();
        
        // LOGIC CODE
        /*
        - Before execute this method, make sure to validation the input first(licensePlate and type)
        - IF licensePlate and type isBlank, showMessageDialog with related message
        - Always using trim() method
        - if user input type with "     Motor     ", trim method will remove the whitespaces
        - result = "Motor"
        - IF not using trim method, the variables value will be "       Motor     "
        */
         // authManager.vehicleIn(new Vehicle(license.trim(), type.trim()));
    }
}
