import java.util.Scanner;


public class ifelse {

	/**
	 * Need to check number is odd or even
	 */
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int rem = a%2;
	
	if(rem == 0){
		System.out.println("Number is even");
	}else{
		System.out.println("Number is odd");
	}
		
	}

}
