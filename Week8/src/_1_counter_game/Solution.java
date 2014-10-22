package _1_counter_game;

import java.util.Scanner;
import java.math.BigInteger;  



public class Solution {
	static boolean current = true;
	
	public static boolean check(BigInteger _n, boolean curr){
		
	
		String bit = _n.toString(2);
		
		if (_n.toString().length()==1){
			if (_n.intValue()==1){
				if (curr) System.out.println("Richard");
				else System.out.println("Louise");
		
		return true;
		}
		}
		

		
		if (new BigInteger(bit.substring(1), 2).longValue() == 0){
			
			if ((bit.length()-1)%2 == 0)
				 if (curr) System.out.println("Richard");
				 else System.out.println("Louise");
			else if (curr) System.out.println("Louise");
			else System.out.println("Richard");
			
			return true;
			
		} 
		
		
		return false;
		
				
	}
	
	public static void winner(BigInteger _n){
	
		BigInteger node = _n;
		
		while (!check(node,current)){

		
		String by = node.toString(2);
		
		
		by = by.substring(1);

		node = new BigInteger(by,2);
	

		current = !current;

		
		}
		
		
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for (int i = 1; i<=t; i++){
		
			current = true;
			BigInteger n = sc.nextBigInteger();
			if (n.toString().length() == 1 ){ 
				if (n.intValue()==1)System.out.println("Richard");
				else winner(n);
			}
			else
			winner(n);
		
		}
		
				
		
		
	}

}
