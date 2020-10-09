import java.util.*;
public class Grade
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int CIE,SEE;
            System.out.println("Enter the CIE Marks for the student out of 50");
		CIE=sc.nextInt();
            System.out.println("Enter the SEE Marks for the student out of 100");
		SEE=sc.nextInt();
		float Total=CIE+((float)SEE/2);
                System.out.print("The student has obtained ");
            if(Total>=90&&Total<=100)
               {
                  System.out.print("S Grade");
               }
            else if(Total>=80&&Total<90)
               {
                  System.out.print("A Grade");
               }
            else if(Total>=70&&Total<80)
               {
                  System.out.print("B Grade");
               }
            else if(Total>=60&&Total<70)
               {
                  System.out.print("C Grade");
               }
            else if(Total>=40&&Total<60)
               {
                  System.out.print("D Grade");
               }
            else
              {
                 System.out.print("F Grade");
              }
	}
}