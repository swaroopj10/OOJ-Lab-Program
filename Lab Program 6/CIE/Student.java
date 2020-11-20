package CIE;
import java.util.*;
public class Student 
{
    public String usn;
    public String name;
    public int sem;
    Scanner sc=new Scanner(System.in);

    public void setDetails()
    {
        System.out.println("Enter the Name of the student");
        name=sc.nextLine();
        System.out.println("Enter the USN of the student");
        usn=sc.nextLine();
        System.out.println("Enter the Sem of the student");
        sem=sc.nextInt();

    }
    public void getDetails()
    {
        System.out.println("Name: "+name+"  USN: "+usn+"  Sem: "+sem);
    }
    
}
