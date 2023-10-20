package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FinalProject {
    public static void main(String[] args) {

        int currentUser = 0;
        User[] UserArray = new User[100];

        JFrame f = new JFrame();
        f.setSize(200, 300);
        f.setLayout(new GridLayout(4, 3));

        // TEXT FIELDS
        JTextField NameText = new JTextField();
        JTextField UsernameText = new JTextField();
        JTextField PasswordText = new JTextField();

        // LABELS
        JLabel NameLabel = new JLabel("Name: ");
        JLabel UsernameLabel = new JLabel("Username: ");
        JLabel PasswordLabel = new JLabel("Password: ");

        JButton SignUpButton = new JButton();
        SignUpButton.setText("Sign Up");

        f.add(NameLabel);
        f.add(NameText);

        f.add(UsernameLabel);
        f.add(UsernameText);

        f.add(PasswordLabel);
        f.add(PasswordText);

        f.add(new JLabel());
        f.add(SignUpButton);

        SignUpButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                User userToAdd = new User(NameText.getText(), UsernameText.getText(), PasswordText.getText());
                UserArray[currentUser] = userToAdd;

                System.out.println("Added new user with name: " + userToAdd.getName());
                // throw new UnsupportedOperationException("Unimplemented method
                // 'actionPerformed'");
            }

        });

        f.setVisible(true);

    }

}
