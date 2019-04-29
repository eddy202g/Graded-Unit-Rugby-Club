package Model;

/**
 * 
 * @author Edward Morris
 * @version 1.0.0 May 11 2018
 */
	public class JuniorPlayer extends Member{
	private String guardian1;
	private String guardian2;
	private String relationship1;
	private String relationship2;
	private String address1;
	private String address2;
	private String telePhone1;
	private String telePhone2;
	private String docName;
	private String docTele;
	private String docAddress;
	private String healthIssues;	
	private String juniorPosition;
	
	/**
	 * 
	 * @param name 
	 * @param address
	 * @param postcode
	 * @param dob
	 * @param telNum
	 * @param mobileNum
	 * @param email
	 * @param guardian1
	 * @param relationship1
	 * @param address1
	 * @param telePhone1
	 * @param guardian2
	 * @param relationship2
	 * @param address2
	 * @param telePhone2
	 * @param docName
	 * @param docTele
	 * @param docAddress
	 * @param healthIssues
	 * @param juniorPosition
	 * @param squadID
	 * - All of the above paramaters are used to build the blueprint for an object, holding a specific peice of 
	 * - information to be collected ad stored in the object
	 */
	
	// Overloaded Constructor to built up JuniorPLayer blueprint
	public JuniorPlayer(String name, String address, String postcode, String dob, String telNum, String mobileNum, String email, 
			String guardian1, String relationship1, String address1, String telePhone1, 
			String guardian2, String relationship2, String address2, String telePhone2, String docName, 
			String docTele, String docAddress, String healthIssues, String juniorPosition, int squadID)
	{
		this.name = name;
		this.address = address;
		this.postcode = postcode;
		this.dob = dob;
		this.telNum = telNum;
		this.mobileNum = mobileNum;
		this.email = email;
		this.guardian1 = guardian1;
		this.relationship1 = relationship1;
		this.address1 = address1;
		this.telePhone1 = telePhone1;
		this.guardian2 = guardian2;
		this.relationship2 = relationship2;
		this.address2 = address2;
		this.telePhone2 = telePhone2;
		this.docName = docName;
		this.docTele = docTele;
		this.docAddress = docAddress;
		this.healthIssues = healthIssues;
		this.juniorPosition = juniorPosition;
		this.squadID = squadID;
		
		// Each object will take the SRU ID and increment it by one, to get a unique SRU
		sruNumber = sruNumber + 1;
		SRU = sruNumber;
	}
	
	@Override
	/**
	 * @return - Returns string headings and each of the above parameters
	 */
	
	public String details()
	{
		return "\nSRU No: " + SRU
		+ "\nName: " + name
		+ "\nAddress: " + address
		+ "\nPostcode: " + postcode
		+ "\nDOB: " + dob
		+ "\nTelephone Number: " + telNum
		+ "\nMobile Number: " + mobileNum
		+ "\nEmail: " + email
		
		+ "\nGuardian 1: " + guardian1
		+ "\nRelationship: " + relationship1
		+ "\nAddress: " + address1
		+ "\nTelephone No:: " + telePhone1
		+ "\nGuardian 2: " + guardian2
		+ "\nRelationship: " + relationship2
		+ "\nAddress: " + address2
		+ "\nTelephone No: " + telePhone2

		+ "\nDoctor: " + docName
		+ "\nDoctor Tele: " + docTele
		+ "\nDoctor Address: " + docAddress
		+ "\nKnown Health Issues: " + healthIssues
		+ "\nPlayer Position: " + juniorPosition;
	}
	
	@Override
	/**
	 *  @return - Returns string headings and each of the above parameters
	 */
	
	//Polymorphic method that returns a players details
	public String toString()
	{
		return "SRU No: " + SRU
				+ "     " + "\nName: " + name;
	}
}
