package Homework19_Advanced.Homework19_Advanced;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegistrationForm extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField firstNameField, lastNameField, ageField;
    private JButton registerButton;

    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2));

        panel.add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        panel.add(firstNameField);

        panel.add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        panel.add(lastNameField);

        panel.add(new JLabel("Age:"));
        ageField = new JTextField();
        panel.add(ageField);

        panel.add(new JLabel("Photo:"));
        JButton uploadPhotoButton = new JButton("Upload Photo");
        panel.add(uploadPhotoButton);

        registerButton = new JButton("Register");
        panel.add(registerButton);

        add(panel);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String age = ageField.getText();
                dispose();
                showStudentInfo(firstName, lastName, age);
            }
        });
    }

    private void showStudentInfo(String firstName, String lastName, String age) {
        JFrame infoFrame = new JFrame("Student Information");
        infoFrame.setSize(400, 300);

        JPanel infoPanel = new JPanel(new FlowLayout());
        infoPanel.add(new JLabel("Name: " + firstName + " " + lastName));
        infoPanel.add(new JLabel("Age: " + age));
        infoFrame.add(infoPanel);
        infoFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistrationForm().setVisible(true);
            }
        });
    }

	public JTextField getFirstNameField() {
		return firstNameField;
	}

	public void setFirstNameField(JTextField firstNameField) {
		this.firstNameField = firstNameField;
	}

	public JTextField getLastNameField() {
		return lastNameField;
	}

	public void setLastNameField(JTextField lastNameField) {
		this.lastNameField = lastNameField;
	}

	public JTextField getAgeField() {
		return ageField;
	}

	public void setAgeField(JTextField ageField) {
		this.ageField = ageField;
	}

	public JButton getRegisterButton() {
		return registerButton;
	}

	public void setRegisterButton(JButton registerButton) {
		this.registerButton = registerButton;
	}
}

