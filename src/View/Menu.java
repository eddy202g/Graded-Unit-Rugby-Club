package View;

import javax.swing.JButton;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import Controller.Controller;
import Model.Member;
import Model.Skill;
import Model.Squad;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

/**
 * @author Edward Morris
 * @version 1.0.0 May 11 2018
 */
//Class opens a screen that allows the user to search for a user or a squad
public class Menu 
{

	private Controller theController; // reference to the controller
	Squad squad = Controller.getSquadClass(); // reference to squad via the controller
	ArrayList<Member> newMember = squad.getMembers(); // Access Member objects
	
	// List of Swing asset declerations
	private JFrame frame = new JFrame("Simply Rugby - Menu");
	private JPanel Menu;
	private JPanel findSRU_1;
	private JPanel findSquad;
	private JPanel pnlFindName;
	private JButton btnExit;
	private JButton btnPlayerButton; 
	private JButton btnAddPlayer;
	private JButton btnFindSquad;
	private JButton btnPlayerName;
	private JLabel lblFines;
	private JLabel lblSRU;
	private JLabel lblEnterSquadId;
	private JTextField txtInputSRU;
	private JOptionPane saved;
	private JTextField txtFindSquad;
	private JTextField txtInputName;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JLabel lblPlayerName;
	private URL url = getClass().getResource("/resources/Images/SimplyRugby2.png");
	
	private ImageIcon sRugby;
	
	
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
	public Menu(Controller c)
	{
		theController = c;
		
		ArrayList<Squad> newSquad = theController.getSquads();
		
		// Setup the screen 
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 540, 475);
		Menu = new JPanel();
		Menu.setToolTipText("Senior SRUs: 1001 - 1018     Junior SRUs: 1019 - 1036    Junior Squad ID: 1     Senior Squad ID: 2");
		frame.setContentPane(Menu);
		frame.setResizable(true);
		Menu.setLayout(null);
		
		
		
		// Call method which contains swing assets used on the page
		pageAssets();
		
		// Sets up the look and feel of the screen
		try
	    {
	        //Set the required look and feel
	        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	        //Update the component tree - associate the look and feel with the given frame.
	        SwingUtilities.updateComponentTreeUI(frame);
	    }//end try
	    catch(Exception ex)
	    {
	        ex.printStackTrace();
	    }//end catch
		
		// Button that finds a player based on their SRU unique identifier. It takes string input from
		// the user, and parses the string to an integer. An iterator is then used to traverse the Member objects
		// and compares the user input with the SRU no's held in the member objects. If a match is found, the PlayerScreen
		// is opened, menu screen is closed, and the user input is set as the current players ID, and passed to the PlayerScreen.
		// A trim function is used to trim user input to ensure the string value does not contain any spaces. A try catch is also 
		// implemented to ensure the user only enters an integer value, and a validation system is in place to reject the 
		// attempt if the ID entered by the user does not exist		
		btnPlayerButton = new JButton("Find Player by SRU");
		findSRU_1.add(btnPlayerButton);
		btnPlayerButton.setToolTipText("Senior SRUs: 1001 - 1018     Junior SRUs: 1019 - 1036    Junior Squad ID: 1     Senior Squad ID: 2");
		btnPlayerButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					Member tempSRU; // Setup temporary variable that will get the members SRU		
					boolean success = false; // Setup boolean for validation
					
					// Get user input and parse
					String sru = txtInputSRU.getText().trim();
					int sruSearch = Integer.parseInt(sru);
							
					newMember = squad.getMembers();
					
					// Iterator traverses Member list and compares user input with ID 's
					// held in member objects. 
					Iterator<Member> anIt = newMember.iterator();
					while(anIt.hasNext())
					{
						tempSRU= anIt.next();
						// if success, open Player window
						if(sruSearch == tempSRU.getSRU())
						{
							saved.showMessageDialog(frame, "Player Found");
							success = true;
							theController.currentPlayerSRU = sruSearch;					
							openPlayerWindow(theController.currentPlayerSRU);
							
							break;
						}
						
					}
					
