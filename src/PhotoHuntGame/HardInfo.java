package PhotoHuntGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HardInfo {

	JFrame hardInfo;
	BufferedImage BG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HardInfo window = new HardInfo();
					window.hardInfo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HardInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		try 
		{
			BG = ImageIO.read(getClass().getResourceAsStream("/gameImages/Background11.jpg"));
		} 
		catch( IOException e) 
		{

        System.out.println("Image can't read.");

        }
		ImageIcon BG_f = new ImageIcon(BG);
		
		hardInfo = new JFrame();
		hardInfo.setBounds(0, 0, 2000, 2000);
		hardInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hardInfo.getContentPane().setLayout(null);
		
		JLabel info_r = new JLabel("");
		info_r.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/info_w.png")));
		info_r.setBounds(323, 498, 375, 150);
		hardInfo.getContentPane().add(info_r);
		
		JLabel info_w = new JLabel("");
		info_w.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/info_r.png")));
		info_w.setBounds(1102, 498, 375, 150);
		hardInfo.getContentPane().add(info_w);
		
		JLabel info_m = new JLabel("");
		info_m.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/info_m.png")));
		info_m.setBounds(1102, 184, 375, 150);
		hardInfo.getContentPane().add(info_m);
		
		JLabel info_d = new JLabel("");
		info_d.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/info_d.png")));
		info_d.setBounds(323, 184, 375, 150);
		hardInfo.getContentPane().add(info_d);
		
		JLabel sara_h = new JLabel("");
		sara_h.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/Sara_h.png")));
		sara_h.setBounds(346, 26, 690, 112);
		hardInfo.getContentPane().add(sara_h);
		
		JPanel panelpic_d = new JPanel();
		panelpic_d.setBackground(Color.WHITE);
		panelpic_d.setBounds(50, 184, 235, 250);
		hardInfo.getContentPane().add(panelpic_d);
		panelpic_d.setLayout(null);
		
		JLabel durian1 = new JLabel("");
		durian1.setBounds(0, 0, 235, 250);
		panelpic_d.add(durian1);
		durian1.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/durian1.png")));
		durian1.setEnabled(false);
		
		JLabel durian2 = new JLabel("");
		durian2.setBounds(0, 0, 235, 250);
		panelpic_d.add(durian2);
		durian2.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/durian2.png")));
		durian2.setEnabled(false);
		
		JLabel durian3 = new JLabel("");
		durian3.setBounds(0, 0, 235, 250);
		panelpic_d.add(durian3);
		durian3.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/durian3.png")));
		durian3.setEnabled(false);
		
		JPanel panelbutt_d = new JPanel();
		panelbutt_d.setBackground(new Color(189, 183, 107));
		panelbutt_d.setBounds(323, 356, 375, 78);
		hardInfo.getContentPane().add(panelbutt_d);
		panelbutt_d.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Let's paint");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 25));
		lblNewLabel.setBounds(5, 20, 138, 37);
		panelbutt_d.add(lblNewLabel);
		
		JButton butt_d1 = new JButton("");
		butt_d1.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/appbutt1.png")));
		butt_d1.setFont(new Font("Georgia", Font.PLAIN, 12));
		butt_d1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				durian1.setEnabled(true);
			}
		});
		butt_d1.setBounds(159, 10, 58, 58);
		panelbutt_d.add(butt_d1);
		
		JButton butt_d2 = new JButton("");
		butt_d2.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/appbutt2.png")));
		butt_d2.setFont(new Font("Georgia", Font.PLAIN, 12));
		butt_d2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				durian3.setEnabled(true);
			}
		});
		
				butt_d2.setBounds(227, 10, 58, 58);
				panelbutt_d.add(butt_d2);
				
		JButton butt_d3 = new JButton("");
		butt_d3.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/appbutt3.png")));
		butt_d3.setFont(new Font("Georgia", Font.PLAIN, 12));
		butt_d3.addMouseListener(new MouseAdapter() {
				@Override
			public void mouseClicked(MouseEvent e) {
				durian2.setEnabled(true);
				}
			});
		butt_d3.setBounds(295, 10, 58, 58);
		panelbutt_d.add(butt_d3);
		
		JPanel panelpic_w = new JPanel();
		panelpic_w.setBackground(Color.WHITE);
		panelpic_w.setBounds(50, 498, 235, 250);
		hardInfo.getContentPane().add(panelpic_w);
		panelpic_w.setLayout(null);
		
		JLabel wai_1 = new JLabel("");
		wai_1.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/wai_1.png")));
		wai_1.setBounds(0, 0, 235, 250);
		panelpic_w.add(wai_1);
		wai_1.setEnabled(false);
		
		JLabel wai_3 = new JLabel("");
		wai_3.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/wai_3.png")));
		wai_3.setBounds(0, 0, 235, 250);
		panelpic_w.add(wai_3);
		wai_3.setEnabled(false);
		
		JLabel wai_2 = new JLabel("");
		wai_2.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/wai_2.png")));
		wai_2.setBounds(0, 0, 235, 250);
		panelpic_w.add(wai_2);
		wai_2.setEnabled(false);
		
		JPanel panelpic_m = new JPanel();
		panelpic_m.setBackground(Color.WHITE);
		panelpic_m.setBounds(829, 184, 235, 250);
		hardInfo.getContentPane().add(panelpic_m);
		panelpic_m.setLayout(null);
		
		JLabel mang_1 = new JLabel("");
		mang_1.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/mang_1.png")));
		mang_1.setBounds(0, 0, 235, 250);
		panelpic_m.add(mang_1);
		mang_1.setEnabled(false);
		
		JLabel mang_3 = new JLabel("");
		mang_3.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/mang_3.png")));
		mang_3.setBounds(0, 0, 235, 250);
		panelpic_m.add(mang_3);
		mang_3.setEnabled(false);
		
		JLabel mang_2 = new JLabel("");
		mang_2.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/mang_2.png")));
		mang_2.setBounds(0, 0, 235, 250);
		panelpic_m.add(mang_2);
		mang_2.setEnabled(false);
		
		JPanel panelpic_r = new JPanel();
		panelpic_r.setBackground(Color.WHITE);
		panelpic_r.setBounds(829, 498, 235, 250);
		hardInfo.getContentPane().add(panelpic_r);
		panelpic_r.setLayout(null);
		
		JLabel ram_1 = new JLabel("");
		ram_1.setBounds(0, 15, 235, 235);
		panelpic_r.add(ram_1);
		ram_1.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/ram_3.png")));
		ram_1.setEnabled(false);
		
		JLabel ram_2 = new JLabel("");
		ram_2.setBounds(0, 15, 235, 235);
		panelpic_r.add(ram_2);
		ram_2.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/ram_2.png")));
		ram_2.setEnabled(false);
		
		JLabel ram_3 = new JLabel("");
		ram_3.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/ram_1.png")));
		ram_3.setBounds(0, 15, 235, 235);
		panelpic_r.add(ram_3);
		ram_3.setEnabled(false);
		
		JPanel panelbutt_w = new JPanel();
		panelbutt_w.setBackground(new Color(255, 160, 122));
		panelbutt_w.setLayout(null);
		panelbutt_w.setBounds(323, 670, 375, 78);
		hardInfo.getContentPane().add(panelbutt_w);
		
		JLabel lblNewLabel_1 = new JLabel("Let's paint");
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 25));
		lblNewLabel_1.setBounds(5, 20, 138, 37);
		panelbutt_w.add(lblNewLabel_1);
		
		JButton butt_w1 = new JButton("");
		butt_w1.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/appbutt1.png")));
		butt_w1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wai_1.setEnabled(true);
			}
		});
		butt_w1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		butt_w1.setBounds(159, 10, 58, 58);
		panelbutt_w.add(butt_w1);
		
		JButton butt_w2 = new JButton("");
		butt_w2.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/appbutt2.png")));
		butt_w2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wai_3.setEnabled(true);
			}
		});
		butt_w2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		butt_w2.setBounds(227, 10, 58, 58);
		panelbutt_w.add(butt_w2);
		
		JButton butt_w3 = new JButton("");
		butt_w3.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/appbutt3.png")));
		butt_w3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wai_2.setEnabled(true);
			}
		});
		butt_w3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		butt_w3.setBounds(295, 10, 58, 58);
		panelbutt_w.add(butt_w3);
		
		JPanel panelbutt_m = new JPanel();
		panelbutt_m.setBackground(new Color(139, 0, 139));
		panelbutt_m.setLayout(null);
		panelbutt_m.setBounds(1102, 356, 375, 78);
		hardInfo.getContentPane().add(panelbutt_m);
		
		JLabel lblNewLabel_2 = new JLabel("Let's paint");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 25));
		lblNewLabel_2.setBounds(5, 20, 138, 37);
		panelbutt_m.add(lblNewLabel_2);
		
		JButton butt_m1 = new JButton("");
		butt_m1.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/appbutt1.png")));
		butt_m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mang_1.setEnabled(true);
			}
		});
		butt_m1.setFont(new Font("Georgia", Font.PLAIN, 12));
		butt_m1.setBounds(159, 10, 58, 58);
		panelbutt_m.add(butt_m1);
		
		JButton butt_m3 = new JButton("");
		butt_m3.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/appbutt2.png")));
		butt_m3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mang_2.setEnabled(true);
			}
		});
		butt_m3.setFont(new Font("Georgia", Font.PLAIN, 12));
		butt_m3.setBounds(227, 10, 58, 58);
		panelbutt_m.add(butt_m3);
		
		JButton butt_m2 = new JButton("");
		butt_m2.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/appbutt3.png")));
		butt_m2.setBounds(295, 10, 58, 58);
		panelbutt_m.add(butt_m2);
		butt_m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mang_3.setEnabled(true);
			}
		});
		butt_m2.setFont(new Font("Georgia", Font.PLAIN, 12));
		
		JPanel panelbutt_r = new JPanel();
		panelbutt_r.setBackground(new Color(250, 128, 114));
		panelbutt_r.setLayout(null);
		panelbutt_r.setBounds(1102, 670, 375, 78);
		hardInfo.getContentPane().add(panelbutt_r);
		
		JLabel lblNewLabel_3 = new JLabel("Let's paint");
		lblNewLabel_3.setFont(new Font("Georgia", Font.BOLD, 25));
		lblNewLabel_3.setBounds(5, 20, 138, 37);
		panelbutt_r.add(lblNewLabel_3);
		
		JButton butt_r1 = new JButton("");
		butt_r1.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/appbutt3.png")));
		butt_r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ram_1.setEnabled(true);
			}
		});
		butt_r1.setFont(new Font("Georgia", Font.PLAIN, 12));
		butt_r1.setBounds(296, 14, 58, 58);
		panelbutt_r.add(butt_r1);
		
		JButton butt_r2 = new JButton("");
		butt_r2.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/appbutt2.png")));
		butt_r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ram_2.setEnabled(true);
			}
		});
		butt_r2.setFont(new Font("Georgia", Font.PLAIN, 12));
		butt_r2.setBounds(228, 14, 58, 58);
		panelbutt_r.add(butt_r2);
		
		JButton butt_r3 = new JButton("");
		butt_r3.setIcon(new ImageIcon(HardInfo.class.getResource("/gameImages/appbutt1.png")));
		butt_r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ram_3.setEnabled(true);
			}
		});
		butt_r3.setFont(new Font("Georgia", Font.PLAIN, 12));
		butt_r3.setBounds(160, 14, 58, 58);
		panelbutt_r.add(butt_r3);
		
		JButton modeBut = new JButton("SELECT MODE");
		modeBut.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				mode mde = new mode();
				mde.modeframe.setVisible(true);
				hardInfo.dispose();
			}
		});
		modeBut.setFont(new Font("Georgia", Font.BOLD, 25));
		modeBut.setBounds(1241, 26, 247, 50);
		hardInfo.getContentPane().add(modeBut);
		
		JButton exitBut = new JButton("EXIT GAME");
		exitBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Exit ext = new Exit();
					ext.exitFrame.setVisible(true);
					hardInfo.dispose();
				}
			});
			
		exitBut.setFont(new Font("Georgia", Font.BOLD, 25));
		exitBut.setBounds(1266, 88, 220, 50);
		hardInfo.getContentPane().add(exitBut);
		
		JLabel BG11 = new JLabel("");
		BG11.setIcon(BG_f);
		BG11.setBounds(-69, 10, 1920, 1316);
		hardInfo.getContentPane().add(BG11);

		
	}
}
