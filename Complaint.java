import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Complaint extends JFrame{

    JTextArea Issue;
    JButton Submit;
    Container c;

    private class ALsubmit implements ActionListener{
        public void actionPerformed(ActionEvent e){     
            
            

        }
    }



    Complaint(){
    //A must on Jfranes
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    c = getContentPane();
    c.setLayout(null);
    setSize(1000,1000);
    setTitle("Complaints");




    JLabel issue = new JLabel("Whats Your Complaint About The App?");
    issue.setBounds(0,0,300,50);
    
    Issue = new JTextArea();
    Issue.setBounds(250,250,400,400);


    //buttons
    Submit = new JButton("Submit");
    Submit.setBounds(250,750,100,50);
    ALsubmit sb = new ALsubmit();
    Submit.addActionListener(sb);


    


    c.add(Issue);
    c.add(Submit);
    c.add(issue);

    setLocationRelativeTo(null);

    }


}