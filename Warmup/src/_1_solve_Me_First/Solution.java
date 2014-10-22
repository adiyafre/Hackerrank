package _1_solve_Me_First;
import java.util.Scanner;


public class Solution {
	
	public static int solveMeFirst(int a, int b){
		
		return a%b;
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(solveMeFirst(a,b));
		
		
		
	}

}
