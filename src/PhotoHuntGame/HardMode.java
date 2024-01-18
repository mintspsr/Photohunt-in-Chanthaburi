package PhotoHuntGame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class HardMode {

	JFrame HardMode;
	JLabel counterLabel;
	Timer timer;
	int second, minute;
	String  ddSecond, ddMinute;
	int numberclicked = 0;
	int wrongclicked = 0;
	int y = 0;
	BufferedImage BG;
	DecimalFormat dFormat = new DecimalFormat("00");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HardMode window = new HardMode();
					window.HardMode.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HardMode() {
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
		ImageIcon BG_g = new ImageIcon(BG);
		
		HardMode = new JFrame();
		HardMode.setBounds(0, 0, 2000, 2000);
		HardMode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HardMode.getContentPane().setLayout(null);
		
		JButton finishButt = new JButton("FINISH");
		finishButt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HardInfo sfd = new HardInfo();
				sfd.hardInfo.setVisible(true);
				HardMode.dispose();
			}
		});
		finishButt.setFont(new Font("Georgia", Font.BOLD, 20));
		finishButt.setBounds(1249, 719, 115, 56);
		finishButt.setVisible(false);
		
		JLabel score6 = new JLabel("");
		score6.setBounds(1157, 625, 58, 58);
		score6.setEnabled(false);
		HardMode.getContentPane().add(score6);
		score6.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/score.png")));
		
		JLabel score7 = new JLabel("");
		score7.setBounds(1209, 625, 58, 58);
		score7.setEnabled(false);
		HardMode.getContentPane().add(score7);
		score7.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/score.png")));
		
		JLabel score8 = new JLabel("");
		score8.setBounds(1262, 625, 58, 58);
		score8.setEnabled(false);
		HardMode.getContentPane().add(score8);
		score8.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/score.png")));
		
		JLabel score9 = new JLabel("");
		score9.setBounds(1316, 625, 58, 58);
		score9.setEnabled(false);
		HardMode.getContentPane().add(score9);
		score9.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/score.png")));
		
		JLabel score10 = new JLabel("");
		score10.setBounds(1370, 625, 58, 58);
		score10.setEnabled(false);
		HardMode.getContentPane().add(score10);
		score10.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/score.png")));
		
		JLabel score11 = new JLabel("");
		score11.setBounds(1425, 625, 58, 58);
		score11.setEnabled(false);
		HardMode.getContentPane().add(score11);
		score11.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/score.png")));
		HardMode.getContentPane().add(finishButt);
		
		ArrayList<JLabel> chickscore = new ArrayList<JLabel>();
		chickscore.add(score6);
		chickscore.add(score7);
		chickscore.add(score8);
		chickscore.add(score9);
		chickscore.add(score10);
		chickscore.add(score11);
		
		JPanel gnameBG = new JPanel();
		gnameBG.setBackground(new Color(255, 204, 204));
		gnameBG.setBounds(142, 10, 1250, 100);
		HardMode.getContentPane().add(gnameBG);
		gnameBG.setLayout(null);
		
		JLabel gameName2 = new JLabel("PhotoHunt in Chanthaburi Mode : Hard");
		gameName2.setBounds(0, 0, 1250, 100);
		gnameBG.add(gameName2);
		gameName2.setHorizontalAlignment(SwingConstants.CENTER);
		gameName2.setFont(new Font("Georgia", Font.BOLD, 60));
		gameName2.setForeground(new Color(255, 0, 153));
		
		JLabel circle6 = new JLabel("");
		circle6.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/circleH.png")));
		circle6.setBounds(783, 576, 92, 58);
		circle6.setVisible(false);
		HardMode.getContentPane().add(circle6);
		
		JLabel point6 = new JLabel("");
		point6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				circle6.setVisible(true);
				numberclicked = numberclicked+1;
				if (numberclicked == 6)
				{
						finishButt.setVisible(true);
				}
				y = y + 1;
				if (y == 1) {
					chickscore.get(0).setEnabled(true);
				} 
				else if (y == 2) {
					chickscore.get(1).setEnabled(true);
				}
				else if (y == 3) {
					chickscore.get(2).setEnabled(true);
				}
				else if (y == 4) {
					chickscore.get(3).setEnabled(true);
				}
				else if (y == 5) {
					chickscore.get(4).setEnabled(true);
				}
				else if (y == 6) {
					chickscore.get(5).setEnabled(true);
				}
			}
		});
		point6.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/point6.jpg")));
		point6.setBounds(815, 578, 36, 36);
		HardMode.getContentPane().add(point6);
		
		JLabel circle7 = new JLabel("");
		circle7.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/circleH.png")));
		circle7.setBounds(944, 661, 92, 58);
		circle7.setVisible(false);
		HardMode.getContentPane().add(circle7);
		
		JLabel point7 = new JLabel("");
		point7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				circle7.setVisible(true);
				numberclicked = numberclicked+1;
				if (numberclicked == 6)
				{
					finishButt.setVisible(true);
				}
				y = y + 1;
				if (y == 1) {
					chickscore.get(0).setEnabled(true);
				} 
				else if (y == 2) {
					chickscore.get(1).setEnabled(true);
				}
				else if (y == 3) {
					chickscore.get(2).setEnabled(true);
				}
				else if (y == 4) {
					chickscore.get(3).setEnabled(true);
				}
				else if (y == 5) {
					chickscore.get(4).setEnabled(true);
				}
				else if (y == 6) {
					chickscore.get(5).setEnabled(true);
				}
			}
		});
		point7.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/point7.jpg")));
		point7.setBounds(967, 671, 42, 36);
		HardMode.getContentPane().add(point7);
		
		JLabel circle8 = new JLabel("");
		circle8.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/circleHs.png")));
		circle8.setBounds(790, 437, 46, 29);
		circle8.setVisible(false);
		HardMode.getContentPane().add(circle8);
		
		JLabel point8 = new JLabel("");
		point8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				circle8.setVisible(true);
				numberclicked = numberclicked+1;
				if (numberclicked == 6)
				{
					finishButt.setVisible(true);
				}
				y = y + 1;
				if (y == 1) {
					chickscore.get(0).setEnabled(true);
				} 
				else if (y == 2) {
					chickscore.get(1).setEnabled(true);
				}
				else if (y == 3) {
					chickscore.get(2).setEnabled(true);
				}
				else if (y == 4) {
					chickscore.get(3).setEnabled(true);
				}
				else if (y == 5) {
					chickscore.get(4).setEnabled(true);
				}
				else if (y == 6) {
					chickscore.get(5).setEnabled(true);
				}
			}
		});
		point8.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/point8.jpg")));
		point8.setBounds(794, 437, 42, 36);
		HardMode.getContentPane().add(point8);
		
		JLabel circle9 = new JLabel("");
		circle9.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/circleH.png")));
		circle9.setBounds(783, 235, 92, 58);
		circle9.setVisible(false);
		HardMode.getContentPane().add(circle9);
		
		JLabel point9 = new JLabel("");
		point9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				circle9.setVisible(true);
				numberclicked = numberclicked+1;
				if (numberclicked == 6)
				{
					finishButt.setVisible(true);
				}
				y = y + 1;
				if (y == 1) {
					chickscore.get(0).setEnabled(true);
				} 
				else if (y == 2) {
					chickscore.get(1).setEnabled(true);
				}
				else if (y == 3) {
					chickscore.get(2).setEnabled(true);
				}
				else if (y == 4) {
					chickscore.get(3).setEnabled(true);
				}
				else if (y == 5) {
					chickscore.get(4).setEnabled(true);
				}
				else if (y == 6) {
					chickscore.get(5).setEnabled(true);
				}
			}
		});
		point9.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/point9.jpg")));
		point9.setBounds(809, 241, 42, 36);
		HardMode.getContentPane().add(point9);
		
		JLabel circle10 = new JLabel("");
		circle10.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/circleV.png")));
		circle10.setBounds(909, 185, 58, 92);
		circle10.setVisible(false);
		HardMode.getContentPane().add(circle10);
		
		JLabel point10 = new JLabel("");
		point10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				circle10.setVisible(true);
				numberclicked = numberclicked+1;
				if (numberclicked == 6)
				{
					finishButt.setVisible(true);
				}
				y = y + 1;
				if (y == 1) {
					chickscore.get(0).setEnabled(true);
				} 
				else if (y == 2) {
					chickscore.get(1).setEnabled(true);
				}
				else if (y == 3) {
					chickscore.get(2).setEnabled(true);
				}
				else if (y == 4) {
					chickscore.get(3).setEnabled(true);
				}
				else if (y == 5) {
					chickscore.get(4).setEnabled(true);
				}
				else if (y == 6) {
					chickscore.get(5).setEnabled(true);
				}
			}
		});
		point10.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/point10.jpg")));
		point10.setBounds(909, 196, 45, 53);
		HardMode.getContentPane().add(point10);
		
		JLabel circle11 = new JLabel("");
		circle11.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/circleHs.png")));
		circle11.setBounds(725, 647, 46, 29);
		circle11.setVisible(false);
		HardMode.getContentPane().add(circle11);
		
		JLabel point11 = new JLabel("");
		point11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				circle11.setVisible(true);
				numberclicked = numberclicked+1;
				if (numberclicked == 6)
				{
					finishButt.setVisible(true);
				}
				y = y + 1;
				if (y == 1) {
					chickscore.get(0).setEnabled(true);
				} 
				else if (y == 2) {
					chickscore.get(1).setEnabled(true);
				}
				else if (y == 3) {
					chickscore.get(2).setEnabled(true);
				}
				else if (y == 4) {
					chickscore.get(3).setEnabled(true);
				}
				else if (y == 5) {
					chickscore.get(4).setEnabled(true);
				}
				else if (y == 6) {
					chickscore.get(5).setEnabled(true);
				}
			}
		});
		point11.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/point11.jpg")));
		point11.setBounds(726, 647, 45, 36);
		HardMode.getContentPane().add(point11);
		
		JLabel H_photo1 = new JLabel("");
		H_photo1.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/H_photo1.jpg")));
		H_photo1.setBounds(59, 135, 480, 640);
		HardMode.getContentPane().add(H_photo1);
		
		JLabel H_photo2 = new JLabel("");
		H_photo2.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/H_photo2.jpg")));
		H_photo2.setBounds(611, 135, 480, 640);
		HardMode.getContentPane().add(H_photo2);
		
		
		JLabel howToPlay2 = new JLabel("");
		howToPlay2.setIcon(new ImageIcon(HardMode.class.getResource("/gameImages/howtoplay_h.png")));
		howToPlay2.setBounds(1157, 210, 330, 343);
		HardMode.getContentPane().add(howToPlay2);
	
		
		JPanel scoreBG = new JPanel();
		scoreBG.setBackground(new Color(204, 204, 255));
		scoreBG.setBounds(1157, 576, 332, 119);
		HardMode.getContentPane().add(scoreBG);
		scoreBG.setLayout(null);
		
		JLabel Scoretxt = new JLabel("SCORE:");
		Scoretxt.setForeground(new Color(153, 51, 153));
		Scoretxt.setFont(new Font("Georgia", Font.BOLD, 20));
		Scoretxt.setBounds(10, 10, 90, 37);
		scoreBG.add(Scoretxt);
		
		JPanel Timepanel = new JPanel();
		Timepanel.setBackground(new Color(255, 204, 204));
		Timepanel.setBounds(1277, 135, 217, 65);
		HardMode.getContentPane().add(Timepanel);
		Timepanel.setLayout(null);
		
		JLabel Timetxt = new JLabel("Time:");
		Timetxt.setFont(new Font("Georgia", Font.BOLD, 30));
		Timetxt.setBounds(10, 17, 91, 35);
		Timepanel.add(Timetxt);
		
		JPanel timeBG = new JPanel();
		timeBG.setBounds(104, 8, 102, 49);
		Timepanel.add(timeBG);
		timeBG.setBackground(Color.WHITE);
		
		JLabel wrongClick = new JLabel("");
		wrongClick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					JOptionPane.showMessageDialog(null,"Wrong place.");
				
			}
		});
		wrongClick.setBounds(611, 135, 480, 640);
		HardMode.getContentPane().add(wrongClick);
		
		counterLabel = new JLabel("");
		timeBG.add(counterLabel);
		counterLabel.setHorizontalAlignment(SwingConstants.CENTER);
		counterLabel.setFont(new Font("Georgia", Font.BOLD, 30));
		counterLabel.setText("00:30");
		
		JButton exitBut = new JButton("EXIT");
		exitBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exit ext = new Exit();
				ext.exitFrame.setVisible(true);
				HardMode.dispose();
			}
		});
		exitBut.setFont(new Font("Georgia", Font.BOLD, 20));
		exitBut.setBounds(1374, 719, 115, 56);
		HardMode.getContentPane().add(exitBut);
		
		JLabel BG11 = new JLabel("");
		BG11.setIcon(BG_g);
		BG11.setBounds(-434, 10, 1920, 1316);
		HardMode.getContentPane().add(BG11);
		
		second = 30;
		minute = 0;
		sptimer();
		timer.start();
		
}

	private void sptimer() {
		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				second--;
				ddSecond = dFormat.format(second);
				ddMinute = dFormat.format(minute);
				counterLabel.setText(ddMinute + ":"+ ddSecond);
				
				if(second == -1) 
				{
					second = 29;
					minute--;
				ddSecond = dFormat.format(second);
				ddMinute = dFormat.format(minute);
				counterLabel.setText(ddMinute + ":" + ddSecond);
				
				}
				
				if(numberclicked == 6)
				{
					timer.stop();
					counterLabel.setText(ddMinute + ":" + ddSecond);
				}
				
				if(minute == 0 && second == 0) {
					
					//timer.stop();
					SixFrame sfd = new SixFrame();
					sfd.sixframe.setVisible(true);
					HardMode.dispose();
					
				
				}
				
			}
		});

	}
}
