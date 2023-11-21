
import java.util.ArrayList;
import java.util.List;

// Admin class
public class Admin {
    // Attributes
    private String name;
    private String id;
    private String password;

    private Initiative[] initiatives;  // Array to store initiatives
    private Initiator[] initiators;    // Array to store initiators
    private Volunteer[] volunteers;    // Array to store volunteers

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
        if (record instanceof Initiative) {
            removeInitiative((Initiative) record);
        } else if (record instanceof Initiator) {
            removeInitiator((Initiator) record);
        } else if (record instanceof Volunteer) {
            removeVolunteer((Volunteer) record);
        }
    }

    private void removeInitiative(Initiative initiative) {
        // Implementation to remove an initiative from the array
        for (int i = 0; i < initiatives.length; i++) {
            if (initiatives[i].equals(initiative)) {
                // Remove the initiative by shifting elements
                System.arraycopy(initiatives, i + 1, initiatives, i, initiatives.length - 1 - i);
                // Set the last element to null or create a new array with reduced size
                initiatives[initiatives.length - 1] = null;
                // Write updated initiatives array back to the file or database
                writeInitiativesToFile();
                break;
            }
        }
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





