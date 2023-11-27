import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;


public class EditInfo extends JFrame{
    JTextField UserN;
JTextField Pass;
JTextField PhoneNum;
JTextField Email;
JTextField Address;
JComboBox DAY;
JComboBox Mon;
JComboBox Year;
JButton edit1;
JButton edit2;
JButton edit3;
JButton edit4;
JButton edit5;
JButton edit6;
JButton change1;
JButton change2;
JButton change3;
JButton change4;
JButton change5;
JButton change6; 
JButton Okay;
Container c;








private class ALokay implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Hamdan x = new Hamdan();
        dispose();
    }
}








/////////////////JCOMBO BOXES///////////////////


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



/////////////////EDIT BUTTONS/////////////////



private class ALedit1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        UserN.setEnabled(true);
        edit1.setEnabled(false);
        change1.setEnabled(true);
    }
}
private class ALedit2 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Pass.setEnabled(true);
        edit2.setEnabled(false);
        change2.setEnabled(true);
    }
}
private class ALedit3 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        PhoneNum.setEnabled(true);
        edit3.setEnabled(false);
        change3.setEnabled(true);
    }
}
private class ALedit4 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Email.setEnabled(true);
        edit4.setEnabled(false);
        change4.setEnabled(true);
    }
}

private class ALedit5 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Address.setEnabled(true);
        edit5.setEnabled(false);
        change5.setEnabled(true);
    }
}
private class ALedit6 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        DAY.setEnabled(true);
        Mon.setEnabled(true);
        Year.setEnabled(true);
        edit6.setEnabled(false);
        change6.setEnabled(true);
    }
}




////////////CHANGE BUTTON/////////////////



private class ALchange1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        edit1.setEnabled(true);
        UserN.setEnabled(false);
        change1.setEnabled(false);
    }
}
private class ALchange2 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        edit2.setEnabled(true);
        Pass.setEnabled(false);
        change2.setEnabled(false);
    }
}
private class ALchange3 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        edit3.setEnabled(true);
        PhoneNum.setEnabled(false);
        change3.setEnabled(false);
    }
}
private class ALchange4 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        edit4.setEnabled(true);
        Email.setEnabled(false);
        change4.setEnabled(false);
    }
}
private class ALchange5 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        edit5.setEnabled(true);
        Address.setEnabled(false);
        change5.setEnabled(false);
    }
}
private class ALchange6 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        edit6.setEnabled(true);
        DAY.setEnabled(false);
        Mon.setEnabled(false);
        Year.setEnabled(false);
        change6.setEnabled(false);
    }
}





