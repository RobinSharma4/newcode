
public class Relationaloperator {
public static void main(String[] args)
{
//Relational operator
	int a=10,b=10;
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a==b);
	System.out.println(a!=b);
//	Logical operator
	System.out.println(a>b && a==b);  // And Operator, Both condition need to be true
	System.out.println(a>b || a==b ); // Or Operator, anyone condition need to be true
	System.out.println(!(a==b)); // Not Operator, Negates the value
}
}
