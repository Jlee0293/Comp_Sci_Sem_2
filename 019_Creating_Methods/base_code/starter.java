import java.util.Scanner;
class starter {
	public static void multdiv3(int a, int b) {
	int x = a;
	int y = b;
	int product = x*y;
	if (product%3 == 0){
		System.out.println("Your number is divisible by 3");
		return;
	}
	else{
		System.out.println("Your number is not divisible by 3");
	return;
	}
}

	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Input an Integer");
	int a = sc.nextInt();
	System.out.println("Input another Integer");
	int b = sc.nextInt();
	
	multdiv3(a,b);
	}
}
