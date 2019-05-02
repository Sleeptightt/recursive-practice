
public class RecursiveFunctions {

	public static void main(String[] args) {
	}

	public static int factorial(int n){
		if(n<=1)
			return 1;
		return n*factorial(n-1);
	}
	
	public static int fibonacci(int n){
		if(n == 1)
			return 1;
		if(n == 0)
			return 0;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static int arraySummatory(int[] a, int n){
		if(n==a.length-1)
			return a[n];
		return a[n] + arraySummatory(a, n+1);
	}
	
}
