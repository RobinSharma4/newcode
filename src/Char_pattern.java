import java.util.Scanner;
public class Char_pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int i = 1;
		int j = 1;
		int k = N;
		char jth;
		if(0<=N&&N<=26){
			while(i<=N){
				while(j<=i){
					jth = (char)('A'+ k-1);
					System.out.print(jth);
					j=j+1;
					k=k+1;
					
				}
				System.out.print('\n');
				i=i+1;
				j= 1;
				k=k-i;

			}
		}

    
		
	}
}
