package PhotoHuntGame;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SecondFrame {

		public JFrame secondFrame;
		public JTextField NameField;
		JFrame modeFrame;
		public String nameInput;
		public JButton nextBut;
		public JLabel Entertxt;
	
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						SecondFrame window = new SecondFrame();
						window.secondFrame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	
		/**
		 * Create the application.
		 */
		public SecondFrame() {
			initialize();
		}
	
		/**
		 * Initialize the contents of the frame.
		 */
		public void initialize() {
			secondFrame = new JFrame();
			secondFrame.setBounds(550, 250, 450, 300);
			secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			secondFrame.getContentPane().setLayout(null);
			secondFrame.setResizable(false);
	
			
			nextBut = new JButton("NEXT");
			nextBut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					nameInput = NameField.getText();
					ThirdFrame tframe = new ThirdFrame();
					tframe.NameLabel.setText(nameInput);
					tframe.thirdFrame.setVisible(true);
					secondFrame.dispose();
				}
			});
			nextBut.setFont(new Font("Georgia", Font.BOLD, 15));
			nextBut.setBounds(339, 226, 87, 27);
			secondFrame.getContentPane().add(nextBut);
			nextBut.setVisible(false);
	
			
			Entertxt = new JLabel("Enter your name:");
			Entertxt.setFont(new Font("Georgia", Font.BOLD, 27));
			Entertxt.setBounds(107, 70, 251, 49);
			secondFrame.getContentPane().add(Entertxt);
	
			NameField = new JTextField();
			NameField.setBounds(163, 129, 130, 26);
			secondFrame.getContentPane().add(NameField);
			NameField.setColumns(10);
	
			JButton okBut = new JButton("OK");
			okBut.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					nameInput = NameField.getText();
					// System.out.print(nameInput);
					checkname(nameInput);
					
				}
	
			});
			okBut.setFont(new Font("Georgia", Font.BOLD, 20));
			okBut.setBounds(189, 180, 72, 35);
			secondFrame.getContentPane().add(okBut);
	
			JLabel BG2 = new JLabel("");
			BG2.setIcon(new ImageIcon(SecondFrame.class.getResource("/gameImages/Background2.png")));
			BG2.setBounds(0, 0, 450, 272);
			secondFrame.getContentPane().add(BG2);
	
		}
	
		public void checkname(String nameCheck) {
			SecondFrame window = new SecondFrame();
	
			if(nameCheck.matches("[a-zA-Z]+")){
				System.out.println(nameCheck);
				nextBut.setVisible(true);
			}
			
			else if(nameCheck.matches("[a-zA-Z0-9]+")){
				System.out.println("Can input only alphabets");
				nextBut.setVisible(false);
				wrongInput wip = new wrongInput();
			    wip.wronginput.setVisible(true);
			    window.secondFrame.dispose();
				
			}
			
			else if(nameCheck.length() == 0 || nameCheck.trim().isEmpty()){
				System.out.println("Please input your name");
				nextBut.setVisible(false);
				wrongInput wip = new wrongInput();
			    wip.wronginput.setVisible(true);
			    window.secondFrame.dispose();
	
			}
	
		}
	}
