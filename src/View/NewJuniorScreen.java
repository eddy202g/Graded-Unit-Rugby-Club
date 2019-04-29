package View;

import javax.swing.JButton;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import Model.JuniorPlayer;
import Model.Member;
import Model.Squad;
import Controller.Controller;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Edward Morris
 * @version 1.0.0 May 11 2018
 */

// Class opens a new screen that allows the user to create a new Junior Player
public class NewJuniorScreen 
{
	
	Squad squad = Controller.getSquadClass();
	private Controller theController;
	
	// List of Swing asset declerations
	private JFrame frame = new JFrame("Simply Rugby - Add New Junior");
	private JPanel addPlayer;
	private JButton btnAddPlayerDetails;
	private JButton btnBack;
	private JButton btnQuit;
	private JButton btnTest;
	private JLabel lblNewLabel;
	private JLabel lblPosition;
	private JLabel lblGuard1;
	private JLabel lblGuard2;
	private JLabel lblName;
	private JLabel lblAddress;
	private JLabel lblDOB;
	private JLabel lblPostcode;
	private JLabel lblTel;
	private JLabel lblMobile;
	private JLabel lblEmail;
	private JLabel lblRela;
	private JLabel lblRela2;
	private JLabel lblGuardAddress2;
	private JLabel lblGuardAddress;
	private JLabel lblGuardTel;
	private JLabel lblDoctorName;
	private JLabel lblDocAddress;
	private JLabel lblGuardTele2;
	private JLabel lblDocTele;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtPostC;
	private JTextField txtMobile;
	private JTextField txtGuard1;
	private JTextField txtGuardRel1;
	private JTextField txtGuardAdd1;
	private JTextField txtGuardTele1;
	private JTextField txtDocName;
	private JTextField txtDocAdd;
	private JTextField txtDOB;
	private JTextField txtTeleNo;
	private JTextField txtEmail;
	private JTextField txtGuard2;
	private JTextField txtGuardRel2;
	private JTextField txtGuardAdd2;
	private JTextField txtGuardTele2;
	private JTextField txtDocTele;
	private JTextField txtHealth;
	private JOptionPane saved;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JTextField txtPosition;
	
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
	public NewJuniorScreen(Controller c)
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
		
		// Button creates a new player by taking the input from the user via text fields, stores that input into a 
		// temporary variable, and then pushees the temorary variables into a new Player Object. A trim function is used to trim user input to ensure
		// the string values do not contain any spaces.
		btnAddPlayerDetails = new JButton("Add Player Details");
		btnAddPlayerDetails.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String tempName = txtName.getText().trim();
				String tempAdd = txtAddress.getText().trim();
				String tempPostC = txtPostC.getText().trim();
				String tempMobile = txtMobile.getText().trim();
				String tempDOB = txtDOB.getText().trim();
				String tempTele = txtTeleNo.getText().trim();
				String tempEmail = txtEmail.getText().trim();
				String tempGuard1 = txtGuard1.getText().trim();
				String tempRelation1 = txtGuardRel1.getText().trim();
				String tempGuardAddress1 = txtGuardAdd1.getText().trim();
				String tempGuardTele1 = txtGuardTele1.getText().trim();
				String tempGuard2 = txtGuard2.getText().trim();
				String tempRelation2 = txtGuardRel2.getText().trim();
				String tempGuardAddress2 = txtGuardAdd2.getText().trim();
				String tempGuardTele2 = txtGuardTele2.getText().trim();
				String tempDocName = txtDocName.getText().trim();
				String tempDocAddress = txtDocAdd.getText().trim();
				String tempDocTele = txtDocTele.getText().trim();
				String tempHealth = txtHealth.getText().trim();
				String tempPosition = txtPosition.getText().trim();
				int tempSquadID = 1;
				
				// Pushes temp variables into object when button is clicked
				Member tempMember = new JuniorPlayer(tempName, tempAdd, tempPostC, tempDOB, tempTele, tempMobile,  
						tempEmail, tempGuard1, tempRelation1, tempGuardAddress1, tempGuardTele1, tempGuard2, tempRelation2, tempGuardAddress2,
						tempGuardTele2, tempDocName, tempDocAddress, tempDocTele, tempHealth, tempPosition, tempSquadID);
				squad.addPlayers(tempMember);
				
