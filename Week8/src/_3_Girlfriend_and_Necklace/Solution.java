package _3_Girlfriend_and_Necklace;
import java.util.Scanner;



public class Solution {
		

	
	public static void solve(long _n){
		long constant = 1000000007;
		long l1=1,l2=3,l3=4,l4=6,ln=0,lprev=6;
		long i = 5;
		
		

		
		while (i<=_n){

		
	
			if (lprev + l2>=constant) {
				
				ln=(ln+l2)%constant;
				lprev=ln;
				l2=l3;
				l3=l4;
				l4=ln;
			}
			else{
	
			ln = lprev + l2;
			lprev=ln;
			l2=l3;
			l3=l4;
			l4=ln;
			
			}
			i++;
			
		}
		if (ln>=constant) System.out.println(ln%constant);
		else
		System.out.println(ln);
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for (int i = 1; i<=t; i++){
		
			boolean initial = false;
			Long n = sc.nextLong();
			if (n==1) {System.out.println(1); initial = true;} 
			if (n==2) {System.out.println(3); initial = true;}
			if (n==3) {System.out.println(4); initial = true;}
			if (n==4) {System.out.println(6); initial = true;}
			
			if (!initial) solve(n);
			}
			

			
		}
		
				
		
		
	}

