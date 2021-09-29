package factorial_using_recursion;

public class Factorial {

	public static int factorial(int n) {

		if (n >= 1)
			return n * factorial(n-1);
		else
			return 1;
	}
	
	
	public static void main(String[] args) {

		System.out.println(factorial(5));
	}

}
