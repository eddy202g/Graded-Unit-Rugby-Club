package View;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
import java.nio.channels.NonWritableChannelException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import Controller.Controller;
import Model.JuniorPlayer;
import Model.Member;
import Model.Player;
import Model.Skill;
import Model.Squad;

import javax.swing.JCheckBox;
import javax.swing.JSeparator;

/**
 * 
 * @author Edward Morris
 * @version 1.0.0 May 11 2018
 */

//Class opens a new screen that allows the user to create a new Player
public class NewPlayerScreen 
{
	Squad squad = Controller.getSquadClass();
	private Controller theController;
	
	// List of Swing asset declerations
	private JFrame frame = new JFrame("Simply Rugby - Add New Player");
	private JPanel addPlayer;
	private JLabel lblHealth;
	private JLabel lblNextOfKinTel;
	private JLabel lblPosition;
	private JLabel lblName;
	private JLabel lblAddress;
	private JLabel lblDOB;
	private JLabel lblPostcode;
	private JLabel lblTel;
	private JLabel lblMobile;
	private JLabel lblEmail;
	private JLabel lblDoctorName;
	private JLabel lblNOK;
	private JLabel lblDocTele;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtPostC;
	private JTextField txtMobile;
	private JTextField txtDocName;
	private JTextField txtNOK;
	private JTextField txtDate;
	private JTextField txtTeleNo;
	private JTextField txtEmail;
	private JTextField txtDocTele;
	private JTextField txtHealth;
	private JOptionPane saved;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JTextField txtPosition;
	private JTextField txtNOKTele;
	private JTextField txtMonth;
	private JTextField txtYear;
	private JButton btnAddPlayerDetails;
	private JButton btnBack;
	private JButton btnQuit;
	private JButton btnTest;

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
	public NewPlayerScreen(Controller c)
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
		// temporary variable, and then pushes the temporary variables into a new Player Object. A trim function is used to trim user input to ensure
		// the string values do not contain any spaces. This button is also used to calculate the players date of birth, using the LocalDate utility
		// it takes in the date, month and year as user input, parses to integer and puts those details into a variable of type LocalDate.
		// The current date is then retrieved and stored into a variable, and the two variables are passed as parameters into a method called calculate age. The 
		// newly calculated age is pushed into the new Player object
		btnAddPlayerDetails = new JButton("Add Player Details");
		btnAddPlayerDetails.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String tempName = txtName.getText().trim();
				String tempAdd = txtAddress.getText().trim();
				String tempPostC = txtPostC.getText().trim();
				String tempMobile = txtMobile.getText().trim();
				
				String tempDOBDate = txtDate.getText().trim();
				int DOBDate = Integer.parseInt(tempDOBDate);
				
				String tempDOBMonth = txtMonth.getText().trim();
				int DOBMonth = Integer.parseInt(tempDOBMonth);
				
				String tempDOBYear = txtYear.getText().trim();
				int DOBYear = Integer.parseInt(tempDOBYear);
				
				String tempTele = txtTeleNo.getText().trim();
				String tempEmail = txtEmail.getText().trim();
				String tempDocName = txtDocName.getText().trim();
				String tempDocTele = txtDocTele.getText().trim();
				String tempHealth = txtHealth.getText().trim();
				String tempPosition = txtPosition.getText().trim();
				String tempNOK = txtNOK.getText().trim();
				String tempNOKTele = txtNOKTele.getText().trim();
				
				// Parses user input into a date format and store in variable
				LocalDate birthdate = LocalDate.of(DOBYear, DOBMonth, DOBDate);
				// Retrieve current date from system and store in variable
				LocalDate currentDate = LocalDate.now();
				// Pass both variables 
				int DOB = calculateAge(birthdate, currentDate);
				
				
				// Pushes temp variables into object when button is clicked
				Member tempMember = new Player(tempName, tempAdd, tempPostC, tempDOBDate, tempDOBMonth, tempDOBYear, DOB, tempTele, tempMobile,  
						tempEmail, tempNOK, tempNOKTele, tempDocName, tempDocTele, tempHealth, tempPosition, 0);
				squad.addPlayers(tempMember);
				
