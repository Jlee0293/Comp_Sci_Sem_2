import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc= new Scanner (System.in);
	Random rand = new Random();
	String Cool = ("Pick a number between 1 - 1000");
	System.out.println(Cool);
	int a = sc.nextInt();
	int b = rand.nextInt(1000)+1;
	String DingDongDang = ("Your anwer was correct, the random number was " + b);
	String Ahnk = ("Your answer was incorrect, the random number was " + b);
	if (b==a)
	{
		System.out.println (DingDongDang);
	}
	
	else if (b!=a)
	{
	System.out.println(Ahnk);
	}
	}
}
