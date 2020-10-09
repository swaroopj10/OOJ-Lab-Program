import java.util.*;
public class Series
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int i,j,c=0,n;
		System.out.println("Enter the number of rows");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
		    for(j=1;j<=i;j++)
		    {
		        c++;
		        System.out.print(c+" ");
		    }
		    System.out.println();
		}
	}
}