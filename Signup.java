import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
    import java.util.*;
    import javax.swing.*;
    



class Signup extends JFrame {


JTextField UserN;
JTextField Pass;
JTextField PhoneNum;
JTextField Email;
JTextField Address;
JButton Signup;
JComboBox DAY;
JComboBox Mon;
JComboBox Year;
JButton Back;
Container c;




private class ALbox1 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        
    }
}
private class ALbox2 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        
    }
}
private class ALbox3 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        
    }
}
private class ALsignup implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	
        Hamdan x = new Hamdan();
        dispose();
        
        boolean ten, ful ,ema, rere, kata;
        ten = false;
        ful = false;
        ema = false;
        rere = false;
        kata = false;

        
        if(e.getSource()==Signup) {
            int jtxtname = UserN.getText().length();
            if(jtxtname<3 || jtxtname>20) {
         	   JOptionPane.showMessageDialog(null,"your username  should contain 3~20 letters ","error",JOptionPane.ERROR_MESSAGE);
         } else{kata = true;}
    	}
        
        if(e.getSource()==Signup) {
            int jtxtpass = Pass.getText().length();
            if(jtxtpass<8 || jtxtpass>20) {
         	   JOptionPane.showMessageDialog(null,"your password  should contain 8~20 numbers ","error",JOptionPane.ERROR_MESSAGE);
         } else{rere = true;}
    	}
        
        if(e.getSource()==Signup) {
        int jtxtnum = PhoneNum.getText().length();
        if(jtxtnum<10 || jtxtnum>10) {
     	   JOptionPane.showMessageDialog(null,"The Phone number must contain 10 numbers exactly ","error",JOptionPane.ERROR_MESSAGE);
     } else ten = true;
        
        String jtxtemail = Email.getText();
        if (jtxtemail.contains("@")) {
        System.out.println(""); 
        ema = true;
        }   
        else {
     	   JOptionPane.showMessageDialog(null,"The email address must contain an @ symbol","error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        if(e.getSource()==Signup) {
        	if(UserN.getText().equals("")||Pass.getText().equals("")||PhoneNum.getText().equals("")||Email.getText().equals("")||Address.getText().equals("")){
        		JOptionPane.showMessageDialog(null , "You left one or more empty fields","re-enter information",JOptionPane.PLAIN_MESSAGE); 
        		} else ful = true;
        	 	
    } 
        if (ten && ema && ful && rere && kata)  {
           	 User signup1 = new User("", UserN.getText(), Pass.getText() ,PhoneNum.getText() ,Email.getText() ,Address.getText().replaceAll("\\s+","")  , DAY.getSelectedItem()+"-"+Mon.getSelectedItem()+"-"+Year.getSelectedItem() );
             try {
                 // Set the second parameter of FileWriter to true for append mode
                 FileWriter fileWriter = new FileWriter("UserPass.txt", true);

                 // Wrap the FileWriter in a PrintWriter for convenient writing
                 PrintWriter printWriter = new PrintWriter(fileWriter);
                

                 // Write to the file
                 printWriter.println("Database " +UserN.getText()+" "+Pass.getText()+" "+ PhoneNum.getText()+" "+ Email.getText()+" "+ Address.getText().replaceAll("\\s+","-") + " "+ DAY.getSelectedItem()+"-"+Mon.getSelectedItem()+"-"+Year.getSelectedItem() );
              
                 // Close the resources
                 printWriter.close();
                 fileWriter.close();

                 System.out.println("Data written to the file successfully.");

             } catch (IOException n) {
                 n.printStackTrace();
             }
        }
        }
    }
}
        
        
    


private class ALback implements ActionListener{
    public void actionPerformed(ActionEvent e){ 
        Hamdan x = new Hamdan(); 
        dispose();   
    }
}









