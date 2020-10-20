import java.util.*;
public class Employee
{
 String empid;
 String empname;
 int empnohrs,otamt=0;
 int empbasic;
 double emphra,empda,empit,empgross;

Employee()
{
 empgross=0;
}
void input()
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the ID and the name of the employee");
 empid=sc.nextLine();
 empname=sc.nextLine();
 System.out.println("Enter the number of hours");
 empnohrs=sc.nextInt();
 System.out.println("Enter the Basic Salary,HRA,DA and IT");
 empbasic=sc.nextInt();
 emphra=sc.nextInt();
 empda=sc.nextInt();
 empit=sc.nextInt();
 
}
void salary()
{
    empgross=empbasic+(empbasic*emphra)+(empbasic*empda)-(empbasic*empit)+otamt;
}
void overtime()
{
 if(empnohrs>200)
 {
    otamt=(empnohrs-200)*100; 
 }
 else if(empnohrs<200)
 {
     otamt=-(empnohrs-200)*100;
 }
 else otamt=0;
}
void display()
{
   System.out.println("The salary of Employee with ID:"+empid+", Name:"+empname+" is :"+empgross);
}
public static void main(String[] args)
{ 
 int n;    
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of Employees");
 n=sc.nextInt();
 Employee[] emp=new Employee[n];
 for(int i=0;i<n;i++)
 {
     emp[i]= new Employee();
     emp[i].input();
     emp[i].overtime();
     emp[i].salary();
     emp[i].display();
 }
 
 
 
}
}