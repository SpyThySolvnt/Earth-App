    import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
    import java.util.*;
    import javax.swing.*;



public class Signup extends JFrame{


JTextField UserN;
JTextField Pass;
JTextField PhoneNum;
JTextField Email;
//JTextField DOB;
JTextField Address;
JButton Signup;
JComboBox DAY;
JComboBox Mon;
JComboBox Year;
Container c;




private class ALbox1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        
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










Signup(){

    c = getContentPane();
    c.setLayout(null);
   setSize(700,700);


   Integer[] Day = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
   String[] Month = {"January","Febuary","March","April","May","June","July","August","October","November","December"};
   Integer[] Years = {1960 ,1961 ,1962 ,1963 ,1964 ,1965 ,1966 ,1967 ,1968 ,1969 ,1970 ,1971 ,1972 ,1973 ,1974 ,1975 ,1976 ,1977 ,1978 ,1979 ,1980 ,1981 ,1982 ,1983 ,1984 ,1985 ,1986 ,1987 ,1988 ,1989 ,1990 ,1991 ,1992 ,1993 ,1994 ,1995 ,1996 ,1997 ,1998 ,1999 ,2000 ,2001 ,2002 ,2003 ,2004 ,2005 ,2006 ,2007 ,2008 ,2009 
    ,2010 ,2011 ,2012 ,2013 ,2014 ,2015 ,2016 ,2017 ,2018 ,2019 ,2020 ,2021 ,2022 ,2023} ;
   JLabel username = new JLabel("User Name:");
    username.setBounds(80,100,200,50);
    UserN = new JTextField();
    UserN.setBounds(150,100,225,50);
    JLabel password = new JLabel("Password:");
    password.setBounds(80,150,200,50);
    Pass = new JTextField();
    Pass.setBounds(150,150,225,50);
    JLabel phoneNum = new JLabel("Phone Number:");
    phoneNum.setBounds(60,200,150,50);
    PhoneNum = new JTextField();
    PhoneNum.setBounds(150,200,225,50);
   JLabel email = new JLabel("Email:");
   email.setBounds(100,250,150,50);
   Email = new JTextField();
   Email.setBounds(150,250,225,50); 
   JLabel address = new JLabel("Address:");
   address.setBounds(90,300,150,50);
   Address = new JTextField();
   Address.setBounds(150,300,225,50);
   JLabel dob = new JLabel("Date Of Birth:");
   DAY = new JComboBox(Day); 
   DAY.setBounds(150,350,50,50);
   Mon = new JComboBox(Month);
   Mon.setBounds(200,350,100,50);
   Year = new JComboBox(Years);
   Year.setBounds(300,350,75,50) ;






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
    c.add(DAY);
    c.add(Mon);
    c.add(Year);
}

}








