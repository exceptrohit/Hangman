package hangman2;

import java.awt.EventQueue;

import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import java.util.*;

import java.util.ArrayList;
import java.util.Random;

class WORD_LIST{
    
    public static ArrayList<WORD> GET_WORDS(ArrayList<WORD> WL, String DIFFICULTY_LEVEL){
        if(DIFFICULTY_LEVEL.compareTo("Hard")==0){
        int TOTAL_FREQUENCY_SUM=0, PARTIAL_SUM;
    
        for(WORD W:WL) {
            TOTAL_FREQUENCY_SUM=TOTAL_FREQUENCY_SUM + W.GET_FREQUENCY();
        }
        
                int STEP_SIZE=TOTAL_FREQUENCY_SUM/10;
        
        
        int MAX=TOTAL_FREQUENCY_SUM;
        System.out.println("TOTAL FREQUENCY SUM "+MAX);
        int STARTING_POSITION= (int) (Math.random() * (MAX));
        System.out.println(STARTING_POSITION+" START");
        ArrayList<Integer> LOCATION=new ArrayList<Integer>();
        
        for(int i=0; i<10; i++) {
            LOCATION.add((STARTING_POSITION + i*STEP_SIZE)%TOTAL_FREQUENCY_SUM);
            
        }
        
        ArrayList<WORD> WORD_LIST=new ArrayList<WORD>();
        
        for(Integer i:LOCATION) {
            PARTIAL_SUM=0;
            for(WORD W:WL) {
                PARTIAL_SUM+= W.GET_FREQUENCY();
                if(PARTIAL_SUM >= i) {
                    WORD_LIST.add(W);
                    break;
                }
            }
        }
        
        return WORD_LIST;}
        
        else{
            int TOTAL_FREQUENCY_SUM=0, PARTIAL_SUM;
    
        for(WORD W:WL) {
            TOTAL_FREQUENCY_SUM=TOTAL_FREQUENCY_SUM + (23 - W.GET_FREQUENCY()); //23 is the MAX number of misses
        }
        
                int STEP_SIZE=TOTAL_FREQUENCY_SUM/10;
        
        
        int MAX=TOTAL_FREQUENCY_SUM;
        System.out.println("TOTAL FREQUENCY SUM "+MAX);
        int STARTING_POSITION= (int) (Math.random() * (MAX));
        System.out.println(STARTING_POSITION+" START");
        ArrayList<Integer> LOCATION=new ArrayList<Integer>();
        
        for(int i=0; i<10; i++) {
            LOCATION.add((STARTING_POSITION + i*STEP_SIZE)%TOTAL_FREQUENCY_SUM);
            
        }
        
        ArrayList<WORD> WORD_LIST=new ArrayList<WORD>();
        
        for(Integer i:LOCATION) {
            PARTIAL_SUM=0;
            for(WORD W:WL) {
                PARTIAL_SUM+= (23 - W.GET_FREQUENCY());
                if(PARTIAL_SUM >= i) {
                    WORD_LIST.add(W);
                    break;
                }
            }
        }
        
        return WORD_LIST;}
        
    }
}





public class play {

	public JFrame frame;
	private ArrayList<WORD> wordlist;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					play window = new play();
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
	public play() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 100, 950, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
	
		JTextField userinput = new JTextField();
		userinput.setFont(new Font("squeaky chalk sound", Font.BOLD, 15));
		//	textField.setFont(new Font("squeaky chalk sound", Font.PLAIN, 20));
			userinput.setBounds(430, 136, 319, 40);
			frame.getContentPane().add(userinput);
			userinput.setColumns(10);
			
		
		
	
		
		
		JLabel lblEnterUsername = new JLabel("Enter Username");
		lblEnterUsername.setFont(new Font("squeaky chalk sound", Font.BOLD, 15));
		lblEnterUsername.setForeground(Color.WHITE);
		lblEnterUsername.setBackground(new Color(0, 204, 204));
		//lblEnterUsername.setFont(new Font("squeaky chalk sound", Font.BOLD, 25));
		lblEnterUsername.setBounds(31, 107, 289, 95);
		frame.getContentPane().add(lblEnterUsername);
		
		JLabel lblDifficultyLevel = new JLabel("Difficulty level");
		lblDifficultyLevel.setFont(new Font("squeaky chalk sound", Font.BOLD, 15));
		//lblDifficultyLevel.setFont(new Font("squeaky chalk sound", Font.PLAIN, 25));
		lblDifficultyLevel.setForeground(Color.WHITE);
		lblDifficultyLevel.setBounds(31, 239, 264, 55);
		frame.getContentPane().add(lblDifficultyLevel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("squeaky chalk sound", Font.BOLD, 15));
		//comboBox.setFont(new Font("squeaky chalk sound", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Easy", "Hard"}));
		comboBox.setBounds(430, 239, 319, 57);
		frame.getContentPane().add(comboBox);
		
		JButton btnStart = new JButton("start");
		btnStart.setFont(new Font("squeaky chalk sound", Font.BOLD, 15));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=userinput.getText();
				String dl=(String)comboBox.getSelectedItem();
			
				ArrayList<WORD> levelwl=WORD_LIST.GET_WORDS(wordlist,dl);
				player p=new player(username,dl,1);
			  //  levelwl.get(0).setWORD_STRING("abcd");
				p.setLevelwl(levelwl);
				start st=new start(p);
				
				frame.dispose();
				st.frame.setVisible(true);
				
			}
		});
		btnStart.setBounds(342, 405, 119, 45);
		frame.getContentPane().add(btnStart);
		
		JButton btnExit = new JButton("exit");
		btnExit.setFont(new Font("squeaky chalk sound", Font.BOLD, 15));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setBounds(353, 518, 99, 40);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(play.class.getResource("/hangman2/blackboard-569260_960_720.jpg")));
		lblNewLabel.setBounds(10, 10, 926, 573);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
	}
	public void setwordlist(ArrayList<WORD> wordlist)
	{
		this.wordlist=wordlist;
	}
}
