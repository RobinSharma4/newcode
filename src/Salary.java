import java.util.Scanner;

public class Salary {
	
		
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	//	System.out.print("Enter the basic Salary ")
		double basic=s.nextDouble();
		
		char band =s.next().charAt(0); 
		double hra = (0.2d*basic);
		double da = (0.5d*basic);
		int allow=1300;
		double a=basic;
		
		if(band == 'A')
		{
			allow = 1700;
		}
		else if(band == 'B')
		{
			allow = 1500;
		}
		else
		{
			allow = 1300;
		}
		double pf=(0.11d*basic);
       double salary = a+ hra;
	   salary+=da;
	   salary+= allow ;
	   salary-= pf;
	   System.out.println(Math.round(salary));

		}
	}

