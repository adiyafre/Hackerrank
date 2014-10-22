package _2_utopian_Tree;
import java.util.Scanner;


public class Solution {
	
	public static int utopianTree(int n){
		
		int height = 1;
		if (n == 0 ) return height;
		for (int i=1; i<=n; i++){
			if (i%2==1)height= height * 2;
			else height++;
			
		}
		return height;
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int _t = sc.nextInt();
		
		for (int i=1; i<=_t; i++){
		int _n = sc.nextInt();
		System.out.println(utopianTree(_n));
		}
		
		
	}

}
