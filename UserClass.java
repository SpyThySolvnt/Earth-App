import java.util.ArrayList;
import java.util.List;

public class UserClass {
    // Attributes
    private String name;
    private String id;  // Auto-generated
    private String dateOfBirth;
    private String email;
    private String phoneNumber;
    private String address;
    private String password;
    private List<Initiative> registeredInitiatives;
    private List<Initiative> volunteeringJobs;


     public UserClass() {
    	   id = generateUserId(); 
    }// Empty Constructor But it has an ID
    
    //Constructor for initiative
    public UserClass(String name) {
    	 this.name = name;
         id = generateUserId(); 
    }
    // Constructor
    public UserClass(String name, String password, String phoneNumber, String email , String  address, String  dateOfBirth) {
        this.name = name;
        this.id = generateUserId(); // You need to implement this method
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;

        this.registeredInitiatives = new ArrayList<>();
        this.volunteeringJobs = new ArrayList<>();
    }

    // Getter methods for attributes
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    // User sign up method
    public void signUp() {
        // Implementation to sign up a new user
    }

    // User login method
    public boolean login(String enteredPassword) {
        return password.equals(enteredPassword);
    }

    // User editing personal information
    public void editPersonalInfo(String newEmail, String newPhoneNumber, String newAddress) {
        email = newEmail;
        phoneNumber = newPhoneNumber;
        address = newAddress;
        // Implementation to edit personal information
    }

    // Initiator-specific methods
    public void addInitiative(Initiative initiative) {
        // Implementation to add a new initiative by the user
    }

    public void editInitiative(Initiative initiative) {
        // Implementation to edit an existing initiative by the user
    }

    public void deleteInitiative(Initiative initiative) {
        // Implementation to delete an initiative by the user
    }

    public List<Initiative> viewRegisteredVolunteers() {
        // Implementation to view all registered volunteers for the user's initiatives
        return new ArrayList<>();
    }

    // Volunteer-specific methods
    public List<Initiative> viewAllActiveInitiatives() {
        // Implementation to view all active initiatives available for volunteering
        return new ArrayList<>();
    }

    public void registerForInitiative(Initiative initiative) {
        // Implementation to register the user for a volunteering initiative
    }

    public void withdrawFromInitiative(Initiative initiative) {
        // Implementation to withdraw the user from a volunteering initiative
    }

    // Private method to generate a unique user ID
    private String generateUserId() {
    	id = UUID.randomUUID().toString();
		return id
				;
    }
}
