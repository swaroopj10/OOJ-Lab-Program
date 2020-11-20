package CIE;
import java.util.*;
import CIE.Student;
public class Internals extends Student
{
    public double internalMarks[]=new double[5];
    Scanner sc= new Scanner(System.in);
    public void setMarks()
    {
        for(int i = 0;i<internalMarks.length;i++)
        {
            System.out.println("Enter Internal Marks(40) of Subject " + (i+1) + ": ");
            internalMarks[i] = sc.nextDouble();
        }
    }
}
