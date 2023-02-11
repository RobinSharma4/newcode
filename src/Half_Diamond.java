import java.util.Scanner;
public class Half_Diamond {
public static void main(String[] args){
	 Scanner s = new Scanner(System.in);
     int N = s.nextInt();
     int i = 1;
     int a = N-1;
     System.out.print("*\n");
     while(i<=N){
    	 System.out.print("*");
    	 int j=1;
    	 while(j<=i){
    		 System.out.print(j);
    		 j=j+1;
    	 }
    	 int k = i - 1;
    	 while(k>=1){
    		 System.out.print(k);
    		 k=k-1;	 
    	 }
    	 System.out.print("*");
    	 System.out.print('\n');
    	 i =i+1;
    	 
     }
     while(a>= 1){
    	 System.out.print("*");
    	 int j = 1;
    	 while(j<=a){
    		 System.out.print(j);
    		 j =j+1;
    	 }
    	 int k=a-1;
    	 while(k>=1){
    		 System.out.print(k);
    		 k=k-1;
    	 }
    	 a=a-1;
    	 System.out.print("*");
    	 System.out.print('\n');
     }
     System.out.print("*");
     
    
}
}
