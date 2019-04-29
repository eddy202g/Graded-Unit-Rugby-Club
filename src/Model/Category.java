package Model;

import java.util.ArrayList;

/**
 * 
 * @author Edward Morris
 * @version 1.0.0 May 11 2018
 */
public class Category {
	private String categoryName;

	private ArrayList<Skill> theSkills = new ArrayList<Skill>();
	
	/**
	 * 
	 * @param name - Used to take in the name of the Squad category, e.g. "Junior", "Over's"
	 */
	public Category(String name)
	{		
		this.categoryName = name;
		createSkills1();
	}
	
	/**
	 * Method to build Skill objects
	 */
	public void createSkills1()
	{
		Skill s1 = new Skill(1001, 3, 4, 4, 2, 3, 1, 3, 3, 2, 4, 3, "Passing skills satisfactory", "Side skills need improvement", "Goal potential");
		theSkills.add(s1);
		
		Skill s2 = new Skill(1002, 1, 3, 3, 4, 3, 2, 2, 3, 3, 4, 5, "Standard skills need improvement", "Good overall", "Excellent keeper");
		theSkills.add(s2);
		
		Skill s3 = new Skill(1003, 4, 3, 4, 1, 4, 2, 3, 1, 1, 4, 1, "Great progress", "Front skills need improvement", "Kicking skills need work");
		theSkills.add(s3);
		
		Skill s4 = new Skill(1004, 2, 2, 3, 1, 2, 2, 4, 1, 2, 3, 2, "Passing skills need work", "tackling skills need improvement", "Kicking skills need improvement");
		theSkills.add(s4);
		
		Skill s5 = new Skill(1005, 3, 4, 4, 2, 3, 1, 3, 3, 2, 4, 3, "Passing skills satisfactory", "Side skills need improvement", "Goal potential");
		theSkills.add(s5);
		
		Skill s6 = new Skill(1006, 1, 3, 3, 4, 3, 2, 2, 3, 3, 4, 5, "Standard skills need improvement", "Good overall", "Excellent keeper");
		theSkills.add(s6);
		
		Skill s7 = new Skill(1007, 4, 3, 4, 1, 4, 2, 3, 1, 1, 4, 1, "Great progress", "Front skills need improvement", "Kicking skills need work");
		theSkills.add(s7);
		
		Skill s8 = new Skill(1008, 2, 2, 3, 1, 2, 2, 4, 1, 2, 3, 2, "Passing skills need work", "tackling skills need improvement", "Kicking skills need improvement");
		theSkills.add(s8);
		
		Skill s9 = new Skill(1009, 3, 4, 4, 2, 3, 1, 3, 3, 2, 4, 3, "Passing skills satisfactory", "Side skills need improvement", "Goal potential");
		theSkills.add(s9);
		
		Skill s10 = new Skill(1010, 1, 3, 3, 4, 3, 2, 2, 3, 3, 4, 5, "Standard skills need improvement", "Good overall", "Excellent keeper");
		theSkills.add(s10);
		
		Skill s11 = new Skill(1011, 4, 3, 4, 1, 4, 2, 3, 1, 1, 4, 1, "Great progress", "Front skills need improvement", "Kicking skills need work");
		theSkills.add(s11);
		
		Skill s12 = new Skill(1012, 2, 2, 3, 1, 2, 2, 4, 1, 2, 3, 2, "Passing skills need work", "tackling skills need improvement", "Kicking skills need improvement");
		theSkills.add(s12);
		
		Skill s13 = new Skill(1013, 3, 4, 4, 2, 3, 1, 3, 3, 2, 4, 3, "Passing skills satisfactory", "Side skills need improvement", "Goal potential");
		theSkills.add(s13);
		
		Skill s14 = new Skill(1014, 1, 3, 3, 4, 3, 2, 2, 3, 3, 4, 5, "Standard skills need improvement", "Good overall", "Excellent keeper");
		theSkills.add(s14);
		
		Skill s15 = new Skill(1015, 4, 3, 4, 1, 4, 2, 3, 1, 1, 4, 1, "Great progress", "Front skills need improvement", "Kicking skills need work");
		theSkills.add(s15);
		
		Skill s16 = new Skill(1016, 2, 2, 3, 1, 2, 2, 4, 1, 2, 3, 2, "Passing skills need work", "tackling skills need improvement", "Kicking skills need improvement");
		theSkills.add(s16);
		
		Skill s17 = new Skill(1017, 3, 4, 4, 2, 3, 1, 3, 3, 2, 4, 3, "Passing skills satisfactory", "Side skills need improvement", "Goal potential");
		theSkills.add(s17);
		
		Skill s18 = new Skill(1018, 1, 3, 3, 4, 3, 2, 2, 3, 3, 4, 5, "Standard skills need improvement", "Good overall", "Excellent keeper");
		theSkills.add(s18);
		
		Skill s19 = new Skill(1019, 4, 3, 4, 1, 4, 2, 3, 1, 1, 4, 1, "Great progress", "Front skills need improvement", "Kicking skills need work");
		theSkills.add(s19);
		
		Skill s20 = new Skill(1020, 2, 2, 3, 1, 2, 2, 4, 1, 2, 3, 2, "Passing skills need work", "tackling skills need improvement", "Kicking skills need improvement");
		theSkills.add(s20);
		
		Skill s21 = new Skill(1021, 3, 4, 4, 2, 3, 1, 3, 3, 2, 4, 3, "Passing skills satisfactory", "Side skills need improvement", "Goal potential");
		theSkills.add(s21);
		
		Skill s22 = new Skill(1022, 1, 3, 3, 4, 3, 2, 2, 3, 3, 4, 5, "Standard skills need improvement", "Good overall", "Excellent keeper");
		theSkills.add(s22);
		
		Skill s23 = new Skill(1023, 4, 3, 4, 1, 4, 2, 3, 1, 1, 4, 1, "Great progress", "Front skills need improvement", "Kicking skills need work");
		theSkills.add(s23);
		
		Skill s24 = new Skill(1024, 2, 2, 3, 1, 2, 2, 4, 1, 2, 3, 2, "Passing skills need work", "tackling skills need improvement", "Kicking skills need improvement");
		theSkills.add(s24);
		
		Skill s25 = new Skill(1025, 3, 4, 4, 2, 3, 1, 3, 3, 2, 4, 3, "Passing skills satisfactory", "Side skills need improvement", "Goal potential");
		theSkills.add(s25);
		
		Skill s26 = new Skill(1026, 1, 3, 3, 4, 3, 2, 2, 3, 3, 4, 5, "Standard skills need improvement", "Good overall", "Excellent keeper");
		theSkills.add(s26);
		
		Skill s27 = new Skill(1027, 4, 3, 4, 1, 4, 2, 3, 1, 1, 4, 1, "Great progress", "Front skills need improvement", "Kicking skills need work");
		theSkills.add(s27);
		
		Skill s28 = new Skill(1028, 2, 2, 3, 1, 2, 2, 4, 1, 2, 3, 2, "Passing skills need work", "tackling skills need improvement", "Kicking skills need improvement");
		theSkills.add(s28);
		
		Skill s29 = new Skill(1029, 3, 4, 4, 2, 3, 1, 3, 3, 2, 4, 3, "Passing skills satisfactory", "Side skills need improvement", "Goal potential");
		theSkills.add(s29);
		
		Skill s30 = new Skill(1030, 1, 3, 3, 4, 3, 2, 2, 3, 3, 4, 5, "Standard skills need improvement", "Good overall", "Excellent keeper");
		theSkills.add(s30);
		
		Skill s31 = new Skill(1031, 4, 3, 4, 1, 4, 2, 3, 1, 1, 4, 1, "Great progress", "Front skills need improvement", "Kicking skills need work");
		theSkills.add(s31);
		
		Skill s32 = new Skill(1032, 2, 2, 3, 1, 2, 2, 4, 1, 2, 3, 2, "Passing skills need work", "tackling skills need improvement", "Kicking skills need improvement");
		theSkills.add(s32);
		
		Skill s33 = new Skill(1033, 3, 4, 4, 2, 3, 1, 3, 3, 2, 4, 3, "Passing skills satisfactory", "Side skills need improvement", "Goal potential");
		theSkills.add(s33);
		
		Skill s34 = new Skill(1034, 1, 3, 3, 4, 3, 2, 2, 3, 3, 4, 5, "Standard skills need improvement", "Good overall", "Excellent keeper");
		theSkills.add(s34);
		
		Skill s35 = new Skill(1035, 4, 3, 4, 1, 4, 2, 3, 1, 1, 4, 1, "Great progress", "Front skills need improvement", "Kicking skills need work");
		theSkills.add(s35);
		
		Skill s36 = new Skill(1036, 2, 2, 3, 1, 2, 2, 4, 1, 2, 3, 2, "Passing skills need work", "tackling skills need improvement", "Kicking skills need improvement");
		theSkills.add(s36);
	}
	
	
	/**
	 * 
	 * @return - returns the Skill objects in arraylist, other classes will call this method to access skill objects
	 */
	public ArrayList<Skill> getSkills()
	{
		return theSkills;
	}
	
	/**
	 * 
	 * @return - returns string representation of the Squad Category names
	 */
	public String getCategoryName()
	{
		return categoryName;
	}
	
	/**
	 * @return - Returns string headings and each of the above parameters
	 */
	@Override
	//Polymorphic method that returns a players details
	public String toString()
	{
		return "\nCategory: " + categoryName;
	}

	public int getPlayersID() {

		return 0;
	}

	

	

}
