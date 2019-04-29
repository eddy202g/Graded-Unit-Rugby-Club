package View;

import javax.swing.JButton;





import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import Controller.Controller;
import Model.Member;
import Model.Player;
import Model.Skill;
import Model.Category;

import Model.Squad;

import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JSeparator;

/**
 * 
 * @author Edward Morris
 * @version 1.0.0 May 11 2018
 */

// Class allows the user to view details relating to the player
public class PlayerScreen extends JFrame
{
	
	Squad squad = Controller.getSquadClass();
	Player player = Controller.getPlayerClass();
	Category category = Controller.getCategory();

	// List of Swing asset declerations
	private Controller theController;
	private JPanel pnlPanel;
	private JLabel lblComboPrompt;
	private JButton btnEdit;
	private JButton btnBack;
	private JButton btnLogout;
	private JComboBox comboBoxSkills;
	private JTextArea txtDetails;
	private JTextArea txtSkills;
	private JTextArea txtSkillComments;
	private JSeparator separator;
	
	ArrayList<Member> newMember = squad.getMembers();
	ArrayList<Skill> searchSkill = new ArrayList<Skill>();

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
	public PlayerScreen(Controller c)
	{
		theController = c;
		
		// Setup the screen 
		setResizable(false);
		setTitle("Simply Rugby - Players");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 500);
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

		/////////////////////////////
	    // Series of assets that set up a text area for information to be displayed
	    /////////////////////////////
	    txtDetails = new JTextArea();
		txtDetails.setBounds(28, 11, 280, 365);
		txtDetails.setLineWrap(true);
		txtDetails.setWrapStyleWord(true);
		txtDetails.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		txtSkills = new JTextArea();
		txtSkills.setWrapStyleWord(true);
		txtSkills.setLineWrap(true);
		txtSkills.setBorder(new LineBorder(Color.LIGHT_GRAY));
		txtSkills.setBounds(336, 11, 280, 99);
		pnlPanel.add(txtSkills);
		
		txtSkillComments = new JTextArea();
		txtSkillComments.setWrapStyleWord(true);
		txtSkillComments.setLineWrap(true);
		txtSkillComments.setBorder(new LineBorder(Color.LIGHT_GRAY));
		txtSkillComments.setBounds(335, 135, 280, 99);
		pnlPanel.add(txtSkillComments);
		pnlPanel.add(txtDetails);
		
		// This button initialises a new EditSkillsScreen, and closes
		// current screen
		btnEdit = new JButton("Edit Player Skills");
		btnEdit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				EditSkillsScreen newEditSkillsScreen = new EditSkillsScreen(c);
				newEditSkillsScreen.setVisible(true);	
				dispose();
			}
		});
		btnEdit.setBounds(404, 353, 154, 23);
		pnlPanel.add(btnEdit);
		
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
		btnBack.setBounds(200, 437, 119, 23);
		pnlPanel.add(btnBack);
		
		// Button is used to exit the system when pushed
		btnLogout = new JButton("Quit");
		btnLogout.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnLogout.setBounds(329, 437, 119, 23);
		pnlPanel.add(btnLogout);
		
		// Combobox allows the player to select a skill category. Based on which category
		// is chosen, a set of skill details specific to that player will be shown. It achieves this by 
		// using an iterator to traverse the Skills objects, comparing the current players ID
		// with the player ID's contained within each object. When matching ID is found, a second conditional is 
		// then used to compare the selection made in the combobox with a string value, if true, the skills information 
		// is displayed in text areas
		comboBoxSkills = new JComboBox(player.getCategory().toArray());
		pnlPanel.add(comboBoxSkills);
		comboBoxSkills.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// Take selection from the combobox
				Category getCategoryName = (Category) comboBoxSkills.getSelectedItem();
				// Use that selection to get the category name from category objects
				// Store in variable
				String categoryCompare = getCategoryName.getCategoryName();

				// Traverse Skill arraylist, match currentID with players ID
				Iterator<Skill> iterate = category.getSkills().iterator();
				while(iterate.hasNext())
				{
					Skill s = iterate.next();
					
					
					if(theController.currentPlayerSRU == s.getPlayersID())
					{
						if(categoryCompare.equals("Passing"))
						{						
							txtSkills.setText(s.passingDetails());
							txtSkillComments.setText(s.getPassComments());
						}
						
						if(categoryCompare.contentEquals("Tackling"))
						{
							txtSkills.setText(s.tacklingDetails());
							txtSkillComments.setText(s.getTacklingComments());
						}
						
						if(categoryCompare.contentEquals("Kicking"))
						{
							txtSkills.setText(s.kickingDetails());
							txtSkillComments.setText(s.getKickingComments());
						}
					}
				}
			}
		});
		comboBoxSkills.setBounds(404,298,154,23);
		
		displayCurrentPLayersDetails(theController.currentPlayerSRU, txtDetails);
		
		
	}
	
	/**
	 * 
	 * @param ID - pass currentID into method
	 * @param txtBox - pass textarea into method
	 */
	
	// Method that will take in current players ID and a text area, and will
	// display the current usersinformation
	private void displayCurrentPLayersDetails(int ID, JTextArea txtBox)
	{
		Iterator<Member> iterate = newMember.iterator();
		while(iterate.hasNext())
		{
			Member m = iterate.next();
			if(theController.currentPlayerSRU == m.getSRU()) 
			{
				txtBox.setText(m.details());
			}
		}
	}
	
	/**
	 *  Method holding swing assets, to be called in constructor
	 */
	public void pageAssets()
	{
		separator = new JSeparator();
		separator.setBounds(83, 424, 502, 2);
		pnlPanel.add(separator);
		
		lblComboPrompt = new JLabel("Select Skill Category");
		lblComboPrompt.setBounds(421, 269, 122, 18);
		pnlPanel.add(lblComboPrompt);
		lblComboPrompt.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		
	}
}

