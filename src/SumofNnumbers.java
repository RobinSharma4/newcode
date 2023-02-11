import java.util.Scanner;

public class SumofNnumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1;
		Scanner s = new Scanner(System.in);
		System.out.print(" Enter number ");
		int N = s.nextInt();
		int Sum = 0;
		while(i<=N)
		{
			Sum = Sum + i;
			i = i+1;
		}
		System.out.println("Sum of " + N + " natural is " + Sum);
		

	}

}
