import java.util.*;
public class Array1

{
    static void sum(int n)
    {
        Scanner sc=new Scanner(System.in);
        int evensum=0,oddsum=0,i;
        int a[]=new int[n];
        System.out.println("Enter the array elements ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(i%2==0)
            {
                evensum=evensum+a[i];
            }
            else
            {
                oddsum=oddsum+a[i];
            }
        }
        System.out.println("The sum of even indices is "+evensum+" and the sum of odd indices is "+oddsum);
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n=sc.nextInt();
	    int a[]=new int[n];
		sum(n);
	}
}
