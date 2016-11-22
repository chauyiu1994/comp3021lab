package lab11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersTraditional {
	
	public static List<Integer> isOdd(List<Integer> numbers) {
		List<Integer> results = new ArrayList<Integer>();
		for (int n : numbers) {
			if (n % 2 != 0) results.add(n);
		}
		return results;
	}
	
	public static List<Integer> isPrime(List<Integer> numbers) {
		List<Integer> results = new ArrayList<Integer>();
		// TODO
		// Find out all the prime numbers 
		for(int n:numbers){
			int temp;
			boolean isPrime=true;
		    for(int i=2;i<=n/2;i++){
				
		    	temp=n%i;
		    	if(temp==0){
		    		isPrime=false;
		    		break;
		    	}
	        }
		    if(isPrime) results.add(n);
		}
		return results;
	}
	
	public static List<Integer> isPalindrome(List<Integer> numbers) {
		List<Integer> results = new ArrayList<Integer>();
		// TODO
		// Find out all the palindrome numbers, such as 484 and 121.
		for(int n:numbers){
			int x=n;
			int o=x;
			int a=0;
			while(x>0){
				int r=x%10;
				a=a*10+r;
				x=x/10;
		    }
			if(a==o) results.add(n);
		}
		return results;
	}
		
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(480,514,484,389,709,935,328,169,649,300,685,429,243,532,308,87,25,282,91,415);
		
		System.out.println("The odd numbers are : " + isOdd(numbers));
		System.out.println("The prime numbers are : " + isPrime(numbers));
		System.out.println("The palindrome numbers are : " + isPalindrome(numbers));
		
	}
}
