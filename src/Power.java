import java.util.Scanner;
public class Power{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int Sume=0;
		int Sumo=0;
		int rem;
		if(N>=0 && N<= 100000000)
		{
		while(N!=0)
		{
			
			rem = N%10;
			if(rem%2==0)
			{
				Sume=Sume + rem;
			}
			else
			{
				Sumo = Sumo + rem;
			}
			N=N/10;
		}
		System.out.print(Sume+" "+Sumo);

		}


	}
}
