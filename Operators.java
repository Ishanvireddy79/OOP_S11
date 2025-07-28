package practical1;

public class Operators {
	public static void main(String[]args) {
		int a = 10;
		int b = 5;
		int sum = a+b;
		int diff = a-b;
		int product = a*b;
		int quotient = a/b;
		int remainder = a%b;
		System.out.println("Arithemetic operators:");
		System.out.println("Sum:"+ sum);
		System.out.println("difference:"+ diff);
		System.out.println("product"+ product);
		System.out.println("quotient:"+ quotient);
		System.out.println("remainder:"+ remainder);
		System.out.println("\nRelational Operators:");
		System.out.println("a==b"+(a==b));
		System.out.println("a!=b"+(a!=b));
		System.out.println("a>b"+(a>b));
		System.out.println("a<b"+(a<b));
		System.out.println("a>=b"+(a>=b));
		System.out.println("a<=b"+(a<=b));
		boolean x =true;
		boolean y =false;
		System.out.println("\nLogical operators:");
		System.out.println("x&&y:"+(x&&y));
		System.out.println("x||y:"+(x||y));
		System.out.println("!x:"+(!x));
	}

}
