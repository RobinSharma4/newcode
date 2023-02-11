import java.util.Scanner;
public class Star_Pattern {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	N = N/2 +1;
	int i = 1;
	int rev = 1;
	if(0<=N && N<=49 && N%2 == 1){
	while(i<=N)
	{
		int j = 1;
		while(j<=N-i){
			System.out.print(" ");
			j=j+1;
		}
		int k = 1;
		while(k<=i){
			System.out.print("*");
			k=k+1;
		}
		int dec = i - 1;
		while(dec>=1){
			System.out.print("*");
			dec = dec - 1;
		}	
		i=i+1;
		System.out.print('\n');
	}
	
	while(rev<= N-1)
	{
		int k = rev -1;
		while(k>=0) {
			System.out.print(" ");
			k= k -1 ;
		}
		int j = 1;
		
		while(j<= N-rev)
		{
			System.out.print("*");
			j = j+1;
			
		}
		int l = 1;
		while(l <=N-rev-1){
			System.out.print("*");
			l=l+1;
		}
		rev = rev+1;
		System.out.print('\n');
		}
	}
		
	}

	      
	}


