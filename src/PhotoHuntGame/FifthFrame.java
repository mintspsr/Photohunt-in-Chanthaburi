package PhotoHuntGame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;

public class FifthFrame {
	
	JFrame EasyMode;
	BufferedImage BG;
	JLabel counterLabel;
	Timer timer;
	int second, minute;
	String  ddSecond, ddMinute;
	int numberclicked = 0;
	int wrongclicked = 0;
	int x = 0;
	

	DecimalFormat dFormat = new DecimalFormat("00");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FifthFrame window = new FifthFrame();
					window.EasyMode.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FifthFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		try 
		{
			BG = ImageIO.read(getClass().getResourceAsStream("/gameImages/Background9.jpg"));
		} 
		catch( IOException e) 
		{

        System.out.println("Image can't read.");

        }
		ImageIcon BG_d = new ImageIcon(BG);
		
		EasyMode = new JFrame();
		EasyMode.setBounds(0, 0, 2000, 2000);
		EasyMode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		EasyMode.getContentPane().setLayout(null);
		EasyMode.setVisible(true);
		
		JButton finishBut = new JButton("FINISH");
		finishBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		finishBut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EazyInfo sfd = new EazyInfo();
				sfd.easyInfo.setVisible(true);
				EasyMode.dispose();
			}
		});
		finishBut.setFont(new Font("Georgia", Font.BOLD, 20));
		finishBut.setBounds(1245, 719, 115, 56);
		finishBut.setVisible(false);
		
		JLabel score1 = new JLabel("");
		score1.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/score.png")));
		score1.setBounds(1177, 624, 58, 58);
		EasyMode.getContentPane().add(score1);
		score1.setEnabled(false);
		
		
		JLabel score2 = new JLabel("");
		score2.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/score.png")));
		score2.setBounds(1236, 624, 58, 58);
		score2.setEnabled(false);
		EasyMode.getContentPane().add(score2);
		
		
		JLabel score3 = new JLabel("");
		score3.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/score.png")));
		score3.setBounds(1294, 624, 58, 58);
		score3.setEnabled(false);
		EasyMode.getContentPane().add(score3);
	
		
		JLabel score4 = new JLabel("");
		score4.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/score.png")));
		score4.setBounds(1351, 624, 58, 58);
		score4.setEnabled(false);
		EasyMode.getContentPane().add(score4);
		
		
		JLabel score5 = new JLabel("");
		score5.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/score.png")));
		score5.setBounds(1411, 624, 58, 58);
		score5.setEnabled(false);
		EasyMode.getContentPane().add(score5);
		
		ArrayList<JLabel> chickscore = new ArrayList<JLabel>();
		chickscore.add(score1);
		chickscore.add(score2);
		chickscore.add(score3);
		chickscore.add(score4);
		chickscore.add(score5);
		
		JPanel gnameBG = new JPanel();
		gnameBG.setBackground(new Color(153, 204, 255));
		gnameBG.setBounds(142, 10, 1250, 100);
		EasyMode.getContentPane().add(gnameBG);
		gnameBG.setLayout(null);
		
		
		
		JLabel gameName1 = new JLabel("PhotoHunt in Chanthaburi Mode : Easy");
		gameName1.setBounds(0, 0, 1250, 98);
		gnameBG.add(gameName1);
		gameName1.setHorizontalAlignment(SwingConstants.CENTER);
		gameName1.setFont(new Font("Georgia", Font.BOLD, 60));
		gameName1.setForeground(new Color(51, 102, 204));
		EasyMode.getContentPane().add(finishBut);
		
		JLabel E_photo1 = new JLabel("");
		E_photo1.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/E_photo1.jpg")));
		E_photo1.setBounds(59, 135, 480, 640);
		EasyMode.getContentPane().add(E_photo1);		
		
		JLabel circle1 = new JLabel("");
		circle1.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/circleV.png")));
		circle1.setBounds(648, 455, 58, 92);
		EasyMode.getContentPane().add(circle1);
		circle1.setVisible(false);
		
		JLabel point1 = new JLabel("");
		point1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				circle1.setVisible(true);
				numberclicked = numberclicked+1;
				if (numberclicked == 5)
				{
					finishBut.setVisible(true);
				}
				x = x + 1;
				if (x == 1) {
					chickscore.get(0).setEnabled(true);
				} 
				else if (x == 2) {
					chickscore.get(1).setEnabled(true);
				}
				else if (x == 3) {
					chickscore.get(2).setEnabled(true);
				}
				else if (x == 4) {
					chickscore.get(3).setEnabled(true);
				}
				else if (x == 5) {
					chickscore.get(4).setEnabled(true);
				}

			}
		});
		point1.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/point1.jpg")));
		point1.setBounds(648, 458, 46, 89);
		EasyMode.getContentPane().add(point1);
		
		JLabel circle2 = new JLabel("");
		circle2.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/circleHs.png")));
		circle2.setBounds(891, 377, 46, 29);
		EasyMode.getContentPane().add(circle2);
		circle2.setVisible(false);
		
		JLabel point2 = new JLabel("");
		point2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				circle2.setVisible(true);
					numberclicked = numberclicked+1;
				if (numberclicked == 5)
				{
						finishBut.setVisible(true);
				}
				x = x + 1;
				if (x == 1) {
					chickscore.get(0).setEnabled(true);
				} 
				else if (x == 2) {
					chickscore.get(1).setEnabled(true);
				}
				else if (x == 3) {
					chickscore.get(2).setEnabled(true);
				}
				else if (x == 4) {
					chickscore.get(3).setEnabled(true);
				}
				else if (x == 5) {
					chickscore.get(4).setEnabled(true);
			}
			}
		});
		point2.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/point2.jpg")));
		point2.setBounds(903, 377, 25, 30);
		EasyMode.getContentPane().add(point2);
		
		JLabel circle3 = new JLabel("");
		circle3.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/circleH.png")));
		circle3.setBounds(625, 230, 92, 58);
		EasyMode.getContentPane().add(circle3);
		circle3.setVisible(false);
		
		JLabel point3 = new JLabel("");
		point3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				circle3.setVisible(true);
				numberclicked = numberclicked+1;
				if (numberclicked == 5)
				{
					finishBut.setVisible(true);
				}
			
				x = x + 1;
				if (x == 1) {
					chickscore.get(0).setEnabled(true);
				} 
				else if (x == 2) {
					chickscore.get(1).setEnabled(true);
				}
				else if (x == 3) {
					chickscore.get(2).setEnabled(true);
				}
				else if (x == 4) {
					chickscore.get(3).setEnabled(true);
				}
				else if (x == 5) {
					chickscore.get(4).setEnabled(true);
				}
			}	
			
		});
		point3.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/point3.jpg")));
		point3.setBounds(657, 244, 25, 30);
		EasyMode.getContentPane().add(point3);
		
		JLabel circle4 = new JLabel("");
		circle4.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/circleHs.png")));
		circle4.setBounds(850, 171, 46, 29);
		EasyMode.getContentPane().add(circle4);
		circle4.setVisible(false);

		JLabel point4 = new JLabel("");
		point4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				circle4.setVisible(true);
				numberclicked = numberclicked+1;
				if (numberclicked == 5)
				{
					finishBut.setVisible(true);
				}
			
				x = x + 1;
				if (x == 1) {
					chickscore.get(0).setEnabled(true);
				} 
				else if (x == 2) {
					chickscore.get(1).setEnabled(true);
				}
				else if (x == 3) {
					chickscore.get(2).setEnabled(true);
				}
				else if (x == 4) {
					chickscore.get(3).setEnabled(true);
				}
				else if (x == 5) {
					chickscore.get(4).setEnabled(true);
				}
			}
		});
		point4.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/point4.jpg")));
		point4.setBounds(854, 178, 36, 20);
		EasyMode.getContentPane().add(point4);
		
		JLabel circle5 = new JLabel("");
		circle5.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/circleHs.png")));
		circle5.setBounds(740, 746, 46, 29);
		EasyMode.getContentPane().add(circle5);
		circle5.setVisible(false);
		
		JLabel point5 = new JLabel("");
		point5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				circle5.setVisible(true);
				numberclicked = numberclicked+1;
				if (numberclicked == 5)
				{
					finishBut.setVisible(true);
				}
				x = x + 1;
				if (x == 1) {
					chickscore.get(0).setEnabled(true);
				} 
				else if (x == 2) {
					chickscore.get(1).setEnabled(true);
				}
				else if (x == 3) {
					chickscore.get(2).setEnabled(true);
				}
				else if (x == 4) {
					chickscore.get(3).setEnabled(true);
				}
				else if (x == 5) {
					chickscore.get(4).setEnabled(true);
				}
			}
		});
		point5.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/point5.jpg")));
		point5.setBounds(743, 746, 36, 29);
		EasyMode.getContentPane().add(point5);
		
		
		JLabel wrongClick = new JLabel("");
		wrongClick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					JOptionPane.showMessageDialog(null,"Wrong place.");
				
			}
		});
		wrongClick.setBounds(611, 135, 480, 640);
		EasyMode.getContentPane().add(wrongClick);
		
		JLabel E_photo2 = new JLabel("");
		E_photo2.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/E_photo2.jpg")));
		E_photo2.setBounds(611, 135, 480, 640);
		EasyMode.getContentPane().add(E_photo2);
		
		
		JLabel howToPlay = new JLabel("");
		howToPlay.setIcon(new ImageIcon(FifthFrame.class.getResource("/gameImages/how to play.png")));
		howToPlay.setHorizontalAlignment(SwingConstants.CENTER);
		howToPlay.setForeground(Color.BLACK);
		howToPlay.setFont(new Font("Georgia", Font.BOLD, 30));
		howToPlay.setBackground(Color.YELLOW);
		howToPlay.setBounds(1158, 221, 330, 343);
		EasyMode.getContentPane().add(howToPlay);
		
		JPanel scoreBG = new JPanel();
		scoreBG.setBackground(new Color(255, 255, 153));
		scoreBG.setBounds(1157, 586, 331, 108);
		EasyMode.getContentPane().add(scoreBG);
		scoreBG.setLayout(null);
		
		JLabel scoreTx = new JLabel("SCORE :");
		scoreTx.setForeground(new Color(255, 102, 51));
		scoreTx.setFont(new Font("Georgia", Font.BOLD, 20));
		scoreTx.setBounds(10, 5, 98, 37);
		scoreBG.add(scoreTx);
		
		JPanel Timepanel = new JPanel();
		Timepanel.setBackground(new Color(255, 153, 204));
		Timepanel.setBounds(1270, 135, 217, 65);
		EasyMode.getContentPane().add(Timepanel);
		Timepanel.setLayout(null);
		
		JLabel Timetxt = new JLabel("Time:");
		Timetxt.setFont(new Font("Georgia", Font.BOLD, 30));
		Timetxt.setBounds(10, 17, 91, 35);
		Timepanel.add(Timetxt);
		
		JPanel timeBG = new JPanel();
		timeBG.setBounds(104, 8, 102, 49);
		Timepanel.add(timeBG);
		timeBG.setBackground(Color.WHITE);
		
		counterLabel = new JLabel("");
		timeBG.add(counterLabel);
		counterLabel.setHorizontalAlignment(SwingConstants.CENTER);
		counterLabel.setFont(new Font("Georgia", Font.BOLD, 30));
		
		//
		
		counterLabel.setText("00:30");
		
		JButton exitBut = new JButton("EXIT");
		exitBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exit ext = new Exit();
				ext.exitFrame.setVisible(true);
				EasyMode.dispose();
			}
		});

		exitBut.setForeground(UIManager.getColor("Button.foreground"));
		exitBut.setBackground(UIManager.getColor("Button.background"));
		exitBut.setFont(new Font("Georgia", Font.BOLD, 20));
		exitBut.setBounds(1370, 719, 115, 56);
		EasyMode.getContentPane().add(exitBut);
		
		JLabel BG12 = new JLabel("");
		BG12.setIcon(BG_d);
		BG12.setBounds(-1260, 0, 2800, 2000);
		EasyMode.getContentPane().add(BG12);
		

		
		second = 30;
		minute = 0;
		sptimer();
		timer.start();
		
	}
	
	public void sptimer() {
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
				
				if (numberclicked == 5)
				{
					timer.stop();
					counterLabel.setText(ddMinute + ":" + ddSecond);
				}
				

				if(minute == 0 && second == 0) {
					
					//timer.stop();
					SixFrame sfd = new SixFrame();
					sfd.sixframe.setVisible(true);
					EasyMode.dispose();
					
				
				}
				
			}
		});

	}
}
