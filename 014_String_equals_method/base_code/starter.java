import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String question = ("Would you be a Wizard, Warrior, or a Rogue?");
	System.out.println(question);
	String a = sc.nextLine();
	String answer1 = ("Wizard"); 
	String answer2 = ("Warrior");
	String answer3 = ("Rogue");
	String Wiz = ("You have chosen the Wizard!!");
	String War = ("You have chosen the Warrior!!");
	String Rog = ("You have chosen the Rogue!!");
	String dad = ("There seems to be an error.. Please select one of the Three roles.");
	if (a.equals (answer1))
	{
		System.out.println(Wiz);
	}
	else if (a.equals (answer2))
	{
		System.out.println(War);
	}
	else if (a.equals (answer3))
	{
		System.out.println(Rog);
	}
	else if(!a.equals(answer1))
	{
			System.out.println(dad);
	}
	else if(!a.equals(answer2))
	{
			System.out.println(dad);
	}
	else if(!a.equals(answer3))
	{
			System.out.println(dad);
	}	
		}
}