package PhotoHuntGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class mode {

	JFrame modeframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mode window = new mode();
					window.modeframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mode() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		modeframe = new JFrame();
		modeframe.setBounds(550, 250, 450, 300);
		modeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		modeframe.getContentPane().setLayout(null);
		modeframe.setResizable(false);
		
		JLabel selecttxt = new JLabel("Select mode:");
		selecttxt.setBackground(new Color(104, 23, 107));
		selecttxt.setForeground(Color.WHITE);
		selecttxt.setFont(new Font("Georgia", Font.BOLD, 24));
		selecttxt.setBounds(156, 54, 157, 28);
		modeframe.getContentPane().add(selecttxt);
		
		JButton EasyBut = new JButton("EASY ");
		EasyBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FifthFrame ffr = new FifthFrame();
				ffr.EasyMode.setVisible(true);
				modeframe.dispose();
			}
		});
		EasyBut.setFont(new Font("Georgia", Font.BOLD, 18));
		EasyBut.setBounds(156, 112, 141, 41);
		modeframe.getContentPane().add(EasyBut);
		
		JButton HardBur = new JButton("HARD");
		HardBur.setFont(new Font("Georgia", Font.BOLD, 18));
		HardBur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HardMode hm = new HardMode();
				hm.HardMode.setVisible(true);
				modeframe.dispose();
			}
		});
		HardBur.setBounds(156, 176, 141, 41);
		modeframe.getContentPane().add(HardBur);
		
		JLabel BG4 = new JLabel("");
		BG4.setBackground(new Color(0, 255, 102));
		BG4.setIcon(new ImageIcon(mode.class.getResource("/gameImages/Background4.jpg")));
		BG4.setBounds(0, -6, 450, 278);
		modeframe.getContentPane().add(BG4);
	}


		
}

