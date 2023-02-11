import java.util.Scanner;
public class primality {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number to check ");
		int n = s.nextInt();
		int div = 2;
		while(div<n){
			if(n%div == 0){
				System.out.println("Composite number");
				return;
			}
			else{ 
				if(div==(n-1)){
				System.out.println("Number is Prime");
				}
			}
		div = div+1;
		}
		
	}

}
