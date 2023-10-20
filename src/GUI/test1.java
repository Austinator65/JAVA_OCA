package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class test1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame(null, null);
        JButton button = new JButton(null, null);
        JTextField mytext = new JTextField();
        // JPanel panel = new JPanel();

        frame.setLayout(new GridLayout());

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(mytext.getText());

            }

        });

        frame.add(mytext);
        frame.add(button);

        frame.setVisible(true);
    }
}
