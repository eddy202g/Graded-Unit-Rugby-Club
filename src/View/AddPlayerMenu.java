package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import Controller.Controller;
import javax.swing.JSeparator;

/**
 * 
 * @author Edward Morris
 * @version 1.0.0 May 11 2018
 */

// Simple menu class that will allow the user to choose between newJunior and NewPlayer screens
public class AddPlayerMenu 
{
	// Reference to the Controller
	private Controller theController;
	
	// List of Swing asset declerations
	private JFrame frame = new JFrame("Simply Rugby - Add Player Menu");
	private JPanel Menu;
	private JPanel panelUsers;
	private JPanel panelLoans;
	private JButton btnQuit;
	private JButton btnBack;
	private JButton btnAddPlayer;
	private JButton btnJunior;
	private JLabel lblFines;
	private JTextPane txtPDisplayLoans;
	private JComboBox comboBoxLoans;
	private JComboBox comboBoxUsers;
	private JTextField textField;
	
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
	public AddPlayerMenu(Controller c)
	{
		theController = c;
		
		// Setup the screen 
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 650, 500);
		Menu = new JPanel();
		frame.setContentPane(Menu);
		Menu.setLayout(null);
		
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
		
		////////////////////////////
		// Series of Buttons and associated ActionListeners
		////////////////////////////
		
		// Button opens NewJuniorScreen 
		btnJunior = new JButton("Add Junior Player");
		btnJunior.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				// New instance of JuniorScreen class
				NewJuniorScreen newjuniorsc = new NewJuniorScreen(c);
				newjuniorsc.setVisible(true);
				
				// Dispose of frame 
				frame.dispose();
			}
		});
		btnJunior.setBounds(142, 170, 140, 67);
		Menu.add(btnJunior);
		
		// Button opens NewPlayerScreen 
		btnAddPlayer = new JButton("Add Player");
		btnAddPlayer.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				// New instance of NewPlayerScreen class
				NewPlayerScreen newplayersc = new NewPlayerScreen(c);
				newplayersc.setVisible(true);
				
				// Dispose of frame 
				frame.dispose();
			}
		});
		btnAddPlayer.setBounds(380, 170, 140, 67);
		Menu.add(btnAddPlayer);
		
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
				Menu.add(btnQuit);
				
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
				Menu.add(btnBack);
				
				JSeparator separator = new JSeparator();
				separator.setBounds(66, 424, 502, 2);
				Menu.add(separator);
		
	}
	
	


	public void setVisible(boolean b) {

		
	}	
}
