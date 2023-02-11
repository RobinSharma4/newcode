import java.util.Scanner;


public class Squarepattern3 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int b = s.nextInt();
		int i =1;
		int j =b;
		while(i<=l)
		{
			while(j>0)
			{
				System.out.print(j);
				j=j-1;
			}
			System.out.println("\n");
			j=b;
			i=i+1;
		}
	}

}
