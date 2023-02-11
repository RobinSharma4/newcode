import java.util.Scanner;
public class character_pattern_1 {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int i = 1;
	int j = 1;
	int k = 1;
	char jth;

	
	while(i<=N){
		while(j<=N)
		{
		jth = (char)('A'+k-1);
		System.out.print(jth);	
		j=j+1;
		k=k+1;
		}
		System.out.print("\n");
		i=i+1;
		k=i;
		j=1;
	}
	
	}

}
