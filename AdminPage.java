import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class AdminPage{


    JButton Approve;
    JTextArea Initiatives;
    Container c;





    AdminPage(){
    

    
    //A must on Jfranes
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    c = getContentPane();
    c.setLayout(null);
    setSize(900,700);
    setTitle("Admin Log-in");


    JLabel Welcome = new JLabel("Welcome Back Admin");
    Welcome.setBounds(0,0,500,60);

    Initiatives = new JTextArea();
    Initiatives.serBounds(100,100,500,500);



    c.add(Welcome);
    c.add(Initiatives);


    }



}