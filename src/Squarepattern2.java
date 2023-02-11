import java.util.Scanner;
public class Squarepattern2 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int b = s.nextInt();
		int i =1;
		int j =1;
		while(i<=l)
		{
			while(j<=b)
			{
				System.out.print(j);
				j=j+1;
			}
			System.out.println("\n");
			j=1;
			i=i+1;
		}
	}
	

}
