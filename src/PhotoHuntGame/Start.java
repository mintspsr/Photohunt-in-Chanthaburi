package PhotoHuntGame;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frame;
	BufferedImage BG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
			try 
			{
				BG = ImageIO.read(getClass().getResourceAsStream("/gameImages/Background1.jpg"));
			} 
			catch( IOException e) 
			{

            System.out.println("Image can't read.");

            }
			ImageIcon BG_a = new ImageIcon(BG);
			
		frame = new JFrame();
		frame.setBounds(550, 250, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel gameName = new JLabel("PHOTO HUNT IN CHANTHABURI");
		gameName.setHorizontalAlignment(SwingConstants.CENTER);
		gameName.setFont(new Font("Georgia", Font.BOLD, 20));
		gameName.setBounds(32, 39, 381, 37);
		frame.getContentPane().add(gameName);
		
		JLabel txt = new JLabel("LETS PLAY!");
		txt.setHorizontalAlignment(SwingConstants.CENTER);
		txt.setFont(new Font("Georgia", Font.BOLD, 16));
		txt.setBounds(167, 103, 101, 19);
		frame.getContentPane().add(txt);
		
		JButton startButton = new JButton("START");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecondFrame sf = new SecondFrame();
				sf.secondFrame.setVisible(true);
				frame.dispose();
			}
		});
		
		startButton.setFont(new Font("Georgia", Font.BOLD, 14));
		startButton.setBounds(154, 132, 129, 38);
		frame.getContentPane().add(startButton);
		
		JButton Exitbtn = new JButton("EXIT");
		Exitbtn.setFont(new Font("Georgia", Font.BOLD, 14));
		Exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		Exitbtn.setBounds(173, 228, 89, 25);
		frame.getContentPane().add(Exitbtn);
		
		
		JLabel BG1 = new JLabel("");
		BG1.setIcon(BG_a);
		BG1.setBounds(0, 0, 450, 272);
		frame.getContentPane().add(BG1);
	}
}
