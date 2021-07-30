package hangman2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JTextField;



import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class start {

	public JFrame frame;
	private player p;
	private int pindex=0;
	private int chances,nofalphabetsg;
	private static String word;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	private static JTextField textField_10;
	private static JTextField textField_11;
	/**
	 * Launch the application.
	 */
	
	


	/**
	 * Create the application.
	 */
	public start(player p) {
		this.p=p;
		word=p.getLevelwl().get(p.getRound()-1).getWORD_STRING();
		initialize();
		
	}
	public void picupdate()
	{
		pindex++;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		chances=10;
		nofalphabetsg=0;
		
		frame = new JFrame();
		frame.setResizable(false);
		
		
		frame.setBounds(300, 100, 950, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int points=0;
		if(p.getDifficultylevel().compareTo("Hard")==0)
		{
			points=5;
		}
		else
		{
			points=3;
		}
		int score=(p.getRound()-1)*points;
		System.out.println(score);
		frame.getContentPane().setLayout(null);
		 
		 JLabel piclabel = new JLabel("New label");
		 piclabel.setIcon(new ImageIcon(start.class.getResource("/hangman2/rsz_hangmand.jpg")));
		 piclabel.setBounds(10, 0, 160, 137);
		String dir[]= {"/hangman2/rsz_pic1.jpg","/hangman2/rsz_pic2.jpg","/hangman2/rsz_pic3.jpg","/hangman2/rsz_pic4.jpg","/hangman2/rsz_pic5.jpg","/hangman2/rsz_pic6.jpg","/hangman2/rsz_pic7.jpg","/hangman2/rsz_pic8.jpg","/hangman2/rsz_pic9.jpg","/hangman2/rsz_pic10.jpg","/hangman2/rsz_pic10.jpg"};

		 frame.getContentPane().add(piclabel);
		 textField = new JTextField();
		 textField.setEditable(false);
		 textField.setFont(new Font("Tahoma", Font.BOLD, 15));
	        textField.setBounds(86, 164, 38, 19);
	        frame.getContentPane().add(textField);
	        textField.setColumns(10);
	        
	        
	        textField_1 = new JTextField();
	        textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
	        textField_1.setEditable(false);
	        textField_1.setBounds(166, 164, 38, 19);
	        frame.getContentPane().add(textField_1);
	        textField_1.setColumns(10);
	        
	        textField_2 = new JTextField();
	        textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
	        textField_2.setEditable(false);
	        textField_2.setColumns(10);
	        textField_2.setBounds(240, 164, 38, 19);
	        frame.getContentPane().add(textField_2);
	        
	        textField_3 = new JTextField();
	        textField_3.setFont(new Font("Tahoma", Font.BOLD, 15));
	        textField_3.setEditable(false);
	        textField_3.setColumns(10);
	        textField_3.setBounds(304, 164, 38, 19);
	        frame.getContentPane().add(textField_3);
	        
	        textField_4 = new JTextField();
	        textField_4.setFont(new Font("Tahoma", Font.BOLD, 15));
	        textField_4.setEditable(false);
	        textField_4.setColumns(10);
	        textField_4.setBounds(373, 164, 38, 19);
	        frame.getContentPane().add(textField_4);
	        
	        textField_5 = new JTextField();
	        textField_5.setFont(new Font("Tahoma", Font.BOLD, 15));
	        textField_5.setEditable(false);
	        textField_5.setColumns(10);
	        textField_5.setBounds(447, 164, 38, 19);
	        frame.getContentPane().add(textField_5);
	        
	        textField_6 = new JTextField();
	        textField_6.setFont(new Font("Tahoma", Font.BOLD, 15));
	        textField_6.setEditable(false);
	        textField_6.setColumns(10);
	        textField_6.setBounds(520, 164, 38, 19);
	        frame.getContentPane().add(textField_6);
	        
	        textField_7 = new JTextField();
	        textField_7.setFont(new Font("Tahoma", Font.BOLD, 15));
	        textField_7.setEditable(false);
	        textField_7.setColumns(10);
	        textField_7.setBounds(594, 164, 38, 19);
	        frame.getContentPane().add(textField_7);
	        
	        textField_8 = new JTextField();
	        textField_8.setFont(new Font("Tahoma", Font.BOLD, 15));
	        textField_8.setEditable(false);
	        textField_8.setColumns(10);
	        textField_8.setBounds(676, 164, 38, 19);
	        frame.getContentPane().add(textField_8);
	        
	        textField_9 = new JTextField();
	        textField_9.setFont(new Font("Tahoma", Font.BOLD, 15));
	        textField_9.setEditable(false);
	        textField_9.setColumns(10);
	        textField_9.setBounds(750, 164, 38, 19);
	        frame.getContentPane().add(textField_9);
	        
	        textField_10 = new JTextField();
	        textField_10.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
	        textField_10.setEditable(false);
	        textField_10.setColumns(10);
	        textField_10.setBounds(810, 164, 38, 19);
	        frame.getContentPane().add(textField_10);
	        
	        textField_11 = new JTextField();
	        textField_11.setFont(new Font("Tahoma", Font.BOLD, 15));
	        textField_11.setEditable(false);
	        textField_11.setColumns(10);
	        textField_11.setBounds(874, 164, 38, 19);
	        frame.getContentPane().add(textField_11);
	    	 JTextField arrtext[]= {textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6,textField_7,textField_8,textField_9,textField_10,textField_11};

	        for(int i=0;i<arrtext.length;i++)
	        {
	        	arrtext[i].setVisible(false);
	        }
	       // start.textfieldvisible();public   void textfieldvisible()
	    	
	    		for(int i=0;i<word.length();i++)
	    		{
	    			arrtext[i].setVisible(true);
	    		}
	    	System.out.println(word);
		JLabel Chances = new JLabel("New label");
		Chances.setForeground(Color.WHITE);
		Chances.setBounds(818, 44, 46, 14);
		frame.getContentPane().add(Chances);
		Chances.setText(String.valueOf(chances));
		JButton ButtonA = new JButton("");
		ButtonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char C='a';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));
					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonA.setEnabled(false);
			}
		});
		ButtonA.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-a-of-halloween-bones-typography-outline.png")));
		ButtonA.setBounds(86, 225, 38, 38);
		frame.getContentPane().add(ButtonA);
		
		JButton ButtonB = new JButton("");
		ButtonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='b';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					
					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonB.setEnabled(false);
			}
		});
		ButtonB.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-b-of-bones-outlined-typography.png")));
		ButtonB.setBounds(132, 225, 38, 38);
		frame.getContentPane().add(ButtonB);
		
		JButton ButtonC = new JButton("");
		ButtonC.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				char C='c';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonC.setEnabled(false);
			}
		});
		ButtonC.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-c-outline-of-halloween-bone-typography.png")));
		ButtonC.setBounds(180, 225, 38, 38);
		frame.getContentPane().add(ButtonC);
		
		JButton ButtonD = new JButton("");
		ButtonD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				char C='d';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					checkwin();
				}
				ButtonD.setEnabled(false);

			}
		});
		ButtonD.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-d-bones-outlined-halloween-typography.png")));
		ButtonD.setBounds(229, 225, 38, 38);
		frame.getContentPane().add(ButtonD);
		
		JButton ButtonE = new JButton("");
		ButtonE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='e';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonE.setEnabled(false);
			}
		});
		ButtonE.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-e-of-bones-outlined-typography-of-halloween.png")));
		ButtonE.setBounds(277, 225, 38, 38);
		frame.getContentPane().add(ButtonE);
		
		JButton ButtonF = new JButton("");
		ButtonF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='f';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					

					checkwin();
				}
				ButtonF.setEnabled(false);
			}
		});
		ButtonF.setIcon(new ImageIcon(start.class.getResource("/hangman2/halloween-outlined-bones-typography-shape-of-letter-f.png")));
		ButtonF.setBounds(325, 225, 38, 38);
		frame.getContentPane().add(ButtonF);
		
		JButton ButtonG = new JButton("");
		ButtonG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='g';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					

					checkwin();
				}
				ButtonG.setEnabled(false);
			}
		});
		ButtonG.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-g-of-curved-bone-outlined-typography.png")));
		ButtonG.setBounds(373, 225, 38, 38);
		frame.getContentPane().add(ButtonG);
		
		JButton ButtonH = new JButton("");
		ButtonH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='h';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonH.setEnabled(false);
			}
		});
		ButtonH.setIcon(new ImageIcon(start.class.getResource("/hangman2/halloween-bones-typography-outline-of-letter-h.png")));
		ButtonH.setBounds(421, 225, 38, 38);
		frame.getContentPane().add(ButtonH);
		
		JButton ButtonI = new JButton("");
		ButtonI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='i';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonI.setEnabled(false);
			}
		});
		ButtonI.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-i-of-outlined-halloween-bones.png")));
		ButtonI.setBounds(469, 225, 38, 38);
		frame.getContentPane().add(ButtonI);
		
		JButton ButtonJ = new JButton("");
		ButtonJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='j';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonJ.setEnabled(false);
			}
		});
		ButtonJ.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-j-of-bones-typography-outline.png")));
		ButtonJ.setBounds(520, 225, 38, 38);
		frame.getContentPane().add(ButtonJ);
		
		JButton ButtonK = new JButton("");
		ButtonK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='k';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonK.setEnabled(false);
			}
		});
		ButtonK.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-k-of-bones-outlined-halloween-typography.png")));
		ButtonK.setBounds(572, 225, 38, 38);
		frame.getContentPane().add(ButtonK);
		
		JButton ButtonL = new JButton("");
		ButtonL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='l';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonL.setEnabled(false);
			}
		});
		ButtonL.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-l-bones-outline-of-halloween-typography.png")));
		ButtonL.setBounds(620, 225, 38, 38);
		frame.getContentPane().add(ButtonL);
		
		JButton ButtonM = new JButton("");
		ButtonM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='m';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonM.setEnabled(false);
			}
		});
		ButtonM.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-m-of-bones-outline.png")));
		ButtonM.setBounds(132, 274, 38, 38);
		frame.getContentPane().add(ButtonM);
		
		JButton ButtonN = new JButton("");
		ButtonN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='n';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonN.setEnabled(false);
			}
		});
		ButtonN.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-n-of-bones-outlined-typography.png")));
		ButtonN.setBounds(180, 274, 38, 38);
		frame.getContentPane().add(ButtonN);
		
		JButton ButtonO = new JButton("");
		ButtonO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='o';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonO.setEnabled(false);
			}
		});
		ButtonO.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-o-of-bones-outlined-halloween-typography.png")));
		ButtonO.setBounds(229, 274, 38, 38);
		frame.getContentPane().add(ButtonO);
		
		JButton ButtonP = new JButton("");
		ButtonP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='p';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonP.setEnabled(false);
			}
		});
		ButtonP.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-p-of-bones-outlined-halloween-typography.png")));
		ButtonP.setBounds(277, 274, 38, 38);
		frame.getContentPane().add(ButtonP);
		
		JButton ButtonQ = new JButton("");
		ButtonQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='q';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonQ.setEnabled(false);
			}
		});
		ButtonQ.setIcon(new ImageIcon(start.class.getResource("/hangman2/bones-outline-of-letter-q.png")));
		ButtonQ.setBounds(325, 274, 38, 38);
		frame.getContentPane().add(ButtonQ);
		
		JButton ButtonR = new JButton("");
		ButtonR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='r';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonR.setEnabled(false);
			}
		});
		ButtonR.setIcon(new ImageIcon(start.class.getResource("/hangman2/bones-typography-outline-of-letter-r.png")));
		ButtonR.setBounds(373, 274, 38, 38);
		frame.getContentPane().add(ButtonR);
		
		JButton ButtonS = new JButton("");
		ButtonS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='s';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonS.setEnabled(false);
			}
		});
		ButtonS.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-s-of-bones-outlined-typography.png")));
		ButtonS.setBounds(421, 274, 38, 38);
		frame.getContentPane().add(ButtonS);
		
		JButton ButtonT = new JButton("");
		ButtonT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='t';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonT.setEnabled(false);
			}
		});
		ButtonT.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-t-of-bones-outlined-halloween-typography.png")));
		ButtonT.setBounds(469, 274, 38, 38);
		frame.getContentPane().add(ButtonT);
		
		JButton ButtonU = new JButton("");
		ButtonU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='u';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonU.setEnabled(false);
			}
		});
		ButtonU.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-u-of-bones-outlined-typography-for-halloween.png")));
		ButtonU.setBounds(520, 274, 38, 38);
		frame.getContentPane().add(ButtonU);
		
		JButton ButtonV = new JButton("");
		ButtonV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='v';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonV.setEnabled(false);
			}
		});
		ButtonV.setIcon(new ImageIcon(start.class.getResource("/hangman2/two-bones-outline.png")));
		ButtonV.setBounds(572, 274, 38, 38);
		frame.getContentPane().add(ButtonV);
		
		JButton ButtonW = new JButton("");
		ButtonW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='w';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonW.setEnabled(false);
			}
		});
		ButtonW.setIcon(new ImageIcon(start.class.getResource("/hangman2/bones-w-outlined-letter-of-halloween-typography.png")));
		ButtonW.setBounds(277, 323, 38, 38);
		frame.getContentPane().add(ButtonW);
		
		JLabel Score = new JLabel("New label");
		Score.setForeground(Color.WHITE);
		Score.setBounds(818, 13, 46, 14);
		frame.getContentPane().add(Score);
		Score.setText(String.valueOf(score));
	
		

		
		
		JButton ButtonX = new JButton("");
		ButtonX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='x';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonX.setEnabled(false);
			}
		});
		ButtonX.setIcon(new ImageIcon(start.class.getResource("/hangman2/cross-of-crossed-bones-outlined-halloween-typography.png")));
		ButtonX.setBounds(325, 323, 38, 38);
		frame.getContentPane().add(ButtonX);
		
		JButton ButtonY = new JButton("");
		ButtonY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='y';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonY.setEnabled(false);
			}
		});
		ButtonY.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-y-of-bones-outlined-typography-of-halloween.png")));
		ButtonY.setBounds(373, 323, 38, 38);
		frame.getContentPane().add(ButtonY);
		
		JButton ButtonZ = new JButton("");
		ButtonZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char C='z';
				ArrayList<Integer> ial=p.getLevelwl().get(p.getRound()-1).HAS(C);
				if(ial.size()==0)
				{
					//show the life decrement and disable that key (warning that key should not be pressed again)
					chances--;
					piclabel.setIcon(new ImageIcon(start.class.getResource(dir[pindex++])));

					Chances.setText(String.valueOf(chances));

					checklose();
				}
				else
				{
					//fill all accurences of that key
					nofalphabetsg+=ial.size();
					for(int i=0;i<ial.size();i++)
					{
						arrtext[ial.get(i)].setText(Character.toString(C));
					}
					
					checkwin();
				}
				ButtonZ.setEnabled(false);
			}
		});
		ButtonZ.setIcon(new ImageIcon(start.class.getResource("/hangman2/letter-z-of-bones-outline-of-halloween-typography.png")));
		ButtonZ.setBounds(421, 323, 38, 38);
		frame.getContentPane().add(ButtonZ);
		
		JLabel lblScore = new JLabel("Score :");
        lblScore.setForeground(Color.WHITE);
        lblScore.setFont(new Font("Segoe Print", Font.BOLD, 15));
        lblScore.setBounds(703, 11, 97, 14);
        frame.getContentPane().add(lblScore);
        
        JLabel lblChances = new JLabel("Chances :");
        lblChances.setForeground(Color.WHITE);
        lblChances.setFont(new Font("Segoe Print", Font.BOLD, 15));
        lblChances.setBounds(703, 36, 89, 27);
        frame.getContentPane().add(lblChances);
        
        JLabel lblNewLabel_3 = new JLabel("\r\n");
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\gyani\\Desktop\\Icons\\blackboard-569260_960_720.jpg"));
        lblNewLabel_3.setBounds(-39, -167, 950, 49);
        frame.getContentPane().add(lblNewLabel_3);
        
        JButton btnExit = new JButton("exit");
        btnExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose();
        	}
        });
        btnExit.setBounds(354, 531, 89, 23);
        frame.getContentPane().add(btnExit);
        
        JLabel lblNewLabel = new JLabel("New label");
        
        lblNewLabel.setIcon(new ImageIcon(start.class.getResource("/hangman2/blackboard-569260_960_720.jpg")));
        lblNewLabel.setBounds(10, 0, 926, 583);
        frame.getContentPane().add(lblNewLabel);
        
        
       
	}

	public void checkwin()
	{
		if(nofalphabetsg==p.getLevelwl().get(p.getRound()-1).GET_LENGTH())
		{
			JOptionPane.showMessageDialog(null,"YOU WON");
			p.incrementround();
			if(p.getRound()>10)
			{
				int points;
				if(p.getDifficultylevel().compareTo("Easy")==0)
					points=3;
				else
					points=5;
				ArrayList<player2> playerlist=new ArrayList<player2>();
				File file=new File("Leaderboard.txt");
				try {
					FileInputStream fis=new FileInputStream(file);
					BufferedReader br=new BufferedReader(new InputStreamReader(fis));
					try {
						String line=br.readLine();
						line=br.readLine();
						
						
						while(line!=null)
						{
							String info[]=line.split(" ");
							playerlist.add(new player2(info[0],Integer.parseInt(info[1])));
							line=br.readLine();
							
						}
						br.close();
						fis.close();
						
					}catch(IOException ioe)
					{
						JOptionPane.showMessageDialog(null, "error in i/o!");
						return;
					}
					
				}catch(FileNotFoundException fnfe)
				{
					JOptionPane.showMessageDialog(null, "file not found!");
					return;
				}
				playerlist.add(new player2(p.getName(),(p.getRound()-1)*points));
				file=new File("Leaderboard.txt");
				try {
				FileOutputStream fos=new FileOutputStream(file);
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(fos));
				try {
					bw.write("NAME SCORE");
					bw.newLine();
					for(int i=0;i<playerlist.size();i++)
					{
						bw.write(playerlist.get(i).getName()+" "+String.valueOf(playerlist.get(i).getScore()));
						bw.newLine();
					}
					bw.close();
					fos.close();
					
				}
				catch(IOException ioe)
				{
					ioe.printStackTrace();
				}
				}
				catch(FileNotFoundException fnfe)
				{
					fnfe.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Congratulations, YOU EXCEEDED THE WINNING LIMIT, you nailed it");
				frame.dispose();
				
			}
			else
			{
			start st=new start(p);
			
			frame.dispose();
			st.frame.setVisible(true);
			}
		}
	}
	public void checklose()
	{
		if(chances==0)
		{
			JOptionPane.showMessageDialog(null,"You Lose,the correct word was "+word);
			int points;
			if(p.getDifficultylevel().compareTo("Hard")==0)
				points=5;
			else
				points=3;
			ArrayList<player2> playerlist=new ArrayList<player2>();
			File file=new File("Leaderboard.txt");
			try {
				FileInputStream fis=new FileInputStream(file);
				BufferedReader br=new BufferedReader(new InputStreamReader(fis));
				try {
					String line=br.readLine();
					line=br.readLine();
					
					
					while(line!=null)
					{
						String info[]=line.split(" ");
						playerlist.add(new player2(info[0],Integer.parseInt(info[1])));
						line=br.readLine();
						
					}
					br.close();
					fis.close();
					
				}catch(IOException ioe)
				{
					JOptionPane.showMessageDialog(null, "error in i/o!");
					return;
				}
				
			}catch(FileNotFoundException fnfe)
			{
				JOptionPane.showMessageDialog(null, "file not found!");
				return;
			}
			playerlist.add(new player2(p.getName(),(p.getRound()-1)*points));
			file=new File("Leaderboard.txt");
			try {
			FileOutputStream fos=new FileOutputStream(file);
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(fos));
			try {
				bw.write("NAME SCORE");
				bw.newLine();
				for(int i=0;i<playerlist.size();i++)
				{
					bw.write(playerlist.get(i).getName()+" "+String.valueOf(playerlist.get(i).getScore()));
					bw.newLine();
				}
				bw.close();
				fos.close();
				
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
			}
			catch(FileNotFoundException fnfe)
			{
				fnfe.printStackTrace();
			}
			
			frame.dispose();
		}
	}
}
