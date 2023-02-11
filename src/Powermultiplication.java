import java.util.Scanner;
public class Powermultiplication {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x =s.nextInt();
        int n =s.nextInt();
        int i=1;
        int mul =1;
        if(0<=x && x <= 8)
        {
            if(0<=n && n <= 9)
            {
                if(n==0)
                {
                    System.out.print(i);
                }
                else
                {
                    while(i<=n)
                    {
                        mul = mul*x;
                        i=i+1;

                    }
                    System.out.print(mul);

                }



            }
        }
        
    }

}
