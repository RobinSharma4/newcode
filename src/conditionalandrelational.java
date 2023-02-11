import java.util.Scanner;

public class conditionalandrelational {
	public static void main(String[]args){
 Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	if(a>0 && b>0)
	{
		System.out.println("Both are positive");
	}
		else{
			System.out.println("Both are not positive");
		}
	
	if(a>0 || b>0)
	{
		System.out.println("Anyone or both are positive");
	}
		else{
			System.out.println("Both are not Negative");
		}
	if(a==b){
		System.out.println("Both are equal");
	}
	}
	}
	

