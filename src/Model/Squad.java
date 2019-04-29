package Model;

import java.util.ArrayList;

/**
 * 
 * @author Edward Morris
 * @version 1.0.0 May 11 2018
 */

// Builds blueprint for Squad objects
public class Squad {
	
	private String squadName;
	private int squadID;
	private int fullBackID;
	private int WingID;
	private int CentreID;
	private int flyHalfID;
	private int scrumHalfID;
	private int hookerID;
	private int propID;
	private int secondRowID;
	private int backRowID;

	
	protected ArrayList<Member> addNewMember = new ArrayList<Member>(); // Arraylist to build Member objects
	
	/**
	 * 
	 * @param squadName
	 * @param squadID
	 * @param fullBackID
	 * @param WingID
	 * @param CentreID
	 * @param flyHalfID
	 * @param scrumHalfID
	 * @param hookerID
	 * @param propID
	 * @param secondRowID
	 * @param backRowID
	 * - All of the above paramaters are used to build the blueprint for an object, holding a specific peice of 
	 * - information to be collected ad stored in the object 
	 */
	public Squad(String squadName, int squadID, int fullBackID, int WingID, int CentreID, int flyHalfID, int scrumHalfID, int hookerID, int propID, int secondRowID, int backRowID)
	{
		this.squadName = squadName;
		this.squadID = squadID;
		this.fullBackID = fullBackID;	
		this.WingID = WingID;
		this.CentreID = CentreID;
		this.flyHalfID = flyHalfID;
		this.scrumHalfID = scrumHalfID;
		this.hookerID = hookerID;
		this.propID = propID;
		this.secondRowID = secondRowID;
		this.backRowID = backRowID;
		
		createPlayersList();
	}
	
