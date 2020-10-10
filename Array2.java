import java.util.*;
public class Array2

{
    static void sign(int n)
    {
        Scanner sc=new Scanner(System.in);
        int positive=0,negative=0,zero=0,i;
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>0)
            {
                positive++;
            }
            else if(a[i]<0)
            {
                negative++;
            }
            else 
            {
                zero++;
            }
        }
        System.out.println("The number of positive elements= "+positive+" ,the number of negative elements = "+negative+ " and the number of zeros is = "+zero);
            
        
        
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n=sc.nextInt();
		int a[]=new int[n];
		sign(n);
	}
}