import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;



public class AdminFrame extends JFrame{

     String admin;
     String admin2023;
    JTextField username;
    JTextField password;
   // JTextField id;
    Container c;
    JButton Enter;
    JButton Back;

    private class ALenter implements ActionListener{
        public void actionPerformed(ActionEvent e){     
          
            if(e.getSource()==Enter) {
            	
            	
            	if(username.getText().equals("admin")||password.getText().equals("admin2023")){
            		JOptionPane.showMessageDialog(null , "Welcome Back Admin",null,JOptionPane.PLAIN_MESSAGE); 
            		AdminPage x = new AdminPage();
                    dispose();
                	
            	}
            	
            	else      	   JOptionPane.showMessageDialog(null,"Wrong name or password!","error",JOptionPane.ERROR_MESSAGE);

        } 
        }
    }
    
    private class ALback implements ActionListener{
        public void actionPerformed(ActionEvent e){ 
            Hamdan x = new Hamdan(); 
            dispose();   
            
            if(e.getSource()==Enter) {
                String jtxtnum = password.getText();
                if(jtxtnum==admin2023 && username.getText()==admin) {
            
            		JOptionPane.showMessageDialog(null , "Welcome back admin",null,JOptionPane.PLAIN_MESSAGE); 
             }
                
                
                }
        }
            
        }
    AdminFrame(){

        //A must on Jframes
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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
        password = new JTextField();
        password.setBounds(200,100,150,50);
        Enter = new JButton("Enter");
        Enter.setBounds(100,210,300,50);
        Back = new JButton("Back");
        Back.setBounds(0,0,100,30);
       // JLabel Id = new JLabel("ID :");
       // Id.setBounds(100,200,150,50);
        //id = new JTextField();
       // id.setBounds(200,200,150,50);
  
        //Buttons
        ALenter enButton = new ALenter();
        Enter.addActionListener(enButton);
        
        ALback s = new ALback();
        Back.addActionListener(s);


        
      

        

        //A must on Jframes
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //adding assests
        c.add(User);
        c.add(Pass);
       // c.add(Id);
        c.add(username);
        c.add(password);
        c.add(Back);
        //c.add(id);
        c.add(Enter);


    }


    }