	/**
	 * Method used to build up Players objects
	 */
	public void createPlayersList()
	{
		Player p1 = new Player("Eddy M", "55 L Lane", "KY2 0EC", "22", "03", "2000", 18, "01356087963", "07923161616", "eddy1@hmail.com", 
				"Hannah F", "01313456789", "Dr. B", "01312456654", "None", "Full Back", 2);
		addNewMember.add(p1);

		Player p2 = new Player("Jude S", "4 Main Street", "KY4 2ZS", "13", "03", "2001", 17, "01592873678", "07773456001", "jude1@hmail.com", 
				"Ann S", "01592643221", "Dr. D", "01592231649", "Knee Injury", "Wing", 2);
		addNewMember.add(p2);
		
		Player p3 = new Player("Simon G", "101 Loudon Cresent", "KY9 3FB", "01", "05", "2001", 17, "01592890147", "07648812640", "sim1@hmail.com", 
				"Barbara G", "01592874655", "Dr. D", "01592845786", "None", "Centre", 2);
		addNewMember.add(p3);
		
		Player p4 = new Player("Ben H", "41 Mersey Street", "KY7 8HF", "29", "07", "2000", 17, "01592800965", "07001768821", "benh@hmail.com", 
				"Greig H", "01592592790", "Dr. Snow", "01592890037", "None", "Fly half", 2);
		addNewMember.add(p4);
		
		Player p5 = new Player("Alexander C", "13a King Street", "KY9 4RT", "21", "12", "1999", 18, "01592871390", "07991455892", "zander@hmail.com", 
				"Tracy T", "01592897340", "Dr. Davis", "01592891668", "Ankle Injury", "Scrum half", 2);
		addNewMember.add(p5);
		
		Player p6 = new Player("Sven B", "12 Raven Road", "KY4 4EC", "16", "01", "2000", 18, "01592873901", "07817129006", "SB1@hmail.com", 
				"Lyle B", "01592643223", "Dr. Frew", "01592231601", "Elbow Injury", "Hooker", 2);
		addNewMember.add(p6);
		
		Player p7 = new Player("Zak L", "42 M Lane", "KY9 2ER", "19", "01", "1998", 19, "01235645421", "07817988765", "zak1@hmail.com", 
				"Alan P", "01325643221", "Dr. C", "01312316497", "Back Injury", "Prop", 2);
		addNewMember.add(p7);
		
		Player p8 = new Player("Adrian V", "90 Craigs Street", "KY5 6TB", "11", "03", "2000", 18, "01592874410", "07707692678", "Adv1@hmail.com", 
				"Scott V", "01592874410", "Dr. D", "01592231649", "None", "2nd row", 2);
		addNewMember.add(p8);
		
		Player p9 = new Player("Ross B", "48 Main Drive", "KY9 4XD", "02", "10", "2000", 17, "01592871194", "07004893889", "rosso@hmail.com", 
				"Robert B", "01592643221", "Dr. Frew", "01592231601", "Knee Injury", "Back row", 2);
		addNewMember.add(p9);
		
		Player p10 = new Player("Johnathan E", "56 Loan Street", "KY5 5TF", "17", "02", "1999", 18, "01592878834", "07147990478", "johnny1@hmail.com", 
				"Anna S", "01592873123", "Dr. Davis", "01592891668", "Shoulder Injury", "Full back", 2);
		addNewMember.add(p10);
		
		Player p11 = new Player("Evan F", "15 Grange Road", "KY3 9NA", "31", "12", "2000", 17, "01592870478", "07902336789", "evan1@hmail.com", 
				"Rod F", "01592870478", "Dr. Snow", "01592890037", "None", "Wing", 2);
		addNewMember.add(p11);
		
		Player p12 = new Player("Finn A", "22 Dove Grove", "KY4 7YM", "06", "05", "2001", 17, "01592873056", "07773456285", "finna1@hmail.com", 
				"Chris A", "01592873056", "Dr. D", "01592231649", "Foot Injury", "Centre", 2);
		addNewMember.add(p12);
		
		Player p13 = new Player("Thomas G", "90 Fuller Drive", "KY3 2JS", "24", "207", "2000", 17,"01592874908", "07003456001", "tg1@hmail.com", 
				"Thomas G", "01592874907", "Dr. D", "01592231649", "None", "Fly half", 2);
		addNewMember.add(p13);
		
		Player p14 = new Player("Garry D", "10 Garden Street", "KY4 9YL", "03", "04", "2001", 17, "015928711847", "07712002904", "gd1@hmail.com", 
				"Esme F", "01592879378", "Dr. Davis", "01592891668", "Knee Injury", "Scrum half", 2);
		addNewMember.add(p14);
		
		Player p15 = new Player("Gregor C", "8 Foxton Lane", "KY8 8HX", "19", "07", "2000", 18, "01592870057", "07227469057", "gregc1@hmail.com", 
				"Colin C", "01592870058", "Dr. Frew", "01592231601", "Knee Injury", "Hooker", 2);
		addNewMember.add(p15);
		
		Player p16 = new Player("Samuel H", "106b Low Street", "KY7 8TY", "17", "03", "2001", 17, "01592877610", "07780091297", "sammyh1@hmail.com", 
				"Sharon H", "01592877609", "Dr. Snow", "01592890037", "None", "Prop", 2);
		addNewMember.add(p16);
		
		Player p17 = new Player("Harry N", "28 Freedom Road", "KY4 5FG", "13", "04", "1998", 20, "01592875009", "07645099287", "harry1@hmail.com", 
				"Elliot N", "01592875239", "Dr. D", "01592231649", "None", "2nd row", 2);
		addNewMember.add(p17);
		
		Player p18 = new Player("Joseph G", "66 Hill Street", "KY3 5MA", "11", "01", "1999", 19, "01592860933", "07974927498", "jojo1@hmail.com", 
				"Isabella G", "01592860934", "Dr. Davis", "01592891668", "Wrist Injury", "Back row", 2);
		addNewMember.add(p18);
		

		JuniorPlayer jp1 = new JuniorPlayer("Andy R", "21 Oak Lane", "PO2 8OK", "13/05/2005", "01234654321", "07654321123", "Andy1@hmail.com", "Lisa R", "Mother", 
				"21 Oak Lane", "07546133232", "Ann A", "Grandmother", "12 D Lane", "07412544564", "Dr. C", "01312316497", "102 D Lane", "None", "Full Back", 1);
		addNewMember.add(jp1);
		
		JuniorPlayer jp2 = new JuniorPlayer("Steven P", "32 D Lane", "KY6 7HG", "21/03/2006", "01234635241", "07654013464", "Steven1@hmail.com", "Andrew P", "Father", 
				"32 D Lane", "07431256431", "Shirley T", "Grandmother", "12 E Lane", "07171829371", "Dr. C", "01312316497", "102 D Lane", "None", "Wing", 1);
		addNewMember.add(jp2);	
		
		JuniorPlayer jp3 = new JuniorPlayer("Eric S", "1 Grove Street", "KY6 7HI", "31/12/2002", "01234568342", "07700394856", "ES@hmail.com", "David S", "Father", 
				"1 Grove Street", "07892736445", "Eva S", "Mother", "1 Grove St", "07892128549", "Dr. C", "01312316497", "102 D Lane", "Ankle injury", "Centre", 1);
		addNewMember.add(jp3);	
		
		JuniorPlayer jp4 = new JuniorPlayer("Tony K", "22 King Cresent", "KY3 7UN", "29/12/2003", "01234500136", "07890112583", "TTK@hmail.com", "Ellen K", "Mother", 
				"22 King Cresent", "07890584903", "Eoin K", "Father", "22 King Cresent", "07890113729", "Dr. Davis", "01592891668", "97 Baronscourt Row", "Elbow injury", "Fly Half", 1);
		addNewMember.add(jp4);
		
		JuniorPlayer jp5 = new JuniorPlayer("Graham W", "9 North Road", "KY5 7AB", "23/10/2002", "01234904866", "07775058921", "GrahamW@hmail.com", "Elouise W", "Mother", 
				"4 Bellvue", "07890965844", "William W", "Father", "4 Bellvue", "07890115374", "Dr. Davis", "01592891668", "97 Baronscourt Row", "None", "Scrum Half", 1);
		addNewMember.add(jp5);
		
		JuniorPlayer jp6 = new JuniorPlayer("James C", "5 Hilltop Street", "KY3 7EB", "14/09/2001", "01234504333", "07890562344", "Jamc@hmail.com", "Michelle G", "Granmother", 
				"5 Hilltop Street", "07890584346", "Janet C", "Mother", "2 Viewpoint Row", "07890345788", "Dr. C", "01312316497", "102 D Lane", "Foot injury", "Hooker", 1);
		addNewMember.add(jp6);
		
		JuniorPlayer jp7 = new JuniorPlayer("Sam N", "301 Willowbay", "KY3 5HG", "11/01/2004", "01234076228", "07730471138", "Sam3@hmail.com", "Helen N", "Mother", 
				"301 Willowbay", "07748937726", "Sean N", "Father", "301 Willowbay", "07890094889", "Dr. C", "01312316497", "102 D Lane", "None", "Prop", 1);
		addNewMember.add(jp7);
		
		JuniorPlayer jp8 = new JuniorPlayer("Liam D", "63 Rosey Lane", "KY4 5FM", "16/06/2005", "01234573292", "07735740329", "LiamDD@hmail.com", "Sophie D", "Mother", 
				"63 Rosey Lane", "07742579726", "Steve D", "Father", "3 Forrest Place", "07890436898", "Dr. C", "01312316497", "102 D Lane", "None", "2nd Row", 1);
		addNewMember.add(jp8);
		
		JuniorPlayer jp9 = new JuniorPlayer("Heath D", "9 Driveway Road", "KY4 2FG", "01/10/2003", "01234120984", "07504398588", "HD2@hmail.com", "Sara F", "Mother", 
				"23 Grange Grove", "07891406584", "Wilson D", "Father", "9 Driveway Road", "07950183704", "Dr. Davis", "01592891668", "97 Baronscourt Row", "None", "Back Row", 1);
		addNewMember.add(jp9);
		
		JuniorPlayer jp10 = new JuniorPlayer("Elroy V", "3 Sunny Road", "KY2 8FA", "07/05/2003", "01234947300", "07948588270", "elroy@hmail.com", "Vera V", "Mother", 
				"3 Sunny Road", "07899837609", "Walter V", "Grandfather", "19 Western Drive", "07970482019", "Dr. Davis", "01592891668", "97 Baronscourt Row", "Diabetes", "Full Back", 1);
		addNewMember.add(jp10);
		
		JuniorPlayer jp11 = new JuniorPlayer("Howard S", "209 Beeslack Road", "KY6 5XW", "21/02/2004", "01209848633", "07503988422", "Howies@hmail.com", "Flora C", "Mother", 
				"209 Beeslack Road", "07848449300", "Dan R", "Uncle", "48 Jewel Road", "07953437540", "Dr. Davis", "01592891668", "97 Baronscourt Row", "Asthma", "Wing", 1);
		addNewMember.add(jp11);
		
		JuniorPlayer jp12 = new JuniorPlayer("Gregg F", "94 Gateshead", "KY3 3RT", "12/08/2005", "03284572092", "07735722955", "GG4@hmail.com", "Nicole F", "Mother", 
				"94 Gateshead", "07745422566", "Arron F", "Father", "94 Gateshead", "074505489288", "Dr. C", "01312316497", "102 D Lane", "None", "Centre", 1);
		addNewMember.add(jp12);
		
		JuniorPlayer jp13 = new JuniorPlayer("Alistair T", "401 Park Place", "KY2 4DQ", "11/04/2005", "01234592489", "07329488701", "Ali401@hmail.com", "Clara T", "Mother", 
				"401 Park Place", "07742625478", "Felix T", "Father", "36 Reading Court", "07893979350", "Dr. Wang", "01318402175", "78 High Street", "None", "Fly Half", 1);
		addNewMember.add(jp13);
		
		JuniorPlayer jp14 = new JuniorPlayer("Neil B", "633 Town Road", "KY2 7YU", "18/01/2003", "01329393029", "07732957887", "NeilBB@hmail.com", "Lucy S", "Mother", 
				"633 Town Road", "07742565465", "Tim B", "Father", "289 Church Row", "07859378910", "Dr. Wang", "01318402175", "78 High Street", "None", "Scrum Half", 1);
		addNewMember.add(jp14);
		
		JuniorPlayer jp15 = new JuniorPlayer("Mark E", "7/8 Clark Street", "KY2 4DT", "17/02/2005", "01424728489", "07732759481", "markie@hmail.com", "Bethan E", "Mother", 
				"7/8 Clark Street", "07748590038", "Tim E", "Father", "7/8 Clark Street", "07895045890", "Dr. Wang", "01318402175", "78 High Street", "None", "Hooker", 1);
		addNewMember.add(jp15);
		
		JuniorPlayer jp16 = new JuniorPlayer("Colin Y", "77a Carp Place", "KY2 6BV", "09/04/2005", "01234956709", "07018508550", "Col7@hmail.com", "Alice H", "Mother", 
				"40 Glow Place", "07745428498", "Peter Y", "Father", "77a Carp Place", "07893979690", "Dr. Wang", "01318402175", "78 High Street", "Collar Bone injury", "Prop", 1);
		addNewMember.add(jp16);
		
		JuniorPlayer jp17 = new JuniorPlayer("Oliver M", "6/9 Hill Road", "KY3 5ER", "23/07/2002", "01245394880", "077394870158", "Ollie2@hmail.com", "Margaret T", "Auntie", 
				"6/9 Hill Road", "07742625461", "Frank M", "Father", "6/9 Hill Road", "07893979034", "Dr. Wang", "01318402175", "78 High Street", "None", "2nd Row", 1);
		addNewMember.add(jp17);
		
		JuniorPlayer jp18 = new JuniorPlayer("Lewis J", "14 Green Close", "KY2 3YQ", "10/03/2005", "01234592009", "077329488524", "Lewis3@hmail.com", "Janet J", "Mother", 
				"14 Green Close", "07742625489", "George J", "Father", "14 Green Close", "07893948070", "Dr. C", "01312316497", "102 D Lane", "Wrist injury", "Back Row", 1);
		addNewMember.add(jp18);	
	}
	
	
	/**
	 * 
	 * @param members - Temporary variable used to insert new player object into arraylist
	 */
	public void addPlayers(Member members)
	{
		addNewMember.add(members);
	}
	
