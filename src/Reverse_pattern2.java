import java.util.Scanner;
public class Reverse_pattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int i =1;
		while(i<=N)
		{
			int j = 1;
			while(j<=N-i+1){
				System.out.print('*');
				j=j+1;
			}
			System.out.print('\n');
			i=i+1;
		}
		

	}

}
