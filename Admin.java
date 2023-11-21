
import java.util.ArrayList;
import java.util.List;

// Admin class
public class Admin {
    // Attributes
    private String name;
    private String id;
    private String password;

    // Initiatives awaiting approval
    private List<Initiative> pendingInitiatives;

    // Constructor
    public Admin(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.pendingInitiatives = new ArrayList<>();
    }

    // Getter methods for attributes 
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
    public String getPassword() {
        return password;
    }
    
    
    // Admin login method
    public boolean login(String enteredPassword) {
        return password.equals(enteredPassword);
    }

    // Approve or reject an initiative
    public void processInitiative(Initiative initiative, boolean approve) {
        if (approve) {
            initiative.setStatus("active");
        } else {
            initiative.setStatus("rejected");
            pendingInitiatives.remove(initiative);
        }
    }

    // Remove initiative, initiator, or volunteer
    public void removeRecord(Object record) {
        // Implementation to remove a record from the database
    }

    // View all initiatives in tabular form
    public void viewAllInitiatives() {
        // Implementation to display all initiatives in a tabular form
    }

    // Search for an initiative or volunteer by name
    public void searchByName(String name) {
        // Implementation to search for an initiative or volunteer by name
    }

    // View details of an initiative, initiator, or volunteer
    public void viewDetails(Object record) {
        // Implementation to display details of a record
    }


    
}





