import java.util.Scanner;
public class factors {

	 public static void main(String[] args) {
	        // Write your code here
	        Scanner s = new Scanner(System.in);
	        int N,i;
	        N=s.nextInt();
	        i=2;
	        if(N>=0 && N<=10000)
	        {
	            while(i < N)
	            {
	                if(N%i == 0)
	                {
	                    System.out.print(i+" ");
	                }
	                i=i+1;
	            }
	        }
	    }
}
