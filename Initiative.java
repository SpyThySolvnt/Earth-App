import java.util.*;
import java.io.*;
import java.time.LocalDateTime;

class Initiative extends User{
	String  nameOE, dateOE,timeOE,descriptionOE,statusOE, idOE ;
	private int crOE;
	boolean statusBoolean;
	String Status;
	 private int count;
	    static int j;
	   

	
	//Full Constructor
	public Initiative(String data, String name,String nameOE,String dateOfEvent,String timeOfEvent,String descriptionOfEvent, String crOE) {
		super(data = "",name );
		this.nameOE=nameOE;
		this.idOE = setIdOfEvent();
		this.dateOE=dateOfEvent;
		this.descriptionOE=descriptionOfEvent;
		this.timeOE=timeOfEvent;
		this.crOE= 1;
		statusBoolean = true;
		 EventList.add(this);
		 j++;
	        count = j;
	}

	public void deleteEvent() {
		EventList.remove(count-1);
		
	}
	
	 public void editEventInfo( String nameOE, String dateOE, String timeOE , String  descriptionOE, String  crOE) {
	    	this.nameOE = nameOE;
	        this.idOE = setIdOfEvent(); // You need to implement this method
	        this.dateOE= dateOE;
	        this.timeOE = timeOE;
	        this.descriptionOE = descriptionOE;
	        
	        this.crOE = Integer.parseInt(crOE);
	        EventList.add(this);
	    	EventList.remove(count-1) ;
	    }
	 
	 public void entersEvent(Initiative o) {
		 VolunteerList.add(this);
		 ParticipateList.add("(Name of event: "+getNameOE()+" --> Credits gained: " +getCrOE()+")");
		 o.cr += crOE;
		 
	 }
	 public void removeFromEvent(User o) {
		 VolunteerList.remove(count-1);
		 o.cr -= crOE;
	 }
	 
	 
	 public String toString() {
		 String s="";
		 if (statusBoolean!=false)
			 s +="---------------------------------------------------------------------------------------\n"+"Name of event: "+nameOE+
			 "\nDate of Event: "+dateOE+"\nTime Of Event: "+timeOE
			 + "\nDescription of Event: "+descriptionOE+"\nCredits Awarded: "+crOE+"\nParticipants: "+toString0() + "\n---------------------------------------------------------";
		 return s;
	 }
	 
	 
	 public String toString0() {
		 String mn ="";
	 for (int n=0; n<VolunteerList.size();n++) 
		  mn+= VolunteerList.get(n).getNameo()+", ";
	 return mn;
	 }
// Method to auto create id for the event (done)
		public String setIdOfEvent() {
			idOE = UUID.randomUUID().toString();
			return idOE;
		}

// Method to set the Time of the event (done)
	
		
		public void setDescriptionOfEvent(String m) {
		descriptionOE = m;
		}	
		
			
// Setters end here(1)
		
//Getters begin here(2)
		public String getCrOE() {
			String s = "";
			
				s = Integer.toString(crOE);
			return s;
		}
		public String getIdOfEvent() {
			return idOE;
		}
		public String getNameOE() {
			return nameOE;
		}
		public String getName1() {
			return name;
		}
		public String getDateOfEvent() {
			return dateOE;
		}
		public String getTimeOfEvent() {
			return timeOE;
		}
		public String getDescriptionOfEvent() {
			return descriptionOE;
		}
		public String getStatusOEvent() {
			return statusOE;
		}
		public int getCredit() {
			return crOE;
		}
		
		// Needs admin class to be completed
//		public String getStatus() {
//		Status = "Pending";
//			if (StatusBoolean & (year<currentyear | (year==currentyear&&month<currentmonth)| (year==currentyear &&month==currentmonth&&day<currentday)|  (year==currentyear &&month==currentmonth&&day==currentday&& hour<currenthour)|(year==currentyear &&month==currentmonth&&day==currentday&& hour==currenthour&& minute<currentminute)))
//				Status = "Active";
//				else if (StatusBoolean= false)
//				Status = "expired";
//					
//			return Status;
//		}
//Getters end here(2)
		// This is for initiating an event, waiting for JFrame inputs to declare them here. (40%)
//		public void options() throws FileNotFoundException{
//			Scanner console = new Scanner(System.in);
//			String option;
//				option = console.next(); // this will change to Jframe letter
//				switch(option) {
//				case "a":
//				// only the input that were put in JFRame must be fixed here simple
//				break;
//				case "b":
//				break;
//				case "c":
//				break;
//				case "d":
//				break;
//				case "e":
//				break;
//				case "":
//				break;
//				case "g":
//				break;
//				case "h":
//				break;
//				}
//			}


		 LocalDateTime now = LocalDateTime.now();
		   int currentyear = now.getYear();
	       int currentmonth = now.getMonthValue();
	       int currentday = now.getDayOfMonth();
	       int currenthour = now.getHour();
	       int currentminute = now.getMinute();
	}
