import java.util.*;
abstract class Shape
{
    int b,h;
    Shape(int b,int h)
    {
        this.b=b;
        this.h=h;
    }
    void printArea(){};
    Scanner sc = new Scanner(System.in);
}
class Rectangle extends Shape
{
    Rectangle(int b,int h)
    {
        super(b, h);
    }
  void printArea()
  {
      System.out.println("\nThe area of the Rectangle is : "+(b*h));
  }
}
class Triangle extends Shape
{
    Triangle(int b,int h)
    {
        super(b, h);
    }

    void printArea() 
    {
      System.out.println("\nThe area of the Triangle is : "+((b*h)/2));   
    }
}
class Circle extends Shape
{
    Circle(int r)
    {
        super(0,r);
    }
    void printArea()
    {
        System.out.println("\nThe area of the circle is :"+(3.14*h*h));
    }
}

public class Labprog4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice,br,he;
        Rectangle rect= new Rectangle(10,20);
        Triangle t = new Triangle(10, 5);
        Circle c = new Circle(10);
        rect.printArea();
        t.printArea();
        c.printArea();
        System.out.println("\nSelect the figure: \n1.Rectangle\n2.Triangle\n3.Circle\n4.Exit\n");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("\nEnter the breadth and height\n");
            br=sc.nextInt();
            he=sc.nextInt();
            Rectangle r1=new Rectangle(br,he);
            r1.printArea();
            break;

            case 2: System.out.println("\nEnter the length and height\n");
            br=sc.nextInt();
            he=sc.nextInt();
            Triangle t1=new Triangle(br,he);
            t1.printArea();
            break;

            case 3: System.out.println("\nEnter the radius\n");
            br=sc.nextInt();
            Circle c1=new Circle(br);
            c1.printArea();
            break;

            case 4:System.exit(0);
            break;
            

        }
        
    }
}
