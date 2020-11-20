import CIE.Student;
import CIE.Internals;
import CIE.Quiz;
import SEE.Externals;
import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        n = sc.nextInt();
        Student[] st= new Student[n];
        Internals[] in = new Internals[n];
        Quiz[] qz=new Quiz[n];
        Externals[] ext = new Externals[n];
        for(int i = 0;i<in.length;i++)
        {
            System.out.println("Enter Details of Student " + (i+1) + ": ");
            st[i] = new Student();
            st[i].setDetails();
            System.out.println("Enter Internal Marks of Student " + (i+1) + ": ");
            in[i] = new Internals();
            in[i].setMarks();
            System.out.println("Enter Quiz Marks of Student " + (i+1) + ": ");
            qz[i] = new Quiz();
            qz[i].setMarks();
            System.out.println("Enter External Marks of Student " + (i+1) + ": ");
            ext[i]=new Externals();
            ext[i].setMarks();
        }
        for(int i=0;i<in.length;i++)
        {
            System.out.println("Total Marks of student with details:");
            st[i].getDetails();
            for(int j=0;j<5;j++)
            {
                System.out.println("Subject "+(j+1)+" Marks : "+(in[i].internalMarks[j]+ext[i].externalMarks[j]+qz[i].quizMarks[j]));
            }
            


        }
    }
}
