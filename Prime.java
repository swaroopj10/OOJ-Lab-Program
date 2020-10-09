import java.util.* ;
public class Prime
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int a,b,i=0,j=0,c=0;
		System.out.println("Enter the starting and ending numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The Prime numbers are");
		for(i=a;i<=b;i++)
		{
		    for(j=1;j<=i;j++)
		    {
		        if(i%j==0)
		        c++;
		    }
		    if(c==2)
		    System.out.println(i);
		    c=0;
		}
		
	}
}
