package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddclerkGUI extends JFrame {
	private static Warehouse warehouse;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddclerkGUI frame = new AddclerkGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddclerkGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnName = new JButton("Name");
		btnName.setBounds(10, 56, 89, 23);
		contentPane.add(btnName);
		
		JButton btnAddress = new JButton("Address");
		btnAddress.setBounds(10, 90, 89, 23);
		contentPane.add(btnAddress);
		
		JButton btnPhone = new JButton("Phone");
		btnPhone.setBounds(10, 135, 89, 23);
		contentPane.add(btnPhone);
		
		textField = new JTextField();
		textField.setBounds(128, 57, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 91, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 136, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblClerkMenu = new JLabel("Clerk Menu");
		lblClerkMenu.setBounds(159, 11, 89, 14);
		contentPane.add(lblClerkMenu);
		
		JLabel lblEnterYourDetails = new JLabel("Enter your details");
		lblEnterYourDetails.setBounds(10, 31, 123, 14);
		contentPane.add(lblEnterYourDetails);
		
		JButton btnAddClient = new JButton("Add Client");
		btnAddClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				String name = textField.getText();
				String address = textField_1.getText();
				String phone = textField_2.getText();
		        Client result;
		        System.out.println(name + address + phone);
		        result = warehouse.instance().addClient(name, address, phone);
		        if (result == null) {
		        	JLabel labelClerk = new JLabel("invalid user");
		    		labelClerk.setBounds(10, 236, 46, 14);
		    		contentPane.add(labelClerk);
		        }
		        System.out.println(result);
				
			}
		});
		btnAddClient.setBounds(128, 182, 89, 23);
		contentPane.add(btnAddClient);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(10, 182, 89, 23);
		contentPane.add(btnLogout);
		
		
	}
}
