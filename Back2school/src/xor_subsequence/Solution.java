package xor_subsequence;

import java.util.Scanner;
import java.math.BigInteger;  




public class Solution {


	
	public static void main(String[] args) {
		
		
		int con = 65536;

		int[] count = new int[con+1];
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n+1];

		
		for (int t = 1; t<=n; t++){
		
			
			int k = sc.nextInt();

			a[t] = k;
			
		
		}
		

		for (int t = 1; t<=con; t++){
		
		
			count[t] = 0;
			
		
		}

	
		
		for (int i=1; i<=n; i++){
			
			
			for (int j=1; j<=n-i+1; j++){
				
				int xor = 0;
				for (int m=i; m<i+j; m++){
					
					xor = xor^a[m];
					
				}
				count[xor]=count[xor]+1;
					
					
				}
				
				
	
			
		}
		
		
		
		int max = 0,pos=0; 
		for (int t = 1; t<=con; t++){
		
			
			if (count[t]>max) {max=count[t]; pos=t;}
			
		
		}

		System.out.println(pos+" "+max);

		
	}

}
