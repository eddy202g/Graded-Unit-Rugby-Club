package Model;

/**
 * 
 * @author Edward Morris
 * @version 1.0.0 May 11 2018
 */

// Class that creates blueprint for Skills objects
public class Skill 
{

	private int playerID;
	private int standardSkillRating;
	private int spinSkillRating;
	private int popSkillRating;
	private int frontSkillRating;
	private int rearSkillRating;
	private int sideSkillRating;
	private int scrabbleSkillRating;
	private int dropSkillRating;
	private int puntSkillRating;
	private int grubberSkillRating;
	private int goalSkillRating;
	private String passingComments;
	private String tacklingComments;
	private String kickingComments;
	
	
	/**
	 * 
	 * @param playerID
	 * @param standardSkillRating
	 * @param spinSkillRating
	 * @param popSkillRating
	 * @param frontSkillRating
	 * @param rearSkillRating
	 * @param sideSkillRating
	 * @param scrabbleSkillRating
	 * @param dropSkillRating
	 * @param puntSkillRating
	 * @param grubberSkillRating
	 * @param goalSkillRating
	 * @param passingComments
	 * @param tacklingComments
	 * @param kickingComments
	 * - All of the above paramaters are used to build the blueprint for an object, holding a specific peice of 
	 * - information to be collected ad stored in the object 
	 */
	public Skill(int playerID, int standardSkillRating, int spinSkillRating, int popSkillRating, int frontSkillRating, int rearSkillRating, int sideSkillRating,
			int scrabbleSkillRating, int dropSkillRating, int puntSkillRating, int grubberSkillRating, int goalSkillRating, String passingComments,String tacklingComments,
			String kickingComments)
	{
		
		this.playerID = playerID;
		this.standardSkillRating = standardSkillRating;
		this.spinSkillRating = spinSkillRating;
		this.popSkillRating = popSkillRating;
		this.frontSkillRating = frontSkillRating;
		this.rearSkillRating = rearSkillRating;
		this.sideSkillRating = sideSkillRating;
		this.scrabbleSkillRating = scrabbleSkillRating;
		this.dropSkillRating = dropSkillRating;
		this.puntSkillRating = puntSkillRating;
		this.grubberSkillRating = grubberSkillRating;
		this.goalSkillRating = goalSkillRating;
		this.passingComments = passingComments;
		this.tacklingComments = tacklingComments;
		this.kickingComments = kickingComments;
	}
	
	/**
	 * @return - Returns string headings and each of the above parameters
	 */
	public String passingDetails()
	{
		return	 "\nStandard: " + "	Rating: " + getStandardSkillRating()
					+ "\nSpin: " + "	Rating: " + spinSkillRating
					+ "\nPop: " + "	Rating: " + popSkillRating;
		
	}
	
	/**
	 * @return - Returns string headings and each of the above parameters
	 */
	public String tacklingDetails()
	{
		return	 "\nFront: " + "	Rating: " + frontSkillRating
					+ "\nRear: " + "	Rating: " + rearSkillRating
					+ "\nSide: " + "	Rating: " + sideSkillRating
					+ "\nScrabble: " + "	Rating: " + scrabbleSkillRating;
		
	}
	
	/**
	 * @return - Returns string headings and each of the above parameters
	 */
	public String kickingDetails()
	{
		return	 "\nDrop: " + "Rating: " + dropSkillRating
					+ "\nPunt: " + "Rating: " + puntSkillRating
					+ "\nGrubber: " + "Rating: " + grubberSkillRating
					+ "\nGoal: " + "Rating: " + goalSkillRating;
		
	}
	
	////////////////////////////////////
	// The Following are a series of Getter and Setter methods, used to edit 
	// details, and rewrite the appropriate object 
	////////////////////////////////////
	
	/**
	 * 
	 * @return - Returns Players ID
	 */
	public int getPlayersID() 
	{
		
		return playerID;
	}

	/**
	 * 
	 * @return - Returns standardSkillRating attribute
	 */
	public int getStandardSkillRating() {
		return standardSkillRating;
	}

	/**
	 * 
	 * @param - standardSkillRating - inputs skill rating into object
	 */
	public void setStandardSkillRating(int standardSkillRating) {
		this.standardSkillRating = standardSkillRating;
	}
	
	/**
	 * 
	 * @return - Returns spinSkillRating attribute
	 */
	public int getSpinSkillRating() {
		return spinSkillRating;
	}

