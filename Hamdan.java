    import java.awt.*;
    import java.awt.event.*;
    import java.io.*;
    import java.util.*;
    import javax.swing.*;
    
    public class Hamdan extends JFrame {
        JButton login;
        JButton admin;
        JButton signup;
        JTextField username;
        JTextField pass;
        Container c;
        JLabel Photo;


// public static void main(String[] args) throws IOException {

//          Hamdan x = new Hamdan();
//         // AdminPage x = new AdminPage(); 
         
       
//     }
 
        


private class ALadmin implements ActionListener{
    public void actionPerformed(ActionEvent e){
            admin.setEnabled(false);
            AdminFrame y = new AdminFrame();
            dispose();
    
    }
}

private class ALlogin implements ActionListener{
    public void actionPerformed(ActionEvent e)  {
     
boolean twe1 = false;
        
        if(e.getSource()==login){
        	if(pass.getText().equals("")||username.getText().equals("")){
        		JOptionPane.showMessageDialog(null , "You left one or more empty fields","re-enter information",JOptionPane.PLAIN_MESSAGE); 
        		} 
        	else for(int vr = 0; vr < Database.UserList.size();vr++) {
        		if ( username.getText().equals(Database.UserList.get(vr).getNameo()) && pass.getText().equals(Database.UserList.get(vr).getPassword1())) {
        			dispose(); 
        			LoginPage x = new LoginPage();
        			twe1 = true;
                	break;

        	}
        		} 
     
        }
        
        if (twe1) {
        	String dd = "C:\\Users\\3R\\eclipse-workspace\\Project\\src\\Currentuser.txt";

            try {
                PrintWriter printWriter2 = new PrintWriter(dd);
                printWriter2.println(username.getText());
                printWriter2.close();
                System.out.println("Hey.");
            } catch (IOException an) {
                an.printStackTrace();
            }
              }
}
}


private class ALsignup implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        Signup x = new Signup();
        signup.setEnabled(false);
        dispose();
    }
}
    

//web thingy
        Hamdan(){
        
            
        c = getContentPane();
        c.setLayout(null);
        
        setSize(700,500);
        setTitle("Earth App");
        JLabel EnterStuff =new JLabel("Please Write Your Login Information: ");
        EnterStuff.setBounds(0, -100, 250, 250);
        JLabel EnterName =new JLabel("UserName:");
        EnterName.setBounds(180, 50, 250, 250);
        username = new JTextField();
        username.setBounds(260,150,220,50);
        JLabel EnterPass= new JLabel("Password:");
        EnterPass.setBounds(180, 100, 250, 250);
        pass = new JTextField();
        pass.setBounds(260,200,220,50);
        Photo = new JLabel("");
        Photo.setBounds(150,100,100,100);
        



        //buttons:

        admin = new JButton("Admin Login");
        admin.setBounds(550,0,150,50);
        login = new JButton("Login");
        login.setBounds(100, 350, 220, 50);
        signup = new JButton("Sign Up");
        signup.setBounds(400,350,220,50);



        //Action listener:
        ALadmin adButton = new ALadmin();
        admin.addActionListener(adButton);
        ALlogin lgButton = new ALlogin();
        login.addActionListener(lgButton);
        ALsignup suButton = new ALsignup();
        signup.addActionListener(suButton);    


        


        //A must on JFrames
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //adding assets
        c.add(EnterStuff);
        c.add(EnterName);
        c.add(username);
        c.add(EnterPass);
        c.add(pass);
        c.add(admin);
        c.add(login);
        c.add(signup);
        c.add(Photo);
        //I dont know how to make with no error

        setLocationRelativeTo(null);
        }
}
        

    
