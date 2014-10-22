package _3_Largest_prime_factor;
import java.util.Scanner;


public class Solution {
	
	public static long nextPrime(long i, long k){

		long j=i+1;
		long p=2;
		int b=0;
		
		while(j<=k && b==0){
			p=2;
			while (j%p!=0) p++; 
			
			
			if (j==p) b=1;
			else j++;
			
		//	System.out.println("p:"+p+" j:"+j+" k:"+k+" b:"+b);
			
		}
		
			
			
		return j;
			
		
		
	}
	public static long largestPrime(long n){
		
		long j = 0;
		long i = 2;
		long k = n;
		
		while (i<k){
			if (k%i==0) k=k/i;
			
		//	System.out.println(i+":"+k);
			i = nextPrime(i,k);
			
		//	System.out.println("p:"+i);
				
		}
		
			return k;
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		long _t = sc.nextLong();
		
		
		for (long i=1; i<=_t; i++){
			
			long _n = sc.nextLong();
			System.out.println(largestPrime(_n));
		}
		
		
		
	}

}