	/**
	 * 
	 * @return - Returns member objects
	 */
	public ArrayList<Member> getMembers()
	{
		return addNewMember;
	}
	
	/**
	 * @return - Returns string headings and each of the above parameters
	 */
	
	//Polymorphic method that returns a Squads details
	public String squadDetails() 
	{
		return "\nSquad: " + squadName
			+ "\nSquad ID: " + squadID
			+ "\nFull Back: " + fullBackID
		+ "\nWing: " + WingID
		+ "\nCentre: " + CentreID
		+ "\nFly Half: " + flyHalfID
		+ "\nScrum Half: " + scrumHalfID
		+ "\nHooker: " + hookerID
		+ "\nProp: " + propID
		+ "\nSecond Row: " + secondRowID
		+ "\nBack Row: " + backRowID;
				
	}
	
	@Override
	/**
	 * @return - Returns string headings and each of the above parameters
	 */
	
	//Polymorphic method that returns a players details
	public String toString()
	{
		return "\n    Full Back: " + fullBackID
		+ "\n    Wing: " + WingID
		+ "\n    Centre: " + CentreID
		+ "\n    Fly Half: " + flyHalfID
		+ "\n    Scrum Half: " + scrumHalfID
		+ "\n    Hooker: " + hookerID
		+ "\n    Prop: " + propID
		+ "\n    Second Row: " + secondRowID
		+ "\n    Back Row: " + backRowID;
	}
	