				saved.showMessageDialog(frame,
		                "Player Details Have Been Saved");
			}
		});
		btnAddPlayerDetails.setBounds(146, 359, 154, 23);
		addPlayer.add(btnAddPlayerDetails);
		
		// Button is used to return to the home screen
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

				Menu menusc = new Menu(theController);
				menusc.setVisible(true);
				frame.dispose();
			}
		});
		btnBack.setBounds(200, 437, 119, 23);
		addPlayer.add(btnBack);
		
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
		
		// This button is used to test to ensure the newly added player has been successfully created.
		// It calls the displayMembers function, outputting the Members objects to the console
		btnTest = new JButton("Test for Added Player");
		btnTest.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				displayMembers();
			}
		});
		btnTest.setBounds(342, 359, 170, 23);
		addPlayer.add(btnTest);
	}
	
	/**
	 *  Method to display Members
	 */
	
	// Displays member on=bjects and prints list to the console
	public void displayMembers()
	{
		
		Iterator<Member> iterate = squad.getMembers().iterator();
		while(iterate.hasNext())
		{
			Member m = iterate.next();
			System.out.println(m.details());
		}
	}
	
	/**
	 *  Method holding swing assets, to be called in constructor
	 */
	public void pageAssets()
	{
		separator_2 = new JSeparator();
		separator_2.setBounds(67, 425, 502, 2);
		addPlayer.add(separator_2);
		
		txtHealth = new JTextField();
		txtHealth.setBounds(464, 73, 170, 194);
		addPlayer.add(txtHealth);
		txtHealth.setColumns(10);
		
		lblNewLabel = new JLabel("Known Health Issues: ");
		lblNewLabel.setBounds(494, 21, 140, 51);
		addPlayer.add(lblNewLabel);
		
		lblPosition = new JLabel("Player Position");
		lblPosition.setBounds(238, 14, 95, 14);
		addPlayer.add(lblPosition);
		
		
		txtPosition = new JTextField();
		txtPosition.setColumns(10);
		txtPosition.setBounds(321, 11, 131, 23);
		addPlayer.add(txtPosition);
		
		
		txtGuard1 = new JTextField();
		txtGuard1.setBounds(97, 145, 131, 23);
		addPlayer.add(txtGuard1);
		txtGuard1.setColumns(10);
		
		lblGuard1 = new JLabel("Guardian 1");
		lblGuard1.setBounds(20, 145, 62, 14);
		addPlayer.add(lblGuard1);
		
		txtGuard2 = new JTextField();
		txtGuard2.setBounds(322, 145, 131, 23);
		addPlayer.add(txtGuard2);
		txtGuard2.setColumns(10);
		
		lblGuard2 = new JLabel("Guardian 2");
		lblGuard2.setBounds(246, 148, 62, 14);
		addPlayer.add(lblGuard2);
		
		lblName = new JLabel("Name");
		lblName.setBounds(44, 11, 39, 14);
		addPlayer.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(98, 11, 130, 23);
		addPlayer.add(txtName);
		txtName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(97, 42, 131, 23);
		addPlayer.add(txtAddress);
		txtAddress.setColumns(10);
		
		lblAddress = new JLabel("Address");
		lblAddress.setBounds(33, 42, 54, 14);
		addPlayer.add(lblAddress);
		
		lblDOB = new JLabel("DOB");
		lblDOB.setBounds(272, 42, 36, 14);
		addPlayer.add(lblDOB);
		
		txtDOB = new JTextField();
		txtDOB.setBounds(322, 42, 131, 23);
		addPlayer.add(txtDOB);
		txtDOB.setColumns(10);
		
		lblPostcode = new JLabel("PostCode");
		lblPostcode.setBounds(29, 73, 62, 14);
		addPlayer.add(lblPostcode);
		
		txtPostC = new JTextField();
		txtPostC.setBounds(98, 73, 131, 23);
		addPlayer.add(txtPostC);
		txtPostC.setColumns(10);
		
		lblTel = new JLabel("Tele No");
		lblTel.setBounds(263, 73, 46, 14);
		addPlayer.add(lblTel);
		
		txtTeleNo = new JTextField();
		txtTeleNo.setBounds(323, 73, 131, 23);
		addPlayer.add(txtTeleNo);
		txtTeleNo.setColumns(10);
		
		lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(43, 107, 39, 14);
		addPlayer.add(lblMobile);
		
		txtMobile = new JTextField();
		txtMobile.setBounds(97, 104, 131, 23);
		addPlayer.add(txtMobile);
		txtMobile.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(272, 107, 31, 14);
		addPlayer.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(322, 104, 131, 23);
		addPlayer.add(txtEmail);
		txtEmail.setColumns(10);
		
		lblRela = new JLabel("Relationship");
		lblRela.setBounds(10, 175, 95, 14);
		addPlayer.add(lblRela);
		
		txtGuardRel1 = new JTextField();
		txtGuardRel1.setBounds(97, 175, 131, 23);
		addPlayer.add(txtGuardRel1);
		txtGuardRel1.setColumns(10);
		
		lblRela2 = new JLabel("Relationship");
		lblRela2.setBounds(240, 175, 80, 14);
		addPlayer.add(lblRela2);
		
		txtGuardRel2 = new JTextField();
		txtGuardRel2.setBounds(322, 175, 131, 23);
		addPlayer.add(txtGuardRel2);
		txtGuardRel2.setColumns(10);
		
		lblGuardAddress = new JLabel("Address");
		lblGuardAddress.setBounds(33, 204, 62, 14);
		addPlayer.add(lblGuardAddress);
		
		txtGuardAdd1 = new JTextField();
		txtGuardAdd1.setBounds(97, 204, 131, 23);
		addPlayer.add(txtGuardAdd1);
		txtGuardAdd1.setColumns(10);
		
		lblGuardAddress2 = new JLabel("Address");
		lblGuardAddress2.setBounds(258, 204, 62, 14);
		addPlayer.add(lblGuardAddress2);
		
		txtGuardAdd2 = new JTextField();
		txtGuardAdd2.setBounds(322, 204, 131, 23);
		addPlayer.add(txtGuardAdd2);
		txtGuardAdd2.setColumns(10);
		
		lblGuardTel = new JLabel("Tele No");
		lblGuardTel.setBounds(33, 238, 57, 14);
		addPlayer.add(lblGuardTel);
		
		txtGuardTele1 = new JTextField();
		txtGuardTele1.setBounds(97, 235, 131, 23);
		addPlayer.add(txtGuardTele1);
		txtGuardTele1.setColumns(10);
		
		lblDoctorName = new JLabel("Doctor Name");
		lblDoctorName.setBounds(10, 281, 80, 14);
		addPlayer.add(lblDoctorName);
		
		txtDocName = new JTextField();
		txtDocName.setBounds(97, 281, 131, 23);
		addPlayer.add(txtDocName);
		txtDocName.setColumns(10);
		
		lblDocAddress = new JLabel("Address");
		lblDocAddress.setBounds(260, 280, 62, 14);
		addPlayer.add(lblDocAddress);
		
		txtDocAdd = new JTextField();
		txtDocAdd.setBounds(324, 280, 131, 23);
		addPlayer.add(txtDocAdd);
		txtDocAdd.setColumns(10);
		
		lblGuardTele2 = new JLabel("Tele No");
		lblGuardTele2.setBounds(263, 238, 57, 14);
		addPlayer.add(lblGuardTele2);
		
		txtGuardTele2 = new JTextField();
		txtGuardTele2.setBounds(322, 235, 131, 23);
		addPlayer.add(txtGuardTele2);
		txtGuardTele2.setColumns(10);
		
		lblDocTele = new JLabel("Tele No");
		lblDocTele.setBounds(33, 312, 54, 14);
		addPlayer.add(lblDocTele);
		
		txtDocTele = new JTextField();
		txtDocTele.setBounds(97, 312, 131, 23);
		addPlayer.add(txtDocTele);
		txtDocTele.setColumns(10);
		
		separator = new JSeparator();
		separator.setBounds(44, 132, 410, 2);
		addPlayer.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(44, 265, 410, 2);
		addPlayer.add(separator_1);
	}

	public void setVisible(boolean b) {
		
		
	}
}
