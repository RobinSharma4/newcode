import java.util.Scanner;
public class isosceles {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int i = 1;
		int a = 0;
		while(i<=N)
		{
			int j=1;
			while(j<=N-i){
				System.out.print(" ");
				j=j+1;
			}
			int k = 1;
			while(k<=i)
			{
				System.out.print(k);
				k = k+1;
			}
			int b = i - 1;
			while(b>=1)
			{
				System.out.print(b);
				b = b-1;
			}
			System.out.print('\n');
			i=i+1;
			
		}
		
	}

}
