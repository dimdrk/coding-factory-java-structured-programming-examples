package gr.aueb.cf.ch21;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CodingFrame extends JFrame {

    public CodingFrame() {
        this.setSize(500, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hello Coding Factory");

        JPanel contentPane = new JPanel();
        this.setContentPane(contentPane);

        JButton messageBtn = new JButton("Message Button");
        messageBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is a message", "Title of Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        contentPane.add(messageBtn);
    }
}
