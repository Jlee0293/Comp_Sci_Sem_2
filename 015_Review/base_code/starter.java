import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
String name = ("What is your name?");
System.out.println(name);
String ab = sc.nextLine();
String title = ("What is your title? Ex. Hero of Good");
System.out.println(title);
String ac = sc.nextLine();
	
 System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
String A = sc.nextLine();
if (A.equals("Wizard")){
System.out.println("You've chosen the Wizard! Excelsior!");
}
else if (A.equals ("wizard")){
System.out.println("You've chosen the Wizard! Excelsior!");
}
else if (A.equals ("Warrior")){
System.out.println("You've chosen the Warrior! For Honor!");
}
else if (A.equals ("warrior")){
System.out.println("You've chosen the Warrior! For Honor!");
}
else if (A.equals ("Rogue")){
System.out.println("You've chosen the Rogue! How Cunning!");
}
else if (A.equals ("rogue")){
System.out.println("You've chosen the Rogue! How Cunning!");
}
else {
System.out.println("You've decided not to choose a role. Rerun program.");
}
	String b = ("You have a total of 25 points to spend on the following traits : Strngth, Dexterity, Intelligiance, Consitution and Charisma.");
	System.out.println(b);
	String strength = ("Strength (1-10)");
	System.out.println(strength);
	int sq = sc.nextInt ();
	int sw = 25 - sq;
	if (sq<=10)
	{
		System.out.println("You have " + sw + " points left.");
	}
	else if ( sq>10)
	{
		System.out.println("You cannot spend more than 10 points. Please insert a smaller number.");
	sq = sc.nextInt ();
	}
	
	String Dexterity = ("Dexterity (1-10)");
	System.out.println(Dexterity);
	int se = sc.nextInt ();
	int sr = sw-se;
if (sr<=10)
	{
		System.out.println("You have " + sr + " points left. ");
	}
	else if ( sr>10)
	{
		System.out.println("You cannot spend more than 10 points. Please insert a smaller number.");
	se = sc.nextInt ();
	}

	String Intelligiance  = ("Intelligiance (1-10)");
	System.out.println(Intelligiance);
	int st = sc.nextInt ();
	int sy = sr-st;
if (sy<=10)
	{
		System.out.println("You have " + sy + " points left. ");
	}	
else if ( sy>10)
	{
		System.out.println("You cannot spend more than 10 points. Please insert a smaller number.");
	st = sc.nextInt ();
	}		

	String Consitution = ("Consitution (1-10)");
	System.out.println(Consitution);
	int su = sc.nextInt ();
	int ss = sy-su;
	if (ss<=10)
	{
		System.out.println("You have " + ss + " points left. ");
	}
	else if (ss>10)
	{
		System.out.println("You cannot spend more than 10 points. Please insert a smaller number.");
	 su = sc.nextInt ();
	}
	
	String Charisma = ("Charisma (1-10)");
	System.out.println(Charisma);
	int si = sc.nextInt ();
	int sd = ss-si;
	if (sd<=10)
	{
		System.out.println("You have " + sd + " points left. ");
	}
	else if ( sd!=10)
	{
		System.out.println("You cannot spend more than 10 points. Please insert a smaller number.");
		 si = sc.nextInt ();
	}
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("You are " + ab + "," + " the " + ac + (" of CVHS." ));
		System.out.println("You're a " + A + " with the following stats!");
		System.out.println("Strength - " + sq);
		System.out.println("Dexterity - " + se);
		System.out.println("Intelligence - " + st);
		System.out.println("Constitution - " + su);
		System.out.println("Charisma - " + si);
		System.out.println("     ");
		System.out.println("Good Luck on your quest " + ab + "!");
		System.out.println("-----------------------------------------------------------------");
		
		
		
		
		
	}
}