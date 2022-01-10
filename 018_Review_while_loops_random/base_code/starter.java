import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	Random rand = new Random();
	System.out.println("Please insert a random number");
	int a = sc.nextInt();
	int b = rand.nextInt(1001)+1;
	if (a==b)
	{ 
		System.out.println("Good Job!! You got it!");
	}
	while(a!=b)
	{
		System.out.println("Try Again");
		a = sc.nextInt();
		if (a==b)
	{	
		System.out.println("Great Job!! You got it");
		System.out.println("The random number was "+b);
		break;
	}

		
	}
	}
}