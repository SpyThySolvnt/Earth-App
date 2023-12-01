import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AdminPage extends JFrame{


    JButton Approve;
    JTextArea Initiatives;
    JTable z;
    JButton Reject;
    Container c;
    DefaultTableModel model;




//////////////////
private static void removeRowFile(String filePath, int rowIndexToRemove) {
    // Read the content of the original file
    ArrayList<String> lines = new ArrayList<>();
    try (Scanner scanner = new Scanner(new FileReader(filePath))) {
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
    } catch (IOException x) {
        x.printStackTrace();
        return; // Handle the error or log it
    }

    // Remove the specified row index
    if (rowIndexToRemove >= 0 && rowIndexToRemove <= lines.size()) {
        lines.remove(rowIndexToRemove);
    } else {
        System.out.println("Invalid row index to remove.");
        return;
    }

    // Write the modified content back to the original file
    try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
        for (String line : lines) {
            writer.println(line);
        }
    } catch (IOException ex) {
        ex.printStackTrace();
        // Handle the error or log it
    }
}
//////////////

       private class ALreject implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (model != null && z.getSelectedRow() != -1) {
                // Get the data of the rejected row
                Object[] shew = new Object[model.getColumnCount()];
                for (int i = 0; i < model.getColumnCount(); i++) {
                    shew[i] = model.getValueAt(z.getSelectedRow(), i);
                }
    
                // Remove the row from the table
                model.removeRow(z.getSelectedRow());
    
                // Write the rejected data to a separate file (e.g., Rejected.txt)
                RejectedData(shew);

                removeRowFile("PendingAdmin.txt",z.getSelectedRow()+1);

                
            } else {
                JOptionPane.showMessageDialog(AdminPage.this, "Please select a row to reject.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
            }
        }
    }




    /////////////////////////////////////////////////////////
    // private void DelPend(Object[] rowData) {
    //     // Read the content of the original file
    //     ArrayList<String> lines = new ArrayList<>();
    //     try (Scanner scanner = new Scanner(new FileReader("Pending.txt"))) {
    //         while (scanner.hasNextLine()) {
    //             lines.add(scanner.nextLine());
    //         }
    //     } catch (IOException ex) {
    //         ex.printStackTrace();
    //         return; // Handle the error or log it
    //     }
    
    //     // Identify the row to be deleted
    //     String rowToDelete = Arrays.stream(rowData)
    //             .map(Object::toString)
    //             .collect(Collectors.joining(" "));
    
    //     // Remove the row from the list
    //     lines.remove(rowToDelete);
    // }


//////
    private void RejectedData(Object[] rowData) {
        try (PrintWriter wx = new PrintWriter(new FileWriter("Rejected.txt", true))) {
            for (Object data : rowData) {
                wx.print(data + " ");
            }
            wx.println();  
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error writing to Rejected.txt");
        }
    }
//////////////////

private void ApprovedData(Object[] rowData) {
        try (PrintWriter wx = new PrintWriter(new FileWriter("Approved.txt", true))) {
            for (Object data : rowData) {
                wx.print(data + " ");
            }
            wx.println();  
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error writing to Rejected.txt");
        }
    }
    ///////////////////
    private class ALapprove implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                if (model != null && z.getSelectedRow() != -1) {
                   if (model != null && z.getSelectedRow() != -1) {
                // Get the data of the rejected row
                Object[] shew = new Object[model.getColumnCount()];
                for (int i = 0; i < model.getColumnCount(); i++) {
                    shew[i] = model.getValueAt(z.getSelectedRow(), i);
                }
    
                // Remove the row from the table
                model.removeRow(z.getSelectedRow());
    
                // Write the rejected data to a separate file (e.g., Rejected.txt)
                ApprovedData(shew);

                removeRowFile("PendingAdmin.txt",z.getSelectedRow()+1);

                
            } else {
                JOptionPane.showMessageDialog(AdminPage.this, "Please select a row to approve.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    }

    public void loadTable() {
        try (Scanner nm = new Scanner(new FileReader("PendingAdmin.txt"))) {
            while (nm.hasNextLine()) {
                Scanner lin = new Scanner(nm.nextLine());
                Object[] rw = new Object[7];
                for (int i = 0; i < 7 && lin.hasNext(); i++) {
                    rw[i] = lin.next();
                }
                model.addRow(rw);
                lin.close();
            }
        } catch (IOException an) {
            an.printStackTrace();
        }
    }


    AdminPage() {
        // A must on JFrames
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        setSize(900, 700);
        setTitle("Admin Log-in");

        JLabel Welcome = new JLabel("Welcome Back Admin");
        Welcome.setBounds(0, 0, 500, 60);

        Reject = new JButton("Reject");
        Reject.setBounds(300, 400, 150, 50);

        Approve = new JButton("Approve");
        Approve.setBounds(500, 400, 150, 50);

        ALreject r = new ALreject();
        Reject.addActionListener(r);

        ALapprove a = new ALapprove();
        Approve.addActionListener(a);

        // Jtable
        String column[] = {"Counter", "ID ", " Initiative", "Description", "Credit Hour", "Time", "Date"};

        String row[][] = {};  // You may want to initialize with more rows

        model = new DefaultTableModel(row, column) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        z = new JTable(model);
        JScrollPane y = new JScrollPane(z);
        y.setBounds(200, 200, 500, 100);
        z.getTableHeader().setReorderingAllowed(false);
        z.getTableHeader().setResizingAllowed(false);

        c.add(Welcome);
        c.add(y);
        c.add(Reject);
        c.add(Approve);
        loadTable();
        setLocationRelativeTo(null);
    }
}