import java.util.*;
public class Quadratic {

	
	static void findRoots(int a, int b, int c)
	{
		

		if (a == 0) {
			System.out.println("Invalid");
			return;
		}

		int d = (b * b) - (4 * a * c);
		double sqrt_val = Math.sqrt(d);

		if (d > 0) {
			System.out.println("Roots are real and different \n");

			System.out.println("The first root is " + (double)(-b + sqrt_val) / (2 * a) + "  and The second root is"	+ (double)(-b - sqrt_val) / (2 * a));
		}
		else if (d == 0) {
			System.out.println("Roots are real and same \n");

			System.out.println("The root is "+ (-(double)b / (2 * a)) );
		}
		else 
		{
			System.out.println("Roots are complex \n");

			
		}
	}

	
	public static void main(String args[])
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b=sc.nextInt();
		System.out.println("Enter the value of c : ");
		int c=sc.nextInt();
		findRoots(a, b, c);
	}
}


