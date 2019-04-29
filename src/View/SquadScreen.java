package View;

import javax.swing.JButton;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import Controller.Controller;
import Model.Category;
import Model.Member;
import Model.Player;
import Model.Skill;
import Model.Squad;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;

/**
 * 
 * @author Edward Morris
 * @version 1.0.0 May 11 2018
 *
 */

// Class allows the user to view details relating to the player
public class SquadScreen extends JFrame
{

	private Controller theController;
	Squad squad = Controller.getSquadClass();
	Category category = Controller.getCategory();
	Player player = Controller.getPlayerClass();

	// List of Swing asset declerations
	private JPanel pnlPanel;
	private JLabel lblProp;
	private JLabel lblBkRow;
	private JLabel lblNewLabel;
	private JLabel lblWing;
	private JLabel lblFlyHalf;
	private JLabel lblHooker;
	private JLabel lblSecRow;
	private JLabel lblFullBack;
	private JLabel lblCentre;
	private JLabel lblScum;
	private JLabel lblName;
	private JLabel lblNewLabel_1;	
	private JOptionPane saved;
	private JButton button;
	private JButton btnBack;
	private JButton btnEditSquad;
	private JButton btnTest;
	private JTextArea txtDisplaySquad;
	private JTextField txtName;
	private JTextField txtFBack;
	private JTextField txtCentre;
	private JTextField txtFlyHalf;
	private JTextField txtScrum;
	private JTextField txtHooker;
	private JTextField txtProp;
	private JTextField txtSecRow;
	private JTextField txtBackRow;
	private JTextField txtWing;
	private JSeparator separator;
	
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
	public SquadScreen(Controller c)
	{
		theController = c;
		
		// Setup the screen 
		setResizable(false);
		setTitle("Simply Rugby - Manage Squads");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 488, 500);
		pnlPanel = new JPanel();
		setContentPane(pnlPanel);
		pnlPanel.setLayout(null);
		
		// Call method which contains swing assets used on the page
		pageAssets();
		
		// Sets up the look and feel of the screen
		try
	    {
	        //Set the required look and feel
	        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	        //Update the component tree - associate the look and feel with the given frame.
	        SwingUtilities.updateComponentTreeUI(pnlPanel);
	    }
	    catch(Exception ex)
	    {
	        ex.printStackTrace();
	    }
		
		
		// Text area that will display the current squad
		txtDisplaySquad = new JTextArea();
		txtDisplaySquad.setEditable(false);
		txtDisplaySquad.setWrapStyleWord(true);
		txtDisplaySquad.setLineWrap(true);
		txtDisplaySquad.setBounds(41, 47, 183, 250);
		pnlPanel.add(txtDisplaySquad);
		
		// Button which takes the string values from each text field, and converts the input to integer
		// if required. An Iterator is used to traverse the Squad objects, and replaces the values 
		// held in the object with the one value taken from the user. A trim function is used to trim user input to ensure
		// the string values do not contain any spaces
		btnEditSquad = new JButton("Edit Squad");
		btnEditSquad.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				int currentSquadID = theController.currentSquadID;
				
				String tempSquadName = txtName.getText().trim();
				
				String tempFullBackID = txtFBack.getText().trim();
				int fullBackID = Integer.parseInt(tempFullBackID);
				
				String tempWingID = txtWing.getText().trim();
				int wingID = Integer.parseInt(tempWingID);	
				
				String tempCentreID = txtCentre.getText().trim();
				int centreID = Integer.parseInt(tempCentreID);
				
				String tempFlyHalfID = txtFlyHalf.getText().trim();
				int flyHalfID = Integer.parseInt(tempFlyHalfID);
				
				String tempScrumID = txtScrum.getText().trim();
				int scrumID = Integer.parseInt(tempScrumID);
				
				String tempHookerID = txtHooker.getText().trim();
				int hookerID = Integer.parseInt(tempHookerID);
				
				String tempPropID = txtProp.getText().trim();
				int propID = Integer.parseInt(tempPropID);
				
				String temp2ndRowID = txtSecRow.getText().trim();
				int secondRowID = Integer.parseInt(temp2ndRowID);
				
				String tempBackRowID = txtBackRow.getText().trim();
				int backRowID = Integer.parseInt(tempBackRowID);
				
