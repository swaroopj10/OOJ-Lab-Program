import java.util.*;
public class Array3

{
    static void arr(int n)
    {
        Scanner sc=new Scanner(System.in);
        int i,j=0,k=0,sum=0,max=0;
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
               c[j]=a[i];
               j++;
            }
            else
            {
                b[k]=a[i];
                k++;
            }
        }
       int min=c[0];
        for(i=0;i<=j;i++)
        {
            sum=sum+c[i];
            if(c[i]>max)
            {
                max=c[i];
            }
        }
        for(i=1;i<=j;i++)
        {
            if(c[i]<min)
            {
                min=c[i];
            }
        }
        double avg=(sum/j);
        System.out.println("In the array C:\n sum of elements= "+sum+"\n average of elements="+avg+"\n Max term="+max+" and Min term="+min);  
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements of array ");
		int n=sc.nextInt();
	    int a[]=new int[n];
	    int b[]=new int[n];
	    int c[]=new int[n];
		arr(n);
	}
}
