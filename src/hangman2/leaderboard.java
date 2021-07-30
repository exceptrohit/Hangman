package hangman2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.io.*
;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;public class leaderboard {

	public JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					leaderboard window = new leaderboard();
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
	public leaderboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int i=0;
		String content[][]=new String[100][2];
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
					content[i][0]=info[0];
					content[i][1]=info[1];
					line=br.readLine();
					i++;
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
		
		String header[]= {"NAME","SCORE"},content2[][]=new String[i][2];
		for(int j=0;j<i;j++)
		{
			content2[j][0]=content[j][0];
			content2[j][1]=content[j][1];
		}
		for(int k=0;k<i-1;k++)
		{
			for(int l=k+1;l<i;l++)
			{
				if(Integer.parseInt(content2[k][1])<Integer.parseInt(content2[l][1]))
				{
					String temp1=content2[k][1];
					String temp2=content2[k][0];
					content2[k][1]=content2[l][1];
					content2[k][0]=content2[l][0];
					content2[l][0]=temp2;
					content2[l][1]=temp1;
					
				}
			}
		}
		frame = new JFrame();
		frame.setBounds(300, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLeaderBoard = new JLabel("LEADER BOARD");
		lblLeaderBoard.setBounds(228, 11, 135, 34);
		frame.getContentPane().add(lblLeaderBoard);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 74, 495, 247);
		frame.getContentPane().add(scrollPane);
		
		
		
		table = new JTable(content2,header);
		scrollPane.setViewportView(table);
		
		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.dispose();
			}
		});
		btnExit.setBounds(245, 332, 89, 23);
		frame.getContentPane().add(btnExit);
	}

}
