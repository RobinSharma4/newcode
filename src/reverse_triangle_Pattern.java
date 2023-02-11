import java.util.Scanner;
public class reverse_triangle_Pattern {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N =  s.nextInt();
		int i = 1;
		int j = 1;
		int k = 1;
		if(0<=N && N<=50)
		{
			while(i<=N)
			{
				k=i;
				while(j<=i)
				{
					System.out.print(k);
					k=k-1;
					j=j+1;
				}
				System.out.print("\n");
				i=i+1;
				j=1;
			}

		}

		

		
	}

}
