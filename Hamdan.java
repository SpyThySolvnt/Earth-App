    import java.awt.Container;
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
        JTextField pass;
        Container c;

        




public static void main(String[] args){

        // Hamdan x = new Hamdan(); 
        Complaint y = new Complaint();
        
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
        System.out.println("login");
        LoginPage z = new LoginPage();
        dispose();

}
}
private class ALsignup implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Signup x = new Signup();
        signup.setEnabled(false);
        dispose();
    }
}



//web thingy
        Hamdan(){
        
            
        c = getContentPane();
        c.setLayout(null);
        
        setSize(700,700);
        setTitle("Earth App");
        JLabel EnterStuff =new JLabel("Please Write Your Login Information: ");
        EnterStuff.setBounds(0, -100, 250, 250);
        JLabel EnterName =new JLabel("UserName:");
        EnterName.setBounds(235, 100, 250, 250);
        username = new JTextField();
        username.setBounds(300,200,150,50);
        JLabel EnterPass= new JLabel("Password:");
        EnterPass.setBounds(235, 150, 250, 250);
        pass = new JTextField();
        pass.setBounds(300,250,150,50);
        



        //buttons:

        admin = new JButton("Admin Login");
        admin.setBounds(550,0,150,50);
        login = new JButton("Login");
        login.setBounds(230, 300, 220, 50);
        signup = new JButton("Sign Up");
        signup.setBounds(230,350,220,50);



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
        //I dont know how to make with no error

        setLocationRelativeTo(null);

        }
    }