	/**
	 * 
	 * @param spinSkillRating - inputs skill rating into object
	 */
	public void setSpinSkillRating(int spinSkillRating) {
		this.spinSkillRating = spinSkillRating;
	}
	
	/**
	 * 
	 * @return - Returns popSkillRating attribute
	 */
	public int getPopSkillRating() {
		return popSkillRating;
	}

	/**
	 * 
	 * @param popSkillRating - inputs skill rating into object
	 */
	public void setPopSkillRating(int popSkillRating) {
		this.popSkillRating = popSkillRating;
	}
	
	/**
	 * 
	 * @return - Returns popSkillRating attribute
	 */
	public int getFrontSkillRating() {
		return frontSkillRating;
	}

	/**
	 * 
	 * @param frontSkillRating - inputs skill rating into object
	 */
	public void setFrontSkillRating(int frontSkillRating) {
		this.frontSkillRating = frontSkillRating;
	}
	
	/**
	 * 
	 * @return - Returns rearSkillRating attribute
	 */
	public int getRearSkillRating() {
		return rearSkillRating;
	}

	/**
	 * 
	 * @param rearSkillRating - inputs skill rating into object
	 */
	public void setRearSkillRating(int rearSkillRating) {
		this.rearSkillRating = rearSkillRating;
	}
	
	/**
	 * 
	 * @return - Returns sideSkillRating attribute
	 */
	public int getSideSkillRating() {
		return sideSkillRating;
	}

	/**
	 * 
	 * @param sideSkillRating - inputs skill rating into object
	 */
	public void setSideSkillRating(int sideSkillRating) {
		this.sideSkillRating = sideSkillRating;
	}
	
	/**
	 * 
	 * @return - Returns scrabbleSkillRating attribute
	 */
	public int getScrabbleSkillRating() {
		return scrabbleSkillRating;
	}

	/**
	 * 
	 * @param scrabbleSkillRating - inputs skill rating into object
	 */
	public void setScrabbleSkillRating(int scrabbleSkillRating) {
		this.scrabbleSkillRating = scrabbleSkillRating;
	}
	
	/**
	 * 
	 * @return - Returns dropSkillRating attribute
	 */
	public int getDropSkillRating() {
		return dropSkillRating;
	}

	/**
	 * 
	 * @param dropSkillRating - inputs skill rating into object
	 */
	public void setDropSkillRating(int dropSkillRating) {
		this.dropSkillRating = dropSkillRating;
	}
	
	/**
	 * 
	 * @return - Returns puntSkillRating attribute
	 */
	public int getPuntSkillRating() {
		return puntSkillRating;
	}

	/**
	 * 
	 * @param puntSkillRating - inputs skill rating into object
	 */
	public void setPuntSkillRating(int puntSkillRating) {
		this.puntSkillRating = puntSkillRating;
	}
	
	/**
	 * 
	 * @return - Returns grubberSkillRating attribute
	 */
	public int getGrubberSkillRating() {
		return grubberSkillRating;
	}

	/**
	 * 
	 * @param grubberSkillRating - inputs skill rating into object
	 */
	public void setGrubberSkillRating(int grubberSkillRating) {
		this.grubberSkillRating = grubberSkillRating;
	}
	
	/**
	 * 
	 * @return - Returns goalSkillRating attribute
	 */
	public int getGoalSkillRating() {
		return goalSkillRating;
	}

	/**
	 * 
	 * @param goalSkillRating - inputs skill rating into object
	 */
	public void setGoalSkillRating(int goalSkillRating) {
		this.goalSkillRating = goalSkillRating;
	}
	
	/**
	 * 
	 * @return - Returns comments
	 */
	public String getPassComments() {
		return passingComments;
	}

	/*
	 * @param passingComments - inputs skill comments into object
	 */
	public void setPassComments(String passingComments) {
		this.passingComments = passingComments;
	}
	
	/**
	 * 
	 * @return - Returns comments
	 */
	public String getTacklingComments() {
		return tacklingComments;
	}

	/**
	 * 
	 * @param tacklingComments - inputs skill comments into object
	 */
	public void setTacklingComments(String tacklingComments) {
		this.tacklingComments = tacklingComments;
	}
	
	/**
	 * 
	 * @return - Returns comments
	 */
	public String getKickingComments() {
		return kickingComments;
	}

	/**
	 * 
	 * @param kickingComments - inputs skill comments into object
	 */
	public void setKickingComments(String kickingComments) {
		this.kickingComments = kickingComments;
	}

	
}
