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
    setSize(500,300);
    setTitle("Complaints");




    JLabel issue = new JLabel("Whats Your Complaint About The App?");
    issue.setBounds(135,50,300,50);
    
    Issue = new JTextArea();
    Issue.setBounds(45,100,400,100);


    //buttons
    Submit = new JButton("Submit");
    Submit.setBounds(0,210,500,50);
    ALsubmit sb = new ALsubmit();
    Submit.addActionListener(sb);


    


    c.add(Issue);
    c.add(Submit);
    c.add(issue);

    setLocationRelativeTo(null);

    }


}