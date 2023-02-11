import java.util.Scanner;
public class Character_pattern_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int i = 1;
		int j = 1;
		char jth;
		if(0<=N && N <=26)
		{
			while(i<=N ){

			jth = (char)('A' + i-1);
			while(j<=i)
			{
				System.out.print(jth);
				j=j+1;
			}
			System.out.print("\n");
			i=i+1;
			j=1;
			}
		}

		

		
	}
}
