package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import Controller.Controller;
import Model.Category;
import Model.JuniorPlayer;
import Model.Member;
import Model.Player;
import Model.Skill;
import Model.Squad;

/**
 * @author Edward Morris
 * @version 1.0.0 May 11 2018
 */
// Class opens a screen that allows the user to edit the current players skills
public class EditSkillsScreen 
{
	Squad squad = Controller.getSquadClass();
	Category category = Controller.getCategory();
	private Controller theController;
	
	// List of Swing asset declerations
	private JFrame frame = new JFrame("Simply Rugby - Edit Player Skills");
	private JPanel addPlayer;
	private JPanel panelUsers;
	private JPanel panelLoans;
	private JButton btnBack;
	private JLabel lblFines;
	private JTextPane txtPDisplayLoans;
	private JComboBox comboBoxLoans;
	private JComboBox comboBoxUsers;
	private JTextField textField;
	private JTextField txtStandard;
	private JTextField txtSpin;
	private JTextField txtPop;
	private JTextField txtFront;
	private JTextField txtRear;
	private JTextField txtSide;
	private JTextField txtScrabble;
	private JTextField txtDrop;
	private JTextField txtGrubber;
	private JTextField txtGoal;
	private JTextField txtPass;
	private JOptionPane saved;
	private JTextField txtTackling;
	private JTextField txtKicking;
	private JLabel lblStandard;
	private JLabel lblSpin;
	private JLabel lblPop;
	private JLabel lblFront;
	private JLabel lblRear;
	private JLabel lblSide;
	private JLabel lblScrabble;
	private JLabel lblDrop;
	private JLabel lblGrubber;
	private JLabel lblGoal;
	private JLabel lblPass;
	private JLabel lblPunt;
	private JLabel lblRating;
	private JLabel lblComments;
	private JTextField txtPunt;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JButton btnAddPlayerSkills;
	private JButton btnQuit;
	
	/**
	 * 
	 * @param c - Reference to controller 
	 */
	public void setController(Controller c)
	{
		theController = c;
	}
	
	/**
	 * 
	 * @param c - Reference to controller 
	 */
	public EditSkillsScreen(Controller c)
	{
		theController = c;
		
		// Setup the screen 
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 650, 500);
		frame.setVisible(true);
		addPlayer = new JPanel();
		frame.setContentPane(addPlayer);
		addPlayer.setLayout(null);
		frame.setVisible(true);
		
		// Call method which contains swing assets used on the page
		pageAssets();
		
		// Sets up the look and feel of the screen
		try
	    {
	        //Set the required look and feel
	        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	        //Update the component tree - associate the look and feel with the given frame.
	        SwingUtilities.updateComponentTreeUI(frame);
	    }
	    catch(Exception ex)
	    {
	        ex.printStackTrace();
	    }
		
		// Button which takes the string values from each text field, and converts the input to integer
		// if required. An Iterator is used to traverse the current players SKill object, and replaces the values 
		// held in the object with the one value taken from the user. A trim function is used to trim user input to ensure
		// the string values do not contain any spaces. A try catch is also in place to ensure all fields are filled
		btnAddPlayerSkills = new JButton("Save");
		btnAddPlayerSkills.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String tempStandardRating = txtStandard.getText().trim();
					int standardRating = Integer.parseInt(tempStandardRating);
			
					String tempSpinRating = txtSpin.getText().trim();
					int spinRating = Integer.parseInt(tempSpinRating);						
					
					String tempPopRating = txtPop.getText().trim();
					int popRating = Integer.parseInt(tempPopRating);
				
					String tempFrontRating = txtFront.getText().trim();
					int frontRating = Integer.parseInt(tempFrontRating);
					
					String tempRearRating = txtRear.getText().trim();
					int rearRating = Integer.parseInt(tempRearRating);
				
					String tempSideRating = txtSide.getText().trim();
					int sideRating = Integer.parseInt(tempSideRating);
					
					String tempScrabbleRating = txtScrabble.getText().trim();
					int scrabbleRating = Integer.parseInt(tempScrabbleRating);
					
					String tempDropRating = txtDrop.getText().trim();
					int dropRating = Integer.parseInt(tempDropRating);
					
					String tempPuntRating = txtPunt.getText().trim();
					int puntRating = Integer.parseInt(tempPuntRating);
					
