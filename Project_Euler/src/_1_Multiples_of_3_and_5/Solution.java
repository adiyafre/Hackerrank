package _1_Multiples_of_3_and_5;
import java.util.Scanner;


public class Solution {
	
	public static long m35(long n){
		
	
		long d3 = n/3;
		long d5 = n/5;
		long d15 = n/15;
		
		
		long sum_d3 = 0;
		if (d3%2==0) sum_d3 = ((d3+1)*d3)/2;
		else sum_d3 = d3*(d3/2+1);
		
		long sum_d5 = 0;
		if (d5%2==0) sum_d5 = ((d5+1)*d5)/2;
		else sum_d5 = d5*(d5/2+1);
		
		long sum_d15 = 0;
		if (d15%2==0) sum_d15 = ((d15+1)*d15)/2;
		else sum_d15 = d15*(d15/2+1);
		
		
	
		return sum_d3*3+sum_d5*5-sum_d15*15;
			
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		long _t = sc.nextInt();
		
		
		for (long i=1; i<=_t; i++){
			
			long _n = sc.nextInt();
			System.out.println(m35(_n-1));
		}
		
		
		
	}

}