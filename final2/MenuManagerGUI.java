package final2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuManagerGUI {
    private JFrame frame;
    private JTextField textField;
    private MenuManagerImp menuManager;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuManagerGUI window = new MenuManagerGUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MenuManagerGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnAddCake = new JButton("Add Cake");
        btnAddCake.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add your code for adding a cake here
            }
        });
        btnAddCake.setBounds(10, 11, 89, 23);
        frame.getContentPane().add(btnAddCake);

        // Add similar buttons for "Add Tea", "View Menu", "Purchase Items", and "Exit"
        // Remember to add action listeners to each button to handle the user's actions

        textField = new JTextField();
        textField.setBounds(10, 227, 414, 23);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
    }
}
