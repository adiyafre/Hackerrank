package fibonacci_Modified;

import java.util.Scanner;
import java.math.BigInteger;  




public class Solution {


	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		

		

		
			int n1=a;
			int n2=b;
			int n3=n2*n2+n1;
			int n4=n3*n3+n2;
			int n5=n4*n4+n3;

			
				
	
			
			BigInteger _n = new BigInteger("0");
			BigInteger _n1 = BigInteger.valueOf(n5);
			BigInteger _n2 = BigInteger.valueOf(n4);
			
	
			
			if (n<=5){
				
				switch(n){
				
				case 1 : System.out.println(n1);
				break;
				
				case 2 : System.out.println(n2);
				break;
				
				case 3 : System.out.println(n3);
				break;
				
				case 4 : System.out.println(n4);
				break;
				
				case 5 : System.out.println(n5);
				break;
						
				}
				
				
			}
				
					
			
			else {
				for (int i=6; i<=n; i++){
				

				_n = _n1.pow(2).add(_n2);
				
				_n2=_n1.abs();
				_n1=_n.abs();
				

				
			}
			System.out.println(_n.abs());
				
			}
	}

}