import java.util.*;
public class Student
{
 String USN;
 String name;
 int credits[];
 int marks[];
 int i,n,tot=0;
 double SGPA;

Student()
{
 this.USN=USN;
 this.name=name;
 this.credits=credits;
 this.marks=marks;
 SGPA=0;
}
void input()
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the USN and the name of the student");
 USN=sc.nextLine();
 name=sc.nextLine();
 System.out.println("Enter the number of subjects");
 n=sc.nextInt();
 credits=new int[n]; 
 marks =new int[n];
 for(i=0;i<n;i++)
{
 System.out.println("Enter the credits for subject:"+(i+1));
 credits[i]=sc.nextInt();
 tot=tot+credits[i];
}
for(i=0;i<n;i++)
{
 System.out.println("Enter the marks of the student for subject:"+(i+1));
 this.marks[i]=sc.nextInt();
}
}
void grade_points()
{
    int i;
    for(i=0;i<n;i++)
    {
        if(this.marks[i]>90 && this.marks[i]<=100)
        {
            this.marks[i]=10;
        }
        else if(this.marks[i]>80 && this.marks[i]<=90)
        {
            this.marks[i]=9;
        }
        else if(this.marks[i]>70 && this.marks[i]<=80)
        {
            this.marks[i]=8;
        }
        else if(this.marks[i]>60 && this.marks[i]<=70)
        {
            this.marks[i]=7;
        }
        else if(this.marks[i]>50 && this.marks[i]<=60)
        {
            this.marks[i]=6;
        }
        else if(this.marks[i]>40 && this.marks[i]<=50)
        {
            this.marks[i]=4;
        }
        else if(this.marks[i]<40)
        {
            this.marks[i]=4;
        }
    }
}
void calc_SGPA()
{
 int i;
 for(i=0;i<n;i++)
 {
  SGPA=SGPA+(credits[i]*this.marks[i]);
 }
  SGPA=SGPA/tot;
}
void display()
{
   System.out.println("The student with USN:"+USN+", Name:"+name+" has SGPA:"+SGPA);
}
public static void main(String[] args)
{

 Student st=new Student();
 st.input();
 st.grade_points();
 st.calc_SGPA();
 st.display();
}
}