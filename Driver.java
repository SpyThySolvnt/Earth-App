import java.time.LocalDateTime;

import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) throws IOException {
    
    	Database Database = new Database("Database");
    	
    	
    	Scanner MN = new Scanner(new FileReader("UserPass.txt"));
    	int var = 0;
    	while(MN.hasNextLine()) {
    		Scanner line = new Scanner (MN.nextLine());
    		String as = line.next();
    		String bs = line.next();
    		String cs = line.next();
    		String ds = line.next();
    		String es = line.next();
    		String fs = line.next();
    		String gs = " ";
       		
    		Database.UserList.add(new User(as, bs,cs,ds,es,fs,gs));
    		Database.UserList.remove(var);
			System.out.println(Database.UserList);

    		var++;
    	}
    	MN.close();
		Hamdan x = new Hamdan();
    	
    
	
    //	Initiative Donate = new Initiative("","","Donation","10-11-2024","5:30","Collect money",9);
    	
   
   // 	Initiative Donate1 = new Initiative("","","Charity","10-11-2024","5:30","Collect money",7);
//    	Database.entersEvent(Donate);
//    	
    	
//    	System.out.println(Donate.UserList.get(0).toStringInitiatorView());
//    	System.out.println(Donate.VolunteerList.get(1).toStringInitiatorView());
    	
   // 	System.out.println(Donate1.ParticipateList);
    	
    	// System.out.println(Database.EventList.get(0));
//    	System.out.println(Database.UserList.get(1).getNameo());
//    	System.out.println(Database.UserList.get(0).getPassword1());
//    	System.out.println(Database.UserList.size());
    //	Hamdan x = new Hamdan();

    	
    
    	// m.editUserInformation("Hamo9d","1234","0544"," 44","44 "," 44");
    	
    	
    	
    	
//    	 System.out.println(Database.UserList);
    	
    	// System.out.print(Database.UserList.get(0).getName());
  //	Database.UserList.get(0).getName();
  	//System.out.println(Database.EventList);
    //	Donate.entersEvent(G);
//    	Donate.removeFromEvent(G);
//    
//    	System.out.println(Database.EventList);
//    	System.out.println(Database.UserList);
//    	System.out.println(G.cr);
//      	System.out.println(	G.ParticipateList);
   
  //  System.out.println(Database.UserList.get(0).getNameo());
    
   // System.out.println(Database.UserList.get(0).getPassword1());
	}
}
    

