import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
		 System.out.println("Please insert your name.");
		 String a = sc.nextLine();
		 System.out.println("How many times do you wish your name to be repeated?");
		 int b = sc.nextInt();
	int count = 0;
	while(true)
	{
		System.out.println(a);
		if(count+1==(b))
		{
			break;
		}
		count = count + 1;
}
	}
}
