import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Complaint extends JFrame{

    JTextArea Issue; 
    JButton Submit;
    JButton Back;
    Container c;

    private class ALsubmit implements ActionListener{
        public void actionPerformed(ActionEvent e){ 
            Hamdan x = new Hamdan();    
            dispose();
            

        }
    }
    private class ALback implements ActionListener{
        public void actionPerformed(ActionEvent e){ 
            LoginPage y = new LoginPage(); 
            dispose();   
            
            

        }
    }



    Complaint(){
    //A must on Jfranes
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    c = getContentPane();
    c.setLayout(null);
    setSize(500,300);
    setTitle("Complaints");




    JLabel issue = new JLabel("Whats Your Complaint About The App?");
    issue.setForeground(Color.WHITE);
    issue.setBounds(135,50,300,50);
    
    Issue = new JTextArea();
    Issue.setBounds(45,100,400,100);


    //buttons
    Submit = new JButton("Submit");
    Submit.setBackground(new Color(200, 184, 138));
    Submit.setBounds(0,210,500,50);
    ALsubmit sb = new ALsubmit();
    Submit.addActionListener(sb);

    Back = new JButton("Back");
    Back.setBackground(new Color(200, 184, 138));
    Back.setBounds(0,0,100,30);
    ALback s = new ALback();
    Back.addActionListener(s);


    


    c.add(Issue);
    c.add(Submit);
    c.add(issue);
    c.add(Back);
    
    c.setBackground(new Color(71, 105, 48));
    setLocationRelativeTo(null);

    }


}
