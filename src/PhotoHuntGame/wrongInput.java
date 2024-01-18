package PhotoHuntGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class wrongInput {

	JFrame wronginput;
	BufferedImage BG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wrongInput window = new wrongInput();
					window.wronginput.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public wrongInput() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try 
		{
			BG = ImageIO.read(getClass().getResourceAsStream("/gameImages/background10.jpg"));
		} 
		catch( IOException e) 
		{

        System.out.println("Image can't read.");

        }
		ImageIcon BG_c = new ImageIcon(BG);
		
		wronginput = new JFrame();
		wronginput.setBounds(550, 250, 450, 300);
		wronginput.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wronginput.getContentPane().setLayout(null);
		wronginput.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("your name again!");
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 30));
		lblNewLabel.setBounds(91, 98, 274, 35);
		wronginput.getContentPane().add(lblNewLabel);
		
		JLabel wrong = new JLabel("Please enter");
		wrong.setFont(new Font("Georgia", Font.BOLD, 30));
		wrong.setBounds(124, 53, 193, 35);
		wronginput.getContentPane().add(wrong);
		
		JButton Okbutt = new JButton("OK");
		Okbutt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecondFrame sfd = new SecondFrame();
				sfd.secondFrame.setVisible(true);
				wronginput.dispose();
			}
		});
		Okbutt.setFont(new Font("Georgia", Font.BOLD, 22));
		Okbutt.setBounds(177, 160, 89, 44);
		wronginput.getContentPane().add(Okbutt);
		
		JLabel BG10 = new JLabel("");
		BG10.setIcon(BG_c);
		BG10.setBounds(-150, -152, 1000, 780);
		wronginput.getContentPane().add(BG10);
		
	}
}
