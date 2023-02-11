import java.util.Scanner;
public class Problem2 {
	
	
	    
	    public static void main(String[] args) {
	        // Write your code here
	     Scanner s = new Scanner(System.in);
	      String str = s.next();
	      char ch = str.charAt(0);
	      int a = ch;
	      if(a<97 && a > 64)
	      {
	        System.out.println(1);
	      }
	      else{
	      if(a>96&& a<123)
	      {
	          System.out.println(0);

	      }
	      else
	      {
	          System.out.println(-1);
	      }
	      }




	        

	    }
}
	


