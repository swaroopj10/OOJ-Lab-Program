import java.util.* ;
public class Area
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int c;
	    double p=3.14;
		double r,h;
		double Area=0,Vol=0;
		System.out.println("Enter your choice");
		System.out.println("1.Cylinder\n 2.Cone\n 3.Sphere\n");
		c=sc.nextInt();
		while(c!=0)
		{
		    switch(c)
		    {
		        case 1:System.out.println("Enter the radius and height of Cylinder");
		        r=sc.nextFloat();
		        h=sc.nextFloat();
		        Area=(2*p*r*h)+(2*p*r*r);
		        Vol= (p*r*r*h);
		        break;
		        
		        case 2:System.out.println("Enter the radius and height of Cone");
		        r=sc.nextFloat();
		        h=sc.nextFloat();
		        Area=(p*r)*(r+ Math.sqrt((h*h)+(r*r)));
		        Vol= (p*r*r*h)/3;
		        break;
		        
		        case 3:System.out.println("Enter the radius of Sphere");
		        r=sc.nextFloat();
		        Area=(4*p*r*r);
		        Vol= (4/3)*(p*r*r*3);
		        break;
		    }
		    System.out.println("Area of the Solid= "+Area);
		    System.out.println("Volume of the Solid= "+Vol);
		    System.out.println("For different Solid,Enter option between 1 to 3 . To Exit Enter 0");
		    c=sc.nextInt();
		}
		
		    
		
	}
}
