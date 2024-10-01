
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addressbooks extends JFrame implements ActionListener {
    private JTextField nameTextField, addressTextField, cityTextField, stateTextField, zipTextField, phoneTextField, emailTextField;

    public addressbooks() {
        setSize(400, 300);
        setTitle("Address Book");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(8, 2));

        contentPane.add(new JLabel("Name:"));
        nameTextField = new JTextField(25);
        contentPane.add(nameTextField);

        contentPane.add(new JLabel("Address:"));
        addressTextField = new JTextField(25);
        contentPane.add(addressTextField);

        contentPane.add(new JLabel("City:"));
        cityTextField = new JTextField(25);
        contentPane.add(cityTextField);

        contentPane.add(new JLabel("State:"));
        stateTextField = new JTextField(25);
        contentPane.add(stateTextField);

        contentPane.add(new JLabel("Zip code:"));
        zipTextField = new JTextField(25);
        contentPane.add(zipTextField);

        contentPane.add(new JLabel("Phone number:"));
        phoneTextField = new JTextField(25);
        contentPane.add(phoneTextField);

        contentPane.add(new JLabel("Email:"));
        emailTextField = new JTextField(25);
        contentPane.add(emailTextField);

        JButton enterButton = new JButton("Enter Record");
        enterButton.addActionListener(this);
        contentPane.add(enterButton);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        contentPane.add(exitButton);
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Enter Record")) {
            String display = nameTextField.getText() + "\n" +
                             addressTextField.getText() + "\n" +
                             cityTextField.getText() + "\n" +
                             stateTextField.getText() + "\n" +
                             zipTextField.getText() + "\n" +
                             phoneTextField.getText() + "\n" +
                             emailTextField.getText();
            JOptionPane.showMessageDialog(null, display);
            nameTextField.setText("");
            addressTextField.setText("");
            cityTextField.setText("");
            stateTextField.setText("");
            zipTextField.setText("");
            phoneTextField.setText("");
            emailTextField.setText("");
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        addressbooks gui = new addressbooks();
        gui.setVisible(true);
    }
}
