import java.time.LocalDateTime;

import java.io.*;
import java.util.*;

public class Driver extends Hamdan {
	

	
    public static void main(String[] args) throws NoSuchElementException ,IOException{
    
    	 String[][] ini = new String[10][8]; 
    	
    	Database Database = new Database("Database");
    	
    	
    	Scanner MN = new Scanner(new FileReader("UserPass.txt"));
    	int var = 0;
    	while(MN.hasNextLine()) {
    		Scanner line = new Scanner(MN.nextLine());
    		String as = line.next();
    		String bs = line.next();
    		String cs = line.next();
    		String ds = line.next();
    		String es = line.next();
    		String fs = line.next();
    		String gs =" l" ;
    		
  		 Database.UserList.add(new User(as,bs,cs,ds,es,fs,gs));
    		 Database.UserList.remove(var);	
    		var++;
    	}
    	MN.close();




    	
    	
    	Scanner op = new Scanner(new FileReader("IniLIST.txt"));
    	int pp = 0;
    	while(op.hasNextLine()) {
    		Scanner line = new Scanner(op.nextLine());
    		String as = line.next();
    		String bs = line.next();
    		String cs = line.next();
    		String ds = line.next();
    		String es = line.next();
    		String fs = line.next();
    		String gs =" l" ;
  		Database.EventList.add(new Initiative(as,bs,cs,ds,es,fs,gs));  	
  		Database.EventList.remove(pp);		
  		
  		

  		int co = 0;
  		int in = 0; 
  			ini [in][co] = as ;
  			ini [in][co+1] = bs ;
  			ini [in][co+2] = cs ;
  			ini [in][co+3] = ds ;
  			ini [in][co+4] = es ;
  			ini [in][co+5] = fs ;
  			ini [in][co+6] = gs ;
  			in++;
    		pp++;
    	}
    	op.close();
      	
    	 //  System.out.println(  Database.EventList );
    
    	
           //  System.out.println(  hamd.getNameOE());
    	
    Hamdan x = new Hamdan();
             
             
             
             
             
             
             
    }

        }
    	
    	
    	
    	
    	
    	
    	
    	

    	
    	
    	
    	
    	
    	
    	
    	
    	

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    //	Initiative Donate = new Initiative("","","Donation","10-11-2024","5:30","Collect money",9);
    	
   
    //	Initiative Donate1 = new Initiative("","","Charity","10-11-2024","5:30","Collect money",7);
//    	Database.entersEvent(Donate);
//    	
    	
//    	System.out.println(Donate.UserList.get(0).toStringInitiatorView());
//    	System.out.println(Donate.VolunteerList.get(1).toStringInitiatorView());
    	
    	// System.out.println(Donate1.ParticipateList);
    	
    	// System.out.println(Database.EventList.get(0));
    
//    	System.out.println(Database.UserList.get(0).getPassword1());
//    	System.out.println(Database.UserList.size());
    
    	// m.editUserInformation("Hamo9d","1234","0544"," 44","44 "," 44");
//    	 System.out.println(Database.UserList); 	
    	// System.out.print(Database.UserList.get(0).getName());
  //	Database.UserList.get(0).getName();
  	
    //	Donate.entersEvent(G);
//    	Donate.removeFromEvent(G);
//    	System.out.println(Database.EventList);
//    	System.out.println(Database.UserList);
//    	System.out.println(G.cr);
//      	System.out.println(	G.ParticipateList);
  //  System.out.println(Database.UserList.get(0).getNameo());
   // System.out.println(Database.UserList.get(0).getPassword1());