				saved.showMessageDialog(frame,
		                "Player Details Have Been Saved");
			}
		});
		btnAddPlayerDetails.setBounds(216, 391, 154, 23);
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
		btnTest.setToolTipText("Output new user onto console");
		btnTest.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				displayMembers();
			}
		});
		btnTest.setBounds(417, 391, 165, 23);
		addPlayer.add(btnTest);
		
	
}

	/**
	 * 
	 * @param date1 - Parsed date from user will be passed to method
	 * @param currentDate - Current date will be passed to method
	 * @return - Return the age of the player
	 */
	public int calculateAge(LocalDate date1, LocalDate currentDate)
	{	
		if ((date1 != null) && (currentDate != null)) 
		{
	        return Period.between(date1, currentDate).getYears();
	    } else 
	    {
	        return 0;
	    }
	}
	
	/**
	 *  Method to display Members
	 */
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
		separator_2.setBounds(44, 425, 538, 1);
		addPlayer.add(separator_2);
		
		lblNextOfKinTel = new JLabel("Tele No");
		lblNextOfKinTel.setBounds(353, 180, 54, 14);
		addPlayer.add(lblNextOfKinTel);
		
		txtNOKTele = new JTextField();
		txtNOKTele.setColumns(10);
		txtNOKTele.setBounds(417, 180, 131, 23);
		addPlayer.add(txtNOKTele);
		
		txtMonth = new JTextField();
		txtMonth.setColumns(10);
		txtMonth.setBounds(462, 45, 36, 23);
		addPlayer.add(txtMonth);
		
		txtYear = new JTextField();
		txtYear.setColumns(10);
		txtYear.setBounds(510, 45, 36, 23);
		addPlayer.add(txtYear);
		
		txtHealth = new JTextField();
		txtHealth.setBounds(158, 241, 361, 139);
		addPlayer.add(txtHealth);
		txtHealth.setColumns(10);
		
		lblHealth = new JLabel("Known Health Issues: ");
		lblHealth.setBounds(33, 285, 140, 51);
		addPlayer.add(lblHealth);
		
		lblPosition = new JLabel("Player Position");
		lblPosition.setBounds(324, 17, 95, 14);
		addPlayer.add(lblPosition);
		
		
		txtPosition = new JTextField();
		txtPosition.setColumns(10);
		txtPosition.setBounds(415, 14, 131, 23);
		addPlayer.add(txtPosition);
		
		lblName = new JLabel("Name");
		lblName.setBounds(105, 14, 39, 14);
		addPlayer.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(159, 14, 130, 23);
		addPlayer.add(txtName);
		txtName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(158, 45, 131, 23);
		addPlayer.add(txtAddress);
		txtAddress.setColumns(10);
		
		lblAddress = new JLabel("Address");
		lblAddress.setBounds(94, 45, 54, 14);
		addPlayer.add(lblAddress);
		
		lblDOB = new JLabel("DOB (dd/mm/yyyy)");
		lblDOB.setBounds(299, 45, 103, 14);
		addPlayer.add(lblDOB);
		
		txtDate = new JTextField();
		txtDate.setBounds(416, 45, 36, 23);
		addPlayer.add(txtDate);
		txtDate.setColumns(10);
		
		lblPostcode = new JLabel("PostCode");
		lblPostcode.setBounds(90, 76, 62, 14);
		addPlayer.add(lblPostcode);
		
		txtPostC = new JTextField();
		txtPostC.setBounds(159, 76, 131, 23);
		addPlayer.add(txtPostC);
		txtPostC.setColumns(10);
		
		lblTel = new JLabel("Tele No");
		lblTel.setBounds(357, 76, 46, 14);
		addPlayer.add(lblTel);
		
		txtTeleNo = new JTextField();
		txtTeleNo.setBounds(417, 76, 131, 23);
		addPlayer.add(txtTeleNo);
		txtTeleNo.setColumns(10);
		
		lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(104, 110, 39, 14);
		addPlayer.add(lblMobile);
		
		txtMobile = new JTextField();
		txtMobile.setBounds(158, 107, 131, 23);
		addPlayer.add(txtMobile);
		txtMobile.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(366, 110, 31, 14);
		addPlayer.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(416, 107, 131, 23);
		addPlayer.add(txtEmail);
		txtEmail.setColumns(10);
		
		lblDoctorName = new JLabel("Doctor Name");
		lblDoctorName.setBounds(71, 149, 80, 14);
		addPlayer.add(lblDoctorName);
		
		txtDocName = new JTextField();
		txtDocName.setBounds(158, 149, 131, 23);
		addPlayer.add(txtDocName);
		txtDocName.setColumns(10);
		
		lblNOK = new JLabel("Next Of Kin");
		lblNOK.setBounds(341, 149, 78, 14);
		addPlayer.add(lblNOK);
		
		txtNOK = new JTextField();
		txtNOK.setBounds(418, 148, 131, 23);
		addPlayer.add(txtNOK);
		txtNOK.setColumns(10);
		
		lblDocTele = new JLabel("Tele No");
		lblDocTele.setBounds(94, 180, 54, 14);
		addPlayer.add(lblDocTele);
		
		txtDocTele = new JTextField();
		txtDocTele.setBounds(158, 180, 131, 23);
		addPlayer.add(txtDocTele);
		txtDocTele.setColumns(10);
		
		separator = new JSeparator();
		separator.setBounds(44, 136, 538, 2);
		addPlayer.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(44, 219, 538, 2);
		addPlayer.add(separator_1);
		
	}
	
	public void setVisible(boolean b) {
		
		
	}
}
