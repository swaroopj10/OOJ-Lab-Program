package CIE;
import CIE.Student;
import java.util.*;
public class Quiz extends Student
{
    public double quizMarks[] = new double[5];
    Scanner sc = new Scanner(System.in);
    public void setMarks()
    {
        
        for(int i = 0;i<quizMarks.length;i++)
        {
            System.out.println("Enter Quiz Marks of Subject "+(i+1)+" (out of 10)");
            quizMarks[i] = sc.nextDouble();
        }
    }

}