	////////////////////////////////////
	// The Following are a series of Getter and Setter methods, used to edit 
	// details, and rewrite the appropriate object 
	////////////////////////////////////
	
	/**
	 * 
	 * @return - Returns Squad Name
	 */
	public String getSquadName()
	{
		return squadName;
	}

	/**
	 * 
	 * @param squadName - Sets user input into object
	 */
	public void setSquadName(String squadName) {
		this.squadName = squadName;
	}
	
	/**
	 * 
	 * @return - Returns squadID Name
	 */
	public int getSquadID() {
		return squadID;
	}

	/**
	 * 
	 * @param squadID - Sets user input into object
	 */
	public void setSquadID(int squadID) {
		this.squadID = squadID;
	}
	
	/**
	 * 
	 * @return - Returns fullBackID 
	 */
	public int getFullBackID()
	{
		return fullBackID;
		
	}
	
	/**
	 * 
	 * @param fullBackID - Sets user input into object
	 */
	public void setFullBackID(int fullBackID) {
		this.fullBackID = fullBackID;
	}
	
	/**
	 * 
	 * @return - Returns WingID
	 */
	public int getWingID()
	{
		return WingID;		
	}
	
	/**
	 * 
	 * @param WingID - Sets user input into object
	 */
	public void setWingID(int WingID) {
		this.WingID = WingID;
	}
	
