package SEE;
import CIE.Student;
import java.util.*;
public class Externals extends Student 
{
    public double[] externalMarks = new double[5];
    Scanner sc = new Scanner(System.in);
    public void setMarks()
    {
        for(int i = 0;i<externalMarks.length;i++)
        {
            System.out.println("Enter External Marks(100) of Subject " + (i+1) + ": ");
            externalMarks[i] = sc.nextDouble()/2;
        }
    }

}
