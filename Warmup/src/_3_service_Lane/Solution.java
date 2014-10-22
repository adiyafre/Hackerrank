package _3_service_Lane;
import java.util.Scanner;


public class Solution {
	
	public static int serviceLane(int[] len , int i, int j){
		
		int largest_vehicle = 3;
		for (int c=i; c<=j; c++){
			if (largest_vehicle>len[c]) largest_vehicle = len[c];

		}
		
		return largest_vehicle;
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int _n = sc.nextInt();
		int _t = sc.nextInt();
		int[] _hw_len = new int[_n];
		

		for (int i=0; i<_n; i++){
		_hw_len[i] = sc.nextInt();

		}

		for (int c=1; c<=_t; c++){
			
			int _i = sc.nextInt();
			int _j = sc.nextInt();
			System.out.println(serviceLane(_hw_len,_i,_j));
		}
		
		
		
	}

}
/*	
}
Constraints 
2 <= N <= 100000 
1 <= T <= 1000 
0 <= i < j < N 
2 <= j-i+1 <= min(N,1000) 
1 <= width[k] <= 3, where 0 <= k < N

Sample Input #00

8 5
2 3 1 2 3 2 3 3
0 3
4 6
6 7
3 5
0 7 */
