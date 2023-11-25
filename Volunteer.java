import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class Volunteer extends UserClass {
    private List<Initiative> volunteeringJobs;

    public Volunteer(String name, String password, String email , String phoneNumber, String  address, String  dateOfBirth) {
        super(name, password, email, phoneNumber, address, dateOfBirth);
        this.volunteeringJobs = new ArrayList<>();
    }

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

     public void generateVolunteerReport() {
    	String vfout = getName()+getId()+".txt";
    	PrintWriter fn = new PrintWriter(vfout);
    	fn.println(); // needs to print the credits and other details, not done
    	// Implementation to generate a report of the user's volunteering history and points

    @Override
    public String toString() {
        return "Volunteer{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", volunteeringJobs=" + volunteeringJobs +
                '}';
    }
}
