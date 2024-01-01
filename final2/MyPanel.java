package final2;
import javax.swing.*;
import java.awt.*;

public class MyPanel extends JFrame {
    public MyPanel() {
        this.setTitle("Panel with Buttons Example");
        this.setSize(new Dimension(190, 75));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();

        JPanel buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(400,300));
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        button1.setPreferredSize(new Dimension(190, 75));
        button2.setPreferredSize(new Dimension(190, 75));
        button1.addActionListener(e -> {
            test();
        });

        buttonPanel.add(button1);
        buttonPanel.add(button2);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        add(mainPanel);
    }

    private void test() {
    }
}
