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
JComboBox Day;
Container c;




private class ALbox implements ActionListener{
    public void actionPerformed(ActionEvent e){
        
    }
}










Signup(){

    c = getContentPane();
    c.setLayout(null);
   setSize(700,700);


   Integer[] Day ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};

   JLabel username = new JLabel("User Name:");
    username.setBounds(80,100,200,50);
    UserN = new JTextField();
    UserN.setBounds(150,100,150,50);
    JLabel password = new JLabel("Password:");
    password.setBounds(80,150,200,50);
    Pass = new JTextField();
    Pass.setBounds(150,150,150,50);
    JLabel phoneNum = new JLabel("Phone Number:");
    phoneNum.setBounds(60,200,150,50);
    PhoneNum = new JTextField();
    PhoneNum.setBounds(150,200,150,50);
   JLabel email = new JLabel("Email:");
   email.setBounds(100,250,150,50);
   Email = new JTextField();
   Email.setBounds(150,250,150,50); 
   JLabel address = new JLabel("Address:");
   address.setBounds(90,300,150,50);
   Address = new JTextField();
   Address.setBounds(150,300,150,50);
   JLabel dob = new JLabel("Date Of Birth:");
   x = new JComboBox(Day);
   Day.addActionListener






   setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
   setLocationRelativeTo(null);

   // add assets
    add(username);
    add(UserN);
    add(password);
    add(Pass);
    add(phoneNum);
    add(PhoneNum);
    add(email);
    add(Email);
    add(address);
    add(Address);

}

}








