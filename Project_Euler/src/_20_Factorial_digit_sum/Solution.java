package _20_Factorial_digit_sum;
import java.util.Scanner;


public class Solution {
	
	static double gamma(double z)
	   {
	   return Math.exp( -z ) * Math.pow( z, z - 0.5 ) * Math.sqrt( 2 * Math.PI ) *
	   ( 1 + 1 / ( 12 * z ) + 1 / ( 288 * z * z ) - 139 / ( 51840 * z * z * z ) - 571 / ( 2488320 * z * z * z * z ));
	   }

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		long _t = sc.nextInt();
		
		
		for (long i=1; i<=_t; i++){
			
			long _n = sc.nextInt();
			System.out.println(gamma(_n+1)+":"+Math.round(gamma(_n+1)));
		}
		
		
		
	}

}