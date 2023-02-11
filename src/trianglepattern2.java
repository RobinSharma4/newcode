import java.util.Scanner;
public class trianglepattern2 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int l = s.nextInt();
		int i=1;
		int j=1;
		int k=1;
		while(i<=l)
		{
			while(j<=i)
			{
				System.out.print(k+" ");
				j=j+1;
				k=k+1;
			}
			System.out.print("\n");
			i=i+1;
			j=1;
		}
	}

}
