    import java.awt.*;
    import java.awt.GridLayout;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.io.*;
    import java.util.*;
    import javax.swing.*;
    public class Hamdan extends JFrame{
        JButton login;
        JButton admin;
        JButton signup;
          JTextField username;
          JPasswordField pass;
        
        JLabel Photo;
        JCheckBox Nike; 
        Container c;

        public static void main(String[] args){

            Hamdan x = new Hamdan(); 
           
           }
           


private class ALadmin implements ActionListener{
    public void actionPerformed(ActionEvent e){
            admin.setEnabled(false);
            AdminFrame y = new AdminFrame();
            dispose();
            
            

    }
}


private class ALlogin implements ActionListener{
    public void actionPerformed(ActionEvent e){

    	 LoginPage p = new LoginPage();
    	 dispose();
    	
        boolean spp = true;
        String ddd = username.getText();
        if(e.getSource()==login){ 
        	if(pass.getText().equals("")||username.getText().equals("")){
        		JOptionPane.showMessageDialog(null , "You left one or more empty fields","re-enter information",JOptionPane.PLAIN_MESSAGE); 
        		
        		} 
        	else if(spp){	
        				if ( username.getText().equals(Database.UserList.get(0).getNameo()) ) {			
        				
        				}
        				}  else System.out.println(pass.getText()); dispose();
        			
        			}
}}


private class ALsignup implements ActionListener{
    public void actionPerformed(ActionEvent e){
        
        Signup x = new Signup();
        signup.setEnabled(false);
        dispose();
    }
}
private class ALnike implements ActionListener{
    public void actionPerformed(ActionEvent e){
        if(Nike.isSelected()){
        	((JPasswordField)pass).setEchoChar((char)0);}
        else{
       pass.setEchoChar('*');}
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
        pass = new JPasswordField();
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

        Nike = new JCheckBox("Show Password");
        Nike.setBounds(260,250,150,50);


        //Action listener:
        ALadmin adButton = new ALadmin();
        admin.addActionListener(adButton);
        ALlogin lgButton = new ALlogin();
        login.addActionListener(lgButton);
        ALsignup suButton = new ALsignup();
        signup.addActionListener(suButton);
        ALnike k = new ALnike();
        Nike.addActionListener(k);  


        


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
        c.add(Nike);
        //I dont know how to make with no error

        setLocationRelativeTo(null);

        }
    }
