import java.io.*;
import java.util.*;
public class Admin  {
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
    //2.
    public boolean login(String enteredPassword) {
        return password.equals(enteredPassword);
    }

    // 4.Approve 
    public void processInitiative(Initiative initiative, boolean approve) {
        if (initiative != null) {
            initiative.StatusBoolean = approve;
        }
    }
    //
    public void addInitiative(Initiative x) {
        x.Status="Active";
    }




    public void VolunteerList() throws FileNotFoundException {
    	
// 	FOV.close();
 	// needs to print the credits and other details, not done
 	// Implementation to generate a report of the user's volunteering history and points
  }
   //+5remove  
    public void removeInitiative(Initiative initiative)throws FileNotFoundException {
    	
    	 PrintWriter foutInitiativeBan = new PrintWriter(new FileOutputStream(new File("C:\\Users\\3R\\Desktop\\FileOfBannedInitiative.txt"),true));
    	String s = initiative.getNameOfEvent();
    		foutInitiativeBan.println(s);
    		foutInitiativeBan.close();
    		initiative.setStatus("Expired");
    		 initiative.setNameOfEvent("");
    	    	initiative.setIdOfEvent("");
    	    	initiative.setThemeOfEvent("");
    	    	initiative.setTimeOfEvent("");
    	    	initiative.setDateOfEvent("");
    	    	initiative.setDescriptionOfEvent("");
    }
//+6
    public String viewAllInitiatives() throws FileNotFoundException {
    	String s = "" ;
    	String n = "";
    	Scanner read = new Scanner(new FileReader("C:\\Users\\3R\\Desktop\\FileOfInitiative.txt"));
    	Scanner read1 = new Scanner(new FileReader("C:\\Users\\3R\\Desktop\\FileOfBannedInitiative.txt"));
          
       s += "\n " + read.nextLine();
       
    	   
       return s;
    }
    public void addVolunteerToInitiative(UserClass o,Initiative n) throws FileNotFoundException{
		String FN = n.getNameOfEvent()+".txt";
		PrintWriter fout = new PrintWriter(FN);
		fout.println(o);
		fout.close();
		
	}
    // Other high-level operations for managing initiators and volunteers

    // Example method to view details of any record
    public void viewDetails(Object record) {
        if (record != null) {
            System.out.println(record); // Assuming toString() is overridden in respective classes
        }
    }
    
    public void formatLists() throws FileNotFoundException{
    	PrintWriter foutU = new PrintWriter(new FileOutputStream("C:\\Users\\3R\\Desktop\\FileOfUsers.txt"));
        PrintWriter foutV = new PrintWriter(new FileOutputStream("C:\\Users\\3R\\Desktop\\FileOfVolunteer.txt"));
        PrintWriter foutI = new PrintWriter(new FileOutputStream("C:\\Users\\3R\\Desktop\\FileOfInitiator.txt"));

       	PrintWriter foutInitiative = new PrintWriter(new FileOutputStream("C:\\Users\\3R\\Desktop\\FileOfInitiative.txt"));

        foutU.append("");
        foutV.append("");
        foutI.append("");
        foutInitiative.append("");
    }
    
    public String viewRegisteredVolunteers() throws FileNotFoundException { 
    	String s = "" ;
    	Scanner read = new Scanner(new FileReader("C:\\Users\\3R\\Desktop\\FileOfVolunteer.txt"));
       while(read.hasNextLine())
       s += "\n " + read.nextLine();
       return s;
       
    }
}
