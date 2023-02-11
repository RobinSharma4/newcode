import java.util.Scanner;

public class Sum_pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int i = 1;
		int k = 0;
		while(i<= N)
		{
			int j = 1;
			k = 0;
			while(j<= i)
			{
				k=k+j;
				System.out.print(j);
				if(j<i){
					System.out.print("+");
				}
				else{
					System.out.print("=");
					System.out.print(k);
				}
				
				j=j+1;
				
			}
			i = i+1;
			System.out.print('\n');
		}

	}
}
