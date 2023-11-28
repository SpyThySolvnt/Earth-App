import java.io.*;
import java.util.*;

public class User extends Database  {
	public String s;
	public  String name;
	public String name1;
    private String password, id, phone, email, address, dateOB ;
    private int counter;
    protected int cr;
    static int i;
    public static ArrayList<String> ParticipateList = new ArrayList<String>();
    public static ArrayList<User> VolunteerList = new ArrayList<User>();
   
    
    public User(String d, String s) {
    	super(d);
    	this.s = name1;
    	
    }
    

    // Constructor (100%)
    public User(String s,String name, String password, String phone, String email , String  address, String  dateOB) {
    	super(s);
    	this.name = name;
        this.id = generateUserId(); // You need to implement this method
        this.email = email;
        this.dateOB = dateOB;
        this.phone = phone;
        this.address = address;
        this.password = password;
        UserList.add(this);
        i++;
        counter = i;
    }
    

    public void editUserInformation(String s, String name, String password, String phone, String email , String  address, String  dateOB) {
    this.s=s;
    	this.name = name;
        this.id = generateUserId(); // You need to implement this method
        this.email = email;
        this.dateOB = dateOB;
        this.phone = phone;
        this.address = address;
        this.password = password;
        UserList.add(this);
    	UserList.remove(counter-1) ;
    }
    
    public String toString() {
    return name+" "+password+" "+phone+" ";
    }
    
    public String toStringInitiatorView() {
        return "Name: "+name+" Phone: "+phone+" Email: "+email+" Date Of Birth: "+dateOB+" Total Credits: "+cr;
        }


    // Getter methods for attributes
    public  String getNameo() {
        return name;
    }
    

    public String getId() {
        return id;
    }

    public String getDateOB() {
        return dateOB;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword1() {
        return password;
    }



    // Private method to generate a unique user ID
    private String generateUserId() {
    	id = UUID.randomUUID().toString();
		return id
				;
    
    }
}
