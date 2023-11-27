import java.io.*;
import java.util.*;

public class User extends Database{
	protected String name;
    private String password, id, phone, email, address, dateOB ;
    private int counter;
    protected int cr;
    static int i;
   
    public static ArrayList<String> ParticipateList = new ArrayList<String>();
    
    
    public User(String data, String name) {
    	super(data);
    	this.name = name;
    	
    }
    
    
    // Constructor (100%)
    public User(String s,String name, String password, String phone, String email , String  address, String  dateOB) {
    	super(s="");
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
    
    //edit personal info by user (100%)
    public void editUserInformation(String name, String password, String phone, String email , String  address, String  dateOB) {
    
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
    return name+" "+password+" "+phone+" "+cr+" ";
    }

    // Getter methods for attributes
    public String getName() {
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

    public String getPassword() {
        return password;
    }



    // Private method to generate a unique user ID
    private String generateUserId() {
    	id = UUID.randomUUID().toString();
		return id
				;
    
    }
}