EditInfo(){

    c = getContentPane();
    c.setLayout(null);
   setSize(600,600);
   setTitle("Edit Information");


   Integer[] Day = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
   String[] Month = {"January","Febuary","March","April","May","June","July","August","October","November","December"};
   Integer[] Years = {1960 ,1961 ,1962 ,1963 ,1964 ,1965 ,1966 ,1967 ,1968 ,1969 ,1970 ,1971 ,1972 ,1973 ,1974 ,1975 ,1976 ,1977 ,1978 ,1979 ,1980 ,1981 ,1982 ,1983 ,1984 ,1985 ,1986 ,1987 ,1988 ,1989 ,1990 ,1991 ,1992 ,1993 ,1994 ,1995 ,1996 ,1997 ,1998 ,1999 ,2000 ,2001 ,2002 ,2003 ,2004 ,2005 ,2006 ,2007 ,2008 ,2009 
    ,2010 ,2011 ,2012 ,2013 ,2014 ,2015 ,2016 ,2017 ,2018 ,2019 ,2020 ,2021 ,2022 ,2023} ;
   JLabel username = new JLabel("User Name:");
    username.setBounds(30,100,200,50);
    UserN = new JTextField();
    UserN.setBounds(100,100,225,50);
    JLabel password = new JLabel("Password:");
    password.setBounds(30,150,200,50);
    Pass = new JTextField();
    Pass.setBounds(100,150,225,50);
    JLabel phoneNum = new JLabel("Phone Number:");
    phoneNum.setBounds(10,200,150,50);
    PhoneNum = new JTextField();
    PhoneNum.setBounds(100,200,225,50);
   JLabel email = new JLabel("Email:");
   email.setBounds(30,250,150,50);
   Email = new JTextField();
   Email.setBounds(100,250,225,50); 
   JLabel address = new JLabel("Address:");
   address.setBounds(30,300,150,50);
   Address = new JTextField();
   Address.setBounds(100,300,225,50);
   JLabel dob = new JLabel("Date Of Birth:");
   dob.setBounds(20,350,150,50);
   DAY = new JComboBox(Day); 
   DAY.setBounds(100,350,50,50);
   Mon = new JComboBox(Month);
   Mon.setBounds(150,350,100,50);
   Year = new JComboBox(Years);
   Year.setBounds(250,350,75,50);


   UserN.setEnabled(false);
   Pass.setEnabled(false);
   PhoneNum.setEnabled(false);
   Email.setEnabled(false);
   Address.setEnabled(false);
   DAY.setEnabled(false);
   Mon.setEnabled(false);
   Year.setEnabled(false); 





   edit1 = new JButton("Edit");
   edit1.setBounds(375,100,100,50);
   edit2 = new JButton("Edit");
   edit2.setBounds(375,150,100,50); 
   edit3 = new JButton("Edit");
   edit3.setBounds(375,200,100,50); 
   edit4 = new JButton("Edit");
   edit4.setBounds(375,250,100,50); 
   edit5 = new JButton("Edit");
   edit5.setBounds(375,300,100,50); 
   edit6 = new JButton("Edit");
   edit6.setBounds(375,350,100,50);


   change1 = new JButton("Change");
   change1.setBounds(476,100,100,50); 
   change2 = new JButton("Change");
   change2.setBounds(476,150,100,50);  
   change3 = new JButton("Change");
   change3.setBounds(476,200,100,50);  
   change4 = new JButton("Change");
   change4.setBounds(476,250,100,50);  
   change5 = new JButton("Change");
   change5.setBounds(476,300,100,50); 
   change6 = new JButton("Change");
   change6.setBounds(476,350,100,50);



   change1.setEnabled(false);
   change2.setEnabled(false);
   change3.setEnabled(false);
   change4.setEnabled(false);
   change5.setEnabled(false);
   change6.setEnabled(false);


   Okay = new JButton("Ok");
   Okay.setBounds(225,500,150,30);



   ALokay ok = new ALokay();
   Okay.addActionListener(ok);


   ALedit1 eb1 = new ALedit1();
   edit1.addActionListener(eb1);
   ALedit2 eb2 = new ALedit2();
   edit2.addActionListener(eb2);
   ALedit3 eb3 = new ALedit3();
   edit3.addActionListener(eb3);
   ALedit4 eb4 = new ALedit4();
   edit4.addActionListener(eb4);
   ALedit5 eb5 = new ALedit5();
   edit5.addActionListener(eb5);
   ALedit6 eb6 = new ALedit6();
   edit6.addActionListener(eb6);



   ALchange1 ch1 = new ALchange1();
   change1.addActionListener(ch1);
   ALchange2 ch2 = new ALchange2();
   change2.addActionListener(ch2);
   ALchange3 ch3 = new ALchange3();
   change3.addActionListener(ch3);
   ALchange4 ch4 = new ALchange4();
   change4.addActionListener(ch4);
   ALchange5 ch5 = new ALchange5();
   change5.addActionListener(ch5);
   ALchange6 ch6 = new ALchange6();
   change6.addActionListener(ch6);



   ALbox1 DAYS = new ALbox1();
   DAY.addActionListener(DAYS);
   ALbox2 MONTH = new ALbox2();
   Mon.addActionListener(MONTH); 
   ALbox3 YEAR = new ALbox3();
   Year.addActionListener(YEAR); 



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
    c.add(change1);
    c.add(change2);
    c.add(change3);
    c.add(change4);
    c.add(change5);
    c.add(change6);
    c.add(edit1);
    c.add(edit2);
    c.add(edit3);
    c.add(edit4);
    c.add(edit5);
    c.add(edit6);
    c.add(Okay);
}

}