Signup(){

    c = getContentPane();
    c.setLayout(null);
   setSize(500,500);
   setTitle("Sign Up");

   
   String[] Day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
   String[] Month = {"January","Febuary","March","April","May","June","July","August","October","November","December"};
   String[] Years = {"1960" ,"1961" ,"1962" ,"1963" ,"1964" ,"1965" ,"1966" ,"1967","1968" ,"1969" ,"1970","1971" ,"1972" ,"1973" ,"1974" ,"1975","1976" ,"1977" ,"1978" ,"1979" ,"1980" ,"1981" ,"1982" ,"1983" ,"1984" ,"1985" ,"1986" ,"1987" ,"1988" ,"1989" ,"1990" ,"1991" ,"1992" ,"1993" ,"1994" ,"1995" ,"1996" ,"1997" ,"1998" ,"1999" ,"2000" ,"2001" ,"2002" ,"2003" ,"2004" ,"2005" ,"2006" ,"2007" ,"2008" ,"2009" 
		    ,"2010" ,"2011" ,"2012" ,"2013" ,"2014" ,"2015" ,"2016" ,"2017" ,"2018" ,"2019" ,"2020" ,"2021" ,"2022" ,"2023"} ;

   
   
   JLabel username = new JLabel("User Name:");
    username.setForeground(Color.WHITE);
    username.setBounds(80,60,200,50);
    UserN = new JTextField();
    UserN.setBounds(150,60,225,50);
    JLabel password = new JLabel("Password:");
    password.setForeground(Color.WHITE);
    password.setBounds(80,110,200,50);
    Pass = new JTextField();
    Pass.setBounds(150,110,225,50);
    JLabel phoneNum = new JLabel("Phone Number:");
    phoneNum.setForeground(Color.WHITE);
    phoneNum.setBounds(60,160,150,50);
    PhoneNum = new JTextField();
    PhoneNum.setBounds(150,160,225,50);
   JLabel email = new JLabel("Email:");
   email.setForeground(Color.WHITE);
   email.setBounds(100,210,150,50);
   Email = new JTextField();
   Email.setBounds(150,210,225,50); 
   JLabel address = new JLabel("Address:");
   address.setForeground(Color.WHITE);
   address.setBounds(90,260,150,50);
   Address = new JTextField();
   Address.setBounds(150,260,225,50);
   JLabel dob = new JLabel("Date Of Birth:");
   dob.setForeground(Color.WHITE);
   dob.setBounds(70,310,150,50);
   DAY = new JComboBox(Day); 
   DAY.setBackground(new Color(200, 184, 138));
   DAY.setBounds(150,310,50,50);
   Mon = new JComboBox(Month);
   Mon.setBackground(new Color(200, 184, 138));
   Mon.setBounds(200,310,100,50);
   Year = new JComboBox(Years);
   Year.setBackground(new Color(200, 184, 138));
   Year.setBounds(300,310,75,50);


   Signup = new JButton("Sign Up");
   Signup.setBackground(new Color(200, 184, 138));
   Signup.setBounds(200,400,100,50); 

   Back = new JButton("Back");
   Back.setBackground(new Color(200, 184, 138));
   Back.setBounds(0,0,100,30);




   ALback x = new ALback();
   Back.addActionListener(x);


   ALsignup s = new ALsignup();
   Signup.addActionListener(s);



   ALbox1 DAYS = new ALbox1();
   DAY.addActionListener(DAYS);
   ALbox2 MONTH = new ALbox2();
   Mon.addActionListener(MONTH); 
   ALbox3 YEAR = new ALbox3();
   Year.addActionListener(YEAR); 
   
  
  
  

   //ALadmin adButton = new ALadmin();
   //admin.addActionListener(adButton);


   setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
   setLocationRelativeTo(null);

   // add assets
    c.add(username);
    c.add(UserN);
    c.add(password);
    c.add(Pass);
    c.add(phoneNum);
    c.add(PhoneNum);
    c.add(email);
    c.add(Email);
    c.add(address);
    c.add(Address);
    c.add(dob);
    c.add(DAY);
    c.add(Mon);
    c.add(Year);
    c.add(Signup);
    c.add(Back);
    c.setBackground(new Color(71, 105, 48));
}
    }
