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
	String DingDongDang = ("Your number was correct, the random number was " + b );
	String Ahnk = ("Your number was incorrect, the random number was " + b);
	String z = ("Your number was larger than the random number. The number was " + b);
	String y = ("Your number was smaller than the random number. The number was " + b);
		if (b==a)
	{
		System.out.println (DingDongDang);
	}
	if (a!=b&&a>b)
	{
		System.out.println(z);
	}
	else if (b!=a)
	{
	System.out.println(Ahnk);
	}
	if (a!=b&&a<b)
	{
		System.out.println(y);
	}
	}

}
