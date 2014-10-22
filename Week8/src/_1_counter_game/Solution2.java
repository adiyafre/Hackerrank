package _1_counter_game;

import java.util.Scanner;




public class Solution2 {
	static boolean current = true;
	
	public static boolean check(long _n, boolean curr){
		String bit = Long.toBinaryString(_n);
		System.out.println(bit + " "+curr);
		
		if (_n == 1 || _n==0) {
			if (curr) System.out.println("Richard");
			else System.out.println("Louise");
		
		return true;
		}
		
	
		
		
		return false;
		
				
	}
	
	public static void winner(long _n){
	
		long node = _n;
		
		while (!check(node,current)){
		String by = Long.toBinaryString(node);
		by = by.substring(1);

		
		node = Long.parseLong(by, 2);
		System.out.println(node);
		
		current = !current;

		
		}
		
		
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		
		
		for (long i = 1; i<=t; i++){
		
			current = true;
			long n = sc.nextLong();
			if (n==1) System.out.println("Richard");
			else
			winner(n);
		
		}
		
				
		
		
	}

}
