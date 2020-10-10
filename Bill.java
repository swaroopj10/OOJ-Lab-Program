import java.util.*;
public class Bill

{
    static void bill(int n)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        double billamt=0,fbill=0;
        int a[]=new int[n];
        int b[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the rate of  item "+(i+1));
            a[i]=sc.nextInt();
            System.out.println("Enter the quantity of item "+(i+1));
            b[i]=sc.nextInt();
            billamt=billamt + (a[i]*b[i]);
        }
        if(billamt>10000)
        {
            fbill=(billamt-(billamt*0.05));
        }
        else if(billamt>=7500 && billamt<10000)
        {
            fbill=(billamt-(billamt*0.03));
        }
        else if(billamt>=5000)
        {
            fbill=(billamt-(billamt*0.02));
        }
        else 
        {
            fbill=billamt;
        }
        System.out.println("The bill amount before discount is "+billamt+" and the bill amount after discount is "+fbill);
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items ");
		int n=sc.nextInt();
	    int a[]=new int[n];
	    int b[]=new int[n];
		bill(n);
	}
}