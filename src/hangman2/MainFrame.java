package hangman2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.event.ActionEvent;
import java.util.*;
public class MainFrame {

	private JFrame frame;
    private JButton btnPlay;
    private JButton btnLeaderboard;
    private JButton btnExit;
    private ArrayList<WORD> wordlist;
    private JLabel lblNewLabel;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		wordlist=new ArrayList<WORD>();
		frame = new JFrame();
		frame.setBounds(300, 100, 950, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		File file=new File("WORD_MISSES.csv");
		
		try {
		FileInputStream fis=new FileInputStream(file);
		BufferedReader br=new BufferedReader(new InputStreamReader(fis));
		try {
			String line=br.readLine();
			line=br.readLine();
			while(line!=null)
			{
				
				String info[]=line.split(",");
				
				wordlist.add(new WORD(info[0],Integer.parseInt(info[1])));
				line=br.readLine();
			}
			br.close();
			fis.close();
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		}
		catch(FileNotFoundException fnfe)
		{
			JOptionPane.showMessageDialog(null, "not able to open file");
		}
 
    
        
        btnPlay = new JButton("Play");
        btnPlay.setFont(new Font("squeaky chalk sound", Font.BOLD, 15));
        btnPlay.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		play p=new play();
        		p.setwordlist(wordlist);
        		p.frame.setVisible(true);
        		
        	}
        });
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon(MainFrame.class.getResource("/hangman2/500x500.jpg")));
        lblNewLabel_1.setBounds(10, 49, 499, 508);
        frame.getContentPane().add(lblNewLabel_1);
       
        btnPlay.setBounds(594, 68, 197, 39);
        btnPlay.setForeground(Color.DARK_GRAY);
       
        frame.getContentPane().add(btnPlay);
        
        btnLeaderboard = new JButton("Leaderboard");
        btnLeaderboard.setFont(new Font("squeaky chalk sound", Font.BOLD, 15));
        btnLeaderboard.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		leaderboard lb=new leaderboard();
        		lb.frame.setVisible(true);
        	}
        });
        btnLeaderboard.setBounds(594, 202, 197, 39);
        btnLeaderboard.setForeground(Color.DARK_GRAY);
       // btnLeaderboard.setBackground(SystemColor.textText);
       // btnLeaderboard.setFont(new Font("squeaky chalk sound", Font.BOLD, 18));
        frame.getContentPane().add(btnLeaderboard);
        
        
        btnExit = new JButton("Exit");
        btnExit.setFont(new Font("squeaky chalk sound", Font.BOLD, 15));
        btnExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose();
        	}
        });
        btnExit.setBounds(594, 346, 197, 39);
        btnExit.setForeground(Color.DARK_GRAY);
     
        frame.getContentPane().add(btnExit);
        
        lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(MainFrame.class.getResource("/hangman2/blackboard-569260_960_720.jpg")));
        lblNewLabel.setBounds(0, 0, 947, 583);
        frame.getContentPane().add(lblNewLabel);

	}
}
