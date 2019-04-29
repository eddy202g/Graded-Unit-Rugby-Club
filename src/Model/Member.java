package Model;

/**
 * 
 * @author Edward Morris
 * @version 1.0.0 May 11 2018
 */

// Abstract class, used for the purpose of inheritence, child classes will
// inherit details held in abstract class. There is no functionality present
public abstract class Member {
	
	protected static int sruNumber = 1000; // Used to create unique identifier for each player
	
	protected int SRU; // Used to hold unique identifier
	
	// Details that will  be inherited by child classes
	protected String name;
	protected String address;
	protected String postcode;
	protected String dob;
	protected String dobDate;
	protected String dobMonth;
	protected String dobYear;
	protected String telNum;
	protected String mobileNum;
	protected String email;
	protected int squadID;
	protected int playerAge;

	
	/**
	 * 
	 * @return - Returns members name, accessed by other classes
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * 
	 * @return - Returns SqaudID, accessed by other classes
	 */
	public int getSquadID()
	{
		return squadID;
	}
	
	/**
	 * 
	 * @return - Returns string used for polymorphic methods
	 */
	public String details()
	{
		return "";
	}
	
	/**
	 * 
	 * @return - Returns string used for polymorphic methods
	 */
	public String squadDetails()
	{
		return "";
	}
	
	/**
	 * 
	 * @return - returns player SRU no 
	 */
	public int getSRU()
	{
		return SRU;
	}
}
