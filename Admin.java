import java.util.ArrayList;
import java.util.List;


public class Admin {
    private String name;
    private String id;
    private String password;

    public Admin(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public boolean login(String enteredPassword) {
        return password.equals(enteredPassword);
    }

    // High-level operations for managing initiatives
    public void processInitiative(Initiative initiative, boolean approve) {
        if (initiative != null) {
            initiative.StatusBoolean = approve;
        }
    }

    public void removeInitiative(Initiative initiative) {
        // Implementation to remove initiative from a centralized list
        // You can implement this based on your design
    }

    public void viewAllInitiatives() {
        // Implementation to view all initiatives
        // You can implement this based on your design
    }

    // Other high-level operations for managing initiators and volunteers

    // Example method to view details of any record
    public void viewDetails(Object record) {
        if (record != null) {
            System.out.println(record); // Assuming toString() is overridden in respective classes
        }
    }
}
