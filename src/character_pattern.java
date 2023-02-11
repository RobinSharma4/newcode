import java.util.Scanner;
public class character_pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N = s.nextInt();
		int i = 1;
		int j = 1;
		char jth;
		while(i<= N)
		{
			while(j<=N)
			{
				jth = (char)('A'+j-1);
				System.out.print(jth);
				j=j+1;
			}
			i=i+1;
			System.out.print("\n");
			j=1;
		}
		

	}

}
