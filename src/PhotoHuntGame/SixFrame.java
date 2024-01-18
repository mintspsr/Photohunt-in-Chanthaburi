package PhotoHuntGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SixFrame {

	JFrame sixframe;
	BufferedImage BG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SixFrame window = new SixFrame();
					window.sixframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SixFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {			
		
		try 
		{
			BG = ImageIO.read(getClass().getResourceAsStream("/gameImages/Background5.jpeg"));
		} 
		catch( IOException e) 
		{

        System.out.println("Image can't read.");

        }
		ImageIcon BG_b = new ImageIcon(BG);
			
		sixframe = new JFrame();
		sixframe.setBounds(550, 250, 450, 300);
		sixframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sixframe.getContentPane().setLayout(null);
		
		JLabel overtxt = new JLabel("Your time is over!");
		overtxt.setForeground(Color.WHITE);
		overtxt.setFont(new Font("Georgia", Font.BOLD, 23));
		overtxt.setBounds(116, 88, 212, 27);
		sixframe.getContentPane().add(overtxt);
		
		JButton ExitBut = new JButton("EXIT");
		ExitBut.setFont(new Font("Georgia", Font.BOLD, 15));
		ExitBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exit ext = new Exit();
				ext.exitFrame.setVisible(true);
				sixframe.dispose();
			}
		});
		ExitBut.setBounds(252, 155, 95, 38);
		sixframe.getContentPane().add(ExitBut);
		
		JButton agaBut = new JButton("PLAY AGAIN");
		agaBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mode mde = new mode();
				mde.modeframe.setVisible(true);
				sixframe.dispose();
			}
		});
		agaBut.setFont(new Font("Georgia", Font.BOLD, 15));
		agaBut.setBounds(81, 155, 145, 38);
		sixframe.getContentPane().add(agaBut);
		
		JLabel BG5 = new JLabel("");
		BG5.setIcon(BG_b);
		BG5.setBounds(0, -19, 450, 272);
		sixframe.getContentPane().add(BG5);
	}
}
