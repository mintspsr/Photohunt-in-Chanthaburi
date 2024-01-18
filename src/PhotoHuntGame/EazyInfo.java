package PhotoHuntGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class EazyInfo {

	JFrame easyInfo;
	BufferedImage BG;
	
	

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EazyInfo window = new EazyInfo();
					window.easyInfo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EazyInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		try 
		{
			BG = ImageIO.read(getClass().getResourceAsStream("/gameImages/Background9.jpg"));
		} 
		catch( IOException e) 
		{

        System.out.println("Image can't read.");

        }
		ImageIcon BG_e = new ImageIcon(BG);

		easyInfo = new JFrame();
		easyInfo.setBounds(0, 0, 2000, 2000);
		easyInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		easyInfo.getContentPane().setLayout(null);
		
		
		JLabel info_w = new JLabel("");
		info_w.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/info_wa.png")));
		info_w.setBounds(402, 185, 300, 350);
		easyInfo.getContentPane().add(info_w);
		
		JLabel info_f = new JLabel("");
		info_f.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/info_f.png")));
		info_f.setBounds(1126, 185, 300, 350);
		easyInfo.getContentPane().add(info_f);
		
		JLabel sara_e = new JLabel("");
		sara_e.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/Sara_e.png")));
		sara_e.setBounds(288, 30, 690, 112);
		easyInfo.getContentPane().add(sara_e);

		JPanel panelpic_w = new JPanel();
		panelpic_w.setBackground(Color.WHITE);
		panelpic_w.setBounds(93, 185, 265, 530);
		easyInfo.getContentPane().add(panelpic_w);
		panelpic_w.setLayout(null);
		
		JLabel pic_w3 = new JLabel("");
		pic_w3.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/waterfall1.PNG")));
		pic_w3.setBounds(0, 0, 265, 530);
		panelpic_w.add(pic_w3);
		pic_w3.setEnabled(false);
		
		JLabel pic_w1 = new JLabel("");
		pic_w1.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/waterfall3.PNG")));
		pic_w1.setBounds(0, 0, 265, 530);
		panelpic_w.add(pic_w1);
		pic_w1.setEnabled(false);
		
		JLabel pic_w2 = new JLabel("");
		pic_w2.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/waterfall2.PNG")));
		pic_w2.setBounds(0, 0, 265, 530);
		panelpic_w.add(pic_w2);
		pic_w2.setEnabled(false);
		
		JPanel panelbutt_w = new JPanel();
		panelbutt_w.setBounds(402, 570, 300, 146);
		easyInfo.getContentPane().add(panelbutt_w);
		panelbutt_w.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Let's paint");
		lblNewLabel.setBounds(10, 10, 163, 35);
		panelbutt_w.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 30));
		
		JButton butt_w1 = new JButton("");
		butt_w1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pic_w1.setEnabled(true);
			}
		});
		butt_w1.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/fishbutt1.png")));
		butt_w1.setBounds(27, 71, 65, 65);
		panelbutt_w.add(butt_w1);
		
		JButton butt_w2 = new JButton("");
		butt_w2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pic_w2.setEnabled(true);
			}
		});
		butt_w2.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/fishbutt3.png")));
		butt_w2.setBounds(121, 71, 65, 65);
		panelbutt_w.add(butt_w2);
		
		JButton butt_w3 = new JButton("");
		butt_w3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pic_w3.setEnabled(true);
			}
		});
		butt_w3.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/fishbutt2.png")));
		butt_w3.setBounds(213, 71, 65, 65);
		panelbutt_w.add(butt_w3);
		
		JPanel panelpic_f = new JPanel();
		panelpic_f.setBackground(Color.WHITE);
		panelpic_f.setBounds(812, 185, 265, 530);
		easyInfo.getContentPane().add(panelpic_f);
		panelpic_f.setLayout(null);
		
		JLabel pic_f1 = new JLabel("");
		pic_f1.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/fish3.PNG")));
		pic_f1.setBounds(0, 0, 265, 530);
		panelpic_f.add(pic_f1);
		pic_f1.setEnabled(false);
		
		JLabel pic_f2 = new JLabel("");
		pic_f2.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/fish1.PNG")));
		pic_f2.setBounds(0, 0, 265, 530);
		panelpic_f.add(pic_f2);
		pic_f2.setEnabled(false);
		
		JLabel pic_f3 = new JLabel("");
		pic_f3.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/fish2.PNG")));
		pic_f3.setBounds(0, 0, 265, 530);
		panelpic_f.add(pic_f3);
		pic_f3.setEnabled(false);
		
		JButton modeBut = new JButton("SELECT MODE");
		modeBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mode mde = new mode();
				mde.modeframe.setVisible(true);
				easyInfo.dispose();
			}
		});
		
		JPanel panelbutt_f = new JPanel();
		panelbutt_f.setLayout(null);
		panelbutt_f.setBounds(1126, 570, 300, 146);
		easyInfo.getContentPane().add(panelbutt_f);
		
		JLabel lblNewLabel_1 = new JLabel("Let's paint");
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 30));
		lblNewLabel_1.setBounds(10, 10, 163, 35);
		panelbutt_f.add(lblNewLabel_1);
		
		JButton butt_f1 = new JButton("");
		butt_f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pic_f2.setEnabled(true);
			}
		});
		butt_f1.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/fishbutt1.png")));
		butt_f1.setBounds(27, 71, 65, 65);
		panelbutt_f.add(butt_f1);
		
		JButton butt_f2 = new JButton("");
		butt_f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pic_f3.setEnabled(true);
			}
		});
		butt_f2.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/fishbutt3.png")));
		butt_f2.setBounds(120, 71, 65, 65);
		panelbutt_f.add(butt_f2);
		
		JButton butt_f3 = new JButton("");
		butt_f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pic_f1.setEnabled(true);
			}
		});
		butt_f3.setIcon(new ImageIcon(EazyInfo.class.getResource("/gameImages/fishbutt2.png")));
		butt_f3.setBounds(213, 71, 65, 65);
		panelbutt_f.add(butt_f3);
		modeBut.setFont(new Font("Georgia", Font.BOLD, 25));
		modeBut.setBounds(1212, 30, 247, 50);
		easyInfo.getContentPane().add(modeBut);
		
		JButton exitBut = new JButton("EXIT GAME");
		exitBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exit ext = new Exit();
				ext.exitFrame.setVisible(true);
				easyInfo.dispose();
			}
		});
		exitBut.setFont(new Font("Georgia", Font.BOLD, 25));
		exitBut.setBounds(1239, 92, 220, 50);
		easyInfo.getContentPane().add(exitBut);
		
		JLabel BG8 = new JLabel("");
		BG8.setIcon(BG_e);
		BG8.setBounds(0, 0, 2800, 1424);
		easyInfo.getContentPane().add(BG8);
		
		JLabel info_w_1 = new JLabel("");
		info_w_1.setBounds(300, 226, 300, 350);
		easyInfo.getContentPane().add(info_w_1);
		
	}
}
