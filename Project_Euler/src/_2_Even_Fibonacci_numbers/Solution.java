package _2_Even_Fibonacci_numbers;
import java.util.Scanner;


public class Solution {
	
	public static long evenFib(long n){
		
		long j = 0;
		long i = 1;
		long t = 0;
		long sum = 0;
		
		while (j+i<=n){
			t = j + i;
			j = i;
			i = t;
			
			if (t%2==0) sum+=t;
			
		}
		
			return sum;
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		long _t = sc.nextLong();
		
		
		for (long i=1; i<=_t; i++){
			
			long _n = sc.nextLong();
			System.out.println(evenFib(_n));
		}
		
		
		
	}

}