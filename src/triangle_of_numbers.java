import java.util.Scanner; 
public class triangle_of_numbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int N = s.nextInt();
		int i = 1;
		if(0<=N && N <=50)
		{
			while(i<= N)
			{
				int j = 1;
				while(j<=N-i)
				{
					System.out.print(" ");
					j=j+1;

				}
				int k = 1;
				int l = i; 
				while(k<=i)
				{
					System.out.print(l);
					l =l+1;
					k=k+1;
				}
				int dec = i-1;
				int dec1 = l-2;
				while(dec>=1)
				{
					
					System.out.print(dec1);
					dec= dec - 1;
					dec1 =dec1 -1;
					
				}
				i=i+1;
				System.out.print('\n');
			}
		}
	}

}
