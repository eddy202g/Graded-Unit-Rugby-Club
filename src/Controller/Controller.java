package Controller;

import java.util.ArrayList;





import java.util.Iterator;

import Model.Category;
import Model.JuniorPlayer;
import Model.Member;
import Model.Player;
import Model.Skill;
import Model.Squad;
import View.Menu;



/**
 * 
 * @author Edward Morris
 * @version 1.0.0 May 11 2018
 */
public class Controller 
{
	public int currentPlayerSRU; // create a public variable that will make the current player ID accessible across all classes 
	public int currentSquadID; // create a public variable that will make the current Squad ID accessible across all classes 
	protected ArrayList<Squad> theSquads = new ArrayList<Squad>(); // Arraylist for squads 
	private static Squad theSquad = new Squad(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	private static Category theCategories = new Category(null);
	private static Player thePlayer = new Player(null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, 0);
	
	/**
	 * 
	 * @return - returns a reference to squad class 
	 */
	public static Squad getSquadClass()
	{
		return theSquad;
	}
	
	/**
	 * 
	 * @return - returns a reference to Player class
	 */
	public static Player getPlayerClass()
	{
		return thePlayer;
	}
	
	/**
	 * 
	 * @return - returns a reference to Category class
	 */
	public static Category getCategory()
	{
		return theCategories;
	}
	
	/**
	 * 
	 * @return - used as a reference for other classes to access squad objects 
	 */
	public ArrayList<Squad> getSquads()
	{
		return theSquads;
	}
	
	/**
	 * Initialises the "menu" screen, and the method holding Squad objects 
	 */
	public Controller()
	{	
		menuScreen();
		buildSquadList();
	}
	
	/**
	 * Method that holds squad objects
	 */
	private void buildSquadList()
	{
		Squad sq1 = new Squad("Junior", 1, 1019, 1020, 1021, 1022, 1023, 1024, 1025, 1026, 1027);
		theSquads.add(sq1);
		
		Squad sq2 = new Squad("Over's", 2, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009);
		theSquads.add(sq2);
	}
	
	/**
	 * Method that creates a new Instance of Menu class
	 */
	private void menuScreen()
	{
		Menu menu = new Menu(this);
		menu.setController(this);	
	}
}
