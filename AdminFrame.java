import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class AdminFrame extends JFrame{


    JTextField username;
    JPasswordField password;
    JCheckBox Nike;
    Container c;
    JButton Enter;




    private class ALenter implements ActionListener{
        public void actionPerformed(ActionEvent e){     
            AdminPage x = new AdminPage();
            dispose();

        }
    }
    private class ALnike implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(Nike.isSelected()){
            password.setEchoChar((char)0);}
            else{
            password.setEchoChar('*');}
        }
    }

    AdminFrame(){

        //A must on Jfranes
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        setSize(500,300);
        setTitle("Admin Log-in");

        
        //labels 
        JLabel User = new JLabel("User Name:");
        User.setBounds(100,50,150,50);
        username = new JTextField();
        username.setBounds(200,50,150,50);
        JLabel Pass = new JLabel("Password:");
        Pass.setBounds(100,100,150,50);
        password = new JPasswordField();
        password.setBounds(200,100,150,50);
        Enter = new JButton("Enter");
        Enter.setBounds(100,210,300,50);
        Nike = new JCheckBox("Show Password");
        Nike.setBounds(200,150,150,50);
       // JLabel Id = new JLabel("ID :");
       // Id.setBounds(100,200,150,50);
        //id = new JTextField();
       // id.setBounds(200,200,150,50);
        


        //Buttons
        ALenter enButton = new ALenter();
        Enter.addActionListener(enButton);
        ALnike k = new ALnike();
        Nike.addActionListener(k);  



        //A must on Jfranes
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);



        //adding assests
        c.add(User);
        c.add(Pass);
       // c.add(Id);
        c.add(username);
        c.add(password);
        //c.add(id);
        c.add(Enter);
        c.add(Nike);


        setLocationRelativeTo(null);


    }





}