					// Reject if ID does not exist
					if(success == false)
					{
						saved.showMessageDialog(frame, "User Does Not Exist");
						txtInputSRU.setText("");
					}
				}
				// Reject if anything but integers are entered
				catch(NumberFormatException a)
				{
					saved.showMessageDialog(frame, "Only numbers can be entered");
					txtInputSRU.setText("");					
				}
			}		
		});
		
		
		// Button that finds a squad based on their ID. It takes string input from
		// the user, and parses the string to an integer. An iterator is then used to traverse the Squad objects
		// and compares the user input with the ID's held in the squad objects. If a match is found, the SquadScreen
		// is opened, menu screen is closed, and the user input is set as the current Squad ID, and passed to the SquadScreen.
		// A trim function is used to trim user input to ensure the string value does not contain any spaces. A try catch is also 
		// implemented to ensure the user only enters an integer value, and a validation system is in place to reject the 
		// attempt if the ID entered by the user does not exist	
		btnFindSquad = new JButton("Find Squad");
		btnFindSquad.setToolTipText("Senior SRUs: 1001 - 1018     Junior SRUs: 1019 - 1036    Junior Squad ID: 1     Senior Squad ID: 2");
		btnFindSquad.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					Squad tempID; // Setup temporary variable that will get the Squad ID
					boolean success = false;// Setup boolean for validation
					
					// Get user input and parse
					String getSquadID = txtFindSquad.getText().trim();
					int idSearch = Integer.parseInt(getSquadID);
					
					// Iterator traverses Member list and compares user input with ID 's
					// held in member objects. 
					Iterator<Squad> anIt = newSquad.iterator();
					while(anIt.hasNext())
					{
						tempID = anIt.next();
						// if success, open Squad window
						if(idSearch == tempID.getSquadID())
						{
							saved.showMessageDialog(frame, "Squad Found");
							success = true;
							theController.currentSquadID = idSearch;
							openSquadWindow(theController.currentSquadID);
							break;
						}
					}
					
					// Reject if ID does not exist
					if(success == false)
					{
						saved.showMessageDialog(frame, "Squad Does Not Exist");
						txtFindSquad.setText("");
					}
				}
				// Reject if anything but integers are entered
				catch(NumberFormatException a)
				{
					saved.showMessageDialog(frame, "Only numbers can be entered");
					txtFindSquad.setText("");
				}
			}
		});
		findSquad.add(btnFindSquad);
		
		
		
		btnPlayerName = new JButton("Find Player by Name");
		btnPlayerName.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
			
				Member tempName = null; // Setup temporary variable that will get the Player Name
				boolean success = false; // Setup boolean for validation
				
				// Get user input
				String playerName = txtInputName.getText().trim();
						
				newMember = squad.getMembers();
				
				// Iterator traverses Member list and compares user input with name's
				// held in member objects. 
				Iterator<Member> anIt = newMember.iterator();
				while(anIt.hasNext())
				{
					tempName= anIt.next();
					// if success, open Squad window
					if(playerName.equals(tempName.getName()))
					{
						saved.showMessageDialog(frame, "Player Found");
						success = true;
						theController.currentPlayerSRU = tempName.getSRU();					
						openPlayerWindow(theController.currentPlayerSRU);
						break;
					}
					
				}
				// Reject if ID does not exist
				if(success == false)
				{
					saved.showMessageDialog(frame, "User Does Not Exist");
					txtInputSRU.setText("");
				}
			}
		});
		btnPlayerName.setToolTipText("Senior SRUs: 1001 - 1018     Junior SRUs: 1019 - 1036    Junior Squad ID: 1     Senior Squad ID: 2");
		pnlFindName.add(btnPlayerName);
		
		// Button will open the AddPlayerMenu and close Menu
		btnAddPlayer = new JButton("Create New Player");
		btnAddPlayer.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				AddPlayerMenu newplaymenu = new AddPlayerMenu(c);
				newplaymenu.setVisible(true);			
				frame.dispose();
			}
		});
		btnAddPlayer.setBounds(184, 390, 140, 35);
		Menu.add(btnAddPlayer);
		frame.setVisible(true);
	}
	
	/**
	 * 
	 * @param currentUserID - Passes userID entered by user to the next screen
	 */
	private void openPlayerWindow(int currentUserID)
	{
		PlayerScreen playersc = new PlayerScreen(theController);	
		playersc.setVisible(true);
		frame.dispose();
	}
	
	/***
	 * 
	 * @param currentSquadID Passes squadID entered by user to the next screen
	 */
	private void openSquadWindow(int currentSquadID)
	{
		SquadScreen squadsc = new SquadScreen(theController);		
		squadsc.setVisible(true);	
		frame.dispose();
	}
	
	/**
	 *  Method holding swing assets, to be called in constructor
	 */	
	// The following is a series of Swing assets, such as labels and Text Fields
	public void pageAssets()
	{
		
		separator = new JSeparator();
		separator.setBounds(94, 377, 322, 2);
		Menu.add(separator);
		
		lblNewLabel_1 = new JLabel("-OR-");
		lblNewLabel_1.setBounds(247, 142, 31, 18);
		Menu.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		pnlFindName = new JPanel();
		pnlFindName.setToolTipText("Enter SRU");
		pnlFindName.setBounds(126, 159, 277, 68);
		Menu.add(pnlFindName);
		
		lblPlayerName = new JLabel("Enter Player Name:");
		pnlFindName.add(lblPlayerName);
		lblPlayerName.setToolTipText("Senior SRUs: 1001 - 1018     Junior SRUs: 1019 - 1036    Junior Squad ID: 1     Senior Squad ID: 2");
		lblPlayerName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		txtInputName = new JTextField();
		txtInputName.setToolTipText("Senior SRUs: 1001 - 1018     Junior SRUs: 1019 - 1036    Junior Squad ID: 1     Senior Squad ID: 2");
		txtInputName.setColumns(10);
		pnlFindName.add(txtInputName);
		
		findSquad = new JPanel();
		findSquad.setToolTipText("Enter SRU");
		findSquad.setBounds(126, 243, 277, 68);
		Menu.add(findSquad);
		
		lblEnterSquadId = new JLabel("Enter Squad ID No:");
		lblEnterSquadId.setToolTipText("Senior SRUs: 1001 - 1018     Junior SRUs: 1019 - 1036    Junior Squad ID: 1     Senior Squad ID: 2");
		lblEnterSquadId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		findSquad.add(lblEnterSquadId);
		
		txtFindSquad = new JTextField();
		txtFindSquad.setToolTipText("Senior SRUs: 1001 - 1018     Junior SRUs: 1019 - 1036    Junior Squad ID: 1     Senior Squad ID: 2");
		txtFindSquad.setColumns(10);
		findSquad.add(txtFindSquad);
		
		findSRU_1 = new JPanel();
		findSRU_1.setToolTipText("Enter SRU");
		findSRU_1.setBounds(126, 63, 277, 68);
		Menu.add(findSRU_1);
		
		lblSRU = new JLabel("Enter Player SRU: ");
		lblSRU.setToolTipText("Senior SRUs: 1001 - 1018     Junior SRUs: 1019 - 1036    Junior Squad ID: 1     Senior Squad ID: 2");
		lblSRU.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		findSRU_1.add(lblSRU);
		
		txtInputSRU = new JTextField();
		txtInputSRU.setToolTipText("Senior SRUs: 1001 - 1018     Junior SRUs: 1019 - 1036    Junior Squad ID: 1     Senior Squad ID: 2");
		txtInputSRU.setColumns(10);
		findSRU_1.add(txtInputSRU);
	}
	

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}

