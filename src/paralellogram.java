import java.util.Scanner;
public class paralellogram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int i = 1;
if(0<=N && N <= 50){
	while(i<= N){
		int j = 1;
		while(j<= i -1){
			System.out.print(" ");
			j=j+1;
		}
		int k =1;
		while(k<=N)
		{
			System.out.print("*");
			k=k+1;
		}
		i =i+1;
		System.out.print('\n');

	}
}

	}

}
