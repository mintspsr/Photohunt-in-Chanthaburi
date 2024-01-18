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

public class Exit {

	JFrame exitFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exit window = new Exit();
					window.exitFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		exitFrame = new JFrame();
		exitFrame.setBounds(550, 250, 450, 300);
		exitFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		exitFrame.setResizable(false);
		exitFrame.getContentPane().setLayout(null);
		
		JLabel thktxt = new JLabel("THANK YOU FOR PLAYING!!");
		thktxt.setForeground(Color.WHITE);
		thktxt.setFont(new Font("Georgia", Font.BOLD, 23));
		thktxt.setBounds(46, 80, 350, 27);
		exitFrame.getContentPane().add(thktxt);
		
		JButton ExitBut = new JButton("EXIT");
		ExitBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		ExitBut.setFont(new Font("Georgia", Font.BOLD, 20));
		ExitBut.setBounds(155, 151, 97, 42);
		exitFrame.getContentPane().add(ExitBut);
		
		JLabel BG6 = new JLabel("");
		BG6.setIcon(new ImageIcon(Exit.class.getResource("/gameImages/background6.jpg")));
		BG6.setBounds(-342, -64, 1280, 688);
		exitFrame.getContentPane().add(BG6);
	}
}
