package xor_subsequence;

import java.util.Scanner;
import java.math.BigInteger;  




public class Solution2 {


	
	public static void main(String[] args) {
		
		
		int con = 65536;

		int[] count = new int[con+1];
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];

		
		for (int t = 0; t<n; t++){
		
			
			int k = sc.nextInt();

			a[t] = k;
			
		
		}
		

		for (int t = 1; t<=con; t++){
		
		
			count[t] = 0;
			
		
		}

	
		
		
		for(int start_index = 0 ; start_index<n; start_index++){
			
			int xor=0;
			for(int sub_array_size = 1; sub_array_size <=n; sub_array_size++){
				
				if(start_index+sub_array_size>n) break;
				xor = xor^a[start_index+sub_array_size-1];
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