				// Iterator traverses Squad objects and matches the current Squad ID with the ID stored 
				// stored with the Squad object
				Iterator<Squad> iterate = theController.getSquads().iterator();
				while(iterate.hasNext())
				{
					
						Squad squad = iterate.next();
						
						Squad tempRefID = (Squad) squad;
						tempRefID.setSquadID(currentSquadID);
						
						if(currentSquadID == squad.getSquadID())
						{
							if(tempSquadName != null)
							{
								Squad tempRef = (Squad) squad;
								tempRef.setSquadName(tempSquadName);
							}
						}
						
						if(currentSquadID == squad.getSquadID())
						{
							if(tempFullBackID != null)
							{
								Squad tempRef = (Squad) squad;
								tempRef.setFullBackID(fullBackID);
							}
						}
						
						if(currentSquadID == squad.getSquadID())
						{
							if(tempWingID != null)
							{
								Squad tempRef = (Squad) squad;
								tempRef.setWingID(wingID);
							}
						}
						
						if(currentSquadID == squad.getSquadID())
						{
							if(tempCentreID != null)
							{
								Squad tempRef = (Squad) squad;
								tempRef.setCentreID(centreID);
							}
						}
						
						if(currentSquadID == squad.getSquadID())
						{
							if(tempFlyHalfID != null)
							{
								Squad tempRef = (Squad) squad;
								tempRef.setFlyHalfID(flyHalfID);
							}
						}
						
						if(currentSquadID == squad.getSquadID())
						{
							if(tempScrumID != null)
							{
								Squad tempRef = (Squad) squad;
								tempRef.setScrumHalfID(scrumID);
							}
						}
						
						if(currentSquadID == squad.getSquadID())
						{
							if(tempHookerID != null)
							{
								Squad tempRef = (Squad) squad;
								tempRef.setHookerID(hookerID);
							}
						}
						
						if(currentSquadID == squad.getSquadID())
						{
							if(tempPropID != null)
							{
								Squad tempRef = (Squad) squad;
								tempRef.setPropID(propID);
							}
						}
						
						if(currentSquadID == squad.getSquadID())
						{
							if(temp2ndRowID != null)
							{
								Squad tempRef = (Squad) squad;
								tempRef.setSecRowID(secondRowID);
							}
						}
						
						if(currentSquadID == squad.getSquadID())
						{
							if(tempBackRowID != null)
							{
								Squad tempRef = (Squad) squad;
								tempRef.setBackRowID(backRowID);
							}
							
							if(tempBackRowID == null)
							{
								saved.showMessageDialog(pnlPanel, "Please Complete All Fields");
							}
						}
						
						JOptionPane.showMessageDialog(null, "Squad Details Have Been Edited");				
			}
			}
		});
		btnEditSquad.setBounds(298, 368, 119, 23);
		pnlPanel.add(btnEditSquad);
		
		// Button to test if the squad has been successfully edited
		btnTest = new JButton("Test Edited Squad");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				ArrayList<Squad> displaySquad = theController.getSquads();
				
				// Traverse the Squad arraylist, if currentSquadID is equal to ID held in squad objects
				// idsplay the suqad
				Iterator<Squad> iterate = displaySquad.iterator();
				while(iterate.hasNext())
				{
					Squad s = iterate.next();
					if(theController.currentSquadID == s.getSquadID()) 
					{	
						txtDisplaySquad.setText(s.squadDetails());
					}
				}
			}
		});
		btnTest.setBounds(60, 327, 138, 23);
		pnlPanel.add(btnTest);
		
		// Button is used to exit the system when pushed
		button = new JButton("Quit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		button.setBounds(248, 437, 119, 23);
		pnlPanel.add(button);
		
		// Button is used to return to the home screen
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				Menu menusc = new Menu(theController);
				menusc.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(123, 437, 119, 23);
		pnlPanel.add(btnBack);
		
		displayCurrentSquadDetails(theController.currentSquadID, txtDisplaySquad);
	}
	
	/**
	 * 
	 * @param ID - pass currentSquadID into method
	 * @param txtBox - pass textarea into method
	 */
	// Method that will take in current players ID and a text area, and will
	// display the current usersinformation
	private void displayCurrentSquadDetails(int ID, JTextArea txtBox)
	{
		ArrayList<Squad> displaySquad = theController.getSquads();
		
		
		Iterator<Squad> iterate = displaySquad.iterator();
		while(iterate.hasNext())
		{
			Squad s = iterate.next();
			if(theController.currentSquadID == s.getSquadID()) 
			{	
				txtBox.setText(s.squadDetails());
			}
		}
	}
	
	/**
	 *  Method holding swing assets, to be called in constructor
	 */
	public void pageAssets()
	{		
		if(theController.currentSquadID == 1)
		{
			txtName = new JTextField("Junior");
			txtName.setBounds(344, 45, 86, 23);
			pnlPanel.add(txtName);
			txtName.setColumns(10);
		}
		else
		{
			txtName = new JTextField("Over's");
			txtName.setBounds(344, 45, 86, 23);
			pnlPanel.add(txtName);
			txtName.setColumns(10);
		}
		
		separator = new JSeparator();
		separator.setBounds(60, 424, 357, 2);
		pnlPanel.add(separator);
		
		txtWing = new JTextField();
		txtWing.setColumns(10);
		txtWing.setBounds(343, 107, 86, 23);
		pnlPanel.add(txtWing);
		
		lblProp = new JLabel("Prop");
		lblProp.setBounds(281, 265, 65, 14);
		pnlPanel.add(lblProp);
		
		lblBkRow = new JLabel("Back Row");
		lblBkRow.setBounds(281, 327, 65, 14);
		pnlPanel.add(lblBkRow);	

		lblNewLabel = new JLabel("Current Squad");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(80, 23, 146, 14);
		pnlPanel.add(lblNewLabel);
		
		txtFBack = new JTextField();
		txtFBack.setColumns(10);
		txtFBack.setBounds(343, 76, 86, 23);
		pnlPanel.add(txtFBack);
		
		txtCentre = new JTextField();
		txtCentre.setColumns(10);
		txtCentre.setBounds(343, 138, 86, 23);
		pnlPanel.add(txtCentre);
		
		txtFlyHalf = new JTextField();
		txtFlyHalf.setColumns(10);
		txtFlyHalf.setBounds(344, 169, 86, 23);
		pnlPanel.add(txtFlyHalf);
		
		txtScrum = new JTextField();
		txtScrum.setColumns(10);
		txtScrum.setBounds(343, 200, 86, 23);
		pnlPanel.add(txtScrum);
		
		txtHooker = new JTextField();
		txtHooker.setColumns(10);
		txtHooker.setBounds(344, 231, 86, 23);
		pnlPanel.add(txtHooker);
		
		txtProp = new JTextField();
		txtProp.setColumns(10);
		txtProp.setBounds(344, 262, 86, 23);
		pnlPanel.add(txtProp);
		
		txtSecRow = new JTextField();
		txtSecRow.setColumns(10);
		txtSecRow.setBounds(344, 293, 86, 23);
		pnlPanel.add(txtSecRow);
		
		txtBackRow = new JTextField();
		txtBackRow.setColumns(10);
		txtBackRow.setBounds(344, 324, 86, 23);
		pnlPanel.add(txtBackRow);
		
		lblName = new JLabel("Squad");
		lblName.setBounds(279, 50, 65, 14);
		pnlPanel.add(lblName);
		
		lblWing = new JLabel("Wing");
		lblWing.setBounds(279, 110, 65, 14);
		pnlPanel.add(lblWing);
		
		lblFlyHalf = new JLabel("Fly Half");
		lblFlyHalf.setBounds(279, 172, 65, 14);
		pnlPanel.add(lblFlyHalf);
		
		lblHooker = new JLabel("Hooker");
		lblHooker.setBounds(281, 234, 65, 14);
		pnlPanel.add(lblHooker);
		
		lblSecRow = new JLabel("2nd Row");
		lblSecRow.setBounds(279, 296, 65, 14);
		pnlPanel.add(lblSecRow);
		
		lblFullBack = new JLabel("Full Back");
		lblFullBack.setBounds(279, 79, 65, 14);
		pnlPanel.add(lblFullBack);
		
		lblCentre = new JLabel("Centre");
		lblCentre.setBounds(279, 141, 65, 14);
		pnlPanel.add(lblCentre);
		
		lblScum = new JLabel("Scrum Half");
		lblScum.setBounds(279, 203, 65, 14);
		pnlPanel.add(lblScum);
		
		lblNewLabel_1 = new JLabel("Edit Squad");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(304, 21, 93, 14);
		pnlPanel.add(lblNewLabel_1);
	}
}