					String tempGrubberRating = txtGrubber.getText().trim();
					int grubberRating = Integer.parseInt(tempGrubberRating);
					
					String tempGoalRating = txtGoal.getText().trim();
					int goalRating = Integer.parseInt(tempGoalRating);
					
					String tempPassComments = txtPass.getText().trim();			
					String tempTacklingComments = txtTackling.getText().trim();				
					String tempKickingComments = txtKicking.getText().trim();
					
					// Iterator traverses Skill objects and matches the current player ID with the ID stored 
					// stored with the skill object
					Iterator<Skill> iterate = category.getSkills().iterator();
					while(iterate.hasNext())
					{
						Skill s = iterate.next();
						
						if(theController.currentPlayerSRU == s.getPlayersID())
						{
							if(txtStandard != null)
							{
								Skill tempRef = (Skill) s;
								tempRef.setStandardSkillRating(standardRating);
							}
							
							if(txtSpin != null)
							{
								Skill tempRef = (Skill) s;
								tempRef.setSpinSkillRating(spinRating);
							}
							
							if(txtPop != null)
							{
								Skill tempRef = (Skill) s;
								tempRef.setPopSkillRating(popRating);
							}
							
							if(txtFront != null)
							{
								Skill tempRef = (Skill) s;
								tempRef.setFrontSkillRating(frontRating);
							}
							
							if(txtRear != null)
							{
								Skill tempRef = (Skill) s;
								tempRef.setRearSkillRating(rearRating);
							}
							
							if(txtSide != null)
							{
								Skill tempRef = (Skill) s;
								tempRef.setSideSkillRating(sideRating);
							}
							
							if(txtScrabble != null)
							{
								Skill tempRef = (Skill) s;
								tempRef.setScrabbleSkillRating(scrabbleRating);
							}
							
							if(txtDrop != null)
							{
								Skill tempRef = (Skill) s;
								tempRef.setDropSkillRating(dropRating);
							}
							
							if(txtPunt != null)
							{
								Skill tempRef = (Skill) s;
								tempRef.setPuntSkillRating(puntRating);
							}
							
							if(txtGrubber != null)
							{
								Skill tempRef = (Skill) s;
								tempRef.setGrubberSkillRating(grubberRating);
							}
							
							if(txtGoal != null)
							{
								Skill tempRef = (Skill) s;
								tempRef.setGoalSkillRating(goalRating);
							}
							
							if(txtPass != null)
							{
								Skill tempRef = (Skill) s;
								tempRef.setPassComments(tempPassComments);
							}
							
							if(txtTackling != null)
							{
								Skill tempRef = (Skill) s;
								tempRef.setTacklingComments(tempTacklingComments);
							}
							
							if(txtKicking != null)
							{
								Skill tempRef = (Skill) s;
								tempRef.setKickingComments(tempKickingComments);
							}
							
							saved.showMessageDialog(frame, "Player Details Have Been Saved");	
							
							PlayerScreen playersc = new PlayerScreen(c);
							
							playersc.setVisible(true);
							
							frame.dispose();
						}
					}
					
					}
					
					catch(NumberFormatException a)
					{
						saved.showMessageDialog(frame, "Please Complete All Fields");
					}
			}
		});
		btnAddPlayerSkills.setBounds(234, 390, 154, 23);
		addPlayer.add(btnAddPlayerSkills);
		
		// Button is used to exit the system when pushed
		btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnQuit.setBounds(329, 437, 119, 23);
		addPlayer.add(btnQuit);
		
		// Button is used to return to the home screen
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				PlayerScreen playersc = new PlayerScreen(theController);	
				playersc.setVisible(true);
				frame.dispose();
			}
		});
		btnBack.setBounds(200, 437, 119, 23);
		addPlayer.add(btnBack);
	}
	
	
	/**
	 *  Method holding swing assets, to be called in constructor
	 */
	// The following is a series of Swing assets, such as labels and Text Fields
	public void pageAssets()
	{
		separator_2 = new JSeparator();
		separator_2.setBounds(74, 424, 502, 2);
		addPlayer.add(separator_2);
		
		txtPass = new JTextField();
		txtPass.setBounds(327, 25, 277, 91);
		addPlayer.add(txtPass);
		txtPass.setColumns(10);
		
		lblComments = new JLabel("Comments");
		lblComments.setBounds(439, -12, 73, 51);
		addPlayer.add(lblComments);
		
		
		txtRear = new JTextField();
		txtRear.setBounds(151, 158, 131, 23);
		addPlayer.add(txtRear);
		txtRear.setColumns(10);
		
		lblRear = new JLabel("Rear");
		lblRear.setBounds(74, 158, 62, 14);
		addPlayer.add(lblRear);
		
		lblStandard = new JLabel("Standard");
		lblStandard.setBounds(74, 24, 62, 14);
		addPlayer.add(lblStandard);
		
		txtStandard = new JTextField();
		txtStandard.setBounds(152, 24, 130, 23);
		addPlayer.add(txtStandard);
		txtStandard.setColumns(10);
		
		txtSpin = new JTextField();
		txtSpin.setBounds(151, 55, 131, 23);
		addPlayer.add(txtSpin);
		txtSpin.setColumns(10);
		
		 lblSpin = new JLabel("Spin");
		lblSpin.setBounds(74, 58, 62, 14);
		addPlayer.add(lblSpin);
		
		 lblPop = new JLabel("Pop");
		lblPop.setBounds(74, 83, 62, 14);
		addPlayer.add(lblPop);
		
		txtPop = new JTextField();
		txtPop.setBounds(152, 86, 131, 23);
		addPlayer.add(txtPop);
		txtPop.setColumns(10);
		
		 lblFront = new JLabel("Front");
		lblFront.setBounds(74, 130, 62, 14);
		addPlayer.add(lblFront);
		
		txtFront = new JTextField();
		txtFront.setBounds(152, 127, 131, 23);
		addPlayer.add(txtFront);
		txtFront.setColumns(10);
		
		 lblSide = new JLabel("Side");
		lblSide.setBounds(74, 191, 62, 14);
		addPlayer.add(lblSide);
		
		txtSide = new JTextField();
		txtSide.setBounds(151, 188, 131, 23);
		addPlayer.add(txtSide);
		txtSide.setColumns(10);
		
		 lblScrabble = new JLabel("Scrabble");
		lblScrabble.setBounds(74, 219, 62, 14);
		addPlayer.add(lblScrabble);
		
		txtScrabble = new JTextField();
		txtScrabble.setBounds(151, 216, 131, 23);
		addPlayer.add(txtScrabble);
		txtScrabble.setColumns(10);
		
		 lblDrop = new JLabel("Drop");
		lblDrop.setBounds(74, 266, 62, 14);
		addPlayer.add(lblDrop);
		
		txtDrop = new JTextField();
		txtDrop.setBounds(151, 263, 131, 23);
		addPlayer.add(txtDrop);
		txtDrop.setColumns(10);
		
		 lblGrubber = new JLabel("Grubber");
		lblGrubber.setBounds(74, 322, 62, 14);
		addPlayer.add(lblGrubber);
		
		txtGrubber = new JTextField();
		txtGrubber.setBounds(151, 319, 131, 23);
		addPlayer.add(txtGrubber);
		txtGrubber.setColumns(10);
		
		 lblGoal = new JLabel("Goal");
		lblGoal.setBounds(74, 353, 62, 14);
		addPlayer.add(lblGoal);
		
		txtGoal = new JTextField();
		txtGoal.setBounds(151, 350, 131, 23);
		addPlayer.add(txtGoal);
		txtGoal.setColumns(10);
		
		separator = new JSeparator();
		separator.setBounds(38, 117, 270, 2);
		addPlayer.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(38, 253, 270, 2);
		addPlayer.add(separator_1);
		
		txtTackling = new JTextField();
		txtTackling.setColumns(10);
		txtTackling.setBounds(327, 139, 277, 91);
		addPlayer.add(txtTackling);
		
		txtKicking = new JTextField();
		txtKicking.setColumns(10);
		txtKicking.setBounds(326, 267, 277, 91);
		addPlayer.add(txtKicking);
		
		lblRating = new JLabel("Rating(1 to 5)");
		lblRating.setBounds(176, 8, 106, 11);
		addPlayer.add(lblRating);
		
		lblPunt = new JLabel("Punt");
		lblPunt.setBounds(74, 294, 62, 14);
		addPlayer.add(lblPunt);
		
		txtPunt = new JTextField();
		txtPunt.setColumns(10);
		txtPunt.setBounds(151, 291, 131, 23);
		addPlayer.add(txtPunt);

	}
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	
}
