package PhotoHuntGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ThirdFrame extends SecondFrame{

	
	JFrame thirdFrame;
	//String name;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThirdFrame window = new ThirdFrame();
					window.thirdFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ThirdFrame() {
	}
	public JLabel NameLabel; 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		thirdFrame = new JFrame();
		thirdFrame.setBounds(550, 250, 450, 300);
		thirdFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thirdFrame.getContentPane().setLayout(null);
		thirdFrame.setResizable(false);
		
		NameLabel = new JLabel("");
		//NameLabel.setText(name);
		NameLabel.setForeground(Color.WHITE);
		NameLabel.setFont(new Font("Georgia", Font.BOLD, 22));
		NameLabel.setBounds(203, 62, 138, 26);
		thirdFrame.getContentPane().add(NameLabel);
		
		JLabel hellotxt = new JLabel("Hello!");
		hellotxt.setForeground(Color.WHITE);
		hellotxt.setFont(new Font("Georgia", Font.BOLD, 22));
		hellotxt.setBounds(117, 54, 76, 43);
		thirdFrame.getContentPane().add(hellotxt);
		
		JLabel Starttxt = new JLabel("Let's start the game");
		Starttxt.setForeground(Color.WHITE);
		Starttxt.setFont(new Font("Georgia", Font.BOLD, 22));
		Starttxt.setBounds(117, 96, 224, 37);
		thirdFrame.getContentPane().add(Starttxt);
		
		JButton nextButton = new JButton("Next");
		nextButton.setFont(new Font("Georgia", Font.PLAIN, 15));
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mode mde = new mode();
				mde.modeframe.setVisible(true);
				thirdFrame.dispose();
			}
		});
		nextButton.setBounds(191, 155, 77, 29);
		thirdFrame.getContentPane().add(nextButton);
		
		JLabel BG3 = new JLabel("");
		BG3.setIcon(new ImageIcon(ThirdFrame.class.getResource("/gameImages/Background3.jpg")));
		BG3.setBounds(0, 0, 450, 310);
		thirdFrame.getContentPane().add(BG3);
	}
}
