import java.util.*;
public class Student
{
 String USN;
 String name;
 int credits[];
 int marks[];

Student(String USN,String name,int credits[],int marks[])
{
 this.USN=USN;
 this.name=name;
 this.credits=credits;
 this.marks=marks;
}
void grade_points(int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        if(marks[i]>90 && marks[i]<=100)
        {
            marks[i]=10;
        }
        else if(marks[i]>80 && marks[i]<=90)
        {
            marks[i]=9;
        }
        else if(marks[i]>70 && marks[i]<=80)
        {
            marks[i]=8;
        }
        else if(marks[i]>60 && marks[i]<=70)
        {
            marks[i]=7;
        }
        else if(marks[i]>50 && marks[i]<=60)
        {
            marks[i]=6;
        }
        else if(marks[i]>40 && marks[i]<=50)
        {
            marks[i]=4;
        }
        else if(marks[i]<40)
        {
            marks[i]=4;
        }
    }
}
int calc_SGPA(int n)
{
 int i,s=0;
 for(i=0;i<n;i++)
 {
  s=s+(credits[i]*marks[i]);
 }
 return s;
} 
void display(int SGPA,int total)
{
   System.out.println("The student with USN:"+USN+", Name:"+name+" has SGPA:"+((float)SGPA/total));
}
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 int i,n,tot=0,SGPA;
 System.out.println("Enter the USN and the name of the student");
 String USN=new String();
 String name=new String();
 USN=sc.nextLine();
 name=sc.nextLine();
 System.out.println("Enter the number of subjects");
 n=sc.nextInt();
 int c[]=new int[n];
 int m[]=new int[n];
 for(i=0;i<n;i++)
{
 System.out.println("Enter the credits for subject:"+(i+1));
 c[i]=sc.nextInt();
 tot=tot+c[i];
}
for(i=0;i<n;i++)
{
 System.out.println("Enter the marks of the student for subject:"+(i+1));
 m[i]=sc.nextInt();
}
 Student st=new Student(USN,name,c,m);
 st.grade_points(n);
 SGPA=st.calc_SGPA(n);
 st.display(SGPA,tot);
}
}