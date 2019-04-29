package Model;

import java.util.ArrayList;

/**
 * 
 * @author Edward Morris
 * @version 1.0.0 May 11 2018
 */

// Class to create blueprint for Player objects. Inherits the attributes of the parent class
public class Player extends Member {
	
	private String nextOfKin;
	private String nextOfKinTele;
	private String doctor;
	private String doctorTele;
	private String healthIssues;
	private String playerPosition;

	private ArrayList<Category> theCategories = new ArrayList<Category>(); // Arraylist to hold category objects
	
	/**
	 * 
	 * @param name
	 * @param address
	 * @param postcode
	 * @param dobDate
	 * @param dobMonth
	 * @param dobYear
	 * @param playerAge
	 * @param telNum
	 * @param mobileNum
	 * @param email
	 * @param nextOfKin
	 * @param nextOfKinTele
	 * @param doctor
	 * @param doctorTele
	 * @param healthIssues
	 * @param playerPosition
	 * @param squadID
	 * - All of the above paramaters are used to build the blueprint for an object, holding a specific peice of 
	 * - information to be collected ad stored in the object 
	 */
	
	// Overloaded Constructor to built up Player blueprint
	public Player (String name, String address, String postcode, String dobDate, String dobMonth, String dobYear, int playerAge, String telNum, String mobileNum, String email,
	String nextOfKin, String nextOfKinTele, String doctor,
			String doctorTele, String healthIssues, String playerPosition, int squadID)
	{

		this.name = name;
		this.address = address;
		this.postcode = postcode;
		this.dobDate = dobDate;
		this.dobDate = dobMonth;
		this.dobDate = dobYear;
		this.playerAge = playerAge;
		this.telNum = telNum;
		this.mobileNum = mobileNum;
		this.email = email;
		this.nextOfKin = nextOfKin;
		this.nextOfKinTele = nextOfKinTele;
		this.doctor = doctor;
		this.doctorTele = doctorTele;
		this.healthIssues = healthIssues;
		this.playerPosition = playerPosition;
		this.squadID = squadID;
		
		// Each object will take the SRU ID and increment it by one, to get a unique SRU
		sruNumber = sruNumber + 1;
		SRU = sruNumber;
		
		// Build Category objects
		Category cat1 = new Category("Passing");
		theCategories.add(cat1);
		
		Category cat2 = new Category("Tackling");
		theCategories.add(cat2);
		
		Category cat3 = new Category("Kicking");
		theCategories.add(cat3);

	}
	
	/**
	 * 
	 * @return - Return category objects
	 */
	public ArrayList<Category> getCategory()
	{
		return theCategories;
	}
	
	@Override
	/**
	 * @return - Returns string headings and each of the above parameters
	 */
	
	//Polymorphic method that returns a players details
	public String details()
	{
		return "\nSRU No: " + SRU 
				+ "\nName: " + name
				+ "\nAddress: " + address
				+ "\nPostcode: " + postcode
				+ "\nAge: " + playerAge
				+ "\nTelephone Number: " + telNum
				+ "\nMobile Number: " + mobileNum
				+ "\nEmail: " + email
				+ "\nNext of Kin: " + nextOfKin
				+ "\nNext of Kin Tele: " + nextOfKinTele
				+ "\nDoctor: " + doctor
				+ "\nDoctor Tele: " + doctorTele
				+ "\nKnown Health Issues: " + healthIssues
				+ "\nPlayer Position: " + playerPosition;
	}
	
	@Override
	/**
	 * @return - Returns string headings and each of the above parameters
	 */
	
	//Polymorphic method that returns a players details
	public String squadDetails()
	{
		return "\nName: " + name
				+ "\nPlayer Position: " + playerPosition;
	}
	
	@Override
	/**
	 * @return - Returns string headings and each of the above parameters
	 */
	
	//Polymorphic method that returns a players details
	public String toString()
	{
		return "SRU No: " + SRU
				+ "     " + "\nName: " + name;
	}
	
	/**
	 * 
	 * @return - Return Skill Category
	 */
	public ArrayList<Member> getSkillCat() {
		// TODO Auto-generated method stub
		return null;
	}

}