	/**
	 * 
	 * @return - Returns CentreID
	 */
	public int getCentreID()
	{
		return CentreID;		
	}
	/**
	 * 
	 * @param CentreID - Sets user input into object
	 */
	public void setCentreID(int CentreID) {
		this.CentreID = CentreID;
	}
	
	/**
	 * 
	 * @return - Returns flyHalfID
	 */
	public int getFlyHalfID()
	{
		return flyHalfID;		
	}
	
	/**
	 * 
	 * @param flyHalfID - Sets user input into object
	 */
	public void setFlyHalfID(int flyHalfID) {
		this.flyHalfID = flyHalfID;
	}
	
	/**
	 * 
	 * @return - Returns scrumHalfID
	 */
	public int getScrumHalfID()
	{
		return scrumHalfID;		
	}
	
	/**
	 * 
	 * @param scrumHalfID - Sets user input into object
	 */
	public void setScrumHalfID(int scrumHalfID) {
		this.scrumHalfID = scrumHalfID;
	}
	
	/**
	 * 
	 * @return - Returns hookerID
	 */
	public int getHookerID()
	{
		return hookerID;		
	}
	
	/**
	 * 
	 * @param hookerID - Sets user input into object
	 */
	public void setHookerID(int hookerID) {
		this.hookerID = hookerID;
	}
	
	/**
	 * 
	 * @return - Returns propID
	 */
	public int getPropID()
	{
		return propID;		
	}
	
	/**
	 * 
	 * @param propID - Sets user input into object
	 */
	public void setPropID(int propID) {
		this.propID = propID;
	}
	
	/**
	 * 
	 * @return - Returns secondRowID
	 */
	public int getSecRowID()
	{
		return secondRowID;		
	}
	
	/**
	 * 
	 * @param secondRowID - Sets user input into object
	 */
	public void setSecRowID(int secondRowID) {
		this.secondRowID = secondRowID;
	}
	
	/**
	 * 
	 * @return - Returns backRowID
	 */
	public int getBackRowID()
	{
		return backRowID;		
	}
	
	/**
	 * 
	 * @param backRowID - Sets user input into object
	 */
	public void setBackRowID(int backRowID) {
		this.backRowID = backRowID;
	}
}
