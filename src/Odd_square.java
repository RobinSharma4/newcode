import java.util.Scanner;
public class Odd_square {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N =s.nextInt();
		int i = 1;
		int j = 1;
		int k = 1;
		int l = 1;
	    if(0<=N && N<=50 )
		{
			while(i<=N)
			{
				while(j<=N-i+1)
				{
					System.out.print(k);
					k = k+2;
					j=j+1;
				}
				
				int a = i-1;
				int b =1;
				while(a>=1){
					System.out.print(b);
					b=b+2;
					a=a-1;
				}
				System.out.print('\n');
				i=i+1;
				l = l+2;
				k=l;
				j=1;
			}


		}
	}
	
}
