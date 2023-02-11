import java.util.Scanner;
public class Simplepattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.print("Enter number of number of rows ");
		int l =s.nextInt();
		System.out.print("Enter number of number of columns  ");
		int b =s.nextInt();
		int i=1;
		int j=1;
		while(i<=l)
		{
			
			while(j<=b)
			{
				System.out.print("*");
				j=j+1;
			}
			System.out.println("\n");
			i=i+1;
			j=1;
		}

	}
	

}
