import java.util.*;
import java.io.*;

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
    protected  static ArrayList<UserClass> allUL = new ArrayList<>();
    private String Type[] = {"Volunteer","Initiator","Volunteer and Initiator"};
    private String FinalType ;
    
    PrintWriter foutU = new PrintWriter(new FileOutputStream(new File("C:\\Users\\3R\\Desktop\\FileOfUsers.txt"),true));
    PrintWriter foutV = new PrintWriter(new FileOutputStream(new File("C:\\Users\\3R\\Desktop\\FileOfVolunteer.txt"),true));
    PrintWriter foutI = new PrintWriter(new FileOutputStream(new File("C:\\Users\\3R\\Desktop\\FileOfInitiator.txt"),true));
    
    // Constructor
    public UserClass(String FinalType, String name, String password, String phoneNumber, String email , String  address, String  dateOfBirth) throws FileNotFoundException{
        this.FinalType = FinalType;
    	this.name = name;
        this.id = generateUserId(); // You need to implement this method
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;
        this.registeredInitiatives = new ArrayList<>();
        this.volunteeringJobs = new ArrayList<>();
        foutU.println(this);
      foutU.close();
      if (FinalType.equals("Volunteer")) {
    	  foutV.println(this);
          foutV.close();
      } else if (FinalType.equals("Initiator")) {
    	  foutI.println(this);
          foutI.close();
      } else if (FinalType.equals("Volunteer and Initiator")) {
    	  foutV.println(this);
          foutV.close();
          foutI.println(this);
          foutI.close();
      }
    }

//    public void generateVolunteerReport() throws FileNotFoundException {
//    	String flocation = getName()+""+getId()+".txt";
//    	PrintWriter v2fout = new PrintWriter(flocation);
//    	v2fout.println(" hi ");
//    	v2fout.close();
//    	// needs to print the credits and other details, not done
//    	// Implementation to generate a report of the user's volunteering history and points
//     }
    

    // User login method
    public boolean login(String name, String enteredPassword) {
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
   

    public void deleteInitiative(Initiative i) {
      i.idOfEvent= null;
      i.dateOfEvent=null;
      i.timeOfEvent=null;
      i.descriptionOfEvent=null;
      i.statusOfEvent=null;
      i.placeOfEvent=null;
      i.credit= 0;
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
    
	  public String toString() {
	        return "(" + FinalType +
	                " ID ='" + getId() + ") (" +
	                " Name ='" + getName() + ") (" +
	                " Date-Of-Birth ='" + getDateOfBirth() + ") (" +
	                " Email ='" + getEmail() + '\'' +
	                " Phone-Number ='" + getPhoneNumber() + ") (" +
	                " Address ='" + getAddress() + ") (" +
	                " Password ='" + getPassword() + ") (" +
	                " Volunteering-Jobs =" + volunteeringJobs+ ")\n";
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
}
