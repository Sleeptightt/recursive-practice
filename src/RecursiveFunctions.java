
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
	
	public static boolean isPalindrome(String a, int n) {
		if(n==a.length()/2)
			return true;
		if(a.charAt(n) == a.charAt(a.length()-1-n))
			return isPalindrome(a, n+1);
		return false;
	}
	
	public static String flipString(String a, int n) {
		if(n == 0)
			return a.charAt(n) + "";
		return a.charAt(n) + flipString(a, n-1);
	}
	
	public static String shuffle(String a, String b, int n) {
		if(n == a.length()-1)
			return "" + a.charAt(n) + b.charAt(n);
		return "" + a.charAt(n) + b.charAt(n) + shuffle(a,b,n+1);
	}
	
}
