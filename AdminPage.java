import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AdminPage extends JFrame{


    JButton Approve;
    JTextArea Initiatives;
    JTable z;
    Container c;


    AdminPage(){
    

    //A must on Jfranes
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    c = getContentPane();
    c.setLayout(null);
    setSize(900,700);
    setTitle("Admin Log-in");


    JLabel Welcome = new JLabel("Welcome Back Admin");
    Welcome.setBounds(0,0,500,60);

    Initiatives = new JTextArea();
    Initiatives.setBounds(100,100,500,500);




     //Jtable 
     String column [] = {"Counter","ID "," Initiative","Description","Credit Hour","Time","Date"};

     String row [][] = {{"Dino1", "Dino2","Dino3","Dino4","Dino 5","Dino6","Dino7"},
                         {"Bear 1", "Bear2","Bear3","Bear4","Bear 5","Bear6","Bear7"},
                     {"Moose 1", "Moose2","Moose3","Moose4","Moose 5","Moose6","Moose7"},
                     {"Rabbit 1", "Rabbit2","Rabbit3","Rabbit4","Rabbit 5","Rabbit 6","Rabbit 7"},
                     {"dog 1", "dog2","dog3","dog4","dog 5","dog6","dog 7"},
                     {"cat 1", "cat 2","cat3","cat4","cat 5","cat 6","cat 7"},
                     {"wolf 1", "wolf2","wolf3","wolf4","wolf 5","wolf 6","wolf 7"},
                 
                 
                 
                 
                 };
 
 
 DefaultTableModel model = new DefaultTableModel( row,  column) {
 
 
 public boolean isCellEditable(int row, int column) {
     return false;
     }
   };
                 
 
     
     z = new JTable(model);
     JScrollPane y = new JScrollPane(z);
     y.setBounds(200,200,500,100);
     z.getTableHeader().setReorderingAllowed(false);
     z.getTableHeader().setResizingAllowed(false);
 


    c.add(Welcome);
    //c.add(Initiatives);
    c.add(y);

    //for some reason this needs to be in the end
    setLocationRelativeTo(null);


    }



